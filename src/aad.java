public class aad implements uo<zb> {
   private final gu a;
   private final ha b;
   private final aad.a c;
   private final int d;

   public aad(aad.a $$0, gu $$1, ha $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public aad(aad.a $$0, gu $$1, ha $$2) {
      this($$0, $$1, $$2, 0);
   }

   public aad(sf $$0) {
      this.c = $$0.b(aad.a.class);
      this.a = $$0.f();
      this.b = ha.a($$0.readUnsignedByte());
      this.d = $$0.m();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.writeByte(this.b.d());
      $$0.d(this.d);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public ha c() {
      return this.b;
   }

   public aad.a d() {
      return this.c;
   }

   public int e() {
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
