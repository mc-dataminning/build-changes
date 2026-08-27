public class fpt extends fpf {
   private static final int a = 12235202;

   protected fpt(fnk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fri $$8) {
      super($$0, $$1, $$2, $$3, 0.7F, 0.6F, 0.7F, $$4, $$5 + 0.15F, $$6, $$7, $$8, 0.5F, 7, 0.5F, false);
      float $$9 = (float)Math.random() * 0.2F;
      this.v = (float)ats.b.b(12235202) / 255.0F - $$9;
      this.w = (float)ats.b.c(12235202) / 255.0F - $$9;
      this.x = (float)ats.b.d(12235202) / 255.0F - $$9;
   }

   @Override
   public void a() {
      this.u = 0.88F * this.u;
      this.B = 0.92F * this.B;
      super.a();
   }

   public static class a implements fqq<ka> {
      private final fri a;

      public a(fri $$0) {
         this.a = $$0;
      }

      public fqn a(ka $$0, fnk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpt($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
