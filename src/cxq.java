import java.util.Optional;

public class cxq extends csy implements css {
   protected static final float a = 3.0F;
   protected static final eib b = csq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aet<dne<?, ?>> c;

   public cxq(dfd.d $$0, aet<dne<?, ?>> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (gw $$6 : gw.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         gw $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.t($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.t($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfe $$4 = $$1.a_($$3);
      return $$4.a(apo.aZ) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(akn $$0, gw $$1, dfe $$2, arx $$3) {
      Optional<? extends hg<dne<?, ?>>> $$4 = $$0.B_().d(je.as).b(this.c);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.k().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
