public class exb extends ews {
   private float m = Float.MAX_VALUE;
   private ews n;
   private boolean o;

   public exb(ews $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public exb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ews $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ews d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static exb c(vu $$0) {
      exb $$1 = new exb($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
