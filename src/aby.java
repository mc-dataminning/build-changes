public class aby implements ze<abq> {
   public static final yv<wi, aby> a = ze.a(aby::a, aby::new);
   private final io b;
   private final int c;
   private final int d;
   private final ddy e;

   public aby(io $$0, ddy $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aby(wi $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yt.a(lf.f).decode($$0);
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yt.a(lf.f).encode($$0, this.e);
   }

   @Override
   public zg<aby> a() {
      return agb.j;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public io b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public ddy g() {
      return this.e;
   }
}
