import com.mojang.serialization.MapCodec;

public class dcc extends dde {
   public static final MapCodec<dcc> a = b(dcc::new);

   @Override
   public MapCodec<? extends dcc> a() {
      return a;
   }

   public dcc(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      if (!$$0.B) {
         in $$4 = $$2.a();
         $$0.a(null, $$4, avc.G, avd.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avc.E, avd.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
