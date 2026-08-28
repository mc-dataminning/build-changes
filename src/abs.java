public class abs implements yv<abk> {
   public static final ym<vz, abs> a = yv.a(abs::a, abs::new);
   private final ji b;
   private final int c;
   private final int d;
   private final djk e;

   public abs(ji $$0, djk $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abs(vz $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yk.a(mc.f).decode($$0);
   }

   private void a(vz $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yk.a(mc.f).encode($$0, this.e);
   }

   @Override
   public yx<abs> a() {
      return agd.j;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public djk g() {
      return this.e;
   }
}
