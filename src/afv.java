public record afv(float b, boolean c) implements yw<abl> {
   public static final yn<vl, afv> a = yw.a(afv::a, afv::new);

   private afv(vl $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afv a(bss $$0) {
      return new afv($$0.f(), $$0.l());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<afv> a() {
      return age.co;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
