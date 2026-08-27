public record adg(int b, float c) implements zl<abw> {
   public static final zc<we, adg> a = zl.a(adg::a, adg::new);

   public adg(bso $$0) {
      this($$0.al(), $$0.eQ());
   }

   private adg(we $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<adg> a() {
      return agj.J;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
