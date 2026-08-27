import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxy extends cyo implements dfo {
   public static final dlw d = dlv.C;
   private static final eol a = cyo.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cxy(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cxy> a();

   protected void a(dlf $$0, cvo $$1, hz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dlf $$0, cut $$1, hz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ie $$3 : ie.values()) {
            if ($$1.b_($$2.a($$3)).a(aue.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(aue.a) && $$1.e() == 8));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return a;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1 == ie.a && !this.a($$0, (cvq)$$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ie.b);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }
}
