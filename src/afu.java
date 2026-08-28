public record afu(float b, boolean c) implements yw<abl> {
   public static final yn<vl, afu> a = yw.a(afu::a, afu::new);

   private afu(vl $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afu a(bth $$0) {
      return new afu($$0.f(), $$0.l());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<afu> a() {
      return agd.cn;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
