import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgk extends dhc implements dhs {
   public static final MapCodec<dgk> a = b(dgk::new);
   public static final dtb<dsw> b = dst.bd;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(d, Boolean.valueOf(false)).a(b, dsw.a));
   }

   @Override
   protected int g(dsd $$0) {
      return 2;
   }

   @Override
   public dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.b($$3, $$5, $$2) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dbf $$0, iz $$1, dsd $$2) {
      dpi $$3 = $$0.c_($$1);
      return $$3 instanceof dpt ? ((dpt)$$3).b() : 0;
   }

   private int e(dbz $$0, iz $$1, dsd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dcp)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dsw.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dbz $$0, iz $$1, dsd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dcp)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dsw.a;
      }
   }

   @Override
   protected int b(dbz $$0, iz $$1, dsd $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      je $$4 = $$2.c(aE);
      iz $$5 = $$1.a($$4);
      dsd $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cjb $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cjb a(dbz $$0, je $$1, iz $$2) {
      List<cjb> $$3 = $$0.a(
         cjb.class,
         new evn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (!$$3.gd().e) {
         return bqv.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dsw.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awa.fr, awb.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqv.a($$1.B);
      }
   }

   @Override
   protected void c(dbz $$0, iz $$1, dsd $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dpi $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dpt ? ((dpt)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            exn $$6 = this.b($$0, $$1, $$2) ? exn.c : exn.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dbz $$0, iz $$1, dsd $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dpi $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dpt $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dsw.a) {
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
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dsd $$0, dbz $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpi $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpt($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE, b, d);
   }
}
