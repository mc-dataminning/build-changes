public record aax(int c, erh d, float e) implements aao {
   public static final zc<wb, aax> a = aao.a(aax::a, aax::new);
   public static final aao.b<aax> b = aao.a("debug/path");

   private aax(wb $$0) {
      this($$0.readInt(), erh.b($$0), $$0.readFloat());
   }

   private void a(wb $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aao.b<aax> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public erh c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
