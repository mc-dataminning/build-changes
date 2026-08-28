import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends die implements dkn {
   public static final MapCodec<dod> c = b(dod::new);
   public static final dty<dtw> d = die.b;
   protected static final float e = 6.0F;
   protected static final exp f = dfw.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dod> a() {
      return c;
   }

   public dod(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return f;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.d($$1, $$2, ji.b) && !$$0.a(dfy.kJ);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(dfy.bw);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = super.a($$0);
      if ($$1 != null) {
         eoy $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      if ($$0.c(d) == dtw.a) {
         dta $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dtw.b;
      } else {
         eoy $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return eoz.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return false;
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      return false;
   }
}
