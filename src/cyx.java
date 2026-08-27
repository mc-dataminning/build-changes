import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyx extends czo {
   public static final dnv a = ddx.aE;
   public static final dns b = dnr.r;

   protected cyx(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cyx> a();

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         this.a($$1, $$2, $$3);
         return bnd.b;
      }
   }

   protected abstract void a(cxb var1, ib var2, ciu var3);

   @Override
   public dnb a(csu $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof djx) {
            ((djx)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof djx) {
            if ($$1 instanceof apf) {
               bmz.a($$1, $$2, (djx)$$5);
               ((djx)$$5).a((apf)$$1, ept.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dki> dkj<T> a(cxb $$0, dkk<T> $$1, dkk<? extends djx> $$2) {
      return $$0.B ? null : a($$1, $$2, djx::a);
   }
}
