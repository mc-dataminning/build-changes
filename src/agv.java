public record agv(int b, int c, boolean d) implements ze<age> {
   public static final yv<vx, agv> a = ze.a(agv::a, agv::new);

   private agv(vx $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<agv> a() {
      return agc.bu;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
