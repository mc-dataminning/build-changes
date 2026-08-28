public record aag(String b, int c) implements zs<zy> {
   public static final zj<wl, aag> a = zs.a(aag::a, aag::new);

   private aag(wl $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public zu<aag> a() {
      return aai.h;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
