import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dpj extends dhv implements dpk {
   public static final dwf f = dwe.C;
   protected static final float g = 4.0F;
   protected static final fal h = dij.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dxa a;

   protected dpj(dxa $$0, dvn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dpj> a();

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return h;
   }

   @Override
   public boolean a(dvo $$0) {
      return true;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dud($$0, $$1);
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dud $$7) {
         cxj $$10 = $$0.h() instanceof cxj $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gy();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awy.c.b($$0.h()));
                  $$2.a(eak.c, $$7.aB_(), eak.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsh.a;
               } else {
                  return bsh.f;
               }
            } else {
               return bsh.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bsh.c : bsh.a;
         }
      } else {
         return bsh.e;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$1.c_($$2) instanceof dud $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), awp.e);
            return bsh.b;
         } else if ($$8) {
            return bsh.b;
         } else if (!this.a($$3, $$5) && $$3.gy() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsh.b;
         } else {
            return bsh.e;
         }
      } else {
         return bsh.e;
      }
   }

   private boolean b(cor $$0, dud $$1, boolean $$2) {
      due $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xk.a) || $$0x.b() instanceof ys);
   }

   public abstract float h(dvo var1);

   public ezr o(dvo $$0) {
      return new ezr(0.5, 0.5, 0.5);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(f) ? erp.c.a(false) : super.b_($$0);
   }

   public dxa d() {
      return this.a;
   }

   public static dxa a(dij $$0) {
      dxa $$1;
      if ($$0 instanceof dpj) {
         $$1 = ((dpj)$$0).d();
      } else {
         $$1 = dxa.b;
      }

      return $$1;
   }

   public void a(cor $$0, dud $$1, boolean $$2) {
      $$1.a($$0.cI());
      $$0.a($$1, $$2);
   }

   private boolean a(cor $$0, dud $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cI());
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.h, dud::a);
   }
}
