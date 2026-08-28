public record abf(int c, eoi d, float e) implements aaw {
   public static final zm<wl, abf> a = aaw.a(abf::a, abf::new);
   public static final aaw.b<abf> b = aaw.a("debug/path");

   private abf(wl $$0) {
      this($$0.readInt(), eoi.b($$0), $$0.readFloat());
   }

   private void a(wl $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aaw.b<abf> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eoi c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
