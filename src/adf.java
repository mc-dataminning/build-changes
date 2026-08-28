public class adf implements zw<aci> {
   public static final zn<xa, adf> a = zw.a(adf::a, adf::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cur g;

   public adf(int $$0, int $$1, int $$2, cur $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private adf(xa $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cur.h.decode($$0);
   }

   private void a(xa $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cur.h.encode($$0, this.g);
   }

   @Override
   public zy<adf> a() {
      return agu.w;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cur f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
