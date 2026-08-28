import com.mojang.serialization.MapCodec;

public class dkd extends dff implements dfi {
   public static final MapCodec<dkd> a = b(dkd::new);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(rl.n)).ifPresent($$3x -> ((ear)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfi.a aq_() {
      return dfi.a.a;
   }
}
