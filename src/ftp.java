public class ftp implements fsz<dgv> {
   private final fwa a;

   public ftp(fta.a $$0) {
      this.a = $$0.c();
   }

   public void a(dgv $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.0F, 0.5F);
      crh $$6 = $$0.d();
      bkv $$7 = $$6.a($$0.i(), $$0.i().F_(), $$0.aC_());
      if ($$7 != null) {
         float $$8 = 0.53125F;
         float $$9 = Math.max($$7.dh(), $$7.di());
         if ((double)$$9 > 1.0) {
            $$8 /= $$9;
         }

         $$2.a(0.0F, 0.4F, 0.0F);
         $$2.a(a.d.rotationDegrees((float)atq.d((double)$$1, $$6.b(), $$6.a()) * 10.0F));
         $$2.a(0.0F, -0.2F, 0.0F);
         $$2.a(a.b.rotationDegrees(-30.0F));
         $$2.b($$8, $$8, $$8);
         this.a.a($$7, 0.0, 0.0, 0.0, 0.0F, $$1, $$2, $$3, $$4);
      }

      $$2.b();
   }
}
