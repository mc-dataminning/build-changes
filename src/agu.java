public record agu(int b, int c, boolean d) implements ze<agd> {
   public static final yv<vx, agu> a = ze.a(agu::a, agu::new);

   private agu(vx $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<agu> a() {
      return agb.bt;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
