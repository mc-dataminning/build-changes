import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends die<duu> implements dqq {
   public static final MapCodec<dmc> b = b(dmc::new);
   public static final dxs<jn> c = dni.aF;
   public static final dxm d = dxl.J;
   protected static final fbs e = djk.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wo f = wo.c("container.enderchest");

   @Override
   public MapCodec<dmc> a() {
      return b;
   }

   protected dmc(dwu.d $$0) {
      super($$0, () -> dtz.d);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dls.c<? extends due> a(dwv $$0, dgg $$1, ji $$2, boolean $$3) {
      return dls.b::b;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e;
   }

   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == esy.c));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      cto $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof duu $$7) {
         ji $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsi.a;
         } else {
            if ($$1 instanceof arc $$10) {
               $$5.a($$7);
               $$3.a(new bsq(($$1x, $$2x, $$3x) -> csj.a($$1x, $$2x, $$5), f));
               $$3.a(awj.aj);
               cnk.a($$10, $$3, true);
            }

            return bsi.a;
         }
      } else {
         return bsi.a;
      }
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? a($$2, dtz.d, duu::a) : null;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lt.ae, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(d) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      dtx $$4 = $$1.c_($$2);
      if ($$4 instanceof duu) {
         ((duu)$$4).b();
      }
   }
}
