import java.util.List;

public class cts extends cvk {
   private final cpu.b a;
   private final boolean b;

   public cts(boolean $$0, cpu.b $$1, cvk.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      eyq $$4 = a($$0, $$1, ddo.b.c);
      if ($$4.d() == eyq.a.a) {
         return brp.e;
      } else {
         eys $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bto> $$7 = $$0.a($$1, $$1.cO().b($$5.c(5.0)).g(1.0), btt.h);
         if (!$$7.isEmpty()) {
            eys $$8 = $$1.bC();

            for (bto $$9 : $$7) {
               eyn $$10 = $$9.cO().g((double)$$9.bP());
               if ($$10.d($$8)) {
                  return brp.e;
               }
            }
         }

         if ($$4.d() == eyq.a.b) {
            cpu $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dI());
            if (!$$0.a($$11, $$11.cO())) {
               return brp.d;
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dzl.t, $$4.g());
                  $$3.a(1, $$1);
               }

               $$1.b(awo.c.b(this));
               return brp.a;
            }
         } else {
            return brp.e;
         }
      }
   }

   private cpu a(deg $$0, eyq $$1, cvp $$2, cnu $$3) {
      eys $$4 = $$1.g();
      cpu $$5 = (cpu)(this.b ? new cpv($$0, $$4.d, $$4.e, $$4.f) : new cpu($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arh $$6) {
         btv.<cpu>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
