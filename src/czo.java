import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class czo extends cvf implements dcf {
   public static final MapCodec<czo> b = b(czo::new);
   public static final int c = 7;
   public static final din d = did.aC;
   public static final die e = did.v;
   public static final die f = did.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends czo> a() {
      return b;
   }

   public czo(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return ekp.a();
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dhn $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dhn $$0, crl $$1, hx $$2) {
      return 1;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dhn a(dhn $$0, csg $$1, hx $$2) {
      int $$3 = 7;
      hx.a $$4 = new hx.a();

      for (ib $$5 : ib.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dhn $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dhn $$0) {
      if ($$0.a(ark.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(f) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            hx $$4 = $$2.d();
            dhn $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ib.b)) {
               att.a($$1, $$2, $$3, jw.m);
            }
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      dhn $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ecy.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
