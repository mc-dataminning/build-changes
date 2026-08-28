import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgh extends dgz implements dhp {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final dsy<dst> b = dsq.bd;

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(d, Boolean.valueOf(false)).a(b, dst.a));
   }

   @Override
   protected int g(dsa $$0) {
      return 2;
   }

   @Override
   public dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.b($$3, $$5, $$2) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dbc $$0, iz $$1, dsa $$2) {
      dpf $$3 = $$0.c_($$1);
      return $$3 instanceof dpq ? ((dpq)$$3).b() : 0;
   }

   private int e(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dcm)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dst.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dcm)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dst.a;
      }
   }

   @Override
   protected int b(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      je $$4 = $$2.c(aE);
      iz $$5 = $$1.a($$4);
      dsa $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ciy $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ciy a(dbw $$0, je $$1, iz $$2) {
      List<ciy> $$3 = $$0.a(
         ciy.class,
         new evk((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!$$3.gd().e) {
         return bqs.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dst.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avz.fr, awa.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqs.a($$1.B);
      }
   }

   @Override
   protected void c(dbw $$0, iz $$1, dsa $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dpf $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dpq ? ((dpq)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            exk $$6 = this.b($$0, $$1, $$2) ? exk.c : exk.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dpf $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dpq $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dst.a) {
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
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dsa $$0, dbw $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpf $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpq($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, b, d);
   }
}
