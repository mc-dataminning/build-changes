import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyo extends cwc {
   public static final MapCodec<cyo> a = b(cyo::new);
   public static final dkh b = djx.aT;
   public static final djy c = djx.p;
   protected static final emm d = cwq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   public cyo(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   private static void d(djh $$0, ctp $$1, hx $$2) {
      int $$3 = $$1.a(cty.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * auo.b($$4));
      }

      $$3 = auo.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bkb.a;
         } else {
            djh $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dnr.c, $$2, dnr.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bkb.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dgx.q, cyo::a) : null;
   }

   private static void a(ctp $$0, hx $$1, djh $$2, dhk $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }
}
