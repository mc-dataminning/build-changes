import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cwk {
   public static final MapCodec<cyw> a = b(cyw::new);
   public static final dkp b = dkf.aT;
   public static final dkg c = dkf.p;
   protected static final emv d = cwy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   public cyw(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   private static void d(djp $$0, ctx $$1, hx $$2) {
      int $$3 = $$1.a(cug.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aup.b($$4));
      }

      $$3 = aup.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bkc.a;
         } else {
            djp $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dnz.c, $$2, dnz.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bkc.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dhf.q, cyw::a) : null;
   }

   private static void a(ctx $$0, hx $$1, djp $$2, dhs $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }
}
