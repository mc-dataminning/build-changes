import com.mojang.serialization.MapCodec;

public class dfs extends dcq {
   public static final MapCodec<dfs> a = b(dfs::new);
   protected static final eui b = dde.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   protected dfs(dqg.d $$0) {
      super($$0);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpd($$0, $$1);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$1 instanceof aqh && $$3.cu() && euf.c(euf.a($$3.cI().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ett.i)) {
         akg<dad> $$4 = $$1.ae() == dad.j ? dad.h : dad.j;
         aqh $$5 = ((aqh)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return csz.i;
   }

   @Override
   protected boolean a(dqh $$0, elz $$1) {
      return false;
   }
}
