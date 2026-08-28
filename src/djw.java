import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends dhk {
   public static final MapCodec<djw> a = b(djw::new);
   public static final dwd b = dvt.aT;
   public static final dvu c = dvt.p;
   protected static final fab d = dhy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b);
   }

   private static void e(dvd $$0, dev $$1, jg $$2) {
      int $$3 = $$1.a(dfe.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azj.b($$4));
      }

      $$3 = azj.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dvd $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eaa.c, $$2, eaa.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bry.a;
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return !$$0.C && $$0.D_().g() ? a($$2, dsi.q, djw::a) : null;
   }

   private static void a(dev $$0, jg $$1, dvd $$2, dsv $$3) {
      if ($$0.aa() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }
}
