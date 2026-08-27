import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dge extends cyr implements dgf {
   public static final dmv f = dmu.C;
   protected static final float g = 4.0F;
   protected static final epo h = czf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dnr a;

   protected dge(dnr $$0, dmd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dge> a();

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return h;
   }

   @Override
   public boolean a(dme $$0) {
      return true;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dku($$0, $$1);
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof dku $$7) {
         cqp $$10 = $$0.d() instanceof cqp $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gh();
         if (!$$2.B) {
            if ($$11 && !$$7.t() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(atz.c.b($$0.d()));
                  $$2.a(dqr.c, $$7.aD_(), dqr.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bmn.a;
               } else {
                  return bmn.d;
               }
            } else {
               return bmn.d;
            }
         } else {
            return !$$11 && !$$7.t() ? bmn.b : bmn.a;
         }
      } else {
         return bmn.e;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.c_($$2) instanceof dku $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.t()) {
            $$1.a(null, $$5.aD_(), $$5.d(), atq.e);
            return bml.a;
         } else if ($$8) {
            return bml.a;
         } else if (!this.a($$3, $$5) && $$3.gh() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bml.a;
         } else {
            return bml.d;
         }
      } else {
         return bml.d;
      }
   }

   private boolean b(cia $$0, dku $$1, boolean $$2) {
      dkv $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vr.a) || $$0x.b() instanceof wz);
   }

   public abstract float g(dme var1);

   public eov m(dme $$0) {
      return new eov(0.5, 0.5, 0.5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(f) ? ehs.c.a(false) : super.c_($$0);
   }

   public dnr d() {
      return this.a;
   }

   public static dnr a(czf $$0) {
      dnr $$1;
      if ($$0 instanceof dge) {
         $$1 = ((dge)$$0).d();
      } else {
         $$1 = dnr.b;
      }

      return $$1;
   }

   public void a(cia $$0, dku $$1, boolean $$2) {
      $$1.a($$0.ct());
      $$0.a($$1, $$2);
   }

   private boolean a(cia $$0, dku $$1) {
      UUID $$2 = $$1.s();
      return $$2 != null && !$$2.equals($$0.ct());
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.h, dku::a);
   }
}
