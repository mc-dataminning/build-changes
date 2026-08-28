import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dle extends dlu implements dtb {
   public static final eaf b = eae.I;
   private static final feq a = dlu.b(12.0, 0.0, 4.0);

   protected dle(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dle> a();

   protected void a(dzo $$0, dhv $$1, dje $$2, azt $$3, iu $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dzo $$0, dhv $$1, iu $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$1.b_($$2.a($$3)).a(axf.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }
}
