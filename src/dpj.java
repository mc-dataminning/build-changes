import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dpj extends dkg {
   public static final MapCodec<dpj> a = b(dpj::new);
   public static final dzk<jo> b = dot.e;
   public static final dzd c = dzc.A;
   public static final dzd d = dzc.r;
   private static final fdo e = fdl.a(dku.b(16.0, 0.0, 2.0), dku.b(8.0, 2.0, 14.0));
   private static final Map<jo, fdo> f = fdl.c(
      fdl.a(dku.a(16.0, 10.0, 14.0, 1.0, 5.333333), dku.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dku.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fdo d_(dym $$0) {
      return e;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   public dym a(dbn $$0) {
      dhp $$1 = $$0.q();
      cxy $$2 = $$0.n();
      cqi $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gF()) {
         dae $$5 = $$2.a(kx.aa, dae.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwr($$0, $$1);
   }

   public static boolean a(@Nullable bwr $$0, dhp $$1, jj $$2, dym $$3, cxy $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bwr $$0, dhp $$1, jj $$2, dym $$3, cxy $$4) {
      if ($$1.c_($$2) instanceof dwr $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awk.cz, awl.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bvs $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      dym $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(edm.c, $$2, edm.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dhp $$0, jj $$1, dym $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dhp $$0, jj $$1, dym $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dhp $$0, jj $$1, dym $$2) {
      ewb $$3 = evx.a($$0, $$2.c(b).g(), jo.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 == jo.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      if ($$0.c(d)) {
         dvl $$3 = $$1.c_($$2);
         if ($$3 instanceof dwr) {
            return ((dwr)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$1.c(d)) {
         return btq.f;
      } else if ($$0.a(axi.aY)) {
         return (btq)(a($$4, $$2, $$3, $$1, $$0) ? btq.a : btq.e);
      } else {
         return (btq)($$0.f() && $$5 == btp.a ? btq.e : btq.f);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return btq.a;
      } else {
         return btq.c;
      }
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dhp $$0, jj $$1, cqi $$2) {
      dvl $$3 = $$0.c_($$1);
      if ($$3 instanceof dwr) {
         $$2.a((dwr)$$3);
         $$2.a(awu.au);
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
