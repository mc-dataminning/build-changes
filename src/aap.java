public record aap(int c, ewj d, float e) implements aag {
   public static final yu<vs, aap> a = aag.a(aap::a, aap::new);
   public static final aag.b<aap> b = aag.a("debug/path");

   private aap(vs $$0) {
      this($$0.readInt(), ewj.b($$0), $$0.readFloat());
   }

   private void a(vs $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aag.b<aap> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ewj c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
