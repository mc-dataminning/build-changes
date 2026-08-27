import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddk extends dea implements dlb {
   public static final dru d = drt.C;
   private static final evf a = dea.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected ddk(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends ddk> a();

   protected void a(drd $$0, dba $$1, io $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(drd $$0, daf $$1, io $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (it $$3 : it.values()) {
            if ($$1.b_($$2.a($$3)).a(awc.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return a;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1 == it.a && !this.a($$0, (dbc)$$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, it.b);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }
}
