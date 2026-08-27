import com.mojang.serialization.MapCodec;

public class cyo extends cwy {
   public static final MapCodec<cyo> a = b(cyo::new);
   protected static final float b = 6.0F;
   protected static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   protected cyo(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(asg.cd);
   }
}
