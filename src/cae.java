import javax.annotation.Nullable;

public class cae extends bzx {
   private static final bnt bT = bnw.v.n().a(0.5F).b(0.665F);

   public cae(bnw<? extends cae> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bvy(this, 2.0));
      this.bO.a(2, new bur(this, 1.0));
      this.bO.a(3, new bwn(this, 1.25, csc.a(cpg.pv), false));
      this.bO.a(4, new bve(this, 1.25));
      this.bO.a(5, new bws(this, 1.0));
      this.bO.a(6, new bvn(this, chl.class, 6.0F));
      this.bO.a(7, new bwa(this));
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 10.0).a(bpp.o, 0.2F);
   }

   @Override
   protected atk y() {
      return atl.fO;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.fQ;
   }

   @Override
   protected atk n_() {
      return atl.fP;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.fS, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.qx) && !this.o_()) {
         $$0.a(atl.fR, 1.0F, 1.0F);
         cpd $$3 = cpf.a($$2, $$0, cpg.qD.ao_());
         $$0.a($$1, $$3);
         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cae b(aow $$0, bnl $$1) {
      return bnw.v.a((cvr)$$0);
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? bT : super.e($$0);
   }
}
