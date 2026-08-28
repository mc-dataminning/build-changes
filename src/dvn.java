import com.mojang.serialization.MapCodec;

public class dvn extends dpy {
   public static final MapCodec<dvn> c = b(dvn::new);
   private static final ffk g = dmf.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dvn> a() {
      return c;
   }

   public dvn(eag.d $$0) {
      super($$0, ja.b, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drs.a($$0);
   }

   @Override
   protected dmf b() {
      return dmh.pi;
   }

   @Override
   protected boolean h(eah $$0) {
      return drs.a($$0);
   }
}
