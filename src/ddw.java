import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddw extends den {
   public static final dtw a = djc.aE;
   public static final dtt b = dts.r;

   protected ddw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, iw.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddw> a();

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqa.b;
      }
   }

   protected abstract void a(dca var1, ir var2, cly var3);

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpp) {
            if ($$1 instanceof aqt) {
               bpw.a($$1, $$2, (dpp)$$5);
               ((dpp)$$5).a((aqt)$$1, ewu.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dqc> dqd<T> a(dca $$0, dqe<T> $$1, dqe<? extends dpp> $$2) {
      return $$0.C ? null : a($$1, $$2, dpp::a);
   }
}
