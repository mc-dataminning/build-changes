import com.mojang.serialization.MapCodec;

public class cxj extends cwy {
   public static final MapCodec<cxj> a = b(cxj::new);
   public static final dkp b = dkf.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final emv e = cwy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final emv f = cwy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   protected cxj(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
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
               djp $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return f;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      for (ic $$3 : ic.c.a) {
         djp $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(asn.b)) {
            return false;
         }
      }

      djp $$5 = $$1.a_($$2.d());
      return ($$5.a(cxa.dQ) || $$5.a(asi.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
