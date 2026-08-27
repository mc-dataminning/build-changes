public class fst extends fsn<byf> {
   private final foe a;

   public fst(fso.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(byf $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      dfa $$6 = $$0.o();
      if ($$6.l() == cyr.c) {
         cpm $$7 = $$0.dK();
         if ($$6 != $$7.a_($$0.dk()) && $$6.l() != cyr.a) {
            $$3.a();
            gu $$8 = gu.a($$0.dp(), $$0.cG().e, $$0.dv());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fng.b($$6)), false, aru.a(), $$6.a($$0.j()), fyc.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public aer a(byf $$0) {
      return fyk.e;
   }
}
