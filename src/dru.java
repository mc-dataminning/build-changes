import com.mojang.serialization.MapCodec;

public class dru extends dlu implements djo {
   public static final MapCodec<dru> c = b(dru::new);

   @Override
   public MapCodec<dru> a() {
      return c;
   }

   public dru(dwv.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return true;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      a($$0, $$2, new cwo(this));
   }
}
