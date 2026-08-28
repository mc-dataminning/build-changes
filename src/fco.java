public record fco(int a, int b, boolean c) implements fcp<fbo> {
   public fbo a() {
      return new fbp(this.a, this.b, this.c);
   }

   public void a(fbo $$0) {
      $$0.a();
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
