import java.util.OptionalInt;

public class cwx extends csq implements czr {
   public static final int a = 7;
   public static final dge b = dfu.aC;
   public static final dfv c = dfu.v;
   public static final dfv d = dfu.C;
   private static final int e = 1;

   public cwx(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      return ehy.a();
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dfe $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dfe $$0, cow $$1, gw $$2) {
      return 1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dfe a(dfe $$0, cpr $$1, gw $$2) {
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

   private static int o(dfe $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dfe $$0) {
      if ($$0.a(apo.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(d) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gw $$4 = $$2.d();
            dfe $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hc.b)) {
               arv.a($$1, $$2, $$3, ix.m);
            }
         }
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      dfe $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == eai.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
