import java.util.List;
import javax.annotation.Nullable;

public class cly extends ckw implements ckc {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cly(ckw.a $$0) {
      super($$0);
      cwx.a(this, cil.a);
   }

   @Override
   public String j(clb $$0) {
      return ciu.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      cir.a($$0, $$2);
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.d;
   }

   @Override
   public int b(clb $$0) {
      return 72000;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      $$1.c($$2);
      return bir.b($$3);
   }

   @Override
   public boolean a(clb $$0, clb $$1) {
      return $$1.a(ark.b) || super.a($$0, $$1);
   }

   public static cjp d(clb $$0) {
      rz $$1 = ciu.a($$0);
      return $$1 != null ? cjp.a($$1.h("Base")) : cjp.a;
   }

   @Override
   public bkn g() {
      return bkn.b;
   }
}
