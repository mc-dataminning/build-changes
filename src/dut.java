import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dut extends dmm {
   public static final MapCodec<dut> a = b(dut::new);
   private static final wy c = wy.c("container.stonecutter");
   public static final ebm<jb> b = dqn.e;
   private static final ffr d = dmm.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   public dut(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ay);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cxf($$2x, $$3, cvp.a($$1, $$2)), c);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
