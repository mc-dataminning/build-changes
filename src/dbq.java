import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbq extends dch {
   public static final dqs a = dgr.aE;
   public static final dqp b = dqo.r;

   protected dbq(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ir.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dbq> a();

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         this.a($$1, $$2, $$3);
         return boq.b;
      }
   }

   protected abstract void a(czu var1, im var2, ckl var3);

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dmr) {
            if ($$1 instanceof aqe) {
               bom.a($$1, $$2, (dmr)$$5);
               ((dmr)$$5).a((aqe)$$1, etf.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dnd> dne<T> a(czu $$0, dnf<T> $$1, dnf<? extends dmr> $$2) {
      return $$0.B ? null : a($$1, $$2, dmr::a);
   }
}
