import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctv extends cum {
   public static final dic a = cyv.aE;
   public static final dhz b = dhy.r;

   protected ctv(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ctv> a();

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         this.a($$1, $$2, $$3);
         return bix.b;
      }
   }

   protected abstract void a(csa var1, ht var2, cdu var3);

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof des) {
            ((des)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfd $$5 = $$1.c_($$2);
         if ($$5 instanceof des) {
            if ($$1 instanceof ame) {
               bit.a($$1, $$2, (des)$$5);
               ((des)$$5).a((ame)$$1, eju.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dfd> dfe<T> a(csa $$0, dff<T> $$1, dff<? extends des> $$2) {
      return $$0.B ? null : a($$1, $$2, des::a);
   }
}
