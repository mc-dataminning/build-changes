import com.mojang.serialization.MapCodec;

public class dby extends cwp implements cws {
   public static final MapCodec<dby> a = b(dby::new);

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   protected dby(djf.d $$0) {
      super($$0);
   }

   private static boolean b(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.c();
      djg $$4 = $$1.a_($$3);
      int $$5 = eeh.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cwr.dV.o());
      }
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      djg $$4 = $$0.a_($$2);
      hx $$5 = $$2.c();
      dld $$6 = $$0.l().g();
      it<drg<?, ?>> $$7 = $$0.I_().d(ke.aw);
      if ($$4.a(cwr.ow)) {
         this.a($$7, ql.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cwr.on)) {
         this.a($$7, ql.j, $$0, $$6, $$1, $$5);
         this.a($$7, ql.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, ql.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(it<drg<?, ?>> $$0, ahf<drg<?, ?>> $$1, and $$2, dld $$3, auu $$4, hx $$5) {
      $$0.b($$1).ifPresent($$4x -> ((drg)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
