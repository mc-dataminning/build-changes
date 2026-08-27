import java.util.List;
import javax.annotation.Nullable;

public class cqv extends crl implements csb {
   public static final dcz<dcu> a = dcr.bd;

   public cqv(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(c, Boolean.valueOf(false)).a(a, dcu.a));
   }

   @Override
   protected int g(dcb $$0) {
      return 2;
   }

   @Override
   protected int b(cls $$0, gu $$1, dcb $$2) {
      czn $$3 = $$0.c_($$1);
      return $$3 instanceof czy ? ((czy)$$3).c() : 0;
   }

   private int e(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cnc)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dcu.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cnc)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dcu.a;
      }
   }

   @Override
   protected int b(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ha $$4 = $$2.c(aC);
      gu $$5 = $$1.a($$4);
      dcb $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bva $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.E(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bva a(cmm $$0, ha $$1, gu $$2) {
      List<bva> $$3 = $$0.a(
         bva.class,
         new eed((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cB() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if (!$$3.fO().e) {
         return bdx.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dcu.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, amh.eF, ami.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bdx.a($$1.B);
      }
   }

   @Override
   protected void c(cmm $$0, gu $$1, dcb $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         czn $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof czy ? ((czy)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            efx $$6 = this.c($$0, $$1, $$2) ? efx.c : efx.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      czn $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof czy $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dcu.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dcb $$0, cmm $$1, gu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czn $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czy($$0, $$1);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(aC, a, c);
   }
}
