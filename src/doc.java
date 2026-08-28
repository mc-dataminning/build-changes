import com.mojang.serialization.MapCodec;

public class doc extends dgf implements dfz {
   public static final MapCodec<doc> a = b(doc::new);
   protected static final float b = 6.0F;
   protected static final exp c = dfw.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
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
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      die $$4 = (die)($$3.a(dfy.bu) ? dfy.iI : dfy.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         die.a($$0, $$4.o(), $$2, 2);
      }
   }
}
