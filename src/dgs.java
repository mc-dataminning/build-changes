import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgs extends deg {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final dsx b = dsn.aT;
   public static final dso c = dsn.p;
   protected static final ewf d = deu.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dgs(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(drx $$0, dbt $$1, iz $$2) {
      int $$3 = $$1.a(dcc.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayu.b($$4));
      }

      $$3 = ayu.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqp.a;
         } else {
            drx $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dwq.c, $$2, dwq.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqp.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpe.q, dgs::a) : null;
   }

   private static void a(dbt $$0, iz $$1, drx $$2, dpr $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }
}
