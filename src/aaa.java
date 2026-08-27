public record aaa(String c) implements aac {
   public static final ys<vu, aaa> a = aac.a(aaa::a, aaa::new);
   public static final aac.b<aaa> b = aac.a("brand");

   private aaa(vu $$0) {
      this($$0.p());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
   }

   @Override
   public aac.b<aaa> a() {
      return b;
   }

   public String b() {
      return this.c;
   }
}
