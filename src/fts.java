public class fts extends fua {
   private static final awo a = awo.a();
   private final ftv b;

   fts(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftv $$7) {
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
   public fte b() {
      return fte.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(awh.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      exh $$0 = exh.O();
      fuo $$1 = $$0.s;
      return $$1 != null && $$1.br().c(this.g, this.h, this.i) <= 9.0 && $$0.m.ax().a() && $$1.gr();
   }

   public static class a implements ftd<kc> {
      private final ftv a;

      public a(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fta $$8 = new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements ftd<kc> {
      private final ftv a;

      public b(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements ftd<kc> {
      private final ftv a;

      public c(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fta $$8 = new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements ftd<kc> {
      private final ftv a;

      public d(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements ftd<kc> {
      private final ftv a;

      public e(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fts $$8 = new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
