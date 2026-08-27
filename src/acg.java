public class acg implements yn<aay> {
   public static final ye<vg, acg> a = yn.a(acg::a, acg::new);
   private final int b;
   private final int c;
   private final int d;

   public acg(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acg(vg $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(vg $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public yp<acg> a() {
      return afj.H;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
