public class acz implements aac<acr> {
   public static final zt<xg, acz> a = aac.a(acz::a, acz::new);
   private final jh b;
   private final int c;
   private final int d;
   private final dkl e;

   public acz(jh $$0, dkl $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acz(xg $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zr.a(mb.f).decode($$0);
   }

   private void a(xg $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zr.a(mb.f).encode($$0, this.e);
   }

   @Override
   public aae<acz> a() {
      return ahk.j;
   }

   public void a(acr $$0) {
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

   public dkl g() {
      return this.e;
   }
}
