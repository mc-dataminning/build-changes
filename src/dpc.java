import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dmo {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final ece b = ebu.aW;
   public static final ebv c = ebu.s;
   private static final fgk d = dnc.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(b);
   }

   private static void d(ebe $$0, djx $$1, iv $$2) {
      int $$3 = $$1.a(dkg.a, $$2) - $$1.D_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azo.b($$4));
      }

      $$3 = azo.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            ebe $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ege.c, $$2, ege.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bur.a;
      }
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return !$$0.C && $$0.F_().g() ? a($$2, dye.r, dpc::a) : null;
   }

   private static void a(djx $$0, iv $$1, ebe $$2, dyt $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }
}
