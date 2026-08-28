import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpk extends dll<dyp> implements duc {
   public static final MapCodec<dpk> b = b(dpk::new);
   public static final ebr<jb> c = dqs.e;
   public static final ebk d = ebj.I;
   private static final ffw e = dmr.b(14.0, 0.0, 14.0);
   private static final wy f = wy.c("container.enderchest");

   @Override
   public MapCodec<dpk> a() {
      return b;
   }

   protected dpk(eas.d $$0) {
      super($$0, () -> dxt.d);
      this.l(this.C.b().b(c, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public doz.c<? extends dxz> a(eat $$0, djm $$1, iv $$2, boolean $$3) {
      return doz.b::b;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e;
   }

   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == exb.c));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      cwt $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dyp $$7) {
         iv $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bug.a;
         } else {
            if ($$1 instanceof arq $$10) {
               $$5.a($$7);
               $$3.a(new buo(($$1x, $$2x, $$3x) -> cvo.a($$1x, $$2x, $$5), f));
               $$3.a(awx.aj);
               cqc.a($$10, $$3, true);
            }

            return bug.a;
         }
      } else {
         return bug.a;
      }
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? a($$2, dxt.d, dyp::a) : null;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ly.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dxr $$4 = $$1.c_($$2);
      if ($$4 instanceof dyp) {
         ((dyp)$$4).a();
      }
   }
}
