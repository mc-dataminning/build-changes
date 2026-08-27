import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends cwb implements ddp {
   public static final MapCodec<ddh> c = b(ddh::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dke<dkn> f = djw.bo;
   public static final dkg g = djw.aT;
   public static final djx h = djw.C;
   protected static final eml i = cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dbx.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends ddh> a() {
      return c;
   }

   public ddh(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dkn.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      hx $$1 = $$0.a();
      eeq $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eer.c));
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(h) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (h($$0) != dkn.b) {
         if (h($$0) == dkn.c) {
            $$1.a($$2, $$0.a(f, dkn.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, arr.vk, ars.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bly.bj && $$0.c_($$1) instanceof dia $$5 && $$0 instanceof and $$6 && $$5.gh().a($$6, $$1, dnq.P, dnq.a.a($$2))) {
         $$5.g().b($$6, dnq.P, dnq.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dkn.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cto $$0, hx $$1, djg $$2) {
      cwp $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dia($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return !$$0.B ? a($$2, dgw.I, ($$0x, $$1x, $$2x, $$3) -> dnz.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return i;
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dkn h(djg $$0) {
      return $$0.c(f);
   }

   public static boolean n(djg $$0) {
      return h($$0) == dkn.a;
   }

   public static void a(cto $$0, hx $$1, djg $$2) {
      $$0.a($$1, $$2.a(f, dkn.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable blu $$0, cto $$1, hx $$2, djg $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dkn.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dnq.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arr.vj, ars.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable blu $$0, cto $$1, hx $$2, int $$3) {
      for (ic $$4 : ic.values()) {
         hx $$5 = $$2.a($$4);
         djg $$6 = $$1.a_($$5);
         if ($$6.a(asg.bO)) {
            $$1.a(dnz.b($$3), $$5, dnq.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, arr.I, ars.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if (h($$0) == dkn.b) {
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
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dia $$4) {
         return h($$0) == dkn.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bjc.a(5));
      }
   }
}
