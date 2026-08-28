public record aaq(long c, iu d) implements aai {
   public static final yw<vu, aaq> a = aai.a(aaq::a, aaq::new);
   public static final aai.b<aaq> b = aai.a("debug/neighbors_update");

   private aaq(vu $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aai.b<aaq> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public iu c() {
      return this.d;
   }
}
