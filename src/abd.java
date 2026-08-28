public record abd(String c) implements abf {
   public static final zt<ws, abd> a = abf.a(abd::a, abd::new);
   public static final abf.b<abd> b = abf.a("brand");

   private abd(ws $$0) {
      this($$0.p());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
   }

   @Override
   public abf.b<abd> a() {
      return b;
   }

   public String b() {
      return this.c;
   }
}
