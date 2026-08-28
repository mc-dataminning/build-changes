import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eoi extends epf {
   public static final MapCodec<eoi> a = Codec.FLOAT.fieldOf("mossiness").xmap(eoi::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dus[] e = new dus[]{dho.jD.n(), dho.jK.n()};
   private final float f;

   public eoi(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      azn $$6 = $$5.b($$4.a());
      dus $$7 = $$4.b();
      jf $$8 = $$4.a();
      dus $$9 = null;
      if ($$7.a(dho.eH) || $$7.a(dho.b) || $$7.a(dho.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awv.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awv.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awv.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dho.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new epi.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dus a(azn $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dus[] $$1 = new dus[]{dho.eJ.n(), a($$0, dho.fj)};
         dus[] $$2 = new dus[]{dho.eI.n(), a($$0, dho.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dus a(azn $$0, dus $$1) {
      jk $$2 = $$1.c(dph.b);
      dvr $$3 = $$1.c(dph.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dus[] $$4 = new dus[]{dho.ng.n().b(dph.b, $$2).b(dph.c, $$3), dho.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dus b(azn $$0) {
      return $$0.i() < this.f ? dho.nu.n() : null;
   }

   @Nullable
   private dus c(azn $$0) {
      return $$0.i() < this.f ? dho.nI.n() : null;
   }

   @Nullable
   private dus d(azn $$0) {
      return $$0.i() < 0.15F ? dho.pk.n() : null;
   }

   private static dus a(azn $$0, dhm $$1) {
      return $$1.n().b(dph.b, jk.c.a.a($$0)).b(dph.c, ad.a(dvr.values(), $$0));
   }

   private dus a(azn $$0, dus[] $$1, dus[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dus a(azn $$0, dus[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eph<?> a() {
      return eph.k;
   }
}
