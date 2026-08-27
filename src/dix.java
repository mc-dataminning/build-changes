import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dix extends dbk implements diy {
   public static final dpq f = dpp.C;
   protected static final float g = 4.0F;
   protected static final est h = dby.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dqm a;

   protected dix(dqm $$0, doy.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dix> a();

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return h;
   }

   @Override
   public boolean a(doz $$0) {
      return true;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnp($$0, $$1);
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dnp $$7) {
         csi $$10 = $$0.f() instanceof csi $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(auw.c.b($$0.f()));
                  $$2.a(dts.c, $$7.aA_(), dts.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.g(1);
                  }

                  return boc.a;
               } else {
                  return boc.d;
               }
            } else {
               return boc.d;
            }
         } else {
            return !$$11 && !$$7.u() ? boc.b : boc.a;
         }
      } else {
         return boc.e;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.c_($$2) instanceof dnp $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aA_(), $$5.d(), aun.e);
            return boa.a;
         } else if ($$8) {
            return boa.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return boa.a;
         } else {
            return boa.d;
         }
      } else {
         return boa.d;
      }
   }

   private boolean b(cjt $$0, dnp $$1, boolean $$2) {
      dnq $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wf.a) || $$0x.b() instanceof xn);
   }

   public abstract float g(doz var1);

   public esa m(doz $$0) {
      return new esa(0.5, 0.5, 0.5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(f) ? ekt.c.a(false) : super.c_($$0);
   }

   public dqm d() {
      return this.a;
   }

   public static dqm a(dby $$0) {
      dqm $$1;
      if ($$0 instanceof dix) {
         $$1 = ((dix)$$0).d();
      } else {
         $$1 = dqm.b;
      }

      return $$1;
   }

   public void a(cjt $$0, dnp $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cjt $$0, dnp $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.h, dnp::a);
   }
}
