import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dkg extends dfw implements dmy {
   public static final MapCodec<dkg> b = b(dkg::new);
   public static final int c = 7;
   public static final dua d = dtq.aC;
   public static final dtr e = dtq.v;
   public static final dtr f = dtq.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dkg> a() {
      return b;
   }

   public dkg(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return exm.a();
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dta $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dta $$0, dca $$1, jd $$2) {
      return 1;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dta a(dta $$0, dcv $$1, jd $$2) {
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

   private static int o(dta $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dta $$0) {
      if ($$0.a(awd.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(f) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            jd $$4 = $$2.d();
            dta $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ji.b)) {
               ayr.a($$1, $$2, $$3, lm.l);
            }
         }
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      dta $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eoz.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
