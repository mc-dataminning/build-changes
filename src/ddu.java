import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddu extends del {
   public static final dsw a = div.aE;
   public static final dst b = dss.r;

   protected ddu(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddu> a();

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqu.c;
      }
   }

   protected abstract void a(dby var1, iz var2, cmx var3);

   @Override
   public dsc a(cya $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dov) {
            if ($$1 instanceof arf) {
               bqq.a($$1, $$2, (dov)$$5);
               ((dov)$$5).a((arf)$$1, evr.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dph> dpi<T> a(dby $$0, dpj<T> $$1, dpj<? extends dov> $$2) {
      return $$0.B ? null : a($$1, $$2, dov::a);
   }
}
