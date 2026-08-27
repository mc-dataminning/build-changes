public class foe extends fpj {
   foe(flj $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.u = 0.75F;
      this.B = 0.999F;
      this.j *= 0.8F;
      this.k *= 0.8F;
      this.l *= 0.8F;
      this.k = (double)(this.r.i() * 0.4F + 0.05F);
      this.D = this.D * (this.r.i() * 2.0F + 0.2F);
      this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public fom b() {
      return fom.b;
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      int $$2 = 240;
      int $$3 = $$1 >> 16 & 0xFF;
      return 240 | $$3 << 16;
   }

   @Override
   public float b(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      return this.D * (1.0F - $$1 * $$1);
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         float $$0 = (float)this.s / (float)this.t;
         if (this.r.i() > $$0) {
            this.c.a(js.Z, this.g, this.h, this.i, this.j, this.k, this.l);
         }
      }
   }

   public static class a implements fol<jv> {
      private final fpe a;

      public a(fpe $$0) {
         this.a = $$0;
      }

      public foi a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         foe $$8 = new foe($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
