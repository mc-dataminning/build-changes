import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class doy extends dhk implements doz {
   public static final dvu f = dvt.C;
   protected static final float g = 4.0F;
   protected static final fab h = dhy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dwq a;

   protected doy(dwq $$0, dvc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends doy> a();

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return h;
   }

   @Override
   public boolean a(dvd $$0) {
      return true;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dts($$0, $$1);
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.c_($$3) instanceof dts $$7) {
         cxb $$10 = $$0.h() instanceof cxb $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awu.c.b($$0.h()));
                  $$2.a(eaa.c, $$7.aC_(), eaa.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bry.a;
               } else {
                  return bry.f;
               }
            } else {
               return bry.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bry.c : bry.a;
         }
      } else {
         return bry.e;
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$1.c_($$2) instanceof dts $$5) {
         if ($$1.C) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aC_(), $$5.d(), awl.e);
            return bry.b;
         } else if ($$8) {
            return bry.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bry.b;
         } else {
            return bry.e;
         }
      } else {
         return bry.e;
      }
   }

   private boolean b(coh $$0, dts $$1, boolean $$2) {
      dtt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xg.a) || $$0x.b() instanceof yo);
   }

   public abstract float h(dvd var1);

   public ezh o(dvd $$0) {
      return new ezh(0.5, 0.5, 0.5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(f) ? erf.c.a(false) : super.b_($$0);
   }

   public dwq d() {
      return this.a;
   }

   public static dwq a(dhy $$0) {
      dwq $$1;
      if ($$0 instanceof doy) {
         $$1 = ((doy)$$0).d();
      } else {
         $$1 = dwq.b;
      }

      return $$1;
   }

   public void a(coh $$0, dts $$1, boolean $$2) {
      $$1.a($$0.cH());
      $$0.a($$1, $$2);
   }

   private boolean a(coh $$0, dts $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cH());
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.h, dts::a);
   }
}
