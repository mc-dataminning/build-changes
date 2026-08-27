import com.mojang.serialization.MapCodec;

public class dcg extends cwq {
   public static final MapCodec<dcg> c = b(dcg::new);
   protected static final eia g = ctc.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dcg> a() {
      return c;
   }

   public dcg(dfc.d $$0) {
      super($$0, ha.a, g, false, 0.1);
   }

   @Override
   protected int a(ash $$0) {
      return cyg.a($$0);
   }

   @Override
   protected ctc b() {
      return cte.oA;
   }

   @Override
   protected boolean g(dfd $$0) {
      return cyg.a($$0);
   }
}
