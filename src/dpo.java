import com.mojang.serialization.MapCodec;

public class dpo extends djr implements dhm {
   public static final MapCodec<dpo> c = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return c;
   }

   public dpo(dun.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return true;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      a($$0, $$2, new cvp(this));
   }
}
