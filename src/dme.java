import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dme extends dmx implements dnn {
   public static final MapCodec<dme> a = b(dme::new);
   public static final dzk<dzf> b = dzc.bg;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jo.c).b(c, Boolean.valueOf(false)).b(b, dzf.a));
   }

   @Override
   protected int h(dym $$0) {
      return 2;
   }

   @Override
   public dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !this.a($$1, $$5, $$6) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dgv $$0, jj $$1, dym $$2) {
      dvl $$3 = $$0.c_($$1);
      return $$3 instanceof dvx ? ((dvx)$$3).a() : 0;
   }

   private int e(dhp $$0, jj $$1, dym $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dih)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dzf.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dhp $$0, jj $$1, dym $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dih)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dzf.a;
      }
   }

   @Override
   protected int b(dhp $$0, jj $$1, dym $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jo $$4 = $$2.c(e);
      jj $$5 = $$1.a($$4);
      dym $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cmg $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cmg a(dhp $$0, jo $$1, jj $$2) {
      List<cmg> $$3 = $$0.a(
         cmg.class,
         new fcp((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$3.gj().e) {
         return btq.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dzf.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awk.ft, awl.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return btq.a;
      }
   }

   @Override
   protected void c(dhp $$0, jj $$1, dym $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dvl $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dvx ? ((dvx)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            feq $$6 = this.b($$0, $$1, $$2) ? feq.c : feq.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dhp $$0, jj $$1, dym $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dvl $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dvx $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dzf.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dym $$0, dhp $$1, jj $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dvl $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvx($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, b, c);
   }
}
