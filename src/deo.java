import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class deo extends dfg implements dfw {
   public static final MapCodec<deo> a = b(deo::new);
   public static final drf<dra> b = dqx.bd;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, is.c).a(d, Boolean.valueOf(false)).a(b, dra.a));
   }

   @Override
   protected int g(dqh $$0) {
      return 2;
   }

   @Override
   public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !this.b($$3, $$5, $$2) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(czj $$0, in $$1, dqh $$2) {
      dnm $$3 = $$0.c_($$1);
      return $$3 instanceof dnx ? ((dnx)$$3).b() : 0;
   }

   private int e(dad $$0, in $$1, dqh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dat)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dra.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dad $$0, in $$1, dqh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dat)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dra.a;
      }
   }

   @Override
   protected int b(dad $$0, in $$1, dqh $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      is $$4 = $$2.c(aE);
      in $$5 = $$1.a($$4);
      dqh $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         chk $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private chk a(dad $$0, is $$1, in $$2) {
      List<chk> $$3 = $$0.a(
         chk.class,
         new etk((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cF() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!$$3.gb().e) {
         return bpm.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dra.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avc.fm, avd.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bpm.a($$1.B);
      }
   }

   @Override
   protected void c(dad $$0, in $$1, dqh $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dnm $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dnx ? ((dnx)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            evk $$6 = this.b($$0, $$1, $$2) ? evk.c : evk.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dad $$0, in $$1, dqh $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dnm $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dnx $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dra.a) {
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
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dqh $$0, dad $$1, in $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dnm $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnx($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, b, d);
   }
}
