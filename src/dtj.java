import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtj extends dlu {
   public static final MapCodec<dtj> a = b(dtj::new);
   public static final int b = 8;
   public static final eao c = eae.aI;
   private static final feq[] e = dlu.a(8, $$0 -> dlu.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   protected dtj(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return $$1 == ewk.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.e());
      if ($$3.a(axa.ct)) {
         return false;
      } else {
         return $$3.a(axa.cu) ? true : dlu.a($$3.g($$1, $$2.e()), ja.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.a(diy.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ja.b : true;
      }
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }
}
