import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dct extends ddk {
   public static final drv a = dhu.aE;
   public static final drs b = drr.r;

   protected dct(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dct> a();

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         this.a($$1, $$2, $$3);
         return bpu.b;
      }
   }

   protected abstract void a(dax var1, io var2, clw var3);

   @Override
   public drb a(cwz $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dnu) {
            if ($$1 instanceof aqm) {
               bpq.a($$1, $$2, (dnu)$$5);
               ((dnu)$$5).a((aqm)$$1, euk.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dog> doh<T> a(dax $$0, doi<T> $$1, doi<? extends dnu> $$2) {
      return $$0.B ? null : a($$1, $$2, dnu::a);
   }
}
