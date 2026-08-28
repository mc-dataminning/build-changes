public class cus extends cvg {
   public cus(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      if ($$1.cs != null) {
         if (!$$0.B) {
            int $$4 = $$1.cs.a($$3);
            $$3.a($$4, $$1, buf.d($$2));
         }

         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awd.iX, awe.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(dyx.C);
      } else {
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awd.iZ, awe.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arg $$5) {
            int $$6 = (int)(day.b($$5, $$3, $$1) * 20.0F);
            int $$7 = day.a($$5, $$3, $$1);
            coi.a(new coe($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awn.c.b(this));
         $$1.a(dyx.D);
      }

      return brk.a;
   }
}
