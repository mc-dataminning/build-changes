import com.mojang.serialization.MapCodec;

public class did extends dci implements dad {
   public static final MapCodec<did> c = b(did::new);

   @Override
   public MapCodec<did> a() {
      return c;
   }

   public did(dmy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      a($$0, $$2, new cqk(this));
   }
}
