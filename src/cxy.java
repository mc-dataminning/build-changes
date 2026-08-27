import com.mojang.serialization.MapCodec;

public class cxy extends ctc implements ctf {
   public static final MapCodec<cxy> a = b(cxy::new);

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   public cxy(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      $$0.G_().c(jc.at).flatMap($$0x -> $$0x.b(op.n)).ifPresent($$3x -> ((dnd)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
