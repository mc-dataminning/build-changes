import com.mojang.serialization.MapCodec;

public class djj extends dkl {
   public static final MapCodec<djj> a = b(djj::new);

   @Override
   public MapCodec<? extends djj> a() {
      return a;
   }

   public djj(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, axf.E, axg.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
