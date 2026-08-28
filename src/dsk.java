import com.mojang.serialization.MapCodec;

public class dsk extends dme {
   public static final MapCodec<dsk> a = b(dsk::new);
   private static final feq b = dlu.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   protected dsk(dzn.d $$0) {
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
