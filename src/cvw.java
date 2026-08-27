import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvw extends ctm {
   public static final MapCodec<cvw> a = b(cvw::new);
   public static final dhb b = dgr.aT;
   public static final dgs c = dgr.p;
   protected static final eiy d = cua.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cvw> a() {
      return a;
   }

   public cvw(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   private static void d(dgb $$0, cqz $$1, ht $$2) {
      int $$3 = $$1.a(cri.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * asy.b($$4));
      }

      $$3 = asy.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bib.a;
         } else {
            dgb $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dkl.c, $$2, dkl.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bib.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new del($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, ddz.q, cvw::a) : null;
   }

   private static void a(cqz $$0, ht $$1, dgb $$2, del $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }
}
