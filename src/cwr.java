import java.util.OptionalInt;

public class cwr extends csk implements czl {
   public static final int a = 7;
   public static final dfy b = dfo.aC;
   public static final dfp c = dfo.v;
   public static final dfp d = dfo.C;
   private static final int e = 1;

   public cwr(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      return ehv.a();
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dey $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dey $$0, coq $$1, gv $$2) {
      return 1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dey a(dey $$0, cpl $$1, gv $$2) {
      int $$3 = 7;
      gv.a $$4 = new gv.a();

      for (hb $$5 : hb.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(b, Integer.valueOf($$3));
   }

   private static int o(dey $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dey $$0) {
      if ($$0.a(apj.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(d) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gv $$4 = $$2.d();
            dey $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hb.b)) {
               arr.a($$1, $$2, $$3, iw.m);
            }
         }
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      dey $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == eac.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
