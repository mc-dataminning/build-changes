import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djq extends dfc implements dmr {
   public static final MapCodec<djq> b = b(djq::new);
   public static final int c = 7;
   public static final duc d = dts.aC;
   public static final dtt e = dts.v;
   public static final dtt f = dts.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djq> a() {
      return b;
   }

   public djq(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dtc $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int f(dtc $$0, dbg $$1, ir $$2) {
      return 1;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dtc a(dtc $$0, dcb $$1, ir $$2) {
      int $$3 = 7;
      ir.a $$4 = new ir.a();

      for (iw $$5 : iw.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dtc $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dtc $$0) {
      if ($$0.a(awe.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ir $$4 = $$2.d();
            dtc $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, iw.b)) {
               ayp.a($$1, $$2, $$3, lb.l);
            }
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      dtc $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == epf.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
