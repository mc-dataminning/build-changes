public class aci implements zl<aca> {
   public static final zc<wp, aci> a = zl.a(aci::a, aci::new);
   private final jf b;
   private final int c;
   private final int d;
   private final dhm e;

   public aci(jf $$0, dhm $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aci(wp $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = za.a(lw.f).decode($$0);
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      za.a(lw.f).encode($$0, this.e);
   }

   @Override
   public zn<aci> a() {
      return agp.j;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public jf b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dhm g() {
      return this.e;
   }
}
