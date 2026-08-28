import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duu extends dly implements dpy {
   public static final MapCodec<duu> a = b(duu::new);
   public static final ebm<eby> b = ebe.bm;

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   protected duu(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eby.b));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzf($$0, $$1);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      dxm $$5 = $$1.c_($$2);
      if ($$5 instanceof dzf) {
         return (bug)(((dzf)$$5).a($$3) ? bug.a : bug.e);
      } else {
         return bug.e;
      }
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, @Nullable bxj $$3, czk $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dxm $$5 = $$0.c_($$1);
            if ($$5 instanceof dzf) {
               ((dzf)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$1 instanceof arq) {
         if ($$1.c_($$2) instanceof dzf $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((arq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(arq $$0, dzf $$1) {
      switch ($$1.v()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.C();
         case d:
      }
   }
}
