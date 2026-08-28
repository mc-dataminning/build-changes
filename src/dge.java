import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dge extends dgw implements dhm {
   public static final MapCodec<dge> a = b(dge::new);
   public static final dsv<dsq> b = dsn.bd;

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(d, Boolean.valueOf(false)).a(b, dsq.a));
   }

   @Override
   protected int g(drx $$0) {
      return 2;
   }

   @Override
   public drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.b($$3, $$5, $$2) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(daz $$0, iz $$1, drx $$2) {
      dpc $$3 = $$0.c_($$1);
      return $$3 instanceof dpn ? ((dpn)$$3).b() : 0;
   }

   private int e(dbt $$0, iz $$1, drx $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dcj)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dsq.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dbt $$0, iz $$1, drx $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dcj)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dsq.a;
      }
   }

   @Override
   protected int b(dbt $$0, iz $$1, drx $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      je $$4 = $$2.c(aE);
      iz $$5 = $$1.a($$4);
      drx $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         civ $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private civ a(dbt $$0, je $$1, iz $$2) {
      List<civ> $$3 = $$0.a(
         civ.class,
         new evh((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!$$3.gd().e) {
         return bqp.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dsq.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avw.fr, avx.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqp.a($$1.B);
      }
   }

   @Override
   protected void c(dbt $$0, iz $$1, drx $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dpc $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dpn ? ((dpn)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            exh $$6 = this.b($$0, $$1, $$2) ? exh.c : exh.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dbt $$0, iz $$1, drx $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dpc $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dpn $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dsq.a) {
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
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(drx $$0, dbt $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpc $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpn($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, b, d);
   }
}
