public class fto extends fti<byo> {
   private final fpa a;

   public fto(ftj.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(byo $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      dfl $$6 = $$0.t();
      if ($$6.l() == czc.c) {
         cpx $$7 = $$0.dL();
         if ($$6 != $$7.a_($$0.dl()) && $$6.l() != czc.a) {
            $$3.a();
            gw $$8 = gw.a($$0.dq(), $$0.cG().e, $$0.dw());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fob.b($$6)), false, ase.a(), $$6.a($$0.q()), fyx.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public aey a(byo $$0) {
      return fzf.e;
   }
}
