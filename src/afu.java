public record afu(float b, boolean c) implements yv<abk> {
   public static final ym<vl, afu> a = yv.a(afu::a, afu::new);

   private afu(vl $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afu a(bss $$0) {
      return new afu($$0.f(), $$0.l());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yx<afu> a() {
      return agd.co;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
