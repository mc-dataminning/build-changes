import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dif<duv> implements dqr {
   public static final MapCodec<dmd> b = b(dmd::new);
   public static final dxt<jn> c = dnj.aF;
   public static final dxn d = dxm.J;
   protected static final fbt e = djl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wp f = wp.c("container.enderchest");

   @Override
   public MapCodec<dmd> a() {
      return b;
   }

   protected dmd(dwv.d $$0) {
      super($$0, () -> dua.d);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dlt.c<? extends duf> a(dww $$0, dgh $$1, ji $$2, boolean $$3) {
      return dlt.b::b;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return e;
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == esz.c));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      ctp $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof duv $$7) {
         ji $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsj.a;
         } else {
            if ($$1 instanceof ard $$10) {
               $$5.a($$7);
               $$3.a(new bsr(($$1x, $$2x, $$3x) -> csk.a($$1x, $$2x, $$5), f));
               $$3.a(awk.aj);
               cnl.a($$10, $$3, true);
            }

            return bsj.a;
         }
      } else {
         return bsj.a;
      }
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? a($$2, dua.d, duv::a) : null;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
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
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(d) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      dty $$4 = $$1.c_($$2);
      if ($$4 instanceof duv) {
         ((duv)$$4).b();
      }
   }
}
