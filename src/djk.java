import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends dgy {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dvs b = dvi.aT;
   public static final dvj c = dvi.p;
   protected static final ezq d = dhm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   public djk(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b);
   }

   private static void d(dus $$0, dej $$1, jf $$2) {
      int $$3 = $$1.a(des.a, $$2) - $$1.A_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azf.b($$4));
      }

      $$3 = azf.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$3.gp()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.B) {
            dus $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dzp.c, $$2, dzp.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return brs.a;
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return !$$0.B && $$0.C_().g() ? a($$2, drx.q, djk::a) : null;
   }

   private static void a(dej $$0, jf $$1, dus $$2, dsk $$3) {
      if ($$0.aa() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }
}
