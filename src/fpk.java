public class fpk extends foa<crb> {
   private static final akk D = new akk("textures/gui/container/shulker_box.png");

   public fpk(crb $$0, cmk $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.q++;
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
   }
}
