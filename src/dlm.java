import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends diz {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dxx b = dxo.aW;
   public static final dxp c = dxo.t;
   protected static final fbv d = djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   private static void e(dwy $$0, dgj $$1, ji $$2) {
      int $$3 = $$1.a(dgs.a, $$2) - $$1.E_();
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
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dwy $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ebu.c, $$2, ebu.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsl.a;
      }
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, duc.r, dlm::a) : null;
   }

   private static void a(dgj $$0, ji $$1, dwy $$2, duq $$3) {
      if ($$0.ad() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }
}
