import com.mojang.serialization.MapCodec;

public class dio extends dde implements ddh {
   public static final MapCodec<dio> a = b(dio::new);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(dqg.d $$0) {
      super($$0);
   }

   private static boolean b(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.c();
      dqh $$4 = $$1.a_($$3);
      int $$5 = elr.a($$1, $$0, $$2, $$4, $$3, is.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, ddg.dV.n());
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      dqh $$4 = $$0.a_($$2);
      in $$5 = $$2.c();
      dse $$6 = $$0.l().g();
      jj<dyq<?, ?>> $$7 = $$0.H_().d(le.aC);
      if ($$4.a(ddg.ow)) {
         this.a($$7, rs.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(ddg.on)) {
         this.a($$7, rs.j, $$0, $$6, $$1, $$5);
         this.a($$7, rs.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rs.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jj<dyq<?, ?>> $$0, akg<dyq<?, ?>> $$1, aqh $$2, dse $$3, ayg $$4, in $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dyq)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public ddh.a aq_() {
      return ddh.a.a;
   }
}
