import com.mojang.serialization.MapCodec;

public class dsm extends dnc {
   public static final MapCodec<dsm> c = b(dsm::new);
   public static final fbv e = djn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dsm> a() {
      return c;
   }

   public dsm(dwx.d $$0) {
      super($$0, jn.b, e, false);
   }

   @Override
   protected dnd c() {
      return (dnd)djp.pd;
   }
}
