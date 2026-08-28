import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmz extends dfk implements dna {
   public static final dtt f = dts.C;
   protected static final float g = 4.0F;
   protected static final exv h = dfy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dup a;

   protected dmz(dup $$0, dtb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmz> a();

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return h;
   }

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drs($$0, $$1);
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.c_($$3) instanceof drs $$7) {
         cvv $$10 = $$0.g() instanceof cvv $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gk();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avz.c.b($$0.g()));
                  $$2.a(dxz.c, $$7.aD_(), dxz.a.a($$4, $$7.n()));
                  $$0.a(1, $$4);
                  return bqt.a;
               } else {
                  return bqt.d;
               }
            } else {
               return bqt.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqt.b : bqt.a;
         }
      } else {
         return bqt.e;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.c_($$2) instanceof drs $$5) {
         if ($$1.B) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aD_(), $$5.d(), avq.e);
            return bqr.a;
         } else if ($$8) {
            return bqr.a;
         } else if (!this.a($$3, $$5) && $$3.gk() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqr.a;
         } else {
            return bqr.e;
         }
      } else {
         return bqr.e;
      }
   }

   private boolean b(cmx $$0, drs $$1, boolean $$2) {
      drt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Z())).allMatch($$0x -> $$0x.equals(wy.a) || $$0x.b() instanceof yg);
   }

   public abstract float g(dtc var1);

   public exc m(dtc $$0) {
      return new exc(0.5, 0.5, 0.5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   public dup d() {
      return this.a;
   }

   public static dup a(dfy $$0) {
      dup $$1;
      if ($$0 instanceof dmz) {
         $$1 = ((dmz)$$0).d();
      } else {
         $$1 = dup.b;
      }

      return $$1;
   }

   public void a(cmx $$0, drs $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmx $$0, drs $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.h, drs::a);
   }
}
