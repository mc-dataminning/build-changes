public class fpw extends fom<crl> {
   private static final akq D = akq.b("textures/gui/container/shulker_box.png");

   public fpw(crl $$0, cmu $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.q++;
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
   }
}
