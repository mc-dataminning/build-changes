public record aai(String c) implements aak {
   public static final yy<vw, aai> a = aak.a(aai::a, aai::new);
   public static final aak.b<aai> b = aak.a("brand");

   private aai(vw $$0) {
      this($$0.p());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
   }

   @Override
   public aak.b<aai> a() {
      return b;
   }

   public String b() {
      return this.c;
   }
}
