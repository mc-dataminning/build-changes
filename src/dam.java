import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dam extends cya {
   public static final MapCodec<dam> a = b(dam::new);
   public static final dmf b = dlv.aT;
   public static final dlw c = dlv.p;
   protected static final eol d = cyo.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dam(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(b);
   }

   private static void d(dlf $$0, cvn $$1, hz $$2) {
      int $$3 = $$1.a(cvw.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * awh.b($$4));
      }

      $$3 = awh.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$3.gf()) {
         if ($$1.B) {
            return blu.a;
         } else {
            dlf $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dpp.c, $$2, dpp.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return blu.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dji($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, div.q, dam::a) : null;
   }

   private static void a(cvn $$0, hz $$1, dlf $$2, dji $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }
}
