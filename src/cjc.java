import javax.annotation.Nullable;

public class cjc extends cby {
   private final cjb a;

   public cjc(cjb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dX().a(this.a.dC(), this.a.dE(), this.a.dI(), 10.0);
   }

   @Override
   public void a() {
      arn $$0 = (arn)this.a.dX();
      bsb $$1 = $$0.d_(this.a.dx());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      buz $$2 = bul.am.a($$0, buk.k);
      if ($$2 != null) {
         $$2.e(this.a.dC(), this.a.dE(), this.a.dI());
         $$2.a(true);
         $$0.b($$2);
         clz $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               civ $$5 = this.a($$1);
               if ($$5 != null) {
                  clz $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ea().a(0.0, 1.1485), 0.0, this.a.ea().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private civ a(bsb $$0) {
      cjb $$1 = bul.aO.a(this.a.dX(), buk.k);
      if ($$1 != null) {
         $$1.a((arn)this.a.dX(), $$0, buk.k, null);
         $$1.a_(this.a.dC(), this.a.dE(), this.a.dI());
         $$1.ak = 60;
         $$1.ga();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private clz a(bsb $$0, civ $$1) {
      clz $$2 = bul.aN.a($$1.dX(), buk.k);
      if ($$2 != null) {
         $$2.a((arn)$$1.dX(), $$0, buk.k, null);
         $$2.a_($$1.dC(), $$1.dE(), $$1.dI());
         $$2.ak = 60;
         $$2.ga();
         if ($$2.a(bum.f).f()) {
            $$2.a(bum.f, new cwb(cwf.pH));
         }

         this.a($$2, bum.a, $$0);
         this.a($$2, bum.f, $$0);
      }

      return $$2;
   }

   private void a(clz $$0, bum $$1, bsb $$2) {
      cwb $$3 = $$0.a($$1);
      $$3.b(ku.l, dby.a);
      dbu.a($$3, $$0.dX().H_(), ddg.a, $$2, $$0.ea());
      $$0.a($$1, $$3);
   }
}
