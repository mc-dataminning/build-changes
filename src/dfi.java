import com.mojang.serialization.MapCodec;

public class dfi extends daf {
   public static final MapCodec<dfi> c = b(dfi::new);
   public static final emm g = cwq.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dfi> a() {
      return c;
   }

   public dfi(djg.d $$0) {
      super($$0, ic.b, g, false, 0.1);
   }

   @Override
   protected int a(auv $$0) {
      return dbv.a($$0);
   }

   @Override
   protected cwq b() {
      return cws.oC;
   }

   @Override
   protected boolean g(djh $$0) {
      return dbv.a($$0);
   }
}
