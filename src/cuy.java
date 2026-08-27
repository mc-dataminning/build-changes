import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuy extends cso {
   public static final MapCodec<cuy> a = b(cuy::new);
   public static final dgd b = dft.aT;
   public static final dfu c = dft.p;
   protected static final eia d = ctc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cuy> a() {
      return a;
   }

   public cuy(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(b);
   }

   private static void d(dfd $$0, cqb $$1, gw $$2) {
      int $$3 = $$1.a(cqk.a, $$2) - $$1.A_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * asb.b($$4));
      }

      $$3 = asb.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bhe.a;
         } else {
            dfd $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(djn.c, $$2, djn.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bhe.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return !$$0.B && $$0.C_().g() ? a($$2, ddb.q, cuy::a) : null;
   }

   private static void a(cqb $$0, gw $$1, dfd $$2, ddn $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }
}
