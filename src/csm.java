import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class csm extends ctc implements dab {
   public static final dfu d = dft.C;
   private static final eia a = ctc.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected csm(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends csm> a();

   protected void a(dfd $$0, cqc $$1, gw $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.D_().a(40));
      }
   }

   protected static boolean e(dfd $$0, cph $$1, gw $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$1.b_($$2.a($$3)).a(aqa.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(aqa.a) && $$1.e() == 8));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return a;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1 == ha.a && !this.a($$0, (cqe)$$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(d);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }
}
