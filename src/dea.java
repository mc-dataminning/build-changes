import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dea extends der {
   public static final dtb a = djb.aE;
   public static final dsy b = dsx.r;

   protected dea(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dea> a();

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqd.c;
      }
   }

   protected abstract void a(dcd var1, ja var2, cmh var3);

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dpb) {
            if ($$1 instanceof aqk) {
               bpz.a($$1, $$2, (dpb)$$5);
               ((dpb)$$5).a((aqk)$$1, evz.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpn> dpo<T> a(dcd $$0, dpp<T> $$1, dpp<? extends dpb> $$2) {
      return $$0.B ? null : a($$1, $$2, dpb::a);
   }
}
