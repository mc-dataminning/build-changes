import com.mojang.serialization.MapCodec;

public class cxb extends cwq {
   public static final MapCodec<cxb> a = b(cxb::new);
   public static final dkh b = djx.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final emm e = cwq.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final emm f = cwq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   protected cxb(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      hx $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               djh $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return e;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return f;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      for (ic $$3 : ic.c.a) {
         djh $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(asm.b)) {
            return false;
         }
      }

      djh $$5 = $$1.a_($$2.d());
      return ($$5.a(cws.dQ) || $$5.a(ash.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
