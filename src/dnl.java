import com.mojang.serialization.MapCodec;

public class dnl extends dga {
   public static final MapCodec<dnl> n = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return n;
   }

   public dnl(drz.d $$0) {
      super($$0, () -> dph.c);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqy($$0, $$1);
   }

   @Override
   protected awg<ale> c() {
      return awj.i.b(awj.ai);
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return ayx.a(dpm.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
