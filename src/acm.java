public class acm implements zp<ace> {
   public static final zg<wt, acm> a = zp.a(acm::a, acm::new);
   private final jh b;
   private final int c;
   private final int d;
   private final die e;

   public acm(jh $$0, die $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acm(wt $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = ze.a(lz.f).decode($$0);
   }

   private void a(wt $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      ze.a(lz.f).encode($$0, this.e);
   }

   @Override
   public zr<acm> a() {
      return agt.j;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public die g() {
      return this.e;
   }
}
