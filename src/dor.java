import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dmd {
   public static final MapCodec<dor> a = b(dor::new);
   public static final ebt b = ebj.aW;
   public static final ebk c = ebj.s;
   private static final ffw d = dmr.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b);
   }

   private static void d(eat $$0, djm $$1, iv $$2) {
      int $$3 = $$1.a(djv.a, $$2) - $$1.z_();
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
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            eat $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eft.c, $$2, eft.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bug.a;
      }
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dxt.r, dor::a) : null;
   }

   private static void a(djm $$0, iv $$1, eat $$2, dyi $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }
}
