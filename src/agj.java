public record agj(float b, boolean c) implements zo<acd> {
   public static final zf<we, agj> a = zo.a(agj::a, agj::new);

   private agj(we $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agj a(bsh $$0) {
      return new agj($$0.f(), $$0.l());
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<agj> a() {
      return ags.ci;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
