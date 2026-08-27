import java.util.Optional;

public class cun extends cpv implements cpp {
   protected static final float a = 3.0F;
   protected static final efb b = cpn.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final acp<dkb<?, ?>> c;

   public cun(dca.d $$0, acp<dkb<?, ?>> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (gu $$6 : gu.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         gu $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dcb $$4 = $$1.a_($$3);
      return $$4.a(amw.aY) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(aif $$0, gu $$1, dcb $$2, apf $$3) {
      Optional<? extends he<dkb<?, ?>>> $$4 = $$0.B_().d(jc.as).b(this.c);
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
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
