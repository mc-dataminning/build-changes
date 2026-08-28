import com.mojang.serialization.MapCodec;

public class dij extends djl {
   public static final MapCodec<dij> a = b(dij::new);

   @Override
   public MapCodec<? extends dij> a() {
      return a;
   }

   public dij(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
