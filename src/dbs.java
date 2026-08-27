import com.mojang.serialization.MapCodec;

public class dbs extends deg {
   public static final MapCodec<dbs> a = b(dbs::new);

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(djg.d $$0) {
      super($$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jx.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
