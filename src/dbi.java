import com.mojang.serialization.MapCodec;

public class dbi extends cvz implements cwc {
   public static final MapCodec<dbi> a = b(dbi::new);

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   protected dbi(dio.d $$0) {
      super($$0);
   }

   private static boolean b(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.c();
      dip $$4 = $$1.a_($$3);
      int $$5 = edq.a($$1, $$0, $$2, $$4, $$3, ia.b, $$4.b($$1, $$3));
      return $$5 < $$1.N();
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cwb.dV.o());
      }
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      dip $$4 = $$0.a_($$2);
      hv $$5 = $$2.c();
      dkm $$6 = $$0.k().g();
      ir<dqp<?, ?>> $$7 = $$0.I_().d(kc.av);
      if ($$4.a(cwb.ow)) {
         this.a($$7, qh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cwb.on)) {
         this.a($$7, qh.j, $$0, $$6, $$1, $$5);
         this.a($$7, qh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ir<dqp<?, ?>> $$0, ags<dqp<?, ?>> $$1, amp $$2, dkm $$3, auf $$4, hv $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dqp)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
