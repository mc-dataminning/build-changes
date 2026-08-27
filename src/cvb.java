public class cvb extends cuc {
   public cvb(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if (!($$0 instanceof aqt $$4)) {
         return bqb.b($$3);
      } else {
         if ($$1.b("crafted_eyes", 2)) {
            $$1.c("thrown_eye");
         }

         if ($$1.b("potato_village", 7)) {
            $$1.c("thrown_eye_part_two");
         }

         ir $$6;
         if (!$$4.af().equals(dca.h) && !$$4.z_()) {
            $$6 = null;
         } else {
            $$6 = $$4.a($$4.z_() ? awp.v : awp.u, $$1.du(), 100, false);
         }

         if ($$6 != null) {
            if ($$1 instanceof aqu $$7) {
               if ($$0.z_()) {
                  $$7.e($$6);
               } else {
                  $$7.d($$6);
               }
            }

            cmk $$8 = new cmk($$0, $$1.dz(), $$1.e(0.5), $$1.dF());
            $$8.a($$3);
            $$8.a($$6);
            $$0.a(dxv.K, $$8.ds(), dxv.a.a($$1));
            $$0.b($$8);
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.iv, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
            $$0.a(null, 1003, $$1.du(), 0);
            $$3.a(1, $$1);
            $$1.b(avz.c.b(this));
            $$1.a($$2, true);
         } else {
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.iv, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
            $$3.a(1, $$1);
            $$1.a(new cuh(cuk.AB), true);
         }

         return bqb.a($$3);
      }
   }
}
