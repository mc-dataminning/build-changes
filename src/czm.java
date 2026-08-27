import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czm extends dac implements dhc {
   public static final dns d = dnr.C;
   private static final eqm a = dac.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected czm(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends czm> a();

   protected void a(dnb $$0, cxc $$1, ib $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dnb $$0, cwh $$1, ib $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$1.b_($$2.a($$3)).a(aus.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(aus.a) && $$1.e() == 8));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return a;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1 == ih.a && !this.a($$0, (cxe)$$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }
}
