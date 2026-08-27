public class fnj extends fpj {
   fnj(flj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7) {
      super($$0, $$1, $$2, $$3);
      this.d(3.0F);
      this.b(0.25F, 0.25F);
      if ($$7) {
         this.t = this.r.a(50) + 280;
      } else {
         this.t = this.r.a(50) + 80;
      }

      this.u = 3.0E-6F;
      this.j = $$4;
      this.k = $$5 + (double)(this.r.i() / 500.0F);
      this.l = $$6;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ < this.t && !(this.y <= 0.0F)) {
         this.j = this.j + (double)(this.r.i() / 5000.0F * (float)(this.r.h() ? 1 : -1));
         this.l = this.l + (double)(this.r.i() / 5000.0F * (float)(this.r.h() ? 1 : -1));
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         if (this.s >= this.t - 60 && this.y > 0.01F) {
            this.y -= 0.015F;
         }
      } else {
         this.k();
      }
   }

   @Override
   public fom b() {
      return fom.c;
   }

   public static class a implements fol<jv> {
      private final fpe a;

      public a(fpe $$0) {
         this.a = $$0;
      }

      public foi a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnj $$8 = new fnj($$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
         $$8.e(0.9F);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements fol<jv> {
      private final fpe a;

      public b(fpe $$0) {
         this.a = $$0;
      }

      public foi a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnj $$8 = new fnj($$1, $$2, $$3, $$4, $$5, $$6, $$7, true);
         $$8.e(0.95F);
         $$8.a(this.a);
         return $$8;
      }
   }
}
