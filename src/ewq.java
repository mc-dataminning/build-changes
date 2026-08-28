public class ewq extends ewh {
   private float m = Float.MAX_VALUE;
   private ewh n;
   private boolean o;

   public ewq(ewh $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ewq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ewh $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ewh d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ewq c(vs $$0) {
      ewq $$1 = new ewq($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
