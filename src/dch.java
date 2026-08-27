import com.mojang.serialization.MapCodec;

public class dch extends cwy implements cxb {
   public static final MapCodec<dch> a = b(dch::new);

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   protected dch(djo.d $$0) {
      super($$0);
   }

   private static boolean b(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.c();
      djp $$4 = $$1.a_($$3);
      int $$5 = eeq.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cxa.dV.o());
      }
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      djp $$4 = $$0.a_($$2);
      hx $$5 = $$2.c();
      dlm $$6 = $$0.l().g();
      it<drp<?, ?>> $$7 = $$0.I_().d(ke.aw);
      if ($$4.a(cxa.ow)) {
         this.a($$7, qm.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cxa.on)) {
         this.a($$7, qm.j, $$0, $$6, $$1, $$5);
         this.a($$7, qm.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qm.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(it<drp<?, ?>> $$0, ahg<drp<?, ?>> $$1, ane $$2, dlm $$3, auw $$4, hx $$5) {
      $$0.b($$1).ifPresent($$4x -> ((drp)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public cxb.a av_() {
      return cxb.a.a;
   }
}
