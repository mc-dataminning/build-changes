import com.mojang.serialization.MapCodec;

public class dht extends dcv implements dcy {
   public static final MapCodec<dht> a = b(dht::new);

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dpx.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      $$0.H_().c(ld.aB).flatMap($$0x -> $$0x.b(rm.n)).ifPresent($$3x -> ((dyh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dcy.a aq_() {
      return dcy.a.a;
   }
}
