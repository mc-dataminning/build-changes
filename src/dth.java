import com.mojang.serialization.MapCodec;

public class dth extends dnc {
   public static final MapCodec<dth> c = b(dth::new);
   public static final fbv e = djn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dth> a() {
      return c;
   }

   public dth(dwx.d $$0) {
      super($$0, jn.a, e, false);
   }

   @Override
   protected dnd c() {
      return (dnd)djp.pb;
   }
}
