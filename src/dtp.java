import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dtp extends dlr implements dtq {
   public static final eay d = eax.I;
   private static final ffk a = dmf.b(8.0, 0.0, 16.0);
   private final ebv b;

   protected dtp(ebv $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dtp> a();

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   public boolean a(eah $$0) {
      return true;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyt($$0, $$1);
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.c_($$3) instanceof dyt $$7) {
         daf $$10 = $$0.h() instanceof daf $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awx.c.b($$0.h()));
                  $$2.a(efh.c, $$7.ax_(), efh.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bud.a;
               } else {
                  return bud.f;
               }
            } else {
               return bud.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bud.c : bud.a;
         }
      } else {
         return bud.e;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.c_($$2) instanceof dyt $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.ax_(), $$5.d(), awo.e);
            return bud.b;
         } else if ($$8) {
            return bud.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bud.b;
         } else {
            return bud.e;
         }
      } else {
         return bud.e;
      }
   }

   private boolean b(crc $$0, dyt $$1, boolean $$2) {
      dyu $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wx.a) || $$0x.b() instanceof yf);
   }

   public abstract float h(eah var1);

   public feq o(eah $$0) {
      return new feq(0.5, 0.5, 0.5);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   public ebv d() {
      return this.b;
   }

   public static ebv a(dmf $$0) {
      ebv $$1;
      if ($$0 instanceof dtp) {
         $$1 = ((dtp)$$0).d();
      } else {
         $$1 = ebv.b;
      }

      return $$1;
   }

   public void a(crc $$0, dyt $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(crc $$0, dyt $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.h, dyt::a);
   }
}
