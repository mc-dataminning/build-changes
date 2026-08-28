import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmx extends dfi implements dmy {
   public static final dtr f = dtq.C;
   protected static final float g = 4.0F;
   protected static final exp h = dfw.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dun a;

   protected dmx(dun $$0, dsz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmx> a();

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return h;
   }

   @Override
   public boolean a(dta $$0) {
      return true;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drq($$0, $$1);
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof drq $$7) {
         cvt $$10 = $$0.g() instanceof cvt $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avy.c.b($$0.g()));
                  $$2.a(dxw.c, $$7.az_(), dxw.a.a($$4, $$7.n()));
                  $$0.a(1, $$4);
                  return bqs.a;
               } else {
                  return bqs.d;
               }
            } else {
               return bqs.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqs.b : bqs.a;
         }
      } else {
         return bqs.e;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.c_($$2) instanceof drq $$5) {
         if ($$1.B) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), avp.e);
            return bqq.a;
         } else if ($$8) {
            return bqq.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqq.a;
         } else {
            return bqq.e;
         }
      } else {
         return bqq.e;
      }
   }

   private boolean b(cmv $$0, drq $$1, boolean $$2) {
      drr $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Z())).allMatch($$0x -> $$0x.equals(wx.a) || $$0x.b() instanceof yf);
   }

   public abstract float g(dta var1);

   public eww m(dta $$0) {
      return new eww(0.5, 0.5, 0.5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(f) ? eoz.c.a(false) : super.b_($$0);
   }

   public dun d() {
      return this.a;
   }

   public static dun a(dfw $$0) {
      dun $$1;
      if ($$0 instanceof dmx) {
         $$1 = ((dmx)$$0).d();
      } else {
         $$1 = dun.b;
      }

      return $$1;
   }

   public void a(cmv $$0, drq $$1, boolean $$2) {
      $$1.a($$0.cA());
      $$0.a($$1, $$2);
   }

   private boolean a(cmv $$0, drq $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cA());
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.h, drq::a);
   }
}
