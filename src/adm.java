public record adm(int b, float c) implements zo<acd> {
   public static final zf<we, adm> a = zo.a(adm::a, adm::new);

   public adm(buv $$0) {
      this($$0.ar(), $$0.eN());
   }

   private adm(we $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<adm> a() {
      return ags.I;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
