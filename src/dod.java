import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dgv implements dol {
   public static final MapCodec<dod> c = b(dod::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dvm<dvv> f = dve.bo;
   public static final dvo g = dve.aT;
   public static final dvf h = dve.C;
   protected static final ezm i = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dms.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dod> a() {
      return c;
   }

   public dod(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dvv.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      je $$1 = $$0.a();
      eqp $$2 = $$0.q().b_($$1);
      return this.o().b(h, Boolean.valueOf($$2.a() == eqq.c));
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(h) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (o($$0) != dvv.b) {
         if (o($$0) == dvv.c) {
            $$1.a($$2, $$0.b(f, dvv.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awe.wi, awf.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      if (!$$0.w_() && q($$2) && $$3.ao() != btv.bm && $$0.c_($$1) instanceof dtb $$5 && $$0 instanceof arh $$6 && $$5.gs().a($$6, $$1, dzl.P, dzl.a.a($$2))) {
         $$5.f().b($$6, dzl.P, dzl.a.a($$3), $$3.dq());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dvv.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(deg $$0, je $$1, duo $$2) {
      dhj $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dtb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return !$$0.B ? a($$2, dru.I, ($$0x, $$1x, $$2x, $$3) -> dzu.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return i;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dvv o(duo $$0) {
      return $$0.c(f);
   }

   public static boolean q(duo $$0) {
      return o($$0) == dvv.a;
   }

   public static void a(deg $$0, je $$1, duo $$2) {
      $$0.a($$1, $$2.b(f, dvv.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bto $$0, deg $$1, je $$2, duo $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dvv.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dzl.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.wh, awf.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bto $$0, deg $$1, je $$2, int $$3) {
      for (jj $$4 : jj.values()) {
         je $$5 = $$2.a($$4);
         duo $$6 = $$1.a_($$5);
         if ($$6.a(awt.bW)) {
            $$1.a(dzu.b($$3), $$5, dzl.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awe.I, awf.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if (o($$0) == dvv.b) {
         jj $$4 = jj.b($$3);
         if ($$4 != jj.b && $$4 != jj.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lh.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      if ($$1.c_($$2) instanceof dtb $$4) {
         return o($$0) == dvv.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqr.a(5));
      }
   }
}
