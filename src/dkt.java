import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkt extends ddm implements dlb {
   public static final MapCodec<dkt> c = b(dkt::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dsb<dsk> f = drt.bo;
   public static final dsd g = drt.aT;
   public static final dru h = drt.C;
   protected static final evf i = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = djj.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dkt> a() {
      return c;
   }

   public dkt(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dsk.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      io $$1 = $$0.a();
      emw $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == emx.c));
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(h) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (m($$0) != dsk.b) {
         if (m($$0) == dsk.c) {
            $$1.a($$2, $$0.a(f, dsk.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avi.we, avj.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsc.bm && $$0.c_($$1) instanceof dpp $$5 && $$0 instanceof aqn $$6 && $$5.gs().a($$6, $$1, dvw.P, dvw.a.a($$2))) {
         $$5.f().b($$6, dvw.P, dvw.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dsk.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(daz $$0, io $$1, drd $$2) {
      dea $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dpp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return !$$0.B ? a($$2, dok.I, ($$0x, $$1x, $$2x, $$3) -> dwf.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return i;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 == it.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dsk m(drd $$0) {
      return $$0.c(f);
   }

   public static boolean n(drd $$0) {
      return m($$0) == dsk.a;
   }

   public static void a(daz $$0, io $$1, drd $$2) {
      $$0.a($$1, $$2.a(f, dsk.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable brw $$0, daz $$1, io $$2, drd $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dsk.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dvw.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avi.wd, avj.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable brw $$0, daz $$1, io $$2, int $$3) {
      for (it $$4 : it.values()) {
         io $$5 = $$2.a($$4);
         drd $$6 = $$1.a_($$5);
         if ($$6.a(avx.bV)) {
            $$1.a(dwf.b($$3), $$5, dvw.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avi.I, avj.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if (m($$0) == dsk.b) {
         it $$4 = it.b($$3);
         if ($$4 != it.b && $$4 != it.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(kr.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpp $$4) {
         return m($$0) == dsk.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, boy.a(5));
      }
   }
}
