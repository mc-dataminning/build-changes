import com.mojang.serialization.MapCodec;

public class dii extends djk {
   public static final MapCodec<dii> a = b(dii::new);

   @Override
   public MapCodec<? extends dii> a() {
      return a;
   }

   public dii(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         $$0.a(null, $$4, avz.E, awa.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
