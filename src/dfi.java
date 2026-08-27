import com.mojang.serialization.MapCodec;

public class dfi extends dad {
   public static final MapCodec<dfi> c = b(dfi::new);
   public static final eml e = cwp.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dfi> a() {
      return c;
   }

   public dfi(djf.d $$0) {
      super($$0, ic.b, e, false);
   }

   @Override
   protected dae c() {
      return (dae)cwr.oB;
   }
}
