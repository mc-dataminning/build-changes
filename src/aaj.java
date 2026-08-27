public record aaj(int c, emf d, float e) implements aaa {
   public static final yq<vs, aaj> a = aaa.a(aaj::a, aaj::new);
   public static final aaa.b<aaj> b = aaa.a("debug/path");

   private aaj(vs $$0) {
      this($$0.readInt(), emf.b($$0), $$0.readFloat());
   }

   private void a(vs $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aaa.b<aaj> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public emf c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
