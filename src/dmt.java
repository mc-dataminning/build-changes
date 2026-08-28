import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends dkg {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dzm b = dzc.aW;
   public static final dzd c = dzc.s;
   private static final fdo d = dku.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b);
   }

   private static void e(dym $$0, dhp $$1, jj $$2) {
      int $$3 = $$1.a(dhy.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azk.b($$4));
      }

      $$3 = azk.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dym $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(edm.c, $$2, edm.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return btq.a;
      }
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dvn.r, dmt::a) : null;
   }

   private static void a(dhp $$0, jj $$1, dym $$2, dwc $$3) {
      if ($$0.ae() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }
}
