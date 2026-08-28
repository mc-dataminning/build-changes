public class ajl implements aac<ahm> {
   public static final zt<ws, ajl> a = aac.a(ajl::a, ajl::new);
   private final bth b;
   private final int c;
   private final float d;
   private final float e;

   public ajl(bth $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajl(ws $$0) {
      this.b = $$0.b(bth.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public aae<ajl> a() {
      return ahk.ck;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public bth b() {
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
