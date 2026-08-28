import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsf extends dnd implements dkx, dsb {
   public static final MapCodec<dsf> c = b(dsf::new);
   private static final dzd e = dzc.I;
   public static final dzk<jo> d = dzc.T;
   private static final fdo f = dku.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dsf> a() {
      return c;
   }

   public dsf(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dzi.b).b(e, Boolean.valueOf(false)).b(d, jo.c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(awz.bz) || $$1.b_($$2.d()).a(euu.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      if (!$$0.w_()) {
         jj $$5 = $$1.d();
         dym $$6 = dnd.b($$0, $$5, this.m().b(b, dzi.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      if ($$0.c(b) == dzi.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jj $$3 = $$2.e();
         dym $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return true;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      if ($$3.c(dnd.b) == dzi.b) {
         jj $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dkr.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jj $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ap_() {
      return 0.1F;
   }
}
