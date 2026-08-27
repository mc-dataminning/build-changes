import java.util.List;

public class csg extends cuc {
   public csg(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      List<brr> $$3 = $$0.a(brr.class, $$1.cP().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.r() instanceof cha);
      cuh $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         brr $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.cI, avq.g, 1.0F, 1.0F);
         $$0.a($$1, dxv.y, $$1.ds());
         if ($$1 instanceof aqu $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return bqb.a(this.a($$4, $$1, new cuh(cuk.wY)), $$0.x_());
      } else {
         ewq $$7 = a($$0, $$1, dbj.b.b);
         if ($$7.c() == ews.a.a) {
            return bqb.c($$4);
         } else {
            if ($$7.c() == ews.a.b) {
               ir $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqb.c($$4);
               }

               if ($$0.b_($$8).a(awj.a)) {
                  $$0.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), avo.cH, avq.g, 1.0F, 1.0F);
                  $$0.a($$1, dxv.y, $$8);
                  return bqb.a(this.a($$4, $$1, cwr.a(cuk.tH, cws.a)), $$0.x_());
               }
            }

            return bqb.c($$4);
         }
      }
   }

   protected cuh a(cuh $$0, cly $$1, cuh $$2) {
      $$1.b(avz.c.b(this));
      return cuj.a($$0, $$1, $$2);
   }
}
