public record agp(float b) implements yv<agf> {
   public static final ym<vl, agp> a = yv.a(agp::a, agp::new);

   private agp(vl $$0) {
      this($$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
   }

   @Override
   public yx<agp> a() {
      return agd.bt;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }
}
