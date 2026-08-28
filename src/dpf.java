import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpf extends dlg<dyk> implements dtx {
   public static final MapCodec<dpf> b = b(dpf::new);
   public static final ebm<jb> c = dqn.e;
   public static final ebf d = ebe.I;
   private static final ffr e = dmm.b(14.0, 0.0, 14.0);
   private static final wy f = wy.c("container.enderchest");

   @Override
   public MapCodec<dpf> a() {
      return b;
   }

   protected dpf(ean.d $$0) {
      super($$0, () -> dxo.d);
      this.l(this.C.b().b(c, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dou.c<? extends dxu> a(eao $$0, djh $$1, iv $$2, boolean $$3) {
      return dou.b::b;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e;
   }

   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == eww.c));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      cwq $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dyk $$7) {
         iv $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bug.a;
         } else {
            if ($$1 instanceof arq $$10) {
               $$5.a($$7);
               $$3.a(new buo(($$1x, $$2x, $$3x) -> cvl.a($$1x, $$2x, $$5), f));
               $$3.a(awx.aj);
               cpz.a($$10, $$3, true);
            }

            return bug.a;
         }
      } else {
         return bug.a;
      }
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? a($$2, dxo.d, dyk::a) : null;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
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
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dxm $$4 = $$1.c_($$2);
      if ($$4 instanceof dyk) {
         ((dyk)$$4).a();
      }
   }
}
