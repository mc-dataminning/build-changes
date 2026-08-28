import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dei extends dey implements dlz {
   public static final dss d = dsr.C;
   private static final ewj a = dey.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dei(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dei> a();

   protected void a(dsb $$0, dby $$1, iz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsb $$0, dbd $$1, iz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (je $$3 : je.values()) {
            if ($$1.b_($$2.a($$3)).a(awu.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awu.a) && $$1.e() == 8));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return a;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1 == je.a && !this.a($$0, (dca)$$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }
}
