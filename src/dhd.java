import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhd extends der {
   public static final MapCodec<dhd> a = b(dhd::new);
   public static final dth b = dsx.aT;
   public static final dsy c = dsx.p;
   protected static final ews d = dff.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b);
   }

   private static void d(dsh $$0, dcd $$1, ja $$2) {
      int $$3 = $$1.a(dcm.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aye.b($$4));
      }

      $$3 = aye.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$3.gk()) {
         if ($$1.B) {
            return bqd.a;
         } else {
            dsh $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxa.c, $$2, dxa.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqd.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpp.q, dhd::a) : null;
   }

   private static void a(dcd $$0, ja $$1, dsh $$2, dqc $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }
}
