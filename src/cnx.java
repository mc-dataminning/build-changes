import org.jetbrains.annotations.Nullable;

public class cnx extends cnu {
   public cnx(bsw<? extends cnx> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnx(dcu $$0, btl $$1) {
      super(bsw.G, $$1, $$0);
   }

   @Override
   protected cuj t() {
      return cur.sf;
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      $$0.a().a(this.dR().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dQ().a(lm.ac, this.dv(), this.dx() + this.ah.j() * 2.0, this.dB(), this.ah.k(), 0.0, this.ah.k());
      }

      if (this.dQ() instanceof aqt $$2 && !this.dL()) {
         bsq $$3 = this.s();
         if ($$3 instanceof aqu $$4) {
            if ($$4.c.c() && $$4.cx()) {
               if (this.ah.i() < 0.05F && $$2.ab().b(dcq.e)) {
                  cjs $$5 = bsw.I.a((dcu)$$2);
                  if ($$5 != null) {
                     $$5.b($$3.dv(), $$3.dx(), $$3.dB(), $$3.dG(), $$3.dI());
                     $$2.b($$5);
                  }
               }

               if ($$3.bS()) {
                  this.ak();
               }

               $$3.a(new epw($$2, this.do(), $$3.dt(), $$3.dG(), $$3.dI()));
               $$3.n();
               $$3.a(this.dR().l(), 5.0F);
               this.a($$2, this.do());
            }
         } else if ($$3 != null) {
            $$3.a(new epw($$2, this.do(), $$3.dt(), $$3.dG(), $$3.dI()));
            $$3.n();
         }

         this.aq();
      }
   }

   @Override
   public void l() {
      bsq $$0 = this.s();
      if ($$0 instanceof aqu && !$$0.bE() && this.dQ().ab().b(dcq.Y)) {
         this.aq();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bsq a(epw $$0) {
      if (this.dQ().af() != $$0.a().af()) {
         this.I();
      }

      return super.a($$0);
   }

   private void a(dcu $$0, eww $$1) {
      $$0.a(null, $$1.c, $$1.d, $$1.e, avo.uv, avp.h);
   }
}
