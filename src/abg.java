public record abg(int c, eoj d, float e) implements aax {
   public static final zn<wm, abg> a = aax.a(abg::a, abg::new);
   public static final aax.b<abg> b = aax.a("debug/path");

   private abg(wm $$0) {
      this($$0.readInt(), eoj.b($$0), $$0.readFloat());
   }

   private void a(wm $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aax.b<abg> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eoj c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
