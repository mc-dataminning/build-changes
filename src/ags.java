public record ags(int b, int c, boolean d) implements zb<agb> {
   public static final ys<vr, ags> a = zb.a(ags::a, ags::new);

   private ags(vr $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ags> a() {
      return afz.bu;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
