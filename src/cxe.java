import java.util.OptionalInt;

public class cxe extends csx implements czy {
   public static final int a = 7;
   public static final dgl b = dgb.aC;
   public static final dgc c = dgb.v;
   public static final dgc d = dgb.C;
   private static final int e = 1;

   public cxe(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return eif.a();
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dfl $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dfl $$0, cpd $$1, gw $$2) {
      return 1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dfl a(dfl $$0, cpy $$1, gw $$2) {
      int $$3 = 7;
      gw.a $$4 = new gw.a();

      for (hc $$5 : hc.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(b, Integer.valueOf($$3));
   }

   private static int o(dfl $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dfl $$0) {
      if ($$0.a(apu.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(d) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gw $$4 = $$2.d();
            dfl $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hc.b)) {
               asb.a($$1, $$2, $$3, ix.m);
            }
         }
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      dfl $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == eap.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
