import com.mojang.serialization.MapCodec;

public class dcg extends csv {
   public static final MapCodec<dcg> a = b(dcg::new);

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   public dcg(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return false;
   }

   @Override
   public int g(dgb $$0, cqf $$1, ht $$2) {
      return $$1.M();
   }
}
