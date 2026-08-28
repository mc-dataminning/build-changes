public record aah(int c, etn d, float e) implements zy {
   public static final ym<vl, aah> a = zy.a(aah::a, aah::new);
   public static final zy.b<aah> b = zy.a("debug/path");

   private aah(vl $$0) {
      this($$0.readInt(), etn.b($$0), $$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public zy.b<aah> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public etn c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
