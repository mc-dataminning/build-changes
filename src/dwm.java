import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dwm {
   private static final Map<String, dwm> l = new Object2ObjectArrayMap();
   public static final Codec<dwm> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dwm b = new dwm(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rk.g), Optional.of(rk.q), Optional.of(rk.F), Optional.of(rk.L)
   );
   public static final dwm c = new dwm(
      "spruce", 0.5F, Optional.of(rk.t), Optional.of(rk.u), Optional.of(rk.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dwm d = new dwm(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rk.A), Optional.of(rk.B), Optional.empty(), Optional.empty()
   );
   public static final dwm e = new dwm("azalea", Optional.empty(), Optional.of(rk.z), Optional.empty());
   public static final dwm f = new dwm("birch", Optional.empty(), Optional.of(rk.l), Optional.of(rk.I));
   public static final dwm g = new dwm("jungle", Optional.of(rk.s), Optional.of(rk.r), Optional.empty());
   public static final dwm h = new dwm("acacia", Optional.empty(), Optional.of(rk.m), Optional.empty());
   public static final dwm i = new dwm("cherry", Optional.empty(), Optional.of(rk.C), Optional.of(rk.N));
   public static final dwm j = new dwm("dark_oak", Optional.of(rk.h), Optional.empty(), Optional.empty());
   public static final dwm k = new dwm("pale_oak", Optional.of(rk.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<aku<efk<?, ?>>> o;
   private final Optional<aku<efk<?, ?>>> p;
   private final Optional<aku<efk<?, ?>>> q;
   private final Optional<aku<efk<?, ?>>> r;
   private final Optional<aku<efk<?, ?>>> s;
   private final Optional<aku<efk<?, ?>>> t;

   public dwm(String $$0, Optional<aku<efk<?, ?>>> $$1, Optional<aku<efk<?, ?>>> $$2, Optional<aku<efk<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dwm(
      String $$0,
      float $$1,
      Optional<aku<efk<?, ?>>> $$2,
      Optional<aku<efk<?, ?>>> $$3,
      Optional<aku<efk<?, ?>>> $$4,
      Optional<aku<efk<?, ?>>> $$5,
      Optional<aku<efk<?, ?>>> $$6,
      Optional<aku<efk<?, ?>>> $$7
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
   private aku<efk<?, ?>> a(azh $$0, boolean $$1) {
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
   private aku<efk<?, ?>> a(azh $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(ard $$0, dyt $$1, ji $$2, dwx $$3, azh $$4) {
      aku<efk<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jr<efk<?, ?>> $$6 = $$0.K_().e(mc.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     efk<?, ?> $$9 = $$6.a();
                     dwx $$10 = djo.a.m();
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

      aku<efk<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jr<efk<?, ?>> $$12 = $$0.K_().e(mc.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            efk<?, ?> $$13 = $$12.a();
            dwx $$14 = $$0.b_($$2).g();
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

   private static boolean a(dwx $$0, dfn $$1, ji $$2, int $$3, int $$4) {
      djm $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dgj $$0, ji $$1) {
      for (ji $$2 : ji.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.V)) {
            return true;
         }
      }

      return false;
   }
}
