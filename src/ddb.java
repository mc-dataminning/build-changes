import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddb extends cvv implements ddj {
   public static final MapCodec<ddb> c = b(ddb::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final djy<dkh> f = djq.bo;
   public static final dka g = djq.aT;
   public static final djr h = djq.C;
   protected static final emf i = cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dbr.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends ddb> a() {
      return c;
   }

   public ddb(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dkh.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      hx $$1 = $$0.a();
      eek $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eel.c));
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(h) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (h($$0) != dkh.b) {
         if (h($$0) == dkh.c) {
            $$1.a($$2, $$0.a(f, dkh.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, arm.vk, arn.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != blt.bj && $$0.c_($$1) instanceof dhu $$5 && $$0 instanceof amz $$6 && $$5.gh().a($$6, $$1, dnk.P, dnk.a.a($$2))) {
         $$5.g().b($$6, dnk.P, dnk.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dkh.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cti $$0, hx $$1, dja $$2) {
      cwj $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return !$$0.B ? a($$2, dgq.I, ($$0x, $$1x, $$2x, $$3) -> dnt.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return i;
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dkh h(dja $$0) {
      return $$0.c(f);
   }

   public static boolean n(dja $$0) {
      return h($$0) == dkh.a;
   }

   public static void a(cti $$0, hx $$1, dja $$2) {
      $$0.a($$1, $$2.a(f, dkh.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable blp $$0, cti $$1, hx $$2, dja $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dkh.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dnk.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arm.vj, arn.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable blp $$0, cti $$1, hx $$2, int $$3) {
      for (ic $$4 : ic.values()) {
         hx $$5 = $$2.a($$4);
         dja $$6 = $$1.a_($$5);
         if ($$6.a(asb.bO)) {
            $$1.a(dnt.b($$3), $$5, dnk.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, arm.I, arn.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if (h($$0) == dkh.b) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhu $$4) {
         return h($$0) == dkh.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bix.a(5));
      }
   }
}
