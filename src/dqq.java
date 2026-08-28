import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dqq extends dix implements dqr {
   public static final dxn f = dxm.J;
   protected static final float g = 4.0F;
   protected static final fbt h = djl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dyi a;

   protected dqq(dyi $$0, dwv.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dqq> a();

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return h;
   }

   @Override
   public boolean a(dww $$0) {
      return true;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvl($$0, $$1);
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$2.c_($$3) instanceof dvl $$7) {
         cxs $$10 = $$0.h() instanceof cxs $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.h()));
                  $$2.a(ebs.c, $$7.aA_(), ebs.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsj.a;
               } else {
                  return bsj.f;
               }
            } else {
               return bsj.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bsj.c : bsj.a;
         }
      } else {
         return bsj.e;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1.c_($$2) instanceof dvl $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aA_(), $$5.d(), awb.e);
            return bsj.b;
         } else if ($$8) {
            return bsj.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsj.b;
         } else {
            return bsj.e;
         }
      } else {
         return bsj.e;
      }
   }

   private boolean b(cow $$0, dvl $$1, boolean $$2) {
      dvm $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wo.a) || $$0x.b() instanceof xw);
   }

   public abstract float h(dww var1);

   public faz o(dww $$0) {
      return new faz(0.5, 0.5, 0.5);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(f) ? esz.c.a(false) : super.b_($$0);
   }

   public dyi d() {
      return this.a;
   }

   public static dyi a(djl $$0) {
      dyi $$1;
      if ($$0 instanceof dqq) {
         $$1 = ((dqq)$$0).d();
      } else {
         $$1 = dyi.b;
      }

      return $$1;
   }

   public void a(cow $$0, dvl $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cow $$0, dvl $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.h, dvl::a);
   }
}
