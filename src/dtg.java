import com.mojang.serialization.MapCodec;

public class dtg extends dnb {
   public static final MapCodec<dtg> c = b(dtg::new);
   public static final fbu e = djm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dtg> a() {
      return c;
   }

   public dtg(dww.d $$0) {
      super($$0, jn.a, e, false);
   }

   @Override
   protected dnc c() {
      return (dnc)djo.pb;
   }
}
