import com.mojang.serialization.MapCodec;

public class dtd extends dna {
   public static final MapCodec<dtd> c = b(dtd::new);
   protected static final fbs g = djk.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtd> a() {
      return c;
   }

   public dtd(dwu.d $$0) {
      super($$0, jn.a, g, false, 0.1);
   }

   @Override
   protected int a(azg $$0) {
      return dot.a($$0);
   }

   @Override
   protected djk b() {
      return djm.pc;
   }

   @Override
   protected boolean h(dwv $$0) {
      return dot.a($$0);
   }
}
