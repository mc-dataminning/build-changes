public class fon extends fow {
   private static final ato a = ato.a();
   private final foq b;

   fon(fkw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, foq $$7) {
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
   public fnz b() {
      return fnz.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(ati.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      esr $$0 = esr.N();
      fpj $$1 = $$0.s;
      return $$1 != null && $$1.bp().c(this.g, this.h, this.i) <= 9.0 && $$0.m.ax().a() && $$1.gq();
   }

   public static class a implements fny<jv> {
      private final foq a;

      public a(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnv $$8 = new fon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements fny<jv> {
      private final foq a;

      public b(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements fny<jv> {
      private final foq a;

      public c(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnv $$8 = new fon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements fny<jv> {
      private final foq a;

      public d(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements fny<jv> {
      private final foq a;

      public e(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fon $$8 = new fon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
