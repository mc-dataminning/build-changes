import com.mojang.serialization.MapCodec;

public class djy extends dfa implements dfd {
   public static final MapCodec<djy> a = b(djy::new);

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dsc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sg.n)).ifPresent($$3x -> ((eam)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfd.a ap_() {
      return dfd.a.a;
   }
}
