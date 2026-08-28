import com.mojang.serialization.MapCodec;

public class dns extends dio {
   public static final MapCodec<dns> c = b(dns::new);
   public static final ewk g = dez.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   public dns(dsb.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dkf.a($$0);
   }

   @Override
   protected dez b() {
      return dfb.oC;
   }

   @Override
   protected boolean g(dsc $$0) {
      return dkf.a($$0);
   }
}
