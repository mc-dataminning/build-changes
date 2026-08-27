import com.mojang.serialization.MapCodec;

public class cxq extends cys {
   public static final MapCodec<cxq> a = b(cxq::new);

   @Override
   public MapCodec<? extends cxq> a() {
      return a;
   }

   public cxq(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         $$0.a(null, $$4, atl.G, atm.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, atl.E, atm.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
