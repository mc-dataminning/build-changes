import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddw extends den {
   public static final dsy a = dix.aE;
   public static final dsv b = dsu.r;

   protected ddw(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddw> a();

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqw.c;
      }
   }

   protected abstract void a(dca var1, iz var2, cmz var3);

   @Override
   public dse a(cyc $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dox) {
            if ($$1 instanceof arf) {
               bqs.a($$1, $$2, (dox)$$5);
               ((dox)$$5).a((arf)$$1, evt.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpj> dpk<T> a(dca $$0, dpl<T> $$1, dpl<? extends dox> $$2) {
      return $$0.B ? null : a($$1, $$2, dox::a);
   }
}
