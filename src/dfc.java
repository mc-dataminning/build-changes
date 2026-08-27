import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfc extends dcq {
   public static final MapCodec<dfc> a = b(dfc::new);
   public static final drh b = dqx.aT;
   public static final dqy c = dqx.p;
   protected static final eui d = dde.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b);
   }

   private static void d(dqh $$0, dad $$1, in $$2) {
      int $$3 = $$1.a(dam.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * axz.b($$4));
      }

      $$3 = axz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$3.gm()) {
         if ($$1.B) {
            return bpm.a;
         } else {
            dqh $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dva.c, $$2, dva.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bpm.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dob($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dno.q, dfc::a) : null;
   }

   private static void a(dad $$0, in $$1, dqh $$2, dob $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }
}
