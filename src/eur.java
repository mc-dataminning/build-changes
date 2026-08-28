public class eur extends eui {
   private float m = Float.MAX_VALUE;
   private eui n;
   private boolean o;

   public eur(eui $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eur(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eui $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eui d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eur c(vl $$0) {
      eur $$1 = new eur($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
