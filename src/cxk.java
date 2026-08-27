import java.util.Optional;

public class cxk extends css implements csm {
   protected static final float a = 3.0F;
   protected static final ehy b = csk.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aeo<dmy<?, ?>> c;

   public cxk(dex.d $$0, aeo<dmy<?, ?>> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (gv $$6 : gv.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         gv $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      dey $$4 = $$1.a_($$3);
      return $$4.a(apj.aZ) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(aki $$0, gv $$1, dey $$2, art $$3) {
      Optional<? extends hf<dmy<?, ?>>> $$4 = $$0.B_().d(jd.as).b(this.c);
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
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
