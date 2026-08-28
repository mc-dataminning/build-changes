import com.mojang.serialization.MapCodec;

public class dil extends dlt {
   public static final MapCodec<dil> a = b(dil::new);

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dun.d $$0) {
      super($$0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         je $$4 = $$2.e();
         duo $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jj.b)) {
            azh.a($$1, $$2, $$3, ln.H);
         }
      }
   }
}
