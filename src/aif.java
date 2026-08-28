public record aif(int b, int c) implements zh<agr> {
   public static final yy<vw, aif> a = zh.a(aif::a, aif::new);

   private aif(vw $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zj<aif> a() {
      return agp.bm;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
