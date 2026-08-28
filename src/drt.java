import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drt extends dmo {
   public static final MapCodec<drt> a = b(drt::new);
   public static final ecc<jb> b = drd.e;
   public static final ebv c = ebu.A;
   public static final ebv d = ebu.r;
   private static final fgk e = fgh.a(dnc.b(16.0, 0.0, 2.0), dnc.b(8.0, 2.0, 14.0));
   private static final Map<jb, fgk> f = fgh.c(
      fgh.a(dnc.a(16.0, 10.0, 14.0, 1.0, 5.333333), dnc.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dnc.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   protected drt(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgk d_(ebe $$0) {
      return e;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   public ebe a(ddr $$0) {
      djx $$1 = $$0.q();
      czy $$2 = $$0.n();
      crx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         dcg $$5 = $$2.a(kk.aa, dcg.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzi($$0, $$1);
   }

   public static boolean a(@Nullable bxu $$0, djx $$1, iv $$2, ebe $$3, czy $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxu $$0, djx $$1, iv $$2, ebe $$3, czy $$4) {
      if ($$1.c_($$2) instanceof dzi $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awp.cz, awq.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwt $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      ebe $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ege.c, $$2, ege.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(djx $$0, iv $$1, ebe $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(djx $$0, iv $$1, ebe $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(djx $$0, iv $$1, ebe $$2) {
      eyw $$3 = eys.a($$0, $$2.c(b).g(), jb.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$3 == jb.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      if ($$0.c(d)) {
         dyc $$3 = $$1.c_($$2);
         if ($$3 instanceof dzi) {
            return ((dzi)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$1.c(d)) {
         return bur.f;
      } else if ($$0.a(axm.aZ)) {
         return (bur)(a($$4, $$2, $$3, $$1, $$0) ? bur.a : bur.e);
      } else {
         return (bur)($$0.f() && $$5 == buq.a ? bur.e : bur.f);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bur.a;
      } else {
         return bur.c;
      }
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(djx $$0, iv $$1, crx $$2) {
      dyc $$3 = $$0.c_($$1);
      if ($$3 instanceof dzi) {
         $$2.a((dzi)$$3);
         $$2.a(awz.au);
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
