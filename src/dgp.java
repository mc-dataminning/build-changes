import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgp extends dhh implements dhx {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final dtf<dta> b = dsx.bd;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(d, Boolean.valueOf(false)).a(b, dta.a));
   }

   @Override
   protected int g(dsh $$0) {
      return 2;
   }

   @Override
   public dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.b($$3, $$5, $$2) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dbj $$0, ja $$1, dsh $$2) {
      dpn $$3 = $$0.c_($$1);
      return $$3 instanceof dpy ? ((dpy)$$3).b() : 0;
   }

   private int e(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dct)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dta.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dct)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dta.a;
      }
   }

   @Override
   protected int b(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jf $$4 = $$2.c(aE);
      ja $$5 = $$1.a($$4);
      dsh $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cik $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.I(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cik a(dcd $$0, jf $$1, ja $$2) {
      List<cik> $$3 = $$0.a(
         cik.class,
         new evu((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!$$3.fZ().e) {
         return bqd.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dta.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avf.fr, avg.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqd.a($$1.B);
      }
   }

   @Override
   protected void c(dcd $$0, ja $$1, dsh $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dpn $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dpy ? ((dpy)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            exu $$6 = this.b($$0, $$1, $$2) ? exu.c : exu.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dpn $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dpy $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dta.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dsh $$0, dcd $$1, ja $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpn $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, b, d);
   }
}
