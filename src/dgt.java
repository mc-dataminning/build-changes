import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgt extends dhj implements dol {
   public static final dvf d = dve.C;
   private static final ezm a = dhj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dgt(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dgt> a();

   protected void a(duo $$0, deh $$1, je $$2) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.C_().a(40));
      }
   }

   protected static boolean d(duo $$0, ddl $$1, je $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jj $$3 : jj.values()) {
            if ($$1.b_($$2.a($$3)).a(awz.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(d, Boolean.valueOf($$1.a(awz.a) && $$1.e() == 8));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return a;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1 == jj.a && !this.a($$0, (dej)$$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jj.b);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }
}
