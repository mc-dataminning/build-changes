import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dly {
   public static final MapCodec<dom> a = b(dom::new);
   public static final ebo b = ebe.aW;
   public static final ebf c = ebe.s;
   private static final ffr d = dmm.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(b);
   }

   private static void d(eao $$0, djh $$1, iv $$2) {
      int $$3 = $$1.a(djq.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azm.b($$4));
      }

      $$3 = azm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            eao $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(efo.c, $$2, efo.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bug.a;
      }
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dxo.r, dom::a) : null;
   }

   private static void a(djh $$0, iv $$1, eao $$2, dyd $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }
}
