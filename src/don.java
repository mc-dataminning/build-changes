import com.mojang.serialization.MapCodec;

public class don extends dfa {
   public static final MapCodec<don> a = b(don::new);

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      evs $$4 = new evs(0.25, 0.05F, 0.25);
      if ($$3 instanceof btq $$5 && $$5.b(bsf.K)) {
         $$4 = new evs(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
