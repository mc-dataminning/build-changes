import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dud extends dmo implements dun {
   public static final MapCodec<dud> c = b(dud::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final ecc<ecl> f = ebu.br;
   public static final ece g = ebu.aW;
   public static final ebv h = ebu.I;
   private static final fgk a = dnc.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dss.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dud> a() {
      return c;
   }

   public dud(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, ecl.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      iv $$1 = $$0.a();
      exo $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == exp.c));
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(h) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (o($$0) != ecl.b) {
         if (o($$0) == ecl.c) {
            $$1.a($$2, $$0.b(f, ecl.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awp.wX, awq.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      if (!$$0.A_() && q($$2) && $$3.an() != bxc.bH && $$0.c_($$1) instanceof dzn $$5 && $$0 instanceof ars $$6 && $$5.gu().a($$6, $$1, ege.P, ege.a.a($$2))) {
         $$5.f().b($$6, ege.P, ege.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (o($$0) == ecl.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(djx $$0, iv $$1, ebe $$2) {
      dnc $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return !$$0.C ? a($$2, dye.J, ($$0x, $$1x, $$2x, $$3) -> egn.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ecl o(ebe $$0) {
      return $$0.c(f);
   }

   public static boolean q(ebe $$0) {
      return o($$0) == ecl.a;
   }

   public static void a(djx $$0, iv $$1, ebe $$2) {
      $$0.a($$1, $$2.b(f, ecl.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwt $$0, djx $$1, iv $$2, ebe $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ecl.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ege.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.wW, awq.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwt $$0, djx $$1, iv $$2, int $$3) {
      for (jb $$4 : jb.values()) {
         iv $$5 = $$2.a($$4);
         ebe $$6 = $$1.a_($$5);
         if ($$6.a(axe.bZ)) {
            $$1.a(egn.b($$3), $$5, ege.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awp.I, awq.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if (o($$0) == ecl.b) {
         jb $$4 = jb.b($$3);
         if ($$4 != jb.b && $$4 != jb.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ls.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dzn $$4) {
         return o($$0) == ecl.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btt.a(5));
      }
   }
}
