import java.util.OptionalInt;

public class cwt extends csm implements czn {
   public static final int a = 7;
   public static final dga b = dfq.aC;
   public static final dfr c = dfq.v;
   public static final dfr d = dfq.C;
   private static final int e = 1;

   public cwt(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return ehu.a();
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dfa $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dfa $$0, cos $$1, gu $$2) {
      return 1;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dfa a(dfa $$0, cpn $$1, gu $$2) {
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

   private static int o(dfa $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dfa $$0) {
      if ($$0.a(apl.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(d) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gu $$4 = $$2.d();
            dfa $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ha.b)) {
               ars.a($$1, $$2, $$3, iv.m);
            }
         }
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      dfa $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == eae.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
