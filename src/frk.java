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

public class frk implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azh b = azh.a();
   private static final float c = 32.0F;
   private final hek d;
   private final aku e;
   private fro f;
   private fro g;
   private List<fdt.a> h = List.of();
   private List<fdt> i = List.of();
   private final frh<fro> j = new frh<>(fro[]::new, fro[][]::new);
   private final frh<frk.a> k = new frh<>(frk.a[]::new, frk.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<frl> m = Lists.newArrayList();
   private final IntFunction<frk.a> n = this::b;
   private final IntFunction<fro> o = this::c;

   public frk(hek $$0, aku $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fdt.a> $$0, Set<frj> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<frj> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = frq.b.bake(this::a);
      this.g = frq.a.bake(this::a);
   }

   private List<fdt> b(List<fdt.a> $$0, Set<frj> $$1) {
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
               if ($$4x != frq.b) {
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
      for (frl $$0 : this.m) {
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

   private frk.a b(int $$0) {
      fds $$1 = null;

      for (fdt $$2 : this.i) {
         fds $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new frk.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new frk.a($$1, frq.b) : frk.a.c;
   }

   public fds a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fro c(int $$0) {
      for (fdt $$1 : this.i) {
         fds $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fro a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fro a(fdu $$0) {
      for (frl $$1 : this.m) {
         fro $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aku $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      frm $$5 = $$4 ? frm.b($$3) : frm.a($$3);
      frl $$6 = new frl($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fro $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fro a(fds $$0) {
      IntList $$1 = (IntList)this.l.get(ayz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public aku a() {
      return this.e;
   }

   public fro b() {
      return this.g;
   }

   static record a(fds a, fds b) {
      static final frk.a c = new frk.a(frq.b, frq.b);

      fds a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
