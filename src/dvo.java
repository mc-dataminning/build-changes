import com.mojang.serialization.MapCodec;

public class dvo extends dpx {
   public static final MapCodec<dvo> c = b(dvo::new);
   private static final ffk e = dmf.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dvo> a() {
      return c;
   }

   public dvo(eag.d $$0) {
      super($$0, ja.b, e, false);
   }

   @Override
   protected dpy c() {
      return (dpy)dmh.ph;
   }
}
