import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpe extends dmq {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final ecg b = ebw.aW;
   public static final ebx c = ebw.s;
   private static final fgm d = dne.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b);
   }

   private static void d(ebg $$0, djz $$1, iw $$2) {
      int $$3 = $$1.a(dki.a, $$2) - $$1.D_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azq.b($$4));
      }

      $$3 = azq.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            ebg $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(egg.c, $$2, egg.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return but.a;
      }
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return !$$0.C && $$0.F_().g() ? a($$2, dyg.r, dpe::a) : null;
   }

   private static void a(djz $$0, iw $$1, ebg $$2, dyv $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }
}
