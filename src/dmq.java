import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmq extends den implements dmr {
   public static final dtt f = dts.C;
   protected static final float g = 4.0F;
   protected static final exn h = dfc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dup a;

   protected dmq(dup $$0, dtb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmq> a();

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return h;
   }

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drr($$0, $$1);
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof drr $$7) {
         cvr $$10 = $$0.f() instanceof cvr $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gz();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avz.c.b($$0.f()));
                  $$2.a(dxv.c, $$7.az_(), dxv.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqc.a;
               } else {
                  return bqc.d;
               }
            } else {
               return bqc.d;
            }
         } else {
            return !$$11 && !$$7.u() ? bqc.b : bqc.a;
         }
      } else {
         return bqc.e;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.c_($$2) instanceof drr $$5) {
         if ($$1.C) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.az_(), $$5.d(), avq.e);
            return bqa.a;
         } else if ($$8) {
            return bqa.a;
         } else if (!this.a($$3, $$5) && $$3.gz() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqa.a;
         } else {
            return bqa.d;
         }
      } else {
         return bqa.d;
      }
   }

   private boolean b(cly $$0, drr $$1, boolean $$2) {
      drs $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xd.a) || $$0x.b() instanceof yl);
   }

   public abstract float g(dtc var1);

   public ewu m(dtc $$0) {
      return new ewu(0.5, 0.5, 0.5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   public dup c() {
      return this.a;
   }

   public static dup a(dfc $$0) {
      dup $$1;
      if ($$0 instanceof dmq) {
         $$1 = ((dmq)$$0).c();
      } else {
         $$1 = dup.b;
      }

      return $$1;
   }

   public void a(cly $$0, drr $$1, boolean $$2) {
      $$1.a($$0.cE());
      $$0.a($$1, $$2);
   }

   private boolean a(cly $$0, drr $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cE());
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.i, drr::a);
   }
}
