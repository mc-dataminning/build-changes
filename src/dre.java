import com.mojang.serialization.MapCodec;

public class dre extends djt {
   public static final MapCodec<dre> n = b(dre::new);

   @Override
   public MapCodec<dre> a() {
      return n;
   }

   public dre(dvu.d $$0) {
      super(() -> dta.c, $$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dut($$0, $$1);
   }

   @Override
   protected awu<alj> c() {
      return awx.i.b(awx.ai);
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return azm.a(dtf.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
