public record acv(int b, float c) implements zb<abm> {
   public static final ys<vu, acv> a = zb.a(acv::a, acv::new);

   public acv(bsa $$0) {
      this($$0.aj(), $$0.eH());
   }

   private acv(vu $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<acv> a() {
      return afx.I;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
