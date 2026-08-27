import com.mojang.serialization.MapCodec;

public class dex extends daa implements dad {
   public static final MapCodec<dex> a = b(dex::new);

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dmy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      $$0.H_().c(kj.ax).flatMap($$0x -> $$0x.b(qo.n)).ifPresent($$3x -> ((dvd)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dad.a at_() {
      return dad.a.a;
   }
}
