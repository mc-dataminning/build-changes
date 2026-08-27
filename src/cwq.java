import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwq extends cuf {
   public static final MapCodec<cwq> a = b(cwq::new);
   public static final dhw b = dhm.aT;
   public static final dhn c = dhm.p;
   protected static final ekb d = cut.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cwq> a() {
      return a;
   }

   public cwq(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   private static void d(dgw $$0, crs $$1, ht $$2) {
      int $$3 = $$1.a(csb.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ati.b($$4));
      }

      $$3 = ati.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return biq.a;
         } else {
            dgw $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dlg.c, $$2, dlg.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return biq.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, det.q, cwq::a) : null;
   }

   private static void a(crs $$0, ht $$1, dgw $$2, dfg $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }
}
