public class afy implements yn<afl> {
   public static final ye<vg, afy> a = yn.a(afy::a, afy::new);
   private final int b;
   private final int c;

   public afy(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afy(vg $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(vg $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public yp<afy> a() {
      return afj.bp;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
