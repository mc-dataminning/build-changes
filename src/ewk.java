public class ewk extends evp<ccb> {
   private static final acq w = new acq("textures/gui/container/grindstone.png");

   public ewk(ccb $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).f() || this.p.b(1).f()) && !this.p.b(2).f()) {
         $$0.a(w, $$4 + 92, $$5 + 31, this.c, 0, 28, 21);
      }
   }
}
