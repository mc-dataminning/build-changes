import com.mojang.serialization.MapCodec;

public class dnm extends dgb {
   public static final MapCodec<dnm> n = b(dnm::new);

   @Override
   public MapCodec<dnm> a() {
      return n;
   }

   public dnm(dsa.d $$0) {
      super($$0, () -> dpi.c);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqz($$0, $$1);
   }

   @Override
   protected awg<ale> c() {
      return awj.i.b(awj.ai);
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return ayy.a(dpn.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
