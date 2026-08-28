import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends djq {
   public static final MapCodec<dme> a = b(dme::new);
   public static final dym b = dyd.aU;
   public static final dye c = dyd.p;
   protected static final fcm d = dke.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dxn $$0, dha $$1, jh $$2) {
      int $$3 = $$1.a(dhj.a, $$2) - $$1.E_();
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
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$3.gt()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dxn $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ecj.c, $$2, ecj.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bte.a;
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, dur.r, dme::a) : null;
   }

   private static void a(dha $$0, jh $$1, dxn $$2, dvf $$3) {
      if ($$0.ac() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }
}
