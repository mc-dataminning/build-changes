import java.util.List;
import javax.annotation.Nullable;

public class cod extends cnb implements cmi {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cod(cnb.a $$0) {
      super($$0);
      czd.a(this, ckr.a);
   }

   @Override
   public String j(cng $$0) {
      return cla.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      ckx.a($$0, $$2);
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.d;
   }

   @Override
   public int b(cng $$0) {
      return 72000;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      $$1.c($$2);
      return bkd.b($$3);
   }

   @Override
   public boolean a(cng $$0, cng $$1) {
      return $$1.a(asq.b) || super.a($$0, $$1);
   }

   public static clv d(cng $$0) {
      so $$1 = cla.a($$0);
      return $$1 != null ? clv.a($$1.h("Base")) : clv.a;
   }

   @Override
   public bmd g() {
      return bmd.b;
   }
}
