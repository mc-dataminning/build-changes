import com.mojang.serialization.MapCodec;

public class dgk extends dhm {
   public static final MapCodec<dgk> a = b(dgk::new);

   @Override
   public MapCodec<? extends dgk> a() {
      return a;
   }

   public dgk(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      if (!$$0.B) {
         jf $$4 = $$2.b();
         $$0.a(null, $$4, awg.G, awh.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awg.E, awh.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
