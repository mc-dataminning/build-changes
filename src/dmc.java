import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends djp {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final dyn b = dye.aW;
   public static final dyf c = dye.t;
   protected static final fcl d = dkd.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dxo $$0, dgz $$1, jh $$2) {
      int $$3 = $$1.a(dhi.a, $$2) - $$1.E_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azu.b($$4));
      }

      $$3 = azu.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dxo $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eck.c, $$2, eck.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bta.a;
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, dus.r, dmc::a) : null;
   }

   private static void a(dgz $$0, jh $$1, dxo $$2, dvg $$3) {
      if ($$0.ad() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }
}
