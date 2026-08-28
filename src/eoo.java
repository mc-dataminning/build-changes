public class eoo extends eof {
   private float m = Float.MAX_VALUE;
   private eof n;
   private boolean o;

   public eoo(eof $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eoo(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eof $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eof d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eoo c(wl $$0) {
      eoo $$1 = new eoo($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
