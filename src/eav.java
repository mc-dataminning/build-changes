public class eav extends eap {
   private float m = Float.MAX_VALUE;
   private eap n;
   private boolean o;

   public eav(eap $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eav(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eap $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eap d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eav c(si $$0) {
      eav $$1 = new eav($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
