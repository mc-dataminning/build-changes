import com.mojang.serialization.MapCodec;

public class dbm extends cwp implements cws {
   public static final MapCodec<dbm> a = b(dbm::new);

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public dbm(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qh.n)).ifPresent($$3x -> ((drg)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }
}
