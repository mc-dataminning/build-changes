import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dln extends dmg implements dmw {
   public static final MapCodec<dln> a = b(dln::new);
   public static final dyl<dyh> b = dye.bg;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dyh.a));
   }

   @Override
   protected int h(dxo $$0) {
      return 2;
   }

   @Override
   public dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !this.b($$1, $$5, $$6) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dge $$0, jh $$1, dxo $$2) {
      duq $$3 = $$0.c_($$1);
      return $$3 instanceof dvb ? ((dvb)$$3).b() : 0;
   }

   private int e(dgz $$0, jh $$1, dxo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dhr)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dyh.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgz $$0, jh $$1, dxo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dhr)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dyh.a;
      }
   }

   @Override
   protected int b(dgz $$0, jh $$1, dxo $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dxo $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cll $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cll a(dgz $$0, jm $$1, jh $$2) {
      List<cll> $$3 = $$0.a(
         cll.class,
         new fbm((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$3.gj().e) {
         return bta.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dyh.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awv.ft, aww.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bta.a;
      }
   }

   @Override
   protected void c(dgz $$0, jh $$1, dxo $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         duq $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dvb ? ((dvb)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fdn $$6 = this.b($$0, $$1, $$2) ? fdn.c : fdn.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgz $$0, jh $$1, dxo $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      duq $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dvb $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dyh.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dxo $$0, dgz $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      duq $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvb($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, b, d);
   }
}
