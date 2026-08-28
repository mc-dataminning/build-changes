import com.mojang.serialization.MapCodec;

public class dgh extends dhj {
   public static final MapCodec<dgh> a = b(dgh::new);

   @Override
   public MapCodec<? extends dgh> a() {
      return a;
   }

   public dgh(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      if (!$$0.B) {
         je $$4 = $$2.b();
         $$0.a(null, $$4, awe.G, awf.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awe.E, awf.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
