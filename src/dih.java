import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dih extends dck implements des {
   public static final MapCodec<dih> c = b(dih::new);
   public static final dnz<dnx> d = dck.b;
   protected static final float e = 6.0F;
   protected static final eqm f = dac.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dih> a() {
      return c;
   }

   public dih(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return f;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dae.kJ);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(dae.bw);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      if ($$1 != null) {
         eip $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(aus.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      if ($$0.c(d) == dnx.a) {
         dnb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dnx.b;
      } else {
         eip $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aus.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return eiq.c.a(false);
   }

   @Override
   public boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return false;
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      return false;
   }
}
