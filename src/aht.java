public record aht(int b, int c) implements yw<agf> {
   public static final yn<vl, aht> a = yw.a(aht::a, aht::new);

   private aht(vl $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public yy<aht> a() {
      return agd.bl;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
