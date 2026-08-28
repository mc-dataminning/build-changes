import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dus {
   private static final Map<String, dus> k = new Object2ObjectArrayMap();
   public static final Codec<dus> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dus b = new dus(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sd.g), Optional.of(sd.n), Optional.of(sd.C), Optional.of(sd.I)
   );
   public static final dus c = new dus(
      "spruce", 0.5F, Optional.of(sd.q), Optional.of(sd.r), Optional.of(sd.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dus d = new dus(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sd.x), Optional.of(sd.y), Optional.empty(), Optional.empty()
   );
   public static final dus e = new dus("azalea", Optional.empty(), Optional.of(sd.w), Optional.empty());
   public static final dus f = new dus("birch", Optional.empty(), Optional.of(sd.i), Optional.of(sd.F));
   public static final dus g = new dus("jungle", Optional.of(sd.p), Optional.of(sd.o), Optional.empty());
   public static final dus h = new dus("acacia", Optional.empty(), Optional.of(sd.j), Optional.empty());
   public static final dus i = new dus("cherry", Optional.empty(), Optional.of(sd.z), Optional.of(sd.K));
   public static final dus j = new dus("dark_oak", Optional.of(sd.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<alg<edr<?, ?>>> n;
   private final Optional<alg<edr<?, ?>>> o;
   private final Optional<alg<edr<?, ?>>> p;
   private final Optional<alg<edr<?, ?>>> q;
   private final Optional<alg<edr<?, ?>>> r;
   private final Optional<alg<edr<?, ?>>> s;

   public dus(String $$0, Optional<alg<edr<?, ?>>> $$1, Optional<alg<edr<?, ?>>> $$2, Optional<alg<edr<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dus(
      String $$0,
      float $$1,
      Optional<alg<edr<?, ?>>> $$2,
      Optional<alg<edr<?, ?>>> $$3,
      Optional<alg<edr<?, ?>>> $$4,
      Optional<alg<edr<?, ?>>> $$5,
      Optional<alg<edr<?, ?>>> $$6,
      Optional<alg<edr<?, ?>>> $$7
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
   private alg<edr<?, ?>> a(azr $$0, boolean $$1) {
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
   private alg<edr<?, ?>> a(azr $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arm $$0, dxa $$1, jg $$2, dvd $$3, azr $$4) {
      alg<edr<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jp<edr<?, ?>> $$6 = $$0.H_().e(ly.aJ).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     edr<?, ?> $$9 = $$6.a();
                     dvd $$10 = dia.a.m();
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

      alg<edr<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jp<edr<?, ?>> $$12 = $$0.H_().e(ly.aJ).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            edr<?, ?> $$13 = $$12.a();
            dvd $$14 = $$0.b_($$2).g();
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

   private static boolean a(dvd $$0, dea $$1, jg $$2, int $$3, int $$4) {
      dhy $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dew $$0, jg $$1) {
      for (jg $$2 : jg.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awz.V)) {
            return true;
         }
      }

      return false;
   }
}
