public class ads implements wo<acp> {
   private final hx a;
   private final ib b;
   private final ads.a c;
   private final int d;

   public ads(ads.a $$0, hx $$1, ib $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public ads(ads.a $$0, hx $$1, ib $$2) {
      this($$0, $$1, $$2, 0);
   }

   public ads(ty $$0) {
      this.c = $$0.b(ads.a.class);
      this.a = $$0.e();
      this.b = ib.a($$0.readUnsignedByte());
      this.d = $$0.n();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public ib d() {
      return this.b;
   }

   public ads.a e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
