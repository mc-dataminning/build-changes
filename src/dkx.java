import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkx extends dlq implements dmg {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dxv<dxr> b = dxo.bg;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(d, Boolean.valueOf(false)).b(b, dxr.a));
   }

   @Override
   protected int h(dwy $$0) {
      return 2;
   }

   @Override
   public dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$1, $$5, $$6) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dfo $$0, ji $$1, dwy $$2) {
      dua $$3 = $$0.c_($$1);
      return $$3 instanceof dul ? ((dul)$$3).b() : 0;
   }

   private int e(dgj $$0, ji $$1, dwy $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dhb)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dxr.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgj $$0, ji $$1, dwy $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dhb)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dxr.a;
      }
   }

   @Override
   protected int b(dgj $$0, ji $$1, dwy $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jn $$4 = $$2.c(aF);
      ji $$5 = $$1.a($$4);
      dwy $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ckw $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ckw a(dgj $$0, jn $$1, ji $$2) {
      List<ckw> $$3 = $$0.a(
         ckw.class,
         new faw((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$3.gj().e) {
         return bsl.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dxr.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awa.ft, awb.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsl.a;
      }
   }

   @Override
   protected void c(dgj $$0, ji $$1, dwy $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dua $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dul ? ((dul)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fcx $$6 = this.b($$0, $$1, $$2) ? fcx.c : fcx.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgj $$0, ji $$1, dwy $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dua $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dul $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dxr.a) {
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
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dwy $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dua $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dul($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF, b, d);
   }
}
