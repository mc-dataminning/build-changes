import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dqs {
   private static final Map<String, dqs> k = new Object2ObjectArrayMap();
   public static final Codec<dqs> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dqs b = new dqs(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(ry.g), Optional.of(ry.n), Optional.of(ry.C), Optional.of(ry.I)
   );
   public static final dqs c = new dqs(
      "spruce", 0.5F, Optional.of(ry.q), Optional.of(ry.r), Optional.of(ry.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dqs d = new dqs(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(ry.x), Optional.of(ry.y), Optional.empty(), Optional.empty()
   );
   public static final dqs e = new dqs("azalea", Optional.empty(), Optional.of(ry.w), Optional.empty());
   public static final dqs f = new dqs("birch", Optional.empty(), Optional.of(ry.i), Optional.of(ry.F));
   public static final dqs g = new dqs("jungle", Optional.of(ry.p), Optional.of(ry.o), Optional.empty());
   public static final dqs h = new dqs("acacia", Optional.empty(), Optional.of(ry.j), Optional.empty());
   public static final dqs i = new dqs("cherry", Optional.empty(), Optional.of(ry.z), Optional.of(ry.K));
   public static final dqs j = new dqs("dark_oak", Optional.of(ry.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akm<dzm<?, ?>>> n;
   private final Optional<akm<dzm<?, ?>>> o;
   private final Optional<akm<dzm<?, ?>>> p;
   private final Optional<akm<dzm<?, ?>>> q;
   private final Optional<akm<dzm<?, ?>>> r;
   private final Optional<akm<dzm<?, ?>>> s;

   public dqs(String $$0, Optional<akm<dzm<?, ?>>> $$1, Optional<akm<dzm<?, ?>>> $$2, Optional<akm<dzm<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dqs(
      String $$0,
      float $$1,
      Optional<akm<dzm<?, ?>>> $$2,
      Optional<akm<dzm<?, ?>>> $$3,
      Optional<akm<dzm<?, ?>>> $$4,
      Optional<akm<dzm<?, ?>>> $$5,
      Optional<akm<dzm<?, ?>>> $$6,
      Optional<akm<dzm<?, ?>>> $$7
   ) {
      this.l = $$0;
      this.m = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.q = $$5;
      this.r = $$6;
      this.s = $$7;
      k.put($$0, this);
   }

   @Nullable
   private akm<dzm<?, ?>> a(aym $$0, boolean $$1) {
      if ($$0.i() < this.m) {
         if ($$1 && this.s.isPresent()) {
            return this.s.get();
         }

         if (this.q.isPresent()) {
            return this.q.get();
         }
      }

      return $$1 && this.r.isPresent() ? this.r.get() : this.p.orElse(null);
   }

   @Nullable
   private akm<dzm<?, ?>> a(aym $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqn $$0, dta $$1, io $$2, drd $$3, aym $$4) {
      akm<dzm<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ix<dzm<?, ?>> $$6 = $$0.H_().d(lf.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dzm<?, ?> $$9 = $$6.a();
                     drd $$10 = dec.a.n();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      akm<dzm<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ix<dzm<?, ?>> $$12 = $$0.H_().d(lf.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dzm<?, ?> $$13 = $$12.a();
            drd $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(drd $$0, daf $$1, io $$2, int $$3, int $$4) {
      dea $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dba $$0, io $$1) {
      for (io $$2 : io.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avx.U)) {
            return true;
         }
      }

      return false;
   }
}
