public class acq implements zw<aci> {
   public static final zn<xa, acq> a = zw.a(acq::a, acq::new);
   private final iz b;
   private final int c;
   private final int d;
   private final dfa e;

   public acq(iz $$0, dfa $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acq(xa $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zl.a(lq.f).decode($$0);
   }

   private void a(xa $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      zl.a(lq.f).encode($$0, this.e);
   }

   @Override
   public zy<acq> a() {
      return agu.j;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dfa g() {
      return this.e;
   }
}
