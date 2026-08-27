import java.util.List;
import javax.annotation.Nullable;

public class cml extends clj implements ckp {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cml(clj.a $$0) {
      super($$0);
      cxk.a(this, ciy.a);
   }

   @Override
   public String j(clo $$0) {
      return cjh.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      cje.a($$0, $$2);
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.d;
   }

   @Override
   public int b(clo $$0) {
      return 72000;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      $$1.c($$2);
      return bjc.b($$3);
   }

   @Override
   public boolean a(clo $$0, clo $$1) {
      return $$1.a(ars.b) || super.a($$0, $$1);
   }

   public static ckc d(clo $$0) {
      sd $$1 = cjh.a($$0);
      return $$1 != null ? ckc.a($$1.h("Base")) : ckc.a;
   }

   @Override
   public bla g() {
      return bla.b;
   }
}
