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

public class frm implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azh b = azh.a();
   private static final float c = 32.0F;
   private final hev d;
   private final akv e;
   private frq f;
   private frq g;
   private List<fdu.a> h = List.of();
   private List<fdu> i = List.of();
   private final frj<frq> j = new frj<>(frq[]::new, frq[][]::new);
   private final frj<frm.a> k = new frj<>(frm.a[]::new, frm.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<frn> m = Lists.newArrayList();
   private final IntFunction<frm.a> n = this::b;
   private final IntFunction<frq> o = this::c;

   public frm(hev $$0, akv $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fdu.a> $$0, Set<frl> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<frl> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = frs.b.bake(this::a);
      this.g = frs.a.bake(this::a);
   }

   private List<fdu> b(List<fdu.a> $$0, Set<frl> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fdu> $$3 = new ArrayList<>();

      for (fdu.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fdu> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fdu $$3x : $$3) {
            fdt $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != frs.b) {
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
      for (frn $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fdt $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private frm.a b(int $$0) {
      fdt $$1 = null;

      for (fdu $$2 : this.i) {
         fdt $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new frm.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new frm.a($$1, frs.b) : frm.a.c;
   }

   public fdt a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private frq c(int $$0) {
      for (fdu $$1 : this.i) {
         fdt $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public frq a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private frq a(fdv $$0) {
      for (frn $$1 : this.m) {
         frq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akv $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fro $$5 = $$4 ? fro.b($$3) : fro.a($$3);
      frn $$6 = new frn($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      frq $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public frq a(fdt $$0) {
      IntList $$1 = (IntList)this.l.get(ayz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public akv a() {
      return this.e;
   }

   public frq b() {
      return this.g;
   }

   static record a(fdt a, fdt b) {
      static final frm.a c = new frm.a(frs.b, frs.b);

      fdt a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
