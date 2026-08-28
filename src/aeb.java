public record aeb(int b, float c) implements aac<acr> {
   public static final zt<ws, aeb> a = aac.a(aeb::a, aeb::new);

   public aeb(bwf $$0) {
      this($$0.ar(), $$0.eK());
   }

   private aeb(ws $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<aeb> a() {
      return ahk.I;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
