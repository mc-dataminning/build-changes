import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dtw extends dly implements dtx {
   public static final ebf d = ebe.I;
   private static final ffr a = dmm.b(8.0, 0.0, 16.0);
   private final ecc b;

   protected dtw(ecc $$0, ean.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dtw> a();

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   public boolean a(eao $$0) {
      return true;
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dza($$0, $$1);
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dza $$7) {
         dam $$10 = $$0.h() instanceof dam $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awx.c.b($$0.h()));
                  $$2.a(efo.c, $$7.ax_(), efo.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bug.a;
               } else {
                  return bug.f;
               }
            } else {
               return bug.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bug.c : bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.c_($$2) instanceof dza $$5) {
         if ($$1.C) {
            ag.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.ax_(), $$5.d(), awo.e);
            return bug.b;
         } else if ($$8) {
            return bug.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bug.b;
         } else {
            return bug.e;
         }
      } else {
         return bug.e;
      }
   }

   private boolean b(crj $$0, dza $$1, boolean $$2) {
      dzb $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(wx.a) || $$0x.b() instanceof yf);
   }

   public abstract float h(eao var1);

   public fex o(eao $$0) {
      return new fex(0.5, 0.5, 0.5);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   public ecc d() {
      return this.b;
   }

   public static ecc a(dmm $$0) {
      ecc $$1;
      if ($$0 instanceof dtw) {
         $$1 = ((dtw)$$0).d();
      } else {
         $$1 = ecc.b;
      }

      return $$1;
   }

   public void a(crj $$0, dza $$1, boolean $$2) {
      $$1.a($$0.cF());
      $$0.a($$1, $$2);
   }

   private boolean a(crj $$0, dza $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cF());
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.h, dza::a);
   }
}
