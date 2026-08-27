public class cox extends cpl {
   public cox(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if ($$1.cp != null) {
         if (!$$0.B) {
            int $$4 = $$1.cp.a($$3);
            $$3.a($$4, $$1, box.d($$2));
         }

         $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.iI, atq.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.b(dqr.C);
      } else {
         $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.iK, atq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cua.c($$3);
            int $$6 = cua.b($$3);
            $$0.b(new cio($$1, $$0, $$6, $$5));
         }

         $$1.b(atz.c.b(this));
         $$1.b(dqr.D);
      }

      return bmm.a($$3, $$0.y_());
   }

   @Override
   public int e() {
      return 1;
   }
}
