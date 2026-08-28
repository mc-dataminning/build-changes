import com.mojang.serialization.MapCodec;

public class dnu extends diq {
   public static final MapCodec<dnu> c = b(dnu::new);
   public static final ewm g = dfb.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dnu> a() {
      return c;
   }

   public dnu(dsd.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dkh.a($$0);
   }

   @Override
   protected dfb b() {
      return dfd.oC;
   }

   @Override
   protected boolean g(dse $$0) {
      return dkh.a($$0);
   }
}
