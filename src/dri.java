import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dri extends djp implements drj {
   public static final dyf f = dye.J;
   protected static final float g = 4.0F;
   protected static final fcl h = dkd.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dza a;

   protected dri(dza $$0, dxn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dri> a();

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return h;
   }

   @Override
   public boolean a(dxo $$0) {
      return true;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwd($$0, $$1);
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof dwd $$7) {
         cyk $$10 = $$0.h() instanceof cyk $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axf.c.b($$0.h()));
                  $$2.a(eck.c, $$7.aB_(), eck.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bta.a;
               } else {
                  return bta.f;
               }
            } else {
               return bta.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bta.c : bta.a;
         }
      } else {
         return bta.e;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1.c_($$2) instanceof dwd $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aB_(), $$5.d(), aww.e);
            return bta.b;
         } else if ($$8) {
            return bta.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bta.b;
         } else {
            return bta.e;
         }
      } else {
         return bta.e;
      }
   }

   private boolean b(cpo $$0, dwd $$1, boolean $$2) {
      dwe $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xj.a) || $$0x.b() instanceof yr);
   }

   public abstract float h(dxo var1);

   public fbr o(dxo $$0) {
      return new fbr(0.5, 0.5, 0.5);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(f) ? etr.c.a(false) : super.b_($$0);
   }

   public dza d() {
      return this.a;
   }

   public static dza a(dkd $$0) {
      dza $$1;
      if ($$0 instanceof dri) {
         $$1 = ((dri)$$0).d();
      } else {
         $$1 = dza.b;
      }

      return $$1;
   }

   public void a(cpo $$0, dwd $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cpo $$0, dwd $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.h, dwd::a);
   }
}
