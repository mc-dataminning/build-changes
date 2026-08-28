import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dwn {
   private static final Map<String, dwn> l = new Object2ObjectArrayMap();
   public static final Codec<dwn> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dwn b = new dwn(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rk.g), Optional.of(rk.q), Optional.of(rk.F), Optional.of(rk.L)
   );
   public static final dwn c = new dwn(
      "spruce", 0.5F, Optional.of(rk.t), Optional.of(rk.u), Optional.of(rk.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dwn d = new dwn(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rk.A), Optional.of(rk.B), Optional.empty(), Optional.empty()
   );
   public static final dwn e = new dwn("azalea", Optional.empty(), Optional.of(rk.z), Optional.empty());
   public static final dwn f = new dwn("birch", Optional.empty(), Optional.of(rk.l), Optional.of(rk.I));
   public static final dwn g = new dwn("jungle", Optional.of(rk.s), Optional.of(rk.r), Optional.empty());
   public static final dwn h = new dwn("acacia", Optional.empty(), Optional.of(rk.m), Optional.empty());
   public static final dwn i = new dwn("cherry", Optional.empty(), Optional.of(rk.C), Optional.of(rk.N));
   public static final dwn j = new dwn("dark_oak", Optional.of(rk.h), Optional.empty(), Optional.empty());
   public static final dwn k = new dwn("pale_oak", Optional.of(rk.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<aku<efl<?, ?>>> o;
   private final Optional<aku<efl<?, ?>>> p;
   private final Optional<aku<efl<?, ?>>> q;
   private final Optional<aku<efl<?, ?>>> r;
   private final Optional<aku<efl<?, ?>>> s;
   private final Optional<aku<efl<?, ?>>> t;

   public dwn(String $$0, Optional<aku<efl<?, ?>>> $$1, Optional<aku<efl<?, ?>>> $$2, Optional<aku<efl<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dwn(
      String $$0,
      float $$1,
      Optional<aku<efl<?, ?>>> $$2,
      Optional<aku<efl<?, ?>>> $$3,
      Optional<aku<efl<?, ?>>> $$4,
      Optional<aku<efl<?, ?>>> $$5,
      Optional<aku<efl<?, ?>>> $$6,
      Optional<aku<efl<?, ?>>> $$7
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
   private aku<efl<?, ?>> a(azh $$0, boolean $$1) {
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
   private aku<efl<?, ?>> a(azh $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(ard $$0, dyu $$1, ji $$2, dwy $$3, azh $$4) {
      aku<efl<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jr<efl<?, ?>> $$6 = $$0.K_().e(mc.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     efl<?, ?> $$9 = $$6.a();
                     dwy $$10 = djp.a.m();
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

      aku<efl<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jr<efl<?, ?>> $$12 = $$0.K_().e(mc.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            efl<?, ?> $$13 = $$12.a();
            dwy $$14 = $$0.b_($$2).g();
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

   private static boolean a(dwy $$0, dfo $$1, ji $$2, int $$3, int $$4) {
      djn $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dgk $$0, ji $$1) {
      for (ji $$2 : ji.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.V)) {
            return true;
         }
      }

      return false;
   }
}
