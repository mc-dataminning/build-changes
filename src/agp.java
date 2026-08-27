public record agp(int b, int c, boolean d) implements zb<afz> {
   public static final ys<vu, agp> a = zb.a(agp::a, agp::new);

   private agp(vu $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<agp> a() {
      return afx.bs;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
