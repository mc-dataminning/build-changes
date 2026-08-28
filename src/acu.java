public record acu(int b, float c) implements yv<abk> {
   public static final ym<vl, acu> a = yv.a(acu::a, acu::new);

   public acu(bvg $$0) {
      this($$0.ar(), $$0.eK());
   }

   private acu(vl $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yx<acu> a() {
      return agd.I;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
