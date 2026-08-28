public class bul extends bto {
   private static final String b = "data";
   private uf c = new uf();

   public bul(btv<?> $$0, deg $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(uf $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(uf $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zk<abz> a(arg $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bto $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(bto $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public equ j_() {
      return equ.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
