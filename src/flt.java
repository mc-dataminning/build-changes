public class flt extends fmb {
   private static final aru a = aru.a();
   private final flw b;

   flt(fii $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, flw $$7) {
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
   public flf b() {
      return flf.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(arp.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      eqm $$0 = eqm.O();
      fmn $$1 = $$0.v;
      return $$1 != null && $$1.bp().c(this.g, this.h, this.i) <= 9.0 && $$0.m.au().a() && $$1.go();
   }

   public static class a implements fle<iy> {
      private final flw a;

      public a(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flb $$8 = new flt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements fle<iy> {
      private final flw a;

      public b(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements fle<iy> {
      private final flw a;

      public c(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flb $$8 = new flt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements fle<iy> {
      private final flw a;

      public d(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements fle<iy> {
      private final flw a;

      public e(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flt $$8 = new flt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
