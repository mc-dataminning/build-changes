import java.util.List;
import javax.annotation.Nullable;

public class cnv extends cmt implements clz {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cnv(cmt.a $$0) {
      super($$0);
      cyv.a(this, cki.a);
   }

   @Override
   public String j(cmy $$0) {
      return ckr.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      cko.a($$0, $$2);
   }

   @Override
   public cos c(cmy $$0) {
      return cos.d;
   }

   @Override
   public int b(cmy $$0) {
      return 72000;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      $$1.c($$2);
      return bkc.b($$3);
   }

   @Override
   public boolean a(cmy $$0, cmy $$1) {
      return $$1.a(asp.b) || super.a($$0, $$1);
   }

   public static clm d(cmy $$0) {
      sn $$1 = ckr.a($$0);
      return $$1 != null ? clm.a($$1.h("Base")) : clm.a;
   }

   @Override
   public bma g() {
      return bma.b;
   }
}
