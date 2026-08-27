import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dcx extends cyo implements dfo {
   public static final MapCodec<dcx> b = b(dcx::new);
   public static final int c = 7;
   public static final dmf d = dlv.aC;
   public static final dlw e = dlv.v;
   public static final dlw f = dlv.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dcx> a() {
      return b;
   }

   public dcx(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return eoi.a();
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dlf $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dlf $$0, cut $$1, hz $$2) {
      return 1;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dlf a(dlf $$0, cvo $$1, hz $$2) {
      int $$3 = 7;
      hz.a $$4 = new hz.a();

      for (ie $$5 : ie.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dlf $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dlf $$0) {
      if ($$0.a(atz.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(f) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hz $$4 = $$2.d();
            dlf $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ie.b)) {
               awk.a($$1, $$2, $$3, jz.m);
            }
         }
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      dlf $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == egq.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
