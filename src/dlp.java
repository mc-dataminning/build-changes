import com.mojang.serialization.MapCodec;

public class dlp extends dmm implements dmp {
   public static final MapCodec<dlp> a = b(dlp::new);
   private static final ffr b = dmm.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         return $$4 == jb.b && $$6.a(dmo.nF) ? dmo.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(czo.ej);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.a($$0, $$2);
   }

   protected void a(djh $$0, iv $$1) {
      $$0.a($$1.d(), dmo.nF.m().b(dlq.c, eba.b), 3);
   }
}
