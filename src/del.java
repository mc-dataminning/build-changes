import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class del extends dfb implements dmc {
   public static final dsv d = dsu.C;
   private static final ewm a = dfb.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected del(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends del> a();

   protected void a(dse $$0, dcb $$1, iz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dse $$0, dbg $$1, iz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (je $$3 : je.values()) {
            if ($$1.b_($$2.a($$3)).a(awv.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return a;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1 == je.a && !this.a($$0, (dcd)$$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(d) ? eny.c.a(false) : super.b_($$0);
   }
}
