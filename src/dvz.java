import com.mojang.serialization.MapCodec;

public class dvz extends dqk {
   public static final MapCodec<dvz> c = b(dvz::new);
   private static final ffw g = dmr.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dvz> a() {
      return c;
   }

   public dvz(eas.d $$0) {
      super($$0, jb.b, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return dse.a($$0);
   }

   @Override
   protected dmr b() {
      return dmt.pi;
   }

   @Override
   protected boolean h(eat $$0) {
      return dse.a($$0);
   }
}
