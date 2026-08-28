import com.mojang.serialization.MapCodec;

public class dil extends djn {
   public static final MapCodec<dil> a = b(dil::new);

   @Override
   public MapCodec<? extends dil> a() {
      return a;
   }

   public dil(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
