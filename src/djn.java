import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djn extends dkd implements drj {
   public static final dyf d = dye.J;
   private static final fcl a = dkd.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected djn(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends djn> a();

   protected void a(dxo $$0, dge $$1, dho $$2, bac $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dxo $$0, dge $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(axq.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(axq.a) && $$1.e() == 8));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return a;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(d);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }
}
