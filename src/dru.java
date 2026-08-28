import com.mojang.serialization.MapCodec;

public class dru extends dlu {
   public static final MapCodec<dru> a = b(dru::new);

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   public dru(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return 15;
   }
}
