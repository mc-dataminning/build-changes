public class fqz extends fpp<bvl, fda<bvl>> {
   private static final acq a = new acq("textures/entity/skeleton/skeleton.png");

   public fqz(foy.a $$0) {
      this($$0, fed.bh, fed.bj, fed.bk);
   }

   public fqz(foy.a $$0, fec $$1, fec $$2, fec $$3) {
      super($$0, new fda<>($$0.a($$1)), 0.5F);
      this.a(new fsw<>(this, new fda($$0.a($$2)), new fda($$0.a($$3)), $$0.g()));
   }

   public acq a(bvl $$0) {
      return a;
   }

   protected boolean b(bvl $$0) {
      return $$0.fY();
   }
}
