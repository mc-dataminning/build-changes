import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dgh extends dby implements diy {
   public static final MapCodec<dgh> b = b(dgh::new);
   public static final int c = 7;
   public static final dpz d = dpp.aC;
   public static final dpq e = dpp.v;
   public static final dpq f = dpp.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dgh> a() {
      return b;
   }

   public dgh(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return esq.a();
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(doz $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(doz $$0, cyd $$1, ib $$2) {
      return 1;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static doz a(doz $$0, cyy $$1, ib $$2) {
      int $$3 = 7;
      ib.a $$4 = new ib.a();

      for (ih $$5 : ih.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(doz $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(doz $$0) {
      if ($$0.a(avc.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(f) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ib $$4 = $$2.d();
            doz $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ih.b)) {
               axn.a($$1, $$2, $$3, kl.m);
            }
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      doz $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ekt.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
