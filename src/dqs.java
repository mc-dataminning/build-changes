import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dqs extends diz implements dqt {
   public static final dxp f = dxo.J;
   protected static final float g = 4.0F;
   protected static final fbv h = djn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dyk a;

   protected dqs(dyk $$0, dwx.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dqs> a();

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return h;
   }

   @Override
   public boolean a(dwy $$0) {
      return true;
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvn($$0, $$1);
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof dvn $$7) {
         cxu $$10 = $$0.h() instanceof cxu $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.h()));
                  $$2.a(ebu.c, $$7.aA_(), ebu.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsl.a;
               } else {
                  return bsl.f;
               }
            } else {
               return bsl.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bsl.c : bsl.a;
         }
      } else {
         return bsl.e;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1.c_($$2) instanceof dvn $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aA_(), $$5.d(), awb.e);
            return bsl.b;
         } else if ($$8) {
            return bsl.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsl.b;
         } else {
            return bsl.e;
         }
      } else {
         return bsl.e;
      }
   }

   private boolean b(coy $$0, dvn $$1, boolean $$2) {
      dvo $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wo.a) || $$0x.b() instanceof xw);
   }

   public abstract float h(dwy var1);

   public fbb o(dwy $$0) {
      return new fbb(0.5, 0.5, 0.5);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(f) ? etb.c.a(false) : super.b_($$0);
   }

   public dyk d() {
      return this.a;
   }

   public static dyk a(djn $$0) {
      dyk $$1;
      if ($$0 instanceof dqs) {
         $$1 = ((dqs)$$0).d();
      } else {
         $$1 = dyk.b;
      }

      return $$1;
   }

   public void a(coy $$0, dvn $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(coy $$0, dvn $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.h, dvn::a);
   }
}
