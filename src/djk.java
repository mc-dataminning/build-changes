import com.mojang.serialization.MapCodec;

public class djk extends dkm {
   public static final MapCodec<djk> a = b(djk::new);

   @Override
   public MapCodec<? extends djk> a() {
      return a;
   }

   public djk(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, axf.E, axg.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
