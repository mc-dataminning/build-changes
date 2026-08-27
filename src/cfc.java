public enum cfc {
   a(0, "cape"),
   b(1, "jacket"),
   c(2, "left_sleeve"),
   d(3, "right_sleeve"),
   e(4, "left_pants_leg"),
   f(5, "right_pants_leg"),
   g(6, "hat");

   private final int h;
   private final int i;
   private final String j;
   private final vd k;

   private cfc(int $$0, String $$1) {
      this.h = $$0;
      this.i = 1 << $$0;
      this.j = $$1;
      this.k = vd.c("options.modelPart." + $$1);
   }

   public int a() {
      return this.i;
   }

   public int b() {
      return this.h;
   }

   public String c() {
      return this.j;
   }

   public vd d() {
      return this.k;
   }
}
