import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dku extends dln implements dmd {
   public static final MapCodec<dku> a = b(dku::new);
   public static final dxs<dxo> b = dxl.bg;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(d, Boolean.valueOf(false)).b(b, dxo.a));
   }

   @Override
   protected int h(dwv $$0) {
      return 2;
   }

   @Override
   public dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !this.a($$1, $$5, $$6) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dfl $$0, ji $$1, dwv $$2) {
      dtx $$3 = $$0.c_($$1);
      return $$3 instanceof dui ? ((dui)$$3).b() : 0;
   }

   private int e(dgg $$0, ji $$1, dwv $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dgy)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dxo.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dgg $$0, ji $$1, dwv $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dgy)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dxo.a;
      }
   }

   @Override
   protected int b(dgg $$0, ji $$1, dwv $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jn $$4 = $$2.c(aF);
      ji $$5 = $$1.a($$4);
      dwv $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ckt $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ckt a(dgg $$0, jn $$1, ji $$2) {
      List<ckt> $$3 = $$0.a(
         ckt.class,
         new fat((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$3.gj().e) {
         return bsi.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dxo.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avz.ft, awa.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsi.a;
      }
   }

   @Override
   protected void c(dgg $$0, ji $$1, dwv $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dtx $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dui ? ((dui)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fcu $$6 = this.b($$0, $$1, $$2) ? fcu.c : fcu.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dgg $$0, ji $$1, dwv $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dtx $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dui $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dxo.a) {
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
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dwv $$0, dgg $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dtx $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dui($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF, b, d);
   }
}
