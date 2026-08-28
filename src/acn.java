public class acn implements zq<acf> {
   public static final zh<wu, acn> a = zq.a(acn::a, acn::new);
   private final jh b;
   private final int c;
   private final int d;
   private final diq e;

   public acn(jh $$0, diq $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acn(wu $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zf.a(ma.f).decode($$0);
   }

   private void a(wu $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zf.a(ma.f).encode($$0, this.e);
   }

   @Override
   public zs<acn> a() {
      return agu.j;
   }

   public void a(acf $$0) {
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

   public diq g() {
      return this.e;
   }
}
