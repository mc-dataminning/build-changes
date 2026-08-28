import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmr extends dly {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final ebf[] b = new ebf[]{ebe.n, ebe.o, ebe.p};
   private static final ffr c = ffo.a(dmm.b(2.0, 2.0, 14.0), dmm.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? null : a($$2, dxo.m, dxq::a);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxq $$5) {
         $$3.a($$5);
         $$3.a(awx.aa);
      }

      return bug.a;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
