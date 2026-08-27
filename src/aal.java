public record aal(int c, emo d, float e) implements aac {
   public static final ys<vu, aal> a = aac.a(aal::a, aal::new);
   public static final aac.b<aal> b = aac.a("debug/path");

   private aal(vu $$0) {
      this($$0.readInt(), emo.b($$0), $$0.readFloat());
   }

   private void a(vu $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aac.b<aal> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public emo c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
