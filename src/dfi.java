import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfi extends dga implements dgq {
   public static final MapCodec<dfi> a = b(dfi::new);
   public static final drz<dru> b = drr.bd;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(d, Boolean.valueOf(false)).a(b, dru.a));
   }

   @Override
   protected int g(drb $$0) {
      return 2;
   }

   @Override
   public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.b($$3, $$5, $$2) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dad $$0, io $$1, drb $$2) {
      dog $$3 = $$0.c_($$1);
      return $$3 instanceof dor ? ((dor)$$3).b() : 0;
   }

   private int e(dax $$0, io $$1, drb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dbn)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dru.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dax $$0, io $$1, drb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dbn)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dru.a;
      }
   }

   @Override
   protected int b(dax $$0, io $$1, drb $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      it $$4 = $$2.c(aE);
      io $$5 = $$1.a($$4);
      drb $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         chz $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private chz a(dax $$0, it $$1, io $$2) {
      List<chz> $$3 = $$0.a(
         chz.class,
         new euf((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (!$$3.gd().e) {
         return bpu.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dru.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avh.fr, avi.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bpu.a($$1.B);
      }
   }

   @Override
   protected void c(dax $$0, io $$1, drb $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dog $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dor ? ((dor)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            ewf $$6 = this.b($$0, $$1, $$2) ? ewf.c : ewf.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dax $$0, io $$1, drb $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dog $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dor $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dru.a) {
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
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(drb $$0, dax $$1, io $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dog $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dor($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, b, d);
   }
}
