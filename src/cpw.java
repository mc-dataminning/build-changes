import java.util.List;
import javax.annotation.Nullable;

public class cpw extends cou implements coa {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cpw(cou.a $$0) {
      super($$0);
      dat.a(this, cmj.a);
   }

   @Override
   public String j(coz $$0) {
      return cms.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      cmp.a($$0, $$2);
   }

   @Override
   public cqs c(coz $$0) {
      return cqs.d;
   }

   @Override
   public int b(coz $$0) {
      return 72000;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      $$1.c($$2);
      return blv.b($$3);
   }

   @Override
   public boolean a(coz $$0, coz $$1) {
      return $$1.a(auh.b) || super.a($$0, $$1);
   }

   public static cnn d(coz $$0) {
      sw $$1 = cms.a($$0);
      return $$1 != null ? cnn.a($$1.h("Base")) : cnn.a;
   }

   @Override
   public bnv g() {
      return bnv.b;
   }
}
