public class ees extends eem {
   private float m = Float.MAX_VALUE;
   private eem n;
   private boolean o;

   public ees(eem $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ees(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eem $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eem d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ees c(ue $$0) {
      ees $$1 = new ees($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
