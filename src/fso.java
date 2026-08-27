public class fso extends fsi<byd> {
   private final fnz a;

   public fso(fsj.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(byd $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      dey $$6 = $$0.o();
      if ($$6.l() == cyp.c) {
         cpk $$7 = $$0.dK();
         if ($$6 != $$7.a_($$0.dk()) && $$6.l() != cyp.a) {
            $$3.a();
            gv $$8 = gv.a($$0.dp(), $$0.cG().e, $$0.dv());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fnb.b($$6)), false, art.a(), $$6.a($$0.j()), fxx.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public aep a(byd $$0) {
      return fyf.e;
   }
}
