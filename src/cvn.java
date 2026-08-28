import java.util.List;

public class cvn extends cui implements ctp {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cvn(cui.a $$0) {
      super($$0);
      dhc.a(this, csc.a);
   }

   @Override
   public String i(cun $$0) {
      ctg $$1 = $$0.a(km.X);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      csi.a($$0, $$2);
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.d;
   }

   @Override
   public int b(cun $$0) {
      return 72000;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      $$1.c($$2);
      return bqt.b($$3);
   }

   @Override
   public boolean a(cun $$0, cun $$1) {
      return $$1.a(awx.b) || super.a($$0, $$1);
   }

   @Override
   public bsz m() {
      return bsz.b;
   }
}
