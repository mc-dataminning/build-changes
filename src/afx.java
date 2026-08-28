public record afx(float b, boolean c) implements zg<abu> {
   public static final yx<vw, afx> a = zg.a(afx::a, afx::new);

   private afx(vw $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afx a(brc $$0) {
      return new afx($$0.f(), $$0.l());
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<afx> a() {
      return agg.cf;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
