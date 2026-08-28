import javax.annotation.Nullable;

public class cle extends cdv {
   private final cld a;

   public cle(cld $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      aro $$0 = (aro)this.a.dV();
      btw $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bwy $$2 = bwj.aw.a($$0, bwi.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cob $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               ckx $$5 = this.a($$1);
               if ($$5 != null) {
                  cob $$6 = this.a($$1, $$5);
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
   private ckx a(btw $$0) {
      cld $$1 = bwj.bg.a(this.a.dV(), bwi.k);
      if ($$1 != null) {
         $$1.a((aro)this.a.dV(), $$0, bwi.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fY();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cob a(btw $$0, ckx $$1) {
      cob $$2 = bwj.bf.a($$1.dV(), bwi.k);
      if ($$2 != null) {
         $$2.a((aro)$$1.dV(), $$0, bwi.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fY();
         if ($$2.a(bwk.f).f()) {
            $$2.a(bwk.f, new cys(cyw.qp));
         }

         this.a($$2, bwk.a, $$0);
         this.a($$2, bwk.f, $$0);
      }

      return $$2;
   }

   private void a(cob $$0, bwk $$1, btw $$2) {
      cys $$3 = $$0.a($$1);
      $$3.b(kj.l, dfl.a);
      dfh.a($$3, $$0.dV().F_(), dgt.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
