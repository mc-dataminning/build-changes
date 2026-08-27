import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyh extends cvv {
   public static final MapCodec<cyh> a = b(cyh::new);
   public static final dka b = djq.aT;
   public static final djr c = djq.p;
   protected static final emf d = cwj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   public cyh(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   private static void d(dja $$0, cti $$1, hx $$2) {
      int $$3 = $$1.a(ctr.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aui.b($$4));
      }

      $$3 = aui.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bjv.a;
         } else {
            dja $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dnk.c, $$2, dnk.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bjv.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dgq.q, cyh::a) : null;
   }

   private static void a(cti $$0, hx $$1, dja $$2, dhd $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }
}
