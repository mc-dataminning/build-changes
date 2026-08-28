import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkv extends dlo implements dme {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final dxt<dxp> b = dxm.bg;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(d, Boolean.valueOf(false)).b(b, dxp.a));
   }

   @Override
   protected int h(dww $$0) {
      return 2;
   }

   @Override
   public dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$1, $$5, $$6) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dfm $$0, ji $$1, dww $$2) {
      dty $$3 = $$0.c_($$1);
      return $$3 instanceof duj ? ((duj)$$3).b() : 0;
   }

   private int e(dgh $$0, ji $$1, dww $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dgz)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dxp.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgh $$0, ji $$1, dww $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dgz)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dxp.a;
      }
   }

   @Override
   protected int b(dgh $$0, ji $$1, dww $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jn $$4 = $$2.c(aF);
      ji $$5 = $$1.a($$4);
      dww $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cku $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cku a(dgh $$0, jn $$1, ji $$2) {
      List<cku> $$3 = $$0.a(
         cku.class,
         new fau((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$3.gj().e) {
         return bsj.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dxp.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awa.ft, awb.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsj.a;
      }
   }

   @Override
   protected void c(dgh $$0, ji $$1, dww $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dty $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof duj ? ((duj)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fcv $$6 = this.b($$0, $$1, $$2) ? fcv.c : fcv.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgh $$0, ji $$1, dww $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dty $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof duj $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dxp.a) {
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
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dww $$0, dgh $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dty $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duj($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, b, d);
   }
}
