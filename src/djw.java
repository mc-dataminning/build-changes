import com.mojang.serialization.MapCodec;

public class djw extends dey implements dfb {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dsa.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sf.n)).ifPresent($$3x -> ((eak)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfb.a ap_() {
      return dfb.a.a;
   }
}
