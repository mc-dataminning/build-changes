import com.mojang.serialization.MapCodec;

public class djv extends dex implements dfa {
   public static final MapCodec<djv> a = b(djv::new);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(drz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sf.n)).ifPresent($$3x -> ((eaj)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfa.a aq_() {
      return dfa.a.a;
   }
}
