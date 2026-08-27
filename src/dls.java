import com.mojang.serialization.MapCodec;

public class dls extends deh {
   public static final MapCodec<dls> n = b(dls::new);

   @Override
   public MapCodec<dls> a() {
      return n;
   }

   public dls(dqg.d $$0) {
      super($$0, () -> dno.c);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpf($$0, $$1);
   }

   @Override
   protected avj<akh> c() {
      return avm.i.b(avm.ai);
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return axz.a(dnt.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$3 == is.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
