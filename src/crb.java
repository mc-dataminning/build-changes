import java.util.List;

public class crb extends csu {
   public crb(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      List<brd> $$3 = $$0.a(brd.class, $$1.cI().g(2.0), $$0x -> $$0x != null && $$0x.bB() && $$0x.r() instanceof cgl);
      csz $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         brd $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.cD, avd.g, 1.0F, 1.0F);
         $$0.a($$1, dva.y, $$1.dl());
         if ($$1 instanceof aqi $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bpn.a(this.a($$4, $$1, new csz(ctc.vn)), $$0.x_());
      } else {
         etl $$7 = a($$0, $$1, czm.b.b);
         if ($$7.c() == etn.a.a) {
            return bpn.c($$4);
         } else {
            if ($$7.c() == etn.a.b) {
               in $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bpn.c($$4);
               }

               if ($$0.b_($$8).a(avw.a)) {
                  $$0.a($$1, $$1.ds(), $$1.du(), $$1.dy(), avc.cC, avd.g, 1.0F, 1.0F);
                  $$0.a($$1, dva.y, $$8);
                  return bpn.a(this.a($$4, $$1, cuy.a(ctc.sk, cuz.a)), $$0.x_());
               }
            }

            return bpn.c($$4);
         }
      }
   }

   protected csz a(csz $$0, clh $$1, csz $$2) {
      $$1.b(avm.c.b(this));
      return ctb.a($$0, $$1, $$2);
   }
}
