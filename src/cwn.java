import java.util.Optional;

public class cwn extends cxu {
   private static final wv a = wv.c("item.minecraft.lodestone_compass");

   public cwn(cxu.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cxy $$0) {
      return $$0.c(kx.af) || super.c_($$0);
   }

   @Override
   public void a(cxy $$0, dhp $$1, bvs $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arn $$5) {
         dap $$6 = $$0.a(kx.af);
         if ($$6 != null) {
            dap $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kx.af, $$7);
            }
         }
      }
   }

   @Override
   public btq a(dbp $$0) {
      jj $$1 = $$0.a();
      dhp $$2 = $$0.q();
      if (!$$2.a_($$1).a(dkw.pU)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awk.oV, awl.h, 1.0F, 1.0F);
         cqi $$3 = $$0.o();
         cxy $$4 = $$0.n();
         boolean $$5 = !$$3.fU() && $$4.M() == 1;
         dap $$6 = new dap(Optional.of(jr.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kx.af, $$6);
         } else {
            cxy $$7 = $$4.a(cyc.rD, 1);
            $$4.a(1, $$3);
            $$7.b(kx.af, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return btq.a;
      }
   }

   @Override
   public wv a(cxy $$0) {
      return $$0.c(kx.af) ? a : super.a($$0);
   }
}
