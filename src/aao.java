public record aao(int c, evh d, float e) implements aaf {
   public static final yt<vr, aao> a = aaf.a(aao::a, aao::new);
   public static final aaf.b<aao> b = aaf.a("debug/path");

   private aao(vr $$0) {
      this($$0.readInt(), evh.b($$0), $$0.readFloat());
   }

   private void a(vr $$0) {
      $$0.q(this.c);
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

   public evh c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
