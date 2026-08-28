public enum fku implements bax {
   a(1, "int"),
   b(3, "ivec3"),
   c(1, "float"),
   d(2, "vec2"),
   e(3, "vec3"),
   f(4, "vec4"),
   g(16, "matrix4x4");

   public static final bax.a<fku> h = bax.a(fku::values);
   final int i;
   final String j;

   private fku(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public int a() {
      return this.i;
   }

   public boolean b() {
      return this == a || this == b;
   }

   @Override
   public String c() {
      return this.j;
   }

   public int d() {
      return this.i;
   }
}
