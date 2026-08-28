import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dqr extends diy implements dqs {
   public static final dxo f = dxn.J;
   protected static final float g = 4.0F;
   protected static final fbu h = djm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dyj a;

   protected dqr(dyj $$0, dww.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dqr> a();

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return h;
   }

   @Override
   public boolean a(dwx $$0) {
      return true;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvm($$0, $$1);
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$2.c_($$3) instanceof dvm $$7) {
         cxt $$10 = $$0.h() instanceof cxt $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.h()));
                  $$2.a(ebt.c, $$7.aA_(), ebt.a.a($$4, $$7.m()));
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
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1.c_($$2) instanceof dvm $$5) {
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

   private boolean b(cox $$0, dvm $$1, boolean $$2) {
      dvn $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wn.a) || $$0x.b() instanceof xv);
   }

   public abstract float h(dwx var1);

   public fba o(dwx $$0) {
      return new fba(0.5, 0.5, 0.5);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(f) ? eta.c.a(false) : super.b_($$0);
   }

   public dyj d() {
      return this.a;
   }

   public static dyj a(djm $$0) {
      dyj $$1;
      if ($$0 instanceof dqr) {
         $$1 = ((dqr)$$0).d();
      } else {
         $$1 = dyj.b;
      }

      return $$1;
   }

   public void a(cox $$0, dvm $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cox $$0, dvm $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.h, dvm::a);
   }
}
