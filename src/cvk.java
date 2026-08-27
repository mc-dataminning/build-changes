import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cvk extends cwa implements cwq {
   public static final MapCodec<cvk> a = b(cvk::new);
   public static final dgz<dgu> b = dgr.bd;

   @Override
   public MapCodec<cvk> a() {
      return a;
   }

   public cvk(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(d, Boolean.valueOf(false)).a(b, dgu.a));
   }

   @Override
   protected int g(dgb $$0) {
      return 2;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.b($$3, $$5, $$2) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cqf $$0, ht $$1, dgb $$2) {
      ddx $$3 = $$0.c_($$1);
      return $$3 instanceof dei ? ((dei)$$3).c() : 0;
   }

   private int e(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((crp)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dgu.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((crp)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dgu.a;
      }
   }

   @Override
   protected int b(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hx $$4 = $$2.c(aE);
      ht $$5 = $$1.a($$4);
      dgb $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bzj $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bzj a(cqz $$0, hx $$1, ht $$2) {
      List<bzj> $$3 = $$0.a(
         bzj.class,
         new eia((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!$$3.fT().e) {
         return bib.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dgu.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aqd.eF, aqe.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bib.a($$1.B);
      }
   }

   @Override
   protected void c(cqz $$0, ht $$1, dgb $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         ddx $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dei ? ((dei)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            ejv $$6 = this.b($$0, $$1, $$2) ? ejv.c : ejv.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      ddx $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dei $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dgu.a) {
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
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ddx $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dei($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, b, d);
   }
}
