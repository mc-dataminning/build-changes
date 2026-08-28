import com.mojang.serialization.MapCodec;

public class djc extends dke {
   public static final MapCodec<djc> a = b(djc::new);

   @Override
   public MapCodec<? extends djc> a() {
      return a;
   }

   public djc(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
