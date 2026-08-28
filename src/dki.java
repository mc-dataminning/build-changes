import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dki extends dfy implements dna {
   public static final MapCodec<dki> b = b(dki::new);
   public static final int c = 7;
   public static final duc d = dts.aC;
   public static final dtt e = dts.v;
   public static final dtt f = dts.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dki> a() {
      return b;
   }

   public dki(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ext b_(dtc $$0, dcc $$1, jd $$2) {
      return exq.a();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dtc $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dtc $$0, dcc $$1, jd $$2) {
      return 1;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dtc a(dtc $$0, dcx $$1, jd $$2) {
      int $$3 = 7;
      jd.a $$4 = new jd.a();

      for (ji $$5 : ji.values()) {
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
   protected epc b_(dtc $$0) {
      return $$0.c(f) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jd $$4 = $$2.e();
            dtc $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ji.b)) {
               ays.a($$1, $$2, $$3, lm.l);
            }
         }
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dtc a(cyd $$0) {
      epc $$1 = $$0.q().b_($$0.a());
      dtc $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == epd.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
