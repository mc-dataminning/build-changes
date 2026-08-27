import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddt extends dac implements dhc {
   public static final MapCodec<ddt> a = b(ddt::new);
   private static final dns c = dnr.C;
   protected static final eqm b = dac.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   protected ddt(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      if ($$1 != null) {
         eip $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eiq.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.c();
      dnb $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ih.a);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !this.a($$0, $$3, $$4)) {
         return dae.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
