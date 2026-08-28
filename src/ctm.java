import java.util.List;

public class ctm extends cvg {
   private final cpo.b a;
   private final boolean b;

   public ctm(boolean $$0, cpo.b $$1, cvg.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      eyc $$4 = a($$0, $$1, dda.b.c);
      if ($$4.c() == eyc.a.a) {
         return brk.e;
      } else {
         eye $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<btj> $$7 = $$0.a($$1, $$1.cO().b($$5.c(5.0)).g(1.0), bto.h);
         if (!$$7.isEmpty()) {
            eye $$8 = $$1.bC();

            for (btj $$9 : $$7) {
               exz $$10 = $$9.cO().g((double)$$9.bP());
               if ($$10.d($$8)) {
                  return brk.e;
               }
            }
         }

         if ($$4.c() == eyc.a.b) {
            cpo $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dI());
            if (!$$0.a($$11, $$11.cO())) {
               return brk.d;
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dyx.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awn.c.b(this));
               return brk.a;
            }
         } else {
            return brk.e;
         }
      }
   }

   private cpo a(dds $$0, eyc $$1, cvl $$2, cnp $$3) {
      eye $$4 = $$1.e();
      cpo $$5 = (cpo)(this.b ? new cpp($$0, $$4.d, $$4.e, $$4.f) : new cpo($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arg $$6) {
         btq.<cpo>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
