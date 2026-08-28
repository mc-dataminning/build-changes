public class aig implements yw<agf> {
   public static final yn<vl, aig> a = yw.a(aig::a, aig::new);
   private final bsx b;
   private final int c;
   private final float d;
   private final float e;

   public aig(bsx $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aig(vl $$0) {
      this.b = $$0.b(bsx.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yy<aig> a() {
      return agd.cl;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public bsx b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
