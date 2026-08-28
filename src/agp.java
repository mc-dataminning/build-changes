public record agp(float b, boolean c) implements zo<acf> {
   public static final ze<vy, agp> a = zo.a(agp::a, agp::new);

   private agp(vy $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agp a(bvl $$0) {
      return new agp($$0.f(), $$0.l());
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<agp> a() {
      return agy.cq;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
