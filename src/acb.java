public class acb implements zf<abt> {
   public static final yw<wj, acb> a = zf.a(acb::a, acb::new);
   private final jd b;
   private final int c;
   private final int d;
   private final dfw e;

   public acb(jd $$0, dfw $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acb(wj $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yu.a(lu.f).decode($$0);
   }

   private void a(wj $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yu.a(lu.f).encode($$0, this.e);
   }

   @Override
   public zh<acb> a() {
      return agf.j;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dfw g() {
      return this.e;
   }
}
