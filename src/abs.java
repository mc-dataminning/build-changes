public class abs implements yz<abk> {
   public static final yq<wd, abs> a = yz.a(abs::a, abs::new);
   private final im b;
   private final int c;
   private final int d;
   private final dcv e;

   public abs(im $$0, dcv $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abs(wd $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yo.a(ld.f).decode($$0);
   }

   private void a(wd $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yo.a(ld.f).encode($$0, this.e);
   }

   @Override
   public zb<abs> a() {
      return afv.j;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dcv g() {
      return this.e;
   }
}
