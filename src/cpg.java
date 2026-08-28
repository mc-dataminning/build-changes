public abstract class cpg extends bsr {
   protected static final ajw<Integer> f = aka.a(cpg.class, ajy.b);
   protected static final ajw<Integer> g = aka.a(cpg.class, ajy.b);
   protected static final ajw<Float> h = aka.a(cpg.class, ajy.d);

   public cpg(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.dO().B || this.dJ()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bw();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dxz.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmx && ((cmx)$$0.d()).fZ().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.aq();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(brk $$0) {
      return false;
   }

   public void b(cul $$0) {
      this.ap();
      if (this.dO().ab().b(dcs.i)) {
         cuq $$1 = new cuq($$0);
         $$1.b(kq.g, this.aj());
         this.b($$1);
      }
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, 1);
      $$0.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.ao.a(f, $$0);
   }

   public void m(int $$0) {
      this.ao.a(g, $$0);
   }

   public void b(float $$0) {
      this.ao.a(h, $$0);
   }

   public float N() {
      return this.ao.a(h);
   }

   public int O() {
      return this.ao.a(f);
   }

   public int P() {
      return this.ao.a(g);
   }

   protected void a(brk $$0) {
      this.b(this.ak_());
   }

   abstract cul ak_();
}
