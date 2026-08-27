import javax.annotation.Nullable;

public class ccj extends cbz {
   private static final bnt bT = bnw.bt.n().a(bns.a().a(bnr.a, 0.0F, bnw.bt.l() - 0.03125F, 0.0F)).a(0.5F);

   public ccj(bnw<? extends ccj> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static bpo.a u() {
      return gG().a(bpp.n, 15.0).a(bpp.o, 0.2F);
   }

   public static boolean c(bnw<? extends bzx> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return !bom.a($$2) ? bzx.b($$0, $$1, $$2, $$3, $$4) : bom.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(awp $$0) {
      this.f(bpp.j).a(a($$0::j));
   }

   @Override
   protected atk y() {
      return atl.Cz;
   }

   @Override
   protected atk n_() {
      return atl.CA;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.CB;
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return bnw.bt.a((cvr)$$0);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      return !this.gv() ? blw.d : super.b($$0, $$1);
   }

   @Override
   protected void gw() {
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? bT : super.e($$0);
   }
}
