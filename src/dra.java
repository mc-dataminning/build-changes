import com.mojang.serialization.MapCodec;

public class dra extends dhm {
   public static final MapCodec<dra> a = b(dra::new);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      eyw $$4 = new eyw(0.25, 0.05F, 0.25);
      if ($$3 instanceof bun $$5 && $$5.b(bta.K)) {
         $$4 = new eyw(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
