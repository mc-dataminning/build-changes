import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class czj extends cva implements dca {
   public static final MapCodec<czj> b = b(czj::new);
   public static final int c = 7;
   public static final dii d = dhy.aC;
   public static final dhz e = dhy.v;
   public static final dhz f = dhy.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends czj> a() {
      return b;
   }

   public czj(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return ekk.a();
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dhi $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dhi $$0, crg $$1, ht $$2) {
      return 1;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dhi a(dhi $$0, csb $$1, ht $$2) {
      int $$3 = 7;
      ht.a $$4 = new ht.a();

      for (hx $$5 : hx.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dhi $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dhi $$0) {
      if ($$0.a(arg.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(f) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            ht $$4 = $$2.d();
            dhi $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hx.b)) {
               atp.a($$1, $$2, $$3, js.m);
            }
         }
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      dhi $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ect.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
