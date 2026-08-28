import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpo extends dna {
   public static final MapCodec<dpo> a = b(dpo::new);
   public static final ecq b = ecg.aW;
   public static final ech c = ecg.s;
   private static final fgw d = dno.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(b);
   }

   private static void d(ebq $$0, dkj $$1, iw $$2) {
      int $$3 = $$1.a(dks.a, $$2) - $$1.D_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azz.b($$4));
      }

      $$3 = azz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            ebq $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(egq.c, $$2, egq.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bvc.a;
      }
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return !$$0.C && $$0.F_().g() ? a($$2, dyq.r, dpo::a) : null;
   }

   private static void a(dkj $$0, iw $$1, ebq $$2, dzf $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }
}
