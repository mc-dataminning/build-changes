import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnz extends dlm {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final eaz b = eap.aW;
   public static final eaq c = eap.s;
   private static final ffc d = dma.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   private static void d(dzz $$0, div $$1, iu $$2) {
      int $$3 = $$1.a(dje.a, $$2) - $$1.z_();
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
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dzz $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eez.c, $$2, eez.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bub.a;
      }
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dwz.r, dnz::a) : null;
   }

   private static void a(div $$0, iu $$1, dzz $$2, dxo $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }
}
