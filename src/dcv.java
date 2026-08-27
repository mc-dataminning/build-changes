import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcv extends ddm {
   public static final drx a = dhw.aE;
   public static final dru b = drt.r;

   protected dcv(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dcv> a();

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         this.a($$1, $$2, $$3);
         return bpw.b;
      }
   }

   protected abstract void a(daz var1, io var2, cly var3);

   @Override
   public drd a(cxb $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dnw) {
            if ($$1 instanceof aqn) {
               bps.a($$1, $$2, (dnw)$$5);
               ((dnw)$$5).a((aqn)$$1, eum.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends doi> doj<T> a(daz $$0, dok<T> $$1, dok<? extends dnw> $$2) {
      return $$0.B ? null : a($$1, $$2, dnw::a);
   }
}
