public class abl implements yn<aay> {
   public static final ye<vg, abl> a = yn.a(abl::a, abl::new);
   private final bnx b;
   private final boolean c;

   public abl(bnx $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abl(vg $$0) {
      this.b = bnx.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yp<abl> a() {
      return afj.m;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bnx e() {
      return this.b;
   }
}
