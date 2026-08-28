import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsj extends dku {
   public static final MapCodec<dsj> a = b(dsj::new);
   public static final int b = 8;
   public static final dzm c = dzc.aI;
   private static final fdo[] e = dku.a(8, $$0 -> dku.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   protected dsj(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return $$1 == evi.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.e());
      if ($$3.a(awz.ct)) {
         return false;
      } else {
         return $$3.a(awz.cu) ? true : dku.a($$3.g($$1, $$2.e()), jo.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.a(dhy.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.i()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jo.b : true;
      }
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }
}
