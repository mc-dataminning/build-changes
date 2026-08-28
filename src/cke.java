import javax.annotation.Nullable;

public class cke extends cjv {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bub g;

   public cke(cjs $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         ezr $$0 = this.a.J(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.d.dD();
         double $$2 = this.a.d.e(0.5);
         double $$3 = this.a.d.dJ();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.eb().k() / 2.0;
            double $$6 = $$2 + this.a.eb().k() / 2.0;
            double $$7 = $$3 + this.a.eb().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dY().a(ls.h, $$5, $$6, $$7, -$$0.d * 0.08F * (double)$$8, -$$0.e * 0.6F, -$$0.f * 0.08F * (double)$$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void c() {
      this.e++;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.gs().a(cki.e);
         } else {
            this.a.gs().a(cki.g);
         }
      } else if (this.e == 10) {
         ezr $$0 = new ezr(this.a.d.dD() - this.a.dD(), 0.0, this.a.d.dJ() - this.a.dJ()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.d.dD() + $$0.d * 5.0 / 2.0;
         double $$3 = this.a.d.dJ() + $$0.f * 5.0 / 2.0;
         double $$4 = this.a.d.e(0.5);
         double $$5 = $$4;
         jh.a $$6 = new jh.a($$2, $$4, $$3);

         while (this.a.dY().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(azn.a($$5) + 1);
         this.g = new bub(this.a.dY(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(ls.h);
         this.g.a(new btn(btp.g));
         this.a.dY().b(this.g);
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.f++;
   }

   @Override
   public void e() {
      if (this.g != null) {
         this.g.av();
         this.g = null;
      }
   }

   @Override
   public cki<cke> i() {
      return cki.f;
   }

   public void j() {
      this.f = 0;
   }
}
