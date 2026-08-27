import com.mojang.serialization.MapCodec;

public class dol extends diu {
   public static final MapCodec<dol> c = b(dol::new);
   public static final exn e = dfc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dol> a() {
      return c;
   }

   public dol(dtb.d $$0) {
      super($$0, iw.b, e, false);
   }

   @Override
   protected div c() {
      return (div)dfe.pB;
   }
}
