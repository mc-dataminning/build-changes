import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkt extends dch implements dgd {
   public static final MapCodec<dkt> a = b(dkt::new);
   public static final dqw<dri> b = dqo.bj;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   protected dkt(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dri.b));
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dos($$0, $$1);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      dnd $$5 = $$1.c_($$2);
      if ($$5 instanceof dos) {
         return ((dos)$$5).a($$3) ? boq.a($$1.B) : boq.d;
      } else {
         return boq.d;
      }
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, @Nullable bre $$3, csd $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dnd $$5 = $$0.c_($$1);
            if ($$5 instanceof dos) {
               ((dos)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$1 instanceof aqe) {
         if ($$1.c_($$2) instanceof dos $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqe)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqe $$0, dos $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
