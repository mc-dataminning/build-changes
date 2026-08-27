import com.mojang.serialization.MapCodec;

public class dif extends dck implements daf {
   public static final MapCodec<dif> c = b(dif::new);

   @Override
   public MapCodec<dif> a() {
      return c;
   }

   public dif(dna.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return true;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      a($$0, $$2, new cqm(this));
   }
}
