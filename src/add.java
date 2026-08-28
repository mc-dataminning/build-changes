public record add(int b, float c) implements zf<abu> {
   public static final yw<vu, add> a = zf.a(add::a, add::new);

   public add(bxe $$0) {
      this($$0.ar(), $$0.eM());
   }

   private add(vu $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<add> a() {
      return agn.I;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
