import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import org.slf4j.Logger;

public class frl implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azh b = azh.a();
   private static final float c = 32.0F;
   private final heu d;
   private final akv e;
   private frp f;
   private frp g;
   private List<fdt.a> h = List.of();
   private List<fdt> i = List.of();
   private final fri<frp> j = new fri<>(frp[]::new, frp[][]::new);
   private final fri<frl.a> k = new fri<>(frl.a[]::new, frl.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<frm> m = Lists.newArrayList();
   private final IntFunction<frl.a> n = this::b;
   private final IntFunction<frp> o = this::c;

   public frl(heu $$0, akv $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fdt.a> $$0, Set<frk> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<frk> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = frr.b.bake(this::a);
      this.g = frr.a.bake(this::a);
   }

   private List<fdt> b(List<fdt.a> $$0, Set<frk> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fdt> $$3 = new ArrayList<>();

      for (fdt.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fdt> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fdt $$3x : $$3) {
            fds $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != frr.b) {
                  ((IntList)this.l.computeIfAbsent(ayz.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (frm $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fds $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private frl.a b(int $$0) {
      fds $$1 = null;

      for (fdt $$2 : this.i) {
         fds $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new frl.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new frl.a($$1, frr.b) : frl.a.c;
   }

   public fds a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private frp c(int $$0) {
      for (fdt $$1 : this.i) {
         fds $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public frp a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private frp a(fdu $$0) {
      for (frm $$1 : this.m) {
         frp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akv $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      frn $$5 = $$4 ? frn.b($$3) : frn.a($$3);
      frm $$6 = new frm($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      frp $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public frp a(fds $$0) {
      IntList $$1 = (IntList)this.l.get(ayz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public akv a() {
      return this.e;
   }

   public frp b() {
      return this.g;
   }

   static record a(fds a, fds b) {
      static final frl.a c = new frl.a(frr.b, frr.b);

      fds a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
