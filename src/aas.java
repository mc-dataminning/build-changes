public record aas(int c, epq d, float e) implements aaj {
   public static final yx<vw, aas> a = aaj.a(aas::a, aas::new);
   public static final aaj.b<aas> b = aaj.a("debug/path");

   private aas(vw $$0) {
      this($$0.readInt(), epq.b($$0), $$0.readFloat());
   }

   private void a(vw $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aaj.b<aas> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public epq c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
