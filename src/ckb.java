import java.util.List;
import java.util.function.Predicate;

public class ckb extends cmc {
   private static final Predicate<blf> a = bli.f.and(blf::bt);
   private final cgl.b b;
   private final boolean c;

   public ckb(boolean $$0, cgl.b $$1, cmc.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      ekz $$4 = a($$0, $$1, csh.b.c);
      if ($$4.c() == ekz.a.a) {
         return bjm.c($$3);
      } else {
         elb $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<blf> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            elb $$8 = $$1.br();

            for (blf $$9 : $$7) {
               ekw $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bjm.c($$3);
               }
            }
         }

         if ($$4.c() == ekz.a.b) {
            cgl $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bjm.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dmz.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(arm.c.b(this));
               return bjm.a($$3, $$0.y_());
            }
         } else {
            return bjm.c($$3);
         }
      }
   }

   private cgl a(csy $$0, ekz $$1, cmh $$2, cer $$3) {
      elb $$4 = $$1.e();
      cgl $$5 = (cgl)(this.c ? new cgm($$0, $$4.c, $$4.d, $$4.e) : new cgl($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof amp $$6) {
         blj.<cgl>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
