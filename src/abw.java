public class abw implements ze<abq> {
   public static final yv<vx, abw> a = ze.a(abw::a, abw::new);
   private final int b;
   private final io c;
   private final int d;

   public abw(int $$0, io $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abw(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zg<abw> a() {
      return agc.h;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public io e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
