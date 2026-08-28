import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epd extends eqa {
   public static final MapCodec<epd> a = Codec.FLOAT.fieldOf("mossiness").xmap(epd::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dvo[] e = new dvo[]{dil.jD.m(), dil.jK.m()};
   private final float f;

   public epd(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      azv $$6 = $$5.b($$4.a());
      dvo $$7 = $$4.b();
      jh $$8 = $$4.a();
      dvo $$9 = null;
      if ($$7.a(dil.eH) || $$7.a(dil.b) || $$7.a(dil.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axd.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axd.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axd.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dil.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eqd.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dvo a(azv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvo[] $$1 = new dvo[]{dil.eJ.m(), a($$0, dil.fj)};
         dvo[] $$2 = new dvo[]{dil.eI.m(), a($$0, dil.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dvo a(azv $$0, dvo $$1) {
      jm $$2 = $$1.c(dqd.b);
      dwm $$3 = $$1.c(dqd.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvo[] $$4 = new dvo[]{dil.ng.m().b(dqd.b, $$2).b(dqd.c, $$3), dil.nu.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dvo b(azv $$0) {
      return $$0.i() < this.f ? dil.nu.m() : null;
   }

   @Nullable
   private dvo c(azv $$0) {
      return $$0.i() < this.f ? dil.nI.m() : null;
   }

   @Nullable
   private dvo d(azv $$0) {
      return $$0.i() < 0.15F ? dil.pk.m() : null;
   }

   private static dvo a(azv $$0, dij $$1) {
      return $$1.m().b(dqd.b, jm.c.a.a($$0)).b(dqd.c, ae.a(dwm.values(), $$0));
   }

   private dvo a(azv $$0, dvo[] $$1, dvo[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dvo a(azv $$0, dvo[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eqc<?> a() {
      return eqc.k;
   }
}
