import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvt extends cwk {
   public static final dkj a = dat.aE;
   public static final dkg b = dkf.r;

   protected cvt(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvt> a();

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         this.a($$1, $$2, $$3);
         return bkc.b;
      }
   }

   protected abstract void a(ctx var1, hx var2, cfq var3);

   @Override
   public djp a(cpp $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgs) {
            ((dgs)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dgs) {
            if ($$1 instanceof ane) {
               bjy.a($$1, $$2, (dgs)$$5);
               ((dgs)$$5).a((ane)$$1, emc.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dhd> dhe<T> a(ctx $$0, dhf<T> $$1, dhf<? extends dgs> $$2) {
      return $$0.B ? null : a($$1, $$2, dgs::a);
   }
}
