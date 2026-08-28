import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dna extends dic {
   public static final MapCodec<dna> a = b(dna::new);
   public static final dws<jm> b = dml.aF;
   public static final dwm c = dwl.w;
   public static final dwm d = dwl.o;
   public static final fas e = diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fas f = diq.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fas g = fap.a(e, f);
   public static final fas h = diq.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fas i = fap.a(g, h);
   public static final fas j = fap.a(
      diq.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), diq.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), diq.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fas k = fap.a(
      diq.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), diq.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), diq.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fas l = fap.a(
      diq.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), diq.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), diq.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fas m = fap.a(
      diq.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), diq.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), diq.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected fas d_(dvv $$0) {
      return g;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   public dvv a(dad $$0) {
      dfm $$1 = $$0.q();
      cwm $$2 = $$0.n();
      cou $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gE()) {
         cyv $$5 = $$2.a(ku.Y, cyv.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return i;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((jm)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duc($$0, $$1);
   }

   public static boolean a(@Nullable bvh $$0, dfm $$1, jh $$2, dvv $$3, cwm $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvh $$0, dfm $$1, jh $$2, dvv $$3, cwm $$4) {
      if ($$1.c_($$2) instanceof duc $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awn.cz, awo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bul $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      dvv $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ear.c, $$2, ear.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dfm $$0, jh $$1, dvv $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dfm $$0, jh $$1, dvv $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dfm $$0, jh $$1, dvv $$2) {
      etd $$3 = esz.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dvv $$0, dfm $$1, jh $$2) {
      if ($$1.c_($$2) instanceof duc $$4) {
         jm $$5 = $$0.c(b);
         cwm $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         clc $$9 = new clc($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.n();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      if ($$0.c(d)) {
         dsy $$3 = $$1.c_($$2);
         if ($$3 instanceof duc) {
            return ((duc)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$1.c(d)) {
         return bsk.f;
      } else if ($$0.a(axl.aZ)) {
         return (bsk)(a($$4, $$2, $$3, $$1, $$0) ? bsk.a : bsk.e);
      } else {
         return (bsk)($$0.f() && $$5 == bsj.a ? bsk.e : bsk.f);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsk.a;
      } else {
         return bsk.c;
      }
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dfm $$0, jh $$1, cou $$2) {
      dsy $$3 = $$0.c_($$1);
      if ($$3 instanceof duc) {
         $$2.a((duc)$$3);
         $$2.a(awx.au);
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
