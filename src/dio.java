import com.mojang.serialization.MapCodec;

public class dio extends dlw {
   public static final MapCodec<dio> a = b(dio::new);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dur.d $$0) {
      super($$0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jf $$4 = $$2.e();
         dus $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jk.b)) {
            azj.a($$1, $$2, $$3, lo.H);
         }
      }
   }
}
