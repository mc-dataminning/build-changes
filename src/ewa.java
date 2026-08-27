public class ewa extends evp<cbm> implements ewt<cbm> {
   private static final acq w = new acq("textures/gui/container/generic_54.png");
   private final int x;

   public ewa(cbm $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.x = $$0.m();
      this.k = 114 + this.x * 18;
      this.o = this.k - 94;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.x * 18 + 17);
      $$0.a(w, $$4, $$5 + this.x * 18 + 17, 0, 126, this.c, 96);
   }
}
