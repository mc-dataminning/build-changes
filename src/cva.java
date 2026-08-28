import java.util.List;

public class cva extends ctv implements ctc {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cva(ctv.a $$0) {
      super($$0);
      dhk.a(this, crp.a);
   }

   @Override
   public String h(cua $$0) {
      cst $$1 = $$0.a(kn.Y);
      return $$1 != null ? this.a() + "." + $$1.b() : super.h($$0);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      crv.a($$0, $$2);
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.d;
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 72000;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      $$1.c($$2);
      return bqe.b($$3);
   }

   @Override
   public boolean a(cua $$0, cua $$1) {
      return $$1.a(awd.b) || super.a($$0, $$1);
   }

   @Override
   public bsk m() {
      return bsk.b;
   }
}
