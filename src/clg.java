import java.util.List;
import javax.annotation.Nullable;

public class clg extends cke implements cjk {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public clg(cke.a $$0) {
      super($$0);
      cwd.a(this, cht.a);
   }

   @Override
   public String j(ckj $$0) {
      return cic.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      chz.a($$0, $$2);
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.d;
   }

   @Override
   public int b(ckj $$0) {
      return 72000;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      $$1.c($$2);
      return bic.b($$3);
   }

   @Override
   public boolean a(ckj $$0, ckj $$1) {
      return $$1.a(ara.b) || super.a($$0, $$1);
   }

   public static cix d(ckj $$0) {
      rt $$1 = cic.a($$0);
      return $$1 != null ? cix.a($$1.h("Base")) : cix.a;
   }

   @Override
   public bjy g() {
      return bjy.b;
   }
}
