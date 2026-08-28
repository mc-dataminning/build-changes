import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eoz extends epw {
   public static final MapCodec<eoz> a = Codec.FLOAT.fieldOf("mossiness").xmap(eoz::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dvj[] e = new dvj[]{dig.jD.m(), dig.jK.m()};
   private final float f;

   public eoz(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      azs $$6 = $$5.b($$4.a());
      dvj $$7 = $$4.b();
      jh $$8 = $$4.a();
      dvj $$9 = null;
      if ($$7.a(dig.eH) || $$7.a(dig.b) || $$7.a(dig.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axa.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axa.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axa.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dig.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new epz.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dvj a(azs $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvj[] $$1 = new dvj[]{dig.eJ.m(), a($$0, dig.fj)};
         dvj[] $$2 = new dvj[]{dig.eI.m(), a($$0, dig.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dvj a(azs $$0, dvj $$1) {
      jm $$2 = $$1.c(dpy.b);
      dwi $$3 = $$1.c(dpy.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvj[] $$4 = new dvj[]{dig.ng.m().b(dpy.b, $$2).b(dpy.c, $$3), dig.nu.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dvj b(azs $$0) {
      return $$0.i() < this.f ? dig.nu.m() : null;
   }

   @Nullable
   private dvj c(azs $$0) {
      return $$0.i() < this.f ? dig.nI.m() : null;
   }

   @Nullable
   private dvj d(azs $$0) {
      return $$0.i() < 0.15F ? dig.pk.m() : null;
   }

   private static dvj a(azs $$0, die $$1) {
      return $$1.m().b(dpy.b, jm.c.a.a($$0)).b(dpy.c, ae.a(dwi.values(), $$0));
   }

   private dvj a(azs $$0, dvj[] $$1, dvj[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dvj a(azs $$0, dvj[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected epy<?> a() {
      return epy.k;
   }
}
