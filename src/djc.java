import com.mojang.serialization.MapCodec;

public class djc extends dke {
   public static final MapCodec<djc> a = b(djc::new);

   @Override
   public MapCodec<? extends djc> a() {
      return a;
   }

   public djc(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, axf.E, axg.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
