import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dek extends dfa implements dmb {
   public static final dsu d = dst.C;
   private static final ewl a = dfa.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dek(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dek> a();

   protected void a(dsd $$0, dca $$1, iz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsd $$0, dbf $$1, iz $$2) {
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
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return a;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1 == je.a && !this.a($$0, (dcc)$$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }
}
