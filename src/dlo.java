import com.mojang.serialization.MapCodec;

public class dlo extends dox {
   public static final MapCodec<dlo> a = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dxt.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dxu $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            bai.a($$1, $$2, $$3, ls.H);
         }
      }
   }
}
