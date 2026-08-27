import com.mojang.serialization.MapCodec;

public class dbn extends cwq implements cwt {
   public static final MapCodec<dbn> a = b(dbn::new);

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public dbn(djg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qh.n)).ifPresent($$3x -> ((drh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }
}
