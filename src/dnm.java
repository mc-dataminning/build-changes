import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends djo<dwj> implements dsb {
   public static final MapCodec<dnm> b = b(dnm::new);
   public static final dzk<jo> c = dot.e;
   public static final dzd d = dzc.I;
   private static final fdo e = dku.b(14.0, 0.0, 14.0);
   private static final wv f = wv.c("container.enderchest");

   @Override
   public MapCodec<dnm> a() {
      return b;
   }

   protected dnm(dyl.d $$0) {
      super($$0, () -> dvn.d);
      this.l(this.B.b().b(c, jo.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dnc.c<? extends dvt> a(dym $$0, dhp $$1, jj $$2, boolean $$3) {
      return dnc.b::b;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e;
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == euu.c));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      cvb $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dwj $$7) {
         jj $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return btq.a;
         } else {
            if ($$1 instanceof arn $$10) {
               $$5.a($$7);
               $$3.a(new bty(($$1x, $$2x, $$3x) -> ctw.a($$1x, $$2x, $$5), f));
               $$3.a(awu.aj);
               coy.a($$10, $$3, true);
            }

            return btq.a;
         }
      } else {
         return btq.a;
      }
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? a($$2, dvn.d, dwj::a) : null;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lv.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dvl $$4 = $$1.c_($$2);
      if ($$4 instanceof dwj) {
         ((dwj)$$4).a();
      }
   }
}
