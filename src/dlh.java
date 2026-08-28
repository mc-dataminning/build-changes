import com.mojang.serialization.MapCodec;

public class dlh extends doq {
   public static final MapCodec<dlh> a = b(dlh::new);

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dxm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dxn $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            bai.a($$1, $$2, $$3, ls.H);
         }
      }
   }
}
