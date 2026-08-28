import com.mojang.serialization.MapCodec;

public class ddy extends dfa {
   public static final MapCodec<ddy> a = b(ddy::new);

   @Override
   public MapCodec<? extends ddy> a() {
      return a;
   }

   public ddy(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, awa.G, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
