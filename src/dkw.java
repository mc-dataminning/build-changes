import com.mojang.serialization.MapCodec;

public class dkw extends dfy implements dgb {
   public static final MapCodec<dkw> a = b(dkw::new);

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      $$0.H_().c(lu.aI).flatMap($$0x -> $$0x.b(rp.n)).ifPresent($$3x -> ((ebq)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dgb.a au_() {
      return dgb.a.a;
   }
}
