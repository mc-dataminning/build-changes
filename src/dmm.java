import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmm extends djy {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final dyu b = dyl.aU;
   public static final dym c = dyl.p;
   protected static final fcs d = dkm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dxv $$0, dhi $$1, jh $$2) {
      int $$3 = $$1.a(dhr.a, $$2) - $$1.E_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * bae.b($$4));
      }

      $$3 = bae.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dxv $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ecr.c, $$2, ecr.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return btj.a;
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, duz.r, dmm::a) : null;
   }

   private static void a(dhi $$0, jh $$1, dxv $$2, dvn $$3) {
      if ($$0.ac() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }
}
