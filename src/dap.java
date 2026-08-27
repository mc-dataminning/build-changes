import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dap extends dbh implements dbx {
   public static final MapCodec<dap> a = b(dap::new);
   public static final dnc<dmx> b = dmu.bd;

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   public dap(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(d, Boolean.valueOf(false)).a(b, dmx.a));
   }

   @Override
   protected int g(dme $$0) {
      return 2;
   }

   @Override
   public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.b($$3, $$5, $$2) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cvk $$0, ib $$1, dme $$2) {
      djl $$3 = $$0.c_($$1);
      return $$3 instanceof djw ? ((djw)$$3).b() : 0;
   }

   private int e(cwe $$0, ib $$1, dme $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cwu)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dmx.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cwe $$0, ib $$1, dme $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cwu)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dmx.a;
      }
   }

   @Override
   protected int b(cwe $$0, ib $$1, dme $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ih $$4 = $$2.c(aE);
      ib $$5 = $$1.a($$4);
      dme $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cee $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cee a(cwe $$0, ih $$1, ib $$2) {
      List<cee> $$3 = $$0.a(
         cee.class,
         new eoq((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cB() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!$$3.fW().e) {
         return bml.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dmx.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, atp.fe, atq.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bml.a($$1.B);
      }
   }

   @Override
   protected void c(cwe $$0, ib $$1, dme $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         djl $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof djw ? ((djw)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eqq $$6 = this.b($$0, $$1, $$2) ? eqq.c : eqq.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cwe $$0, ib $$1, dme $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      djl $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof djw $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dmx.a) {
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
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dme $$0, cwe $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      djl $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djw($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, b, d);
   }
}
