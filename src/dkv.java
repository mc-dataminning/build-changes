import com.mojang.serialization.MapCodec;

public class dkv extends dfa {
   public static final MapCodec<dkv> a = b(dkv::new);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return 15;
   }
}
