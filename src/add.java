public record add(int b, float c) implements zg<abu> {
   public static final yx<vw, add> a = zg.a(add::a, add::new);

   public add(btn $$0) {
      this($$0.an(), $$0.eE());
   }

   private add(vw $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<add> a() {
      return agg.I;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
