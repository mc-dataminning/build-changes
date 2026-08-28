public record ahb(float b, boolean c) implements aac<acr> {
   public static final zt<ws, ahb> a = aac.a(ahb::a, ahb::new);

   private ahb(ws $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static ahb a(bts $$0) {
      return new ahb($$0.f(), $$0.l());
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<ahb> a() {
      return ahk.cm;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
