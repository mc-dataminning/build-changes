import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbm extends dce implements dcu {
   public static final MapCodec<dbm> a = b(dbm::new);
   public static final dnz<dnu> b = dnr.bd;

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public dbm(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(d, Boolean.valueOf(false)).a(b, dnu.a));
   }

   @Override
   protected int g(dnb $$0) {
      return 2;
   }

   @Override
   public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.b($$3, $$5, $$2) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cwh $$0, ib $$1, dnb $$2) {
      dki $$3 = $$0.c_($$1);
      return $$3 instanceof dkt ? ((dkt)$$3).b() : 0;
   }

   private int e(cxb $$0, ib $$1, dnb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cxr)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dnu.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cxb $$0, ib $$1, dnb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cxr)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dnu.a;
      }
   }

   @Override
   protected int b(cxb $$0, ib $$1, dnb $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ih $$4 = $$2.c(aE);
      ib $$5 = $$1.a($$4);
      dnb $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cex $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cex a(cxb $$0, ih $$1, ib $$2) {
      List<cex> $$3 = $$0.a(
         cex.class,
         new epo((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!$$3.ga().e) {
         return bnd.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dnu.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aty.fl, atz.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bnd.a($$1.B);
      }
   }

   @Override
   protected void c(cxb $$0, ib $$1, dnb $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dki $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dkt ? ((dkt)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            ero $$6 = this.b($$0, $$1, $$2) ? ero.c : ero.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cxb $$0, ib $$1, dnb $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dki $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dkt $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dnu.a) {
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
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dnb $$0, cxb $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dki $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkt($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, b, d);
   }
}
