import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dai extends cvz implements dcz {
   public static final MapCodec<dai> b = b(dai::new);
   public static final int c = 7;
   public static final djp d = djf.aC;
   public static final djg e = djf.v;
   public static final djg f = djf.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dai> a() {
      return b;
   }

   public dai(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return elr.a();
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dip $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dip $$0, cse $$1, hv $$2) {
      return 1;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dip a(dip $$0, csz $$1, hv $$2) {
      int $$3 = 7;
      hv.a $$4 = new hv.a();

      for (ia $$5 : ia.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dip $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dip $$0) {
      if ($$0.a(arr.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(f) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            hv $$4 = $$2.d();
            dip $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ia.b)) {
               aub.a($$1, $$2, $$3, jv.m);
            }
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      dip $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eea.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
