import com.mojang.serialization.MapCodec;

public class dbr extends cwq {
   public static final MapCodec<dbr> c = b(dbr::new);
   public static final eia g = ctc.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dbr> a() {
      return c;
   }

   public dbr(dfc.d $$0) {
      super($$0, ha.b, g, false, 0.1);
   }

   @Override
   protected int a(ash $$0) {
      return cyg.a($$0);
   }

   @Override
   protected ctc b() {
      return cte.oC;
   }

   @Override
   protected boolean g(dfd $$0) {
      return cyg.a($$0);
   }
}
