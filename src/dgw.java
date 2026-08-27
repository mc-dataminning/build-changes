import com.mojang.serialization.MapCodec;

public class dgw extends czb implements cyv {
   public static final MapCodec<dgw> a = b(dgw::new);
   protected static final float b = 6.0F;
   protected static final eos c = cys.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   protected dgw(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      dba $$4 = (dba)($$3.a(cyu.bu) ? cyu.iI : cyu.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dba.a($$0, $$4.o(), $$2, 2);
      }
   }
}
