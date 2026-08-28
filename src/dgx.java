import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgx extends del {
   public static final MapCodec<dgx> a = b(dgx::new);
   public static final dtc b = dss.aT;
   public static final dst c = dss.p;
   protected static final ewk d = dez.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public dgx(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(dsc $$0, dby $$1, iz $$2) {
      int $$3 = $$1.a(dch.a, $$2) - $$1.B_();
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
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqu.a;
         } else {
            dsc $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dwv.c, $$2, dwv.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqu.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpj.q, dgx::a) : null;
   }

   private static void a(dby $$0, iz $$1, dsc $$2, dpw $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }
}
