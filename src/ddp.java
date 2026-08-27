import com.mojang.serialization.MapCodec;

public class ddp extends cys implements cyv {
   public static final MapCodec<ddp> a = b(ddp::new);

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public ddp(dli.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      $$0.I_().c(kg.aw).flatMap($$0x -> $$0x.b(qk.n)).ifPresent($$3x -> ((dtm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public cyv.a av_() {
      return cyv.a.a;
   }
}
