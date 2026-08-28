import javax.annotation.Nullable;

public class cku extends cdn {
   private final ckt a;

   public cku(ckt $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      arn $$0 = (arn)this.a.dV();
      bto $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bwq $$2 = bwb.aw.a($$0, bwa.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cnr $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               ckn $$5 = this.a($$1);
               if ($$5 != null) {
                  cnr $$6 = this.a($$1, $$5);
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
   private ckn a(bto $$0) {
      ckt $$1 = bwb.bf.a(this.a.dV(), bwa.k);
      if ($$1 != null) {
         $$1.a((arn)this.a.dV(), $$0, bwa.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fY();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cnr a(bto $$0, ckn $$1) {
      cnr $$2 = bwb.be.a($$1.dV(), bwa.k);
      if ($$2 != null) {
         $$2.a((arn)$$1.dV(), $$0, bwa.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fY();
         if ($$2.a(bwc.f).f()) {
            $$2.a(bwc.f, new cxy(cyc.qp));
         }

         this.a($$2, bwc.a, $$0);
         this.a($$2, bwc.f, $$0);
      }

      return $$2;
   }

   private void a(cnr $$0, bwc $$1, bto $$2) {
      cxy $$3 = $$0.a($$1);
      $$3.b(kx.l, den.a);
      dej.a($$3, $$0.dV().F_(), dfv.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
