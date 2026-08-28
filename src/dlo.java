import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlo extends dmh implements dmx {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final dyo<dyj> b = dyg.bg;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jn.c).b(c, Boolean.valueOf(false)).b(b, dyj.a));
   }

   @Override
   protected int h(dxq $$0) {
      return 2;
   }

   @Override
   public dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$1, $$5, $$6) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dgf $$0, ji $$1, dxq $$2) {
      dus $$3 = $$0.c_($$1);
      return $$3 instanceof dvd ? ((dvd)$$3).b() : 0;
   }

   private int e(dgz $$0, ji $$1, dxq $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dhr)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dyj.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgz $$0, ji $$1, dxq $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dhr)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dyj.a;
      }
   }

   @Override
   protected int b(dgz $$0, ji $$1, dxq $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jn $$4 = $$2.c(e);
      ji $$5 = $$1.a($$4);
      dxq $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         clp $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private clp a(dgz $$0, jn $$1, ji $$2) {
      List<clp> $$3 = $$0.a(
         clp.class,
         new fbs((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cN() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$3.gm().e) {
         return bsy.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dyj.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awa.ft, awb.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsy.a;
      }
   }

   @Override
   protected void c(dgz $$0, ji $$1, dxq $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dus $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dvd ? ((dvd)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fdt $$6 = this.b($$0, $$1, $$2) ? fdt.c : fdt.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgz $$0, ji $$1, dxq $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dus $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dvd $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dyj.a) {
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
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dxq $$0, dgz $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dus $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvd($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, b, c);
   }
}
