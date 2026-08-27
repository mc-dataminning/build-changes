public record aao(int c, eni d, float e) implements aaf {
   public static final yv<vx, aao> a = aaf.a(aao::a, aao::new);
   public static final aaf.b<aao> b = aaf.a("debug/path");

   private aao(vx $$0) {
      this($$0.readInt(), eni.b($$0), $$0.readFloat());
   }

   private void a(vx $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aaf.b<aao> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eni c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
