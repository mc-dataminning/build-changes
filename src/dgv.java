import com.mojang.serialization.MapCodec;

public class dgv extends dby implements dcb {
   public static final MapCodec<dgv> a = b(dgv::new);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(doy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      $$0.H_().c(ks.ay).flatMap($$0x -> $$0x.b(ra.n)).ifPresent($$3x -> ((dxi)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dcb.a ar_() {
      return dcb.a.a;
   }
}
