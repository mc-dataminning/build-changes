public record abo(int c, euk d, float e) implements abf {
   public static final zt<ws, abo> a = abf.a(abo::a, abo::new);
   public static final abf.b<abo> b = abf.a("debug/path");

   private abo(ws $$0) {
      this($$0.readInt(), euk.b($$0), $$0.readFloat());
   }

   private void a(ws $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public abf.b<abo> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public euk c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
