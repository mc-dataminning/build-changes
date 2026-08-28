import com.mojang.serialization.MapCodec;

public class dww extends dqk {
   public static final MapCodec<dww> c = b(dww::new);
   private static final ffw g = dmr.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dww> a() {
      return c;
   }

   public dww(eas.d $$0) {
      super($$0, jb.a, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return dse.a($$0);
   }

   @Override
   protected dmr b() {
      return dmt.pg;
   }

   @Override
   protected boolean h(eat $$0) {
      return dse.a($$0);
   }
}
