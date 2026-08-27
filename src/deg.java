import com.mojang.serialization.MapCodec;

public class deg extends dho {
   public static final MapCodec<deg> a = b(deg::new);

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(dqg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         in $$4 = $$2.d();
         dqh $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), is.b)) {
            ayc.a($$1, $$2, $$3, kx.F);
         }
      }
   }
}
