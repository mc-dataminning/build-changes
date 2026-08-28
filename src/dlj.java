import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlj extends diw {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final dxu b = dxl.aW;
   public static final dxm c = dxl.t;
   protected static final fbs d = djk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   private static void e(dwv $$0, dgg $$1, ji $$2) {
      int $$3 = $$1.a(dgp.a, $$2) - $$1.E_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayy.b($$4));
      }

      $$3 = ayy.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dwv $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ebr.c, $$2, ebr.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsi.a;
      }
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, dtz.r, dlj::a) : null;
   }

   private static void a(dgg $$0, ji $$1, dwv $$2, dun $$3) {
      if ($$0.ad() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }
}
