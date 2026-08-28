import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgt extends dhk {
   public static final dvx a = dlt.aF;
   public static final dvu b = dvt.r;

   protected dgt(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jl.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgt> a();

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bry.a;
   }

   protected abstract void a(dev var1, jg var2, coh var3);

   @Override
   public dvd a(czm $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsg $$5 = $$1.c_($$2);
         if ($$5 instanceof dru) {
            if ($$1 instanceof arm) {
               bru.a($$1, $$2, (dru)$$5);
               ((dru)$$5).a((arm)$$1, ezh.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dsg> dsh<T> a(dev $$0, dsi<T> $$1, dsi<? extends dru> $$2) {
      return $$0.C ? null : a($$1, $$2, dru::a);
   }
}
