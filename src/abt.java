public class abt implements yw<abl> {
   public static final yn<wa, abt> a = yw.a(abt::a, abt::new);
   private final ji b;
   private final int c;
   private final int d;
   private final djl e;

   public abt(ji $$0, djl $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abt(wa $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yl.a(mc.f).decode($$0);
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yl.a(mc.f).encode($$0, this.e);
   }

   @Override
   public yy<abt> a() {
      return age.j;
   }

   public void a(abl $$0) {
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

   public djl g() {
      return this.e;
   }
}
