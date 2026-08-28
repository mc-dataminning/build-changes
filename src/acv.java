public record acv(int b, float c) implements yw<abl> {
   public static final yn<vl, acv> a = yw.a(acv::a, acv::new);

   public acv(bvg $$0) {
      this($$0.ar(), $$0.eJ());
   }

   private acv(vl $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<acv> a() {
      return age.I;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
