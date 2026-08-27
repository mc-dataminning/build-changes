import com.mojang.serialization.MapCodec;

public class cyk extends ctc implements ctf {
   public static final MapCodec<cyk> a = b(cyk::new);

   @Override
   public MapCodec<cyk> a() {
      return a;
   }

   protected cyk(dfc.d $$0) {
      super($$0);
   }

   private static boolean b(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfd $$4 = $$1.a_($$3);
      int $$5 = dzx.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cte.dV.o());
      }
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      dfd $$4 = $$0.a_($$2);
      gw $$5 = $$2.c();
      dha $$6 = $$0.k().g();
      hq<dnd<?, ?>> $$7 = $$0.G_().d(jc.at);
      if ($$4.a(cte.ow)) {
         this.a($$7, ot.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cte.on)) {
         this.a($$7, ot.j, $$0, $$6, $$1, $$5);
         this.a($$7, ot.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, ot.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(hq<dnd<?, ?>> $$0, aey<dnd<?, ?>> $$1, akt $$2, dha $$3, ash $$4, gw $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dnd)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
