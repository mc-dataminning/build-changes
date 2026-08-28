import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhl extends dic {
   public static final dws<jm> a = dml.aF;
   public static final dwm b = dwl.r;

   protected dhl(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dhl> a();

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsk.a;
   }

   protected abstract void a(dfm var1, jh var2, cou var3);

   @Override
   public dvv a(dad $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsy $$5 = $$1.c_($$2);
         if ($$5 instanceof dsm) {
            if ($$1 instanceof arp) {
               bsg.a($$1, $$2, (dsm)$$5);
               ((dsm)$$5).a((arp)$$1, ezy.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dsy> dsz<T> a(dfm $$0, dta<T> $$1, dta<? extends dsm> $$2) {
      return $$0.C ? null : a($$1, $$2, dsm::a);
   }
}
