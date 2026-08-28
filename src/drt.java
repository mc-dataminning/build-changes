import com.mojang.serialization.MapCodec;

public class drt extends dlt implements djn {
   public static final MapCodec<drt> c = b(drt::new);

   @Override
   public MapCodec<drt> a() {
      return c;
   }

   public drt(dwu.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return true;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      a($$0, $$2, new cwn(this));
   }
}
