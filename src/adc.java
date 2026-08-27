public class adc implements wb<aca> {
   private final ht a;
   private final hx b;
   private final adc.a c;
   private final int d;

   public adc(adc.a $$0, ht $$1, hx $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public adc(adc.a $$0, ht $$1, hx $$2) {
      this($$0, $$1, $$2, 0);
   }

   public adc(tl $$0) {
      this.c = $$0.b(adc.a.class);
      this.a = $$0.e();
      this.b = hx.a($$0.readUnsignedByte());
      this.d = $$0.n();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }

   public adc.a e() {
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
