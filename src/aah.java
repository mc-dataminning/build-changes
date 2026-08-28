public record aah(String c) implements aaj {
   public static final yx<vw, aah> a = aaj.a(aah::a, aah::new);
   public static final aaj.b<aah> b = aaj.a("brand");

   private aah(vw $$0) {
      this($$0.p());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
   }

   @Override
   public aaj.b<aah> a() {
      return b;
   }

   public String b() {
      return this.c;
   }
}
