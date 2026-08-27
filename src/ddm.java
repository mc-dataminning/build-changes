import com.mojang.serialization.MapCodec;

public class ddm extends cwy implements ddy {
   public static final MapCodec<ddm> a = b(ddm::new);
   private static final int f = 1;
   private static final emv g;
   private static final emv h;
   private static final emv i = cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final emv j = ems.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dkp c = dkf.aW;
   public static final dkg d = dkf.C;
   public static final dkg e = dkf.b;

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   protected ddm(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return ems.b();
      }
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2) {
      return ems.b();
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public djp a(cpp $$0) {
      hx $$1 = $$0.a();
      ctx $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == efa.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      int $$4 = a($$1, $$2);
      djp $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cca.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$3.a(ems.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ems.a();
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   private boolean a(ctd $$0, hx $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(ctd $$0, hx $$1) {
      hx.a $$2 = $$1.j().c(ic.a);
      djp $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cxa.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ic.b)) {
         return 0;
      }

      for (ic $$5 : ic.c.a) {
         djp $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cxa.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      emv $$0 = cwy.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      emv $$1 = cwy.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      emv $$2 = cwy.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      emv $$3 = cwy.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      emv $$4 = cwy.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ems.a($$0, $$1, $$2, $$3, $$4);
      emv $$5 = cwy.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      emv $$6 = cwy.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      emv $$7 = cwy.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      emv $$8 = cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ems.a(ddm.i, g, $$6, $$5, $$8, $$7);
   }
}
