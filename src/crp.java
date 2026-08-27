import java.util.List;
import java.util.function.Predicate;

public class crp extends ctl {
   private static final Predicate<brw> a = bsb.f.and(brw::bz);
   private final cnv.b b;
   private final boolean c;

   public crp(boolean $$0, cnv.b $$1, ctl.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      euk $$4 = a($$0, $$1, dai.b.c);
      if ($$4.c() == euk.a.a) {
         return bpx.c($$3);
      } else {
         eum $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<brw> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eum $$8 = $$1.bx();

            for (brw $$9 : $$7) {
               euh $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bpx.c($$3);
               }
            }
         }

         if ($$4.c() == euk.a.b) {
            cnv $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bpx.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dvw.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avs.c.b(this));
               return bpx.a($$3, $$0.x_());
            }
         } else {
            return bpx.c($$3);
         }
      }
   }

   private cnv a(daz $$0, euk $$1, ctq $$2, cly $$3) {
      eum $$4 = $$1.e();
      cnv $$5 = (cnv)(this.c ? new cnw($$0, $$4.c, $$4.d, $$4.e) : new cnv($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqn $$6) {
         bsc.<cnv>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
