import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgr extends dhj implements dhz {
   public static final MapCodec<dgr> a = b(dgr::new);
   public static final dti<dtd> b = dta.bd;

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(d, Boolean.valueOf(false)).a(b, dtd.a));
   }

   @Override
   protected int g(dsk $$0) {
      return 2;
   }

   @Override
   public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.b($$3, $$5, $$2) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dbl $$0, ja $$1, dsk $$2) {
      dpp $$3 = $$0.c_($$1);
      return $$3 instanceof dqa ? ((dqa)$$3).b() : 0;
   }

   private int e(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dcv)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dtd.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dcv)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dtd.a;
      }
   }

   @Override
   protected int b(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jf $$4 = $$2.c(aE);
      ja $$5 = $$1.a($$4);
      dsk $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cin $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.I(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cin a(dcf $$0, jf $$1, ja $$2) {
      List<cin> $$3 = $$0.a(
         cin.class,
         new ewa((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cI() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!$$3.ga().e) {
         return bqg.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dtd.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avh.fr, avi.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqg.a($$1.B);
      }
   }

   @Override
   protected void c(dcf $$0, ja $$1, dsk $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dpp $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dqa ? ((dqa)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eya $$6 = this.b($$0, $$1, $$2) ? eya.c : eya.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dpp $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dqa $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dtd.a) {
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
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dsk $$0, dcf $$1, ja $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpp $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqa($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, b, d);
   }
}
