import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dlr {
   public static final MapCodec<dof> a = b(dof::new);
   public static final ebh b = eax.aW;
   public static final eay c = eax.s;
   private static final ffk d = dmf.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   private static void d(eah $$0, dja $$1, iu $$2) {
      int $$3 = $$1.a(djj.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azm.b($$4));
      }

      $$3 = azm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            eah $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(efh.c, $$2, efh.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bud.a;
      }
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dxh.r, dof::a) : null;
   }

   private static void a(dja $$0, iu $$1, eah $$2, dxw $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }
}
