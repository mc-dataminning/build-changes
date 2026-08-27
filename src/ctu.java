import java.util.OptionalInt;

public class ctu extends cpn implements cwo {
   public static final int a = 7;
   public static final ddb b = dcr.aC;
   public static final dcs c = dcr.v;
   public static final dcs d = dcr.C;
   private static final int e = 1;

   public ctu(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public efb b_(dcb $$0, cls $$1, gu $$2) {
      return eey.a();
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dcb $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dcb $$0, cls $$1, gu $$2) {
      return 1;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dcb a(dcb $$0, cmn $$1, gu $$2) {
      int $$3 = 7;
      gu.a $$4 = new gu.a();

      for (ha $$5 : ha.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(b, Integer.valueOf($$3));
   }

   private static int o(dcb $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dcb $$0) {
      if ($$0.a(amw.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(d) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gu $$4 = $$2.d();
            dcb $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ha.b)) {
               apd.a($$1, $$2, $$3, iv.m);
            }
         }
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      dcb $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == dxf.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
