import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhb extends den {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final duc b = dts.aT;
   public static final dtt c = dts.p;
   protected static final exn d = dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b);
   }

   private static void d(dtc $$0, dca $$1, ir $$2) {
      int $$3 = $$1.a(dcj.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aym.b($$4));
      }

      $$3 = aym.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$3.gz()) {
         if ($$1.C) {
            return bqa.a;
         } else {
            dtc $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxv.c, $$2, dxv.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqa.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return !$$0.C && $$0.E_().g() ? a($$2, dqe.r, dhb::a) : null;
   }

   private static void a(dca $$0, ir $$1, dtc $$2, dqr $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }
}
