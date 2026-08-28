public class aiw implements zj<agt> {
   public static final za<vy, aiw> a = zj.a(aiw::a, aiw::new);
   private final bus b;
   private final int c;
   private final float d;
   private final float e;

   public aiw(bus $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aiw(vy $$0) {
      this.b = $$0.b(bus.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zl<aiw> a() {
      return agr.co;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public bus b() {
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
