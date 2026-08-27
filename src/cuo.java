import java.util.List;
import javax.annotation.Nullable;

public class cuo extends ctj implements csq {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cuo(ctj.a $$0) {
      super($$0);
      dgd.a(this, crd.a);
   }

   @Override
   public String i(cto $$0) {
      csh $$1 = $$0.a(kb.X);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      crj.a($$0, $$2);
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.d;
   }

   @Override
   public int b(cto $$0) {
      return 72000;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      $$1.c($$2);
      return bpv.b($$3);
   }

   @Override
   public boolean a(cto $$0, cto $$1) {
      return $$1.a(awe.b) || super.a($$0, $$1);
   }

   @Override
   public bsb l() {
      return bsb.b;
   }
}
