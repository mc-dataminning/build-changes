import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dxf {
   private static final Map<String, dxf> l = new Object2ObjectArrayMap();
   public static final Codec<dxf> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dxf b = new dxf(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rk.g), Optional.of(rk.q), Optional.of(rk.F), Optional.of(rk.M)
   );
   public static final dxf c = new dxf(
      "spruce", 0.5F, Optional.of(rk.t), Optional.of(rk.u), Optional.of(rk.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dxf d = new dxf(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rk.A), Optional.of(rk.B), Optional.empty(), Optional.empty()
   );
   public static final dxf e = new dxf("azalea", Optional.empty(), Optional.of(rk.z), Optional.empty());
   public static final dxf f = new dxf("birch", Optional.empty(), Optional.of(rk.l), Optional.of(rk.J));
   public static final dxf g = new dxf("jungle", Optional.of(rk.s), Optional.of(rk.r), Optional.empty());
   public static final dxf h = new dxf("acacia", Optional.empty(), Optional.of(rk.m), Optional.empty());
   public static final dxf i = new dxf("cherry", Optional.empty(), Optional.of(rk.C), Optional.of(rk.O));
   public static final dxf j = new dxf("dark_oak", Optional.of(rk.h), Optional.empty(), Optional.empty());
   public static final dxf k = new dxf("pale_oak", Optional.of(rk.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<akt<egg<?, ?>>> o;
   private final Optional<akt<egg<?, ?>>> p;
   private final Optional<akt<egg<?, ?>>> q;
   private final Optional<akt<egg<?, ?>>> r;
   private final Optional<akt<egg<?, ?>>> s;
   private final Optional<akt<egg<?, ?>>> t;

   public dxf(String $$0, Optional<akt<egg<?, ?>>> $$1, Optional<akt<egg<?, ?>>> $$2, Optional<akt<egg<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dxf(
      String $$0,
      float $$1,
      Optional<akt<egg<?, ?>>> $$2,
      Optional<akt<egg<?, ?>>> $$3,
      Optional<akt<egg<?, ?>>> $$4,
      Optional<akt<egg<?, ?>>> $$5,
      Optional<akt<egg<?, ?>>> $$6,
      Optional<akt<egg<?, ?>>> $$7
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
   private akt<egg<?, ?>> a(azh $$0, boolean $$1) {
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
   private akt<egg<?, ?>> a(azh $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(ard $$0, dzn $$1, ji $$2, dxq $$3, azh $$4) {
      akt<egg<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jr<egg<?, ?>> $$6 = $$0.F_().e(mc.aM).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     egg<?, ?> $$9 = $$6.a();
                     dxq $$10 = dkg.a.m();
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

      akt<egg<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jr<egg<?, ?>> $$12 = $$0.F_().e(mc.aM).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            egg<?, ?> $$13 = $$12.a();
            dxq $$14 = $$0.b_($$2).g();
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

   private static boolean a(dxq $$0, dgf $$1, ji $$2, int $$3, int $$4) {
      dke $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dha $$0, ji $$1) {
      for (ji $$2 : ji.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.V)) {
            return true;
         }
      }

      return false;
   }
}
