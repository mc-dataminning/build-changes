public class ajb implements zr<ahb> {
   public static final zi<wh, ajb> a = zr.a(ajb::a, ajb::new);
   private final bsz b;
   private final int c;
   private final float d;
   private final float e;

   public ajb(bsz $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajb(wh $$0) {
      this.b = $$0.b(bsz.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zt<ajb> a() {
      return agz.cl;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public bsz b() {
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
