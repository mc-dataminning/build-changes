import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqw extends dlr {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final ebf<ja> b = dqg.e;
   public static final eay c = eax.A;
   public static final eay d = eax.r;
   private static final ffk e = ffh.a(dmf.b(16.0, 0.0, 2.0), dmf.b(8.0, 2.0, 14.0));
   private static final Map<ja, ffk> f = ffh.c(
      ffh.a(dmf.a(16.0, 10.0, 14.0, 1.0, 5.333333), dmf.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dmf.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   protected dqw(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffk d_(eah $$0) {
      return e;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   public eah a(dcw $$0) {
      dja $$1 = $$0.q();
      czd $$2 = $$0.n();
      crc $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         dbl $$5 = $$2.a(kj.aa, dbl.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyl($$0, $$1);
   }

   public static boolean a(@Nullable bxe $$0, dja $$1, iu $$2, eah $$3, czd $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxe $$0, dja $$1, iu $$2, eah $$3, czd $$4) {
      if ($$1.c_($$2) instanceof dyl $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awn.cz, awo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwf $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      eah $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(efh.c, $$2, efh.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dja $$0, iu $$1, eah $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dja $$0, iu $$1, eah $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dja $$0, iu $$1, eah $$2) {
      exw $$3 = exs.a($$0, $$2.c(b).g(), ja.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 == ja.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      if ($$0.c(d)) {
         dxf $$3 = $$1.c_($$2);
         if ($$3 instanceof dyl) {
            return ((dyl)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$1.c(d)) {
         return bud.f;
      } else if ($$0.a(axk.aZ)) {
         return (bud)(a($$4, $$2, $$3, $$1, $$0) ? bud.a : bud.e);
      } else {
         return (bud)($$0.f() && $$5 == buc.a ? bud.e : bud.f);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bud.a;
      } else {
         return bud.c;
      }
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dja $$0, iu $$1, crc $$2) {
      dxf $$3 = $$0.c_($$1);
      if ($$3 instanceof dyl) {
         $$2.a((dyl)$$3);
         $$2.a(awx.au);
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
