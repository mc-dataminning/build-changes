import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyn extends cwb {
   public static final MapCodec<cyn> a = b(cyn::new);
   public static final dkg b = djw.aT;
   public static final djx c = djw.p;
   protected static final eml d = cwp.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   public cyn(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   private static void d(djg $$0, cto $$1, hx $$2) {
      int $$3 = $$1.a(ctx.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aun.b($$4));
      }

      $$3 = aun.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bka.a;
         } else {
            djg $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dnq.c, $$2, dnq.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bka.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dgw.q, cyn::a) : null;
   }

   private static void a(cto $$0, hx $$1, djg $$2, dhj $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }
}
