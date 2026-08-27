import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddq extends cwk implements ddy {
   public static final MapCodec<ddq> c = b(ddq::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dkn<dkw> f = dkf.bo;
   public static final dkp g = dkf.aT;
   public static final dkg h = dkf.C;
   protected static final emv i = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dcg.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends ddq> a() {
      return c;
   }

   public ddq(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dkw.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      hx $$1 = $$0.a();
      eez $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == efa.c));
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(h) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (h($$0) != dkw.b) {
         if (h($$0) == dkw.c) {
            $$1.a($$2, $$0.a(f, dkw.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, art.vz, aru.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bmc.bk && $$0.c_($$1) instanceof dij $$5 && $$0 instanceof ane $$6 && $$5.gi().a($$6, $$1, dnz.P, dnz.a.a($$2))) {
         $$5.g().b($$6, dnz.P, dnz.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dkw.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(ctx $$0, hx $$1, djp $$2) {
      cwy $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dij($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return !$$0.B ? a($$2, dhf.I, ($$0x, $$1x, $$2x, $$3) -> doi.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return i;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dkw h(djp $$0) {
      return $$0.c(f);
   }

   public static boolean n(djp $$0) {
      return h($$0) == dkw.a;
   }

   public static void a(ctx $$0, hx $$1, djp $$2) {
      $$0.a($$1, $$2.a(f, dkw.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dkw.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dnz.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, art.vy, aru.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable blw $$0, ctx $$1, hx $$2, int $$3) {
      for (ic $$4 : ic.values()) {
         hx $$5 = $$2.a($$4);
         djp $$6 = $$1.a_($$5);
         if ($$6.a(asi.bO)) {
            $$1.a(doi.b($$3), $$5, dnz.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, art.I, aru.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if (h($$0) == dkw.b) {
         ic $$4 = ic.b($$3);
         if ($$4 != ic.b && $$4 != ic.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jq.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dij $$4) {
         return h($$0) == dkw.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bje.a(5));
      }
   }
}
