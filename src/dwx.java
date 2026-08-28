import com.mojang.serialization.MapCodec;

public class dwx extends dqj {
   public static final MapCodec<dwx> c = b(dwx::new);
   private static final ffw e = dmr.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dwx> a() {
      return c;
   }

   public dwx(eas.d $$0) {
      super($$0, jb.a, e, false);
   }

   @Override
   protected dqk c() {
      return (dqk)dmt.pf;
   }
}
