import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dty extends dmf {
   public static final MapCodec<dty> a = b(dty::new);
   public static final int b = 8;
   public static final ebh c = eax.aI;
   private static final ffk[] e = dmf.a(8, $$0 -> dmf.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   protected dty(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return $$1 == exd.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffk c(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected float c(eah $$0, dig $$1, iu $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.e());
      if ($$3.a(axc.cu)) {
         return false;
      } else {
         return $$3.a(axc.cv) ? true : dmf.a($$3.g($$1, $$2.e()), ja.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a(djj.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ja.b : true;
      }
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }
}
