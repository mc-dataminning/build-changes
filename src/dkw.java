import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkw extends dlp implements dmf {
   public static final MapCodec<dkw> a = b(dkw::new);
   public static final dxu<dxq> b = dxn.bg;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(d, Boolean.valueOf(false)).b(b, dxq.a));
   }

   @Override
   protected int h(dwx $$0) {
      return 2;
   }

   @Override
   public dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$1, $$5, $$6) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dfn $$0, ji $$1, dwx $$2) {
      dtz $$3 = $$0.c_($$1);
      return $$3 instanceof duk ? ((duk)$$3).b() : 0;
   }

   private int e(dgi $$0, ji $$1, dwx $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dha)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dxq.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgi $$0, ji $$1, dwx $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dha)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dxq.a;
      }
   }

   @Override
   protected int b(dgi $$0, ji $$1, dwx $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jn $$4 = $$2.c(aF);
      ji $$5 = $$1.a($$4);
      dwx $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ckv $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ckv a(dgi $$0, jn $$1, ji $$2) {
      List<ckv> $$3 = $$0.a(
         ckv.class,
         new fav((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$3.gj().e) {
         return bsk.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dxq.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awa.ft, awb.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsk.a;
      }
   }

   @Override
   protected void c(dgi $$0, ji $$1, dwx $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dtz $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof duk ? ((duk)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fcw $$6 = this.b($$0, $$1, $$2) ? fcw.c : fcw.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgi $$0, ji $$1, dwx $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dtz $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof duk $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dxq.a) {
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
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dwx $$0, dgi $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dtz $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duk($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, b, d);
   }
}
