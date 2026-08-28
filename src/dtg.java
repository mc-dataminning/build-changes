import com.mojang.serialization.MapCodec;

public class dtg extends dnd {
   public static final MapCodec<dtg> c = b(dtg::new);
   protected static final fbv g = djn.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtg> a() {
      return c;
   }

   public dtg(dwx.d $$0) {
      super($$0, jn.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dow.a($$0);
   }

   @Override
   protected djn b() {
      return djp.pc;
   }

   @Override
   protected boolean h(dwy $$0) {
      return dow.a($$0);
   }
}
