import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dqp extends diw implements dqq {
   public static final dxm f = dxl.J;
   protected static final float g = 4.0F;
   protected static final fbs h = djk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dyh a;

   protected dqp(dyh $$0, dwu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dqp> a();

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return h;
   }

   @Override
   public boolean a(dwv $$0) {
      return true;
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvk($$0, $$1);
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof dvk $$7) {
         cxr $$10 = $$0.h() instanceof cxr $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awj.c.b($$0.h()));
                  $$2.a(ebr.c, $$7.aA_(), ebr.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsi.a;
               } else {
                  return bsi.f;
               }
            } else {
               return bsi.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bsi.c : bsi.a;
         }
      } else {
         return bsi.e;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1.c_($$2) instanceof dvk $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aA_(), $$5.d(), awa.e);
            return bsi.b;
         } else if ($$8) {
            return bsi.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsi.b;
         } else {
            return bsi.e;
         }
      } else {
         return bsi.e;
      }
   }

   private boolean b(cov $$0, dvk $$1, boolean $$2) {
      dvl $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wn.a) || $$0x.b() instanceof xv);
   }

   public abstract float h(dwv var1);

   public fay o(dwv $$0) {
      return new fay(0.5, 0.5, 0.5);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(f) ? esy.c.a(false) : super.b_($$0);
   }

   public dyh d() {
      return this.a;
   }

   public static dyh a(djk $$0) {
      dyh $$1;
      if ($$0 instanceof dqp) {
         $$1 = ((dqp)$$0).d();
      } else {
         $$1 = dyh.b;
      }

      return $$1;
   }

   public void a(cov $$0, dvk $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cov $$0, dvk $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.h, dvk::a);
   }
}
