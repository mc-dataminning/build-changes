import java.util.List;
import javax.annotation.Nullable;

public class ckc extends cja implements cig {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public ckc(cja.a $$0) {
      super($$0);
      cuw.a(this, cgp.a);
   }

   @Override
   public String j(cjf $$0) {
      return cgy.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      cgv.a($$0, $$2);
   }

   @Override
   public cky c(cjf $$0) {
      return cky.d;
   }

   @Override
   public int b(cjf $$0) {
      return 72000;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      $$1.c($$2);
      return bgz.b($$3);
   }

   @Override
   public boolean a(cjf $$0, cjf $$1) {
      return $$1.a(aqa.b) || super.a($$0, $$1);
   }

   public static cht d(cjf $$0) {
      qw $$1 = cgy.a($$0);
      return $$1 != null ? cht.a($$1.h("Base")) : cht.a;
   }

   @Override
   public biv g() {
      return biv.b;
   }
}
