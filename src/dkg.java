import com.mojang.serialization.MapCodec;

public class dkg extends dfi implements dfl {
   public static final MapCodec<dkg> a = b(dkg::new);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dsk.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(rl.n)).ifPresent($$3x -> ((eay)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfl.a aq_() {
      return dfl.a.a;
   }
}
