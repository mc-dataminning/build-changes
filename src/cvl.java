import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvl extends cwc {
   public static final dkb a = dal.aE;
   public static final djy b = djx.r;

   protected cvl(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvl> a();

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         this.a($$1, $$2, $$3);
         return bkb.b;
      }
   }

   protected abstract void a(ctp var1, hx var2, cfi var3);

   @Override
   public djh a(cph $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dgk) {
            ((dgk)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgv $$5 = $$1.c_($$2);
         if ($$5 instanceof dgk) {
            if ($$1 instanceof and) {
               bjx.a($$1, $$2, (dgk)$$5);
               ((dgk)$$5).a((and)$$1, elt.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dgv> dgw<T> a(ctp $$0, dgx<T> $$1, dgx<? extends dgk> $$2) {
      return $$0.B ? null : a($$1, $$2, dgk::a);
   }
}
