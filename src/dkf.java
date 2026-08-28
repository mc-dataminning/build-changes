import com.mojang.serialization.MapCodec;

public class dkf extends dfh implements dfk {
   public static final MapCodec<dkf> a = b(dkf::new);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dsj.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(rl.n)).ifPresent($$3x -> ((eax)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfk.a aq_() {
      return dfk.a.a;
   }
}
