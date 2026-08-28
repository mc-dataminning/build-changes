public class crg extends cqt {
   private final den b = new den() {
      @Override
      public void a(dfm $$0, jh $$1, int $$2) {
         $$0.a(crg.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public crg(bus<? extends crg> $$0, dfm $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cwi t() {
      return cwq.nM;
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.nM);
   }

   private Runnable c(dfm $$0) {
      return $$0 instanceof arp ? () -> this.b.a((arp)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dvv w() {
      return dis.ct.m();
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dV(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public den u() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
