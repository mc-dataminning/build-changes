import com.mojang.serialization.MapCodec;

public class dnj extends dhn implements dfi {
   public static final MapCodec<dnj> c = b(dnj::new);

   @Override
   public MapCodec<dnj> a() {
      return c;
   }

   public dnj(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      a($$0, $$2, new cua(this));
   }
}
