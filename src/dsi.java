import com.mojang.serialization.MapCodec;

public class dsi extends dna {
   public static final MapCodec<dsi> c = b(dsi::new);
   public static final fbs g = djk.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dsi> a() {
      return c;
   }

   public dsi(dwu.d $$0) {
      super($$0, jn.b, g, false, 0.1);
   }

   @Override
   protected int a(azg $$0) {
      return dot.a($$0);
   }

   @Override
   protected djk b() {
      return djm.pe;
   }

   @Override
   protected boolean h(dwv $$0) {
      return dot.a($$0);
   }
}
