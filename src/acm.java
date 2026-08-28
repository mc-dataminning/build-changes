public class acm implements zo<acf> {
   public static final ze<wp, acm> a = zo.a(acm::a, acm::new);
   private final iw b;
   private final int c;
   private final int d;
   private final dno e;

   public acm(iw $$0, dno $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acm(wp $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zc.a(mi.i).decode($$0);
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zc.a(mi.i).encode($$0, this.e);
   }

   @Override
   public zq<acm> a() {
      return agy.i;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dno g() {
      return this.e;
   }
}
