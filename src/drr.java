import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class drr {
   private static final Map<String, drr> k = new Object2ObjectArrayMap();
   public static final Codec<drr> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final drr b = new drr(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sn.g), Optional.of(sn.n), Optional.of(sn.C), Optional.of(sn.I)
   );
   public static final drr c = new drr(
      "spruce", 0.5F, Optional.of(sn.q), Optional.of(sn.r), Optional.of(sn.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final drr d = new drr(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sn.x), Optional.of(sn.y), Optional.empty(), Optional.empty()
   );
   public static final drr e = new drr("azalea", Optional.empty(), Optional.of(sn.w), Optional.empty());
   public static final drr f = new drr("birch", Optional.empty(), Optional.of(sn.i), Optional.of(sn.F));
   public static final drr g = new drr("jungle", Optional.of(sn.p), Optional.of(sn.o), Optional.empty());
   public static final drr h = new drr("acacia", Optional.empty(), Optional.of(sn.j), Optional.empty());
   public static final drr i = new drr("cherry", Optional.empty(), Optional.of(sn.z), Optional.of(sn.K));
   public static final drr j = new drr("dark_oak", Optional.of(sn.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ale<eal<?, ?>>> n;
   private final Optional<ale<eal<?, ?>>> o;
   private final Optional<ale<eal<?, ?>>> p;
   private final Optional<ale<eal<?, ?>>> q;
   private final Optional<ale<eal<?, ?>>> r;
   private final Optional<ale<eal<?, ?>>> s;

   public drr(String $$0, Optional<ale<eal<?, ?>>> $$1, Optional<ale<eal<?, ?>>> $$2, Optional<ale<eal<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public drr(
      String $$0,
      float $$1,
      Optional<ale<eal<?, ?>>> $$2,
      Optional<ale<eal<?, ?>>> $$3,
      Optional<ale<eal<?, ?>>> $$4,
      Optional<ale<eal<?, ?>>> $$5,
      Optional<ale<eal<?, ?>>> $$6,
      Optional<ale<eal<?, ?>>> $$7
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
   private ale<eal<?, ?>> a(azh $$0, boolean $$1) {
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
   private ale<eal<?, ?>> a(azh $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arf $$0, dtz $$1, iz $$2, dsc $$3, azh $$4) {
      ale<eal<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ji<eal<?, ?>> $$6 = $$0.H_().d(lq.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eal<?, ?> $$9 = $$6.a();
                     dsc $$10 = dfb.a.o();
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

      ale<eal<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ji<eal<?, ?>> $$12 = $$0.H_().d(lq.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eal<?, ?> $$13 = $$12.a();
            dsc $$14 = $$0.b_($$2).g();
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

   private static boolean a(dsc $$0, dbe $$1, iz $$2, int $$3, int $$4) {
      dez $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dbz $$0, iz $$1) {
      for (iz $$2 : iz.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.U)) {
            return true;
         }
      }

      return false;
   }
}
