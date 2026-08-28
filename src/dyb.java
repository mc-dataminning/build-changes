import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dyb {
   private static final Map<String, dyb> l = new Object2ObjectArrayMap();
   public static final Codec<dyb> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dyb b = new dyb(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rm.g), Optional.of(rm.q), Optional.of(rm.F), Optional.of(rm.M)
   );
   public static final dyb c = new dyb(
      "spruce", 0.5F, Optional.of(rm.t), Optional.of(rm.u), Optional.of(rm.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dyb d = new dyb(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rm.A), Optional.of(rm.B), Optional.empty(), Optional.empty()
   );
   public static final dyb e = new dyb("azalea", Optional.empty(), Optional.of(rm.z), Optional.empty());
   public static final dyb f = new dyb("birch", Optional.empty(), Optional.of(rm.l), Optional.of(rm.J));
   public static final dyb g = new dyb("jungle", Optional.of(rm.s), Optional.of(rm.r), Optional.empty());
   public static final dyb h = new dyb("acacia", Optional.empty(), Optional.of(rm.m), Optional.empty());
   public static final dyb i = new dyb("cherry", Optional.empty(), Optional.of(rm.C), Optional.of(rm.O));
   public static final dyb j = new dyb("dark_oak", Optional.of(rm.h), Optional.empty(), Optional.empty());
   public static final dyb k = new dyb("pale_oak", Optional.of(rm.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alc<ehd<?, ?>>> o;
   private final Optional<alc<ehd<?, ?>>> p;
   private final Optional<alc<ehd<?, ?>>> q;
   private final Optional<alc<ehd<?, ?>>> r;
   private final Optional<alc<ehd<?, ?>>> s;
   private final Optional<alc<ehd<?, ?>>> t;

   public dyb(String $$0, Optional<alc<ehd<?, ?>>> $$1, Optional<alc<ehd<?, ?>>> $$2, Optional<alc<ehd<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dyb(
      String $$0,
      float $$1,
      Optional<alc<ehd<?, ?>>> $$2,
      Optional<alc<ehd<?, ?>>> $$3,
      Optional<alc<ehd<?, ?>>> $$4,
      Optional<alc<ehd<?, ?>>> $$5,
      Optional<alc<ehd<?, ?>>> $$6,
      Optional<alc<ehd<?, ?>>> $$7
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
   private alc<ehd<?, ?>> a(azs $$0, boolean $$1) {
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
   private alc<ehd<?, ?>> a(azs $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(arn $$0, eak $$1, jj $$2, dym $$3, azs $$4) {
      alc<ehd<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         js<ehd<?, ?>> $$6 = $$0.F_().f(me.aP).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ehd<?, ?> $$9 = $$6.a();
                     dym $$10 = dkw.a.m();
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

      alc<ehd<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         js<ehd<?, ?>> $$12 = $$0.F_().f(me.aP).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ehd<?, ?> $$13 = $$12.a();
            dym $$14 = $$0.b_($$2).g();
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

   private static boolean a(dym $$0, dgv $$1, jj $$2, int $$3, int $$4) {
      dku $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dhq $$0, jj $$1) {
      for (jj $$2 : jj.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awz.V)) {
            return true;
         }
      }

      return false;
   }
}
