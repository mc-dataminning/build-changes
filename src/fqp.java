public class fqp implements fpz<dec> {
   private final fta a;

   public fqp(fqa.a $$0) {
      this.a = $$0.c();
   }

   public void a(dec $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.0F, 0.5F);
      cos $$6 = $$0.d();
      bil $$7 = $$6.a($$0.k(), $$0.k().y_(), $$0.p());
      if ($$7 != null) {
         float $$8 = 0.53125F;
         float $$9 = Math.max($$7.df(), $$7.dg());
         if ((double)$$9 > 1.0) {
            $$8 /= $$9;
         }

         $$2.a(0.0F, 0.4F, 0.0F);
         $$2.a(a.d.rotationDegrees((float)ars.d((double)$$1, $$6.b(), $$6.a()) * 10.0F));
         $$2.a(0.0F, -0.2F, 0.0F);
         $$2.a(a.b.rotationDegrees(-30.0F));
         $$2.b($$8, $$8, $$8);
         this.a.a($$7, 0.0, 0.0, 0.0, 0.0F, $$1, $$2, $$3, $$4);
      }

      $$2.b();
   }
}
