public record abe(int c, esc d, float e) implements aav {
   public static final zj<wi, abe> a = aav.a(abe::a, abe::new);
   public static final aav.b<abe> b = aav.a("debug/path");

   private abe(wi $$0) {
      this($$0.readInt(), esc.b($$0), $$0.readFloat());
   }

   private void a(wi $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aav.b<abe> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public esc c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
