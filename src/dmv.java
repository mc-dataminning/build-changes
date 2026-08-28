import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dgf implements dfz, dkn {
   public static final MapCodec<dmv> a = b(dmv::new);
   protected static final float b = 6.0F;
   protected static final exp c = dfw.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.d($$1, $$2, ji.b) && !$$0.a(dfy.kJ);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return $$1.a(awj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      dta $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   protected eoy b_(dta $$0) {
      return eoz.c.a(false);
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      dta $$4 = dfy.bx.o();
      dta $$5 = $$4.a(dod.d, dtw.a);
      jd $$6 = $$2.c();
      if ($$0.a_($$6).a(dfy.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
