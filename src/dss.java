import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dss extends dfi {
   public static final MapCodec<dss> a = b(dss::new);
   public static final dtu b = dsu.a;
   public static final dty<duc> c = dsu.c;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, duc.a));
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return null;
   }

   public static dqf a(jd $$0, dta $$1, dta $$2, ji $$3, boolean $$4, boolean $$5) {
      return new dsw($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.k, dsw::a);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dsw) {
            ((dsw)$$5).k();
         }
      }
   }

   @Override
   public void a(dcv $$0, jd $$1, dta $$2) {
      jd $$3 = $$1.a($$2.c(b).g());
      dta $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dst && $$4.c(dst.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqq.c;
      } else {
         return bqq.e;
      }
   }

   @Override
   protected List<cuo> a(dta $$0, ero.a $$1) {
      dsw $$2 = this.a($$1.a(), jd.a($$1.a(euh.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      dsw $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : exm.a();
   }

   @Nullable
   private dsw a(dca $$0, jd $$1) {
      dqf $$2 = $$0.c_($$1);
      return $$2 instanceof dsw ? (dsw)$$2 : null;
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return cuo.l;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
