public class fni extends fnq {
   private static final ate a = ate.a();
   private final fnl b;

   fni(fjr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fnl $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public fmu b() {
      return fmu.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(asy.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      ero $$0 = ero.O();
      foc $$1 = $$0.s;
      return $$1 != null && $$1.bp().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aw().a() && $$1.gq();
   }

   public static class a implements fmt<jv> {
      private final fnl a;

      public a(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmq $$8 = new fni($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements fmt<jv> {
      private final fnl a;

      public b(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fni($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements fmt<jv> {
      private final fnl a;

      public c(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmq $$8 = new fni($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements fmt<jv> {
      private final fnl a;

      public d(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fni($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements fmt<jv> {
      private final fnl a;

      public e(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fni $$8 = new fni($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
