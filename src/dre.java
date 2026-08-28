import com.mojang.serialization.MapCodec;

public class dre extends dme {
   public static final MapCodec<dre> a = b(dre::new);
   private static final feq b = dlu.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(axa.aO) || $$0.a(dlw.ek) || super.b($$0, $$1, $$2);
   }
}
