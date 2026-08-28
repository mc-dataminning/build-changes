import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends djq {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final dyq b = dyg.aW;
   public static final dyh c = dyg.s;
   private static final fcr d = dke.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   private static void e(dxq $$0, dgz $$1, ji $$2) {
      int $$3 = $$1.a(dhi.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayz.b($$4));
      }

      $$3 = ayz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$3.gy()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dxq $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ecp.c, $$2, ecp.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsy.a;
      }
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, duu.r, dmd::a) : null;
   }

   private static void a(dgz $$0, ji $$1, dxq $$2, dvi $$3) {
      if ($$0.ae() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }
}
