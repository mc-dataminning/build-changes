import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dkk extends dfw implements dmy {
   public static final MapCodec<dkk> a = b(dkk::new);
   public static final int b = 15;
   public static final dua c = dtq.aP;
   public static final dtr d = dtq.C;
   public static final ToIntFunction<dta> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqq.a;
      } else {
         return bqq.c;
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$3.a(cur.hC) ? exm.b() : exm.a();
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuo a(cuo $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kq.ac, cxb.a.a(c, $$1));
      }

      return $$0;
   }
}
