import com.mojang.serialization.MapCodec;

public class djg extends dmn {
   public static final MapCodec<djg> a = b(djg::new);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dvi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dvj $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            azo.a($$1, $$2, $$3, lr.H);
         }
      }
   }
}
