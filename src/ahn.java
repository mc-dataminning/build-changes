public record ahn(int b, int c, boolean d) implements zw<agw> {
   public static final zn<wm, ahn> a = zw.a(ahn::a, ahn::new);

   private ahn(wm $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<ahn> a() {
      return agu.bu;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
