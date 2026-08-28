public record aia(int b, int c) implements zc<agm> {
   public static final yt<vr, aia> a = zc.a(aia::a, aia::new);

   private aia(vr $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public ze<aia> a() {
      return agk.bm;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
