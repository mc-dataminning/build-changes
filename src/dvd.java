import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvd extends dov implements drj {
   public static final MapCodec<dvd> c = b(dvd::new);
   public static final ebm<ebk> d = dov.b;
   private static final ffr e = dmm.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvd> a() {
      return c;
   }

   public dvd(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dmo.lp);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(dmo.bG);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      if ($$1 != null) {
         ewv $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      if ($$0.c(d) == ebk.a) {
         eao $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == ebk.b;
      } else {
         ewv $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axh.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return eww.c.a(false);
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return false;
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      return false;
   }
}
