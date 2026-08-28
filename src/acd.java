public class acd implements zh<abw> {
   public static final yy<wl, acd> a = zh.a(acd::a, acd::new);
   private final iv b;
   private final int c;
   private final int d;
   private final dnc e;

   public acd(iv $$0, dnc $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acd(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yw.a(mh.i).decode($$0);
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yw.a(mh.i).encode($$0, this.e);
   }

   @Override
   public zj<acd> a() {
      return agp.i;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public iv b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dnc g() {
      return this.e;
   }
}
