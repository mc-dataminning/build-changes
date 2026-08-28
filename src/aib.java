public record aib(int b, int c) implements zd<agn> {
   public static final yu<vs, aib> a = zd.a(aib::a, aib::new);

   private aib(vs $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zf<aib> a() {
      return agl.bm;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
