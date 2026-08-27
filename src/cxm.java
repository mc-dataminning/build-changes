import com.mojang.serialization.MapCodec;

public class cxm extends cyo {
   public static final MapCodec<cxm> a = b(cxm::new);

   @Override
   public MapCodec<? extends cxm> a() {
      return a;
   }

   public cxm(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         $$0.a(null, $$4, atk.G, atl.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, atk.E, atl.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
