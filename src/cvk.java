import java.util.List;

public class cvk extends cuf implements ctm {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cvk(cuf.a $$0) {
      super($$0);
      dgz.a(this, crz.a);
   }

   @Override
   public String i(cuk $$0) {
      ctd $$1 = $$0.a(km.X);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      csf.a($$0, $$2);
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.d;
   }

   @Override
   public int b(cuk $$0) {
      return 72000;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      $$1.c($$2);
      return bqq.b($$3);
   }

   @Override
   public boolean a(cuk $$0, cuk $$1) {
      return $$1.a(awu.b) || super.a($$0, $$1);
   }

   @Override
   public bsw m() {
      return bsw.b;
   }
}
