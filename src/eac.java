import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class eac {
   private static final Map<String, eac> l = new Object2ObjectArrayMap();
   public static final Codec<eac> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final eac b = new eac(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rn.g), Optional.of(rn.q), Optional.of(rn.F), Optional.of(rn.M)
   );
   public static final eac c = new eac(
      "spruce", 0.5F, Optional.of(rn.t), Optional.of(rn.u), Optional.of(rn.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final eac d = new eac(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rn.A), Optional.of(rn.B), Optional.empty(), Optional.empty()
   );
   public static final eac e = new eac("azalea", Optional.empty(), Optional.of(rn.z), Optional.empty());
   public static final eac f = new eac("birch", Optional.empty(), Optional.of(rn.l), Optional.of(rn.J));
   public static final eac g = new eac("jungle", Optional.of(rn.s), Optional.of(rn.r), Optional.empty());
   public static final eac h = new eac("acacia", Optional.empty(), Optional.of(rn.m), Optional.empty());
   public static final eac i = new eac("cherry", Optional.empty(), Optional.of(rn.C), Optional.of(rn.O));
   public static final eac j = new eac("dark_oak", Optional.of(rn.h), Optional.empty(), Optional.empty());
   public static final eac k = new eac("pale_oak", Optional.of(rn.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alf<ejf<?, ?>>> o;
   private final Optional<alf<ejf<?, ?>>> p;
   private final Optional<alf<ejf<?, ?>>> q;
   private final Optional<alf<ejf<?, ?>>> r;
   private final Optional<alf<ejf<?, ?>>> s;
   private final Optional<alf<ejf<?, ?>>> t;

   public eac(String $$0, Optional<alf<ejf<?, ?>>> $$1, Optional<alf<ejf<?, ?>>> $$2, Optional<alf<ejf<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public eac(
      String $$0,
      float $$1,
      Optional<alf<ejf<?, ?>>> $$2,
      Optional<alf<ejf<?, ?>>> $$3,
      Optional<alf<ejf<?, ?>>> $$4,
      Optional<alf<ejf<?, ?>>> $$5,
      Optional<alf<ejf<?, ?>>> $$6,
      Optional<alf<ejf<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private alf<ejf<?, ?>> a(azv $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private alf<ejf<?, ?>> a(azv $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(arq $$0, ecm $$1, iv $$2, eao $$3, azv $$4) {
      alf<ejf<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jf<ejf<?, ?>> $$6 = $$0.F_().f(mh.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ejf<?, ?> $$9 = $$6.a();
                     eao $$10 = dmo.a.m();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                     return false;
                  }
               }
            }
         }
      }

      alf<ejf<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jf<ejf<?, ?>> $$12 = $$0.F_().f(mh.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ejf<?, ?> $$13 = $$12.a();
            eao $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 260);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 260);
               return false;
            }
         }
      }
   }

   private static boolean a(eao $$0, din $$1, iv $$2, int $$3, int $$4) {
      dmm $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dji $$0, iv $$1) {
      for (iv $$2 : iv.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axc.V)) {
            return true;
         }
      }

      return false;
   }
}
