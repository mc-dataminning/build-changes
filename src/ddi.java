import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends cwc implements ddq {
   public static final MapCodec<ddi> c = b(ddi::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dkf<dko> f = djx.bo;
   public static final dkh g = djx.aT;
   public static final djy h = djx.C;
   protected static final emm i = cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dby.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends ddi> a() {
      return c;
   }

   public ddi(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dko.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      hx $$1 = $$0.a();
      eer $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ees.c));
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(h) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (h($$0) != dko.b) {
         if (h($$0) == dko.c) {
            $$1.a($$2, $$0.a(f, dko.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, ars.vk, art.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, blv $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != blz.bj && $$0.c_($$1) instanceof dib $$5 && $$0 instanceof and $$6 && $$5.gh().a($$6, $$1, dnr.P, dnr.a.a($$2))) {
         $$5.g().b($$6, dnr.P, dnr.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dko.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(ctp $$0, hx $$1, djh $$2) {
      cwq $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dib($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return !$$0.B ? a($$2, dgx.I, ($$0x, $$1x, $$2x, $$3) -> doa.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return i;
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dko h(djh $$0) {
      return $$0.c(f);
   }

   public static boolean n(djh $$0) {
      return h($$0) == dko.a;
   }

   public static void a(ctp $$0, hx $$1, djh $$2) {
      $$0.a($$1, $$2.a(f, dko.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dko.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dnr.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ars.vj, art.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable blv $$0, ctp $$1, hx $$2, int $$3) {
      for (ic $$4 : ic.values()) {
         hx $$5 = $$2.a($$4);
         djh $$6 = $$1.a_($$5);
         if ($$6.a(ash.bO)) {
            $$1.a(doa.b($$3), $$5, dnr.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, ars.I, art.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if (h($$0) == dko.b) {
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
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dib $$4) {
         return h($$0) == dko.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bjd.a(5));
      }
   }
}
