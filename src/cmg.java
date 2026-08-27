import java.util.List;
import javax.annotation.Nullable;

public class cmg extends cle implements ckk {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cmg(cle.a $$0) {
      super($$0);
      cxf.a(this, cit.a);
   }

   @Override
   public String j(clj $$0) {
      return cjc.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      ciz.a($$0, $$2);
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.d;
   }

   @Override
   public int b(clj $$0) {
      return 72000;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      $$1.c($$2);
      return biy.b($$3);
   }

   @Override
   public boolean a(clj $$0, clj $$1) {
      return $$1.a(aro.b) || super.a($$0, $$1);
   }

   public static cjx d(clj $$0) {
      rz $$1 = cjc.a($$0);
      return $$1 != null ? cjx.a($$1.h("Base")) : cjx.a;
   }

   @Override
   public bkv g() {
      return bkv.b;
   }
}
