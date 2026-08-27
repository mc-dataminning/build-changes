import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class czf extends crz implements czn {
   public static final int b = 30;
   public static final int c = 10;
   public static final dfy<dgh> d = dfq.bo;
   public static final dga e = dfq.aT;
   public static final dfr f = dfq.C;
   protected static final ehx g = csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cxt.b($$1[$$2]);
      }
   });

   public czf(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgh.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      gu $$1 = $$0.a();
      ead $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == eae.c));
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(f) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (h($$0) != dgh.b) {
         if (h($$0) == dgh.c) {
            $$1.a($$2, $$0.a(d, dgh.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, aow.uu, aox.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      if (!$$0.r_() && n($$2) && $$3.ag() != bim.bi && $$0.c_($$1) instanceof ddr $$5 && $$0 instanceof akk $$6 && $$5.gc().a($$6, $$1, djk.P, djk.a.a($$2))) {
         $$5.g().b($$6, djk.P, djk.a.a($$3), $$3.di());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgh.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpm $$0, gu $$1, dfa $$2) {
      csm $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return !$$0.B ? a($$2, dco.I, ($$0x, $$1x, $$2x, $$3) -> djt.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return g;
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgh h(dfa $$0) {
      return $$0.c(d);
   }

   public static boolean n(dfa $$0) {
      return h($$0) == dgh.a;
   }

   public static void a(cpm $$0, gu $$1, dfa $$2) {
      $$0.a($$1, $$2.a(d, dgh.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgh.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djk.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.ut, aox.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bii $$0, cpm $$1, gu $$2, int $$3) {
      for (ha $$4 : ha.values()) {
         gu $$5 = $$2.a($$4);
         dfa $$6 = $$1.a_($$5);
         if ($$6.a(apl.bO)) {
            $$1.a(djt.b($$3), $$5, djk.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aow.I, aox.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if (h($$0) == dgh.b) {
         ha $$4 = ha.b($$3);
         if ($$4 != ha.b && $$4 != ha.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(io.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddr $$4) {
         return h($$0) == dgh.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, ciy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfs.a(5));
      }
   }
}
