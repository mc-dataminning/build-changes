import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dhk<dtu> implements dpr {
   public static final MapCodec<dlh> b = b(dlh::new);
   public static final dws<jm> c = dml.aF;
   public static final dwm d = dwl.C;
   protected static final fas e = diq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xj f = xj.c("container.enderchest");

   @Override
   public MapCodec<dlh> a() {
      return b;
   }

   protected dlh(dvu.d $$0) {
      super($$0, () -> dta.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dkx.c<? extends dtf> a(dvv $$0, dfm $$1, jh $$2, boolean $$3) {
      return dkx.b::b;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.b;
   }

   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == erw.c));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      ctn $$5 = $$3.gu();
      if ($$5 != null && $$1.c_($$2) instanceof dtu $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsk.a;
         } else {
            if ($$1 instanceof arp $$10) {
               $$5.a($$7);
               $$3.a(new bss(($$1x, $$2x, $$3x) -> csi.a($$1x, $$2x, $$5), f));
               $$3.a(awx.aj);
               cnj.a($$10, $$3, true);
            }

            return bsk.a;
         }
      } else {
         return bsk.a;
      }
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? a($$2, dta.d, dtu::a) : null;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ls.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(d) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      dsy $$4 = $$1.c_($$2);
      if ($$4 instanceof dtu) {
         ((dtu)$$4).b();
      }
   }
}
