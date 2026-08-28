import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends dhg implements djp {
   public static final MapCodec<dne> c = b(dne::new);
   public static final dsz<dsx> d = dhg.b;
   protected static final float e = 6.0F;
   protected static final ewj f = dey.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dne> a() {
      return c;
   }

   public dne(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return f;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfa.kJ);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(dfa.bw);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = super.a($$0);
      if ($$1 != null) {
         enu $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awu.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      if ($$0.c(d) == dsx.a) {
         dsb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dsx.b;
      } else {
         enu $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awu.a) && $$4.e() == 8;
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return env.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return false;
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      return false;
   }
}
