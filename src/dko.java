import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dko extends dic {
   public static final MapCodec<dko> a = b(dko::new);
   public static final dwu b = dwl.aT;
   public static final dwm c = dwl.p;
   protected static final fas d = diq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dvv $$0, dfm $$1, jh $$2) {
      int $$3 = $$1.a(dfv.a, $$2) - $$1.D_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azm.b($$4));
      }

      $$3 = azm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$3.gt()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dvv $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ear.c, $$2, ear.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsk.a;
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return !$$0.C && $$0.F_().g() ? a($$2, dta.q, dko::a) : null;
   }

   private static void a(dfm $$0, jh $$1, dvv $$2, dtn $$3) {
      if ($$0.ab() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }
}
