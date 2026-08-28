import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends dgh implements dnx {
   public static final MapCodec<dnp> c = b(dnp::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final duy<dvh> f = duq.bo;
   public static final dva g = duq.aT;
   public static final dur h = duq.C;
   protected static final eyx i = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dme.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dnp> a() {
      return c;
   }

   public dnp(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(f, dvh.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      je $$1 = $$0.a();
      eqb $$2 = $$0.q().b_($$1);
      return this.o().b(h, Boolean.valueOf($$2.a() == eqc.c));
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(h) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (o($$0) != dvh.b) {
         if (o($$0) == dvh.c) {
            $$1.a($$2, $$0.b(f, dvh.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awd.wi, awe.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
      if (!$$0.w_() && q($$2) && $$3.ao() != btq.bm && $$0.c_($$1) instanceof dsn $$5 && $$0 instanceof arg $$6 && $$5.gr().a($$6, $$1, dyx.P, dyx.a.a($$2))) {
         $$5.f().b($$6, dyx.P, dyx.a.a($$3), $$3.dq());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dvh.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dds $$0, je $$1, dua $$2) {
      dgv $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dsn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return !$$0.B ? a($$2, drg.I, ($$0x, $$1x, $$2x, $$3) -> dzg.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return i;
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dvh o(dua $$0) {
      return $$0.c(f);
   }

   public static boolean q(dua $$0) {
      return o($$0) == dvh.a;
   }

   public static void a(dds $$0, je $$1, dua $$2) {
      $$0.a($$1, $$2.b(f, dvh.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable btj $$0, dds $$1, je $$2, dua $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dvh.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dyx.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awd.wh, awe.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable btj $$0, dds $$1, je $$2, int $$3) {
      for (jj $$4 : jj.values()) {
         je $$5 = $$2.a($$4);
         dua $$6 = $$1.a_($$5);
         if ($$6.a(aws.bW)) {
            $$1.a(dzg.b($$3), $$5, dyx.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awd.I, awe.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if (o($$0) == dvh.b) {
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
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      if ($$1.c_($$2) instanceof dsn $$4) {
         return o($$0) == dvh.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqm.a(5));
      }
   }
}
