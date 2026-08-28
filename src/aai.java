public record aai(String b, int c) implements zs<zy> {
   public static final zj<wi, aai> a = zs.a(aai::a, aai::new);

   private aai(wi $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public zu<aai> a() {
      return aak.j;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
