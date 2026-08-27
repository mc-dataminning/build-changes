import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuk extends cva implements dca {
   public static final dhz d = dhy.C;
   private static final ekn a = cva.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cuk(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cuk> a();

   protected void a(dhi $$0, csb $$1, ht $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dhi $$0, crg $$1, ht $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$1.b_($$2.a($$3)).a(arl.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(arl.a) && $$1.e() == 8));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return a;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1 == hx.a && !this.a($$0, (csd)$$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }
}
