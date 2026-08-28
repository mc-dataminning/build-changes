import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dht extends dij implements dpk {
   public static final dwf d = dwe.C;
   private static final fal a = dij.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dht(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dht> a();

   protected void a(dvo $$0, dek $$1, dfu $$2, azv $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dvo $$0, dek $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(axj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(axj.a) && $$1.e() == 8));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return a;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }
}
