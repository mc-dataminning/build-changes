import com.mojang.serialization.MapCodec;

public class dwa extends dqj {
   public static final MapCodec<dwa> c = b(dwa::new);
   private static final ffw e = dmr.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dwa> a() {
      return c;
   }

   public dwa(eas.d $$0) {
      super($$0, jb.b, e, false);
   }

   @Override
   protected dqk c() {
      return (dqk)dmt.ph;
   }
}
