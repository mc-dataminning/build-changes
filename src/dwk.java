import com.mojang.serialization.MapCodec;

public class dwk extends dpy {
   public static final MapCodec<dwk> c = b(dwk::new);
   private static final ffk g = dmf.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dwk> a() {
      return c;
   }

   public dwk(eag.d $$0) {
      super($$0, ja.a, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drs.a($$0);
   }

   @Override
   protected dmf b() {
      return dmh.pg;
   }

   @Override
   protected boolean h(eah $$0) {
      return drs.a($$0);
   }
}
