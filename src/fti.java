public class fti extends fud<byv, ffg<byv>> {
   private static final aer a = new aer("textures/entity/zombie/zombie.png");
   private final float i;

   public fti(fsx.a $$0, float $$1) {
      super($$0, new fey($$0.a(fhr.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fwy<>(this, $$0.d()));
      this.a(new fwv<>(this, new fey($$0.a(fhr.ac)), new fey($$0.a(fhr.ad)), $$0.g()));
   }

   protected void a(byv $$0, elf $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aer a(byv $$0) {
      return a;
   }
}
