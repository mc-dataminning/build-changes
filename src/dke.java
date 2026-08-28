import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dke extends dku implements dsb {
   public static final dzd b = dzc.I;
   private static final fdo a = dku.b(12.0, 0.0, 4.0);

   protected dke(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dke> a();

   protected void a(dym $$0, dgv $$1, die $$2, azs $$3, jj $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dym $$0, dgv $$1, jj $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jo $$3 : jo.values()) {
            if ($$1.b_($$2.a($$3)).a(axf.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4 == jo.a && !this.a($$0, $$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jo.b);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }
}
