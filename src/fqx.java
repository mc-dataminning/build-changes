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

public class fqx implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final bam b = bam.a();
   private static final float c = 32.0F;
   private final hbl d;
   private final alz e;
   private frb f;
   private frb g;
   private List<feq.a> h = List.of();
   private List<feq> i = List.of();
   private final fqu<frb> j = new fqu<>(frb[]::new, frb[][]::new);
   private final fqu<fqx.a> k = new fqu<>(fqx.a[]::new, fqx.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fqy> m = Lists.newArrayList();
   private final IntFunction<fqx.a> n = this::b;
   private final IntFunction<frb> o = this::c;

   public fqx(hbl $$0, alz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<feq.a> $$0, Set<fqw> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fqw> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = frd.b.bake(this::a);
      this.g = frd.a.bake(this::a);
   }

   private List<feq> b(List<feq.a> $$0, Set<fqw> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<feq> $$3 = new ArrayList<>();

      for (feq.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<feq> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (feq $$3x : $$3) {
            fep $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != frd.b) {
                  ((IntList)this.l.computeIfAbsent(bae.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fqy $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fep $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fqx.a b(int $$0) {
      fep $$1 = null;

      for (feq $$2 : this.i) {
         fep $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fqx.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fqx.a($$1, frd.b) : fqx.a.c;
   }

   public fep a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private frb c(int $$0) {
      for (feq $$1 : this.i) {
         fep $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public frb a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private frb a(fer $$0) {
      for (fqy $$1 : this.m) {
         frb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alz $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fqz $$5 = $$4 ? fqz.b($$3) : fqz.a($$3);
      fqy $$6 = new fqy($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      frb $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public frb a(fep $$0) {
      IntList $$1 = (IntList)this.l.get(bae.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alz a() {
      return this.e;
   }

   public frb b() {
      return this.g;
   }

   static record a(fep a, fep b) {
      static final fqx.a c = new fqx.a(frd.b, frd.b);

      fep a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
