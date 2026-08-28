import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlp extends dmf implements dtq {
   public static final eay b = eax.I;
   private static final ffk a = dmf.b(12.0, 0.0, 4.0);

   protected dlp(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dlp> a();

   protected void a(eah $$0, dig $$1, djp $$2, azv $$3, iu $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(eah $$0, dig $$1, iu $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$1.b_($$2.a($$3)).a(axh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }
}
