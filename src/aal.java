public record aal(int c, eov d, float e) implements aac {
   public static final ys<vr, aal> a = aac.a(aal::a, aal::new);
   public static final aac.b<aal> b = aac.a("debug/path");

   private aal(vr $$0) {
      this($$0.readInt(), eov.b($$0), $$0.readFloat());
   }

   private void a(vr $$0) {
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

   public eov c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
