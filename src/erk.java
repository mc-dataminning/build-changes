public class erk extends erb {
   private float m = Float.MAX_VALUE;
   private erb n;
   private boolean o;

   public erk(erb $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public erk(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, erb $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public erb d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static erk c(wa $$0) {
      erk $$1 = new erk($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
