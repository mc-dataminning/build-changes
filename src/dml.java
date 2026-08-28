import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dml extends djx {
   public static final MapCodec<dml> a = b(dml::new);
   public static final dyt b = dyk.aU;
   public static final dyl c = dyk.p;
   protected static final fcr d = dkl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dxu $$0, dhh $$1, jh $$2) {
      int $$3 = $$1.a(dhq.a, $$2) - $$1.E_();
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
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$3.gt()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dxu $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ecq.c, $$2, ecq.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bti.a;
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, duy.r, dml::a) : null;
   }

   private static void a(dhh $$0, jh $$1, dxu $$2, dvm $$3) {
      if ($$0.ac() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }
}
