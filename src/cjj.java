import javax.annotation.Nullable;

public class cjj extends ccf {
   private final cji a;

   public cjj(cji $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      ard $$0 = (ard)this.a.dV();
      bsi $$1 = $$0.d_(this.a.dv());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bvg $$2 = bus.aw.a($$0, bur.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cmg $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cjc $$5 = this.a($$1);
               if ($$5 != null) {
                  cmg $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dY().a(0.0, 1.1485), 0.0, this.a.dY().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cjc a(bsi $$0) {
      cji $$1 = bus.bf.a(this.a.dV(), bur.k);
      if ($$1 != null) {
         $$1.a((ard)this.a.dV(), $$0, bur.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fY();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cmg a(bsi $$0, cjc $$1) {
      cmg $$2 = bus.be.a($$1.dV(), bur.k);
      if ($$2 != null) {
         $$2.a((ard)$$1.dV(), $$0, bur.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fY();
         if ($$2.a(but.f).f()) {
            $$2.a(but.f, new cwp(cwt.ql));
         }

         this.a($$2, but.a, $$0);
         this.a($$2, but.f, $$0);
      }

      return $$2;
   }

   private void a(cmg $$0, but $$1, bsi $$2) {
      cwp $$3 = $$0.a($$1);
      $$3.b(kv.l, ddf.a);
      ddb.a($$3, $$0.dV().K_(), den.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
