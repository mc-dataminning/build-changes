import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dkg implements dib, doz {
   public static final MapCodec<dpd> c = b(dpd::new);
   private static final dvu g = dvt.C;
   public static final dvx d = dvt.R;
   protected static final float e = 6.0F;
   protected static final fab f = dhy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpd> a() {
      return c;
   }

   public dpd(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvz.b).b(g, Boolean.valueOf(false)).b(d, jl.c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return f;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.by) || $$1.b_($$2.d()).a(erf.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      if (!$$0.y_()) {
         jg $$5 = $$1.d();
         dvd $$6 = dkg.c($$0, $$5, this.m().b(b, dvz.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(g) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      if ($$0.c(b) == dvz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jg $$3 = $$2.e();
         dvd $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return true;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      if ($$3.c(dkg.b) == dvz.b) {
         jg $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dhv.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jg $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float av_() {
      return 0.1F;
   }
}
