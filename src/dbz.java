import com.mojang.serialization.MapCodec;

public class dbz extends cwq implements cwt {
   public static final MapCodec<dbz> a = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   protected dbz(djg.d $$0) {
      super($$0);
   }

   private static boolean b(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.c();
      djh $$4 = $$1.a_($$3);
      int $$5 = eei.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cws.dV.o());
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      djh $$4 = $$0.a_($$2);
      hx $$5 = $$2.c();
      dle $$6 = $$0.l().g();
      it<drh<?, ?>> $$7 = $$0.I_().d(ke.aw);
      if ($$4.a(cws.ow)) {
         this.a($$7, ql.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cws.on)) {
         this.a($$7, ql.j, $$0, $$6, $$1, $$5);
         this.a($$7, ql.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, ql.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(it<drh<?, ?>> $$0, ahf<drh<?, ?>> $$1, and $$2, dle $$3, auv $$4, hx $$5) {
      $$0.b($$1).ifPresent($$4x -> ((drh)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
