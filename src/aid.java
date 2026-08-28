public record aid(int b, int c) implements zf<agp> {
   public static final yw<vu, aid> a = zf.a(aid::a, aid::new);

   private aid(vu $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zh<aid> a() {
      return agn.bm;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
