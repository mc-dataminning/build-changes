import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcr extends cvl implements dcz {
   public static final MapCodec<dcr> c = b(dcr::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final djn<djw> f = djf.bo;
   public static final djp g = djf.aT;
   public static final djg h = djf.C;
   protected static final elu i = cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dbh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dcr> a() {
      return c;
   }

   public dcr(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, djw.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      hv $$1 = $$0.a();
      edz $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eea.c));
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(h) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (h($$0) != djw.b) {
         if (h($$0) == djw.c) {
            $$1.a($$2, $$0.a(f, djw.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, arc.vk, ard.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != blj.bj && $$0.c_($$1) instanceof dhj $$5 && $$0 instanceof amp $$6 && $$5.gh().a($$6, $$1, dmz.P, dmz.a.a($$2))) {
         $$5.g().b($$6, dmz.P, dmz.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == djw.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(csy $$0, hv $$1, dip $$2) {
      cvz $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return !$$0.B ? a($$2, dgf.I, ($$0x, $$1x, $$2x, $$3) -> dni.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return i;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 == ia.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static djw h(dip $$0) {
      return $$0.c(f);
   }

   public static boolean n(dip $$0) {
      return h($$0) == djw.a;
   }

   public static void a(csy $$0, hv $$1, dip $$2) {
      $$0.a($$1, $$2.a(f, djw.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable blf $$0, csy $$1, hv $$2, dip $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, djw.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dmz.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.vj, ard.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable blf $$0, csy $$1, hv $$2, int $$3) {
      for (ia $$4 : ia.values()) {
         hv $$5 = $$2.a($$4);
         dip $$6 = $$1.a_($$5);
         if ($$6.a(arr.bO)) {
            $$1.a(dni.b($$3), $$5, dmz.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, arc.I, ard.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if (h($$0) == djw.b) {
         ia $$4 = ia.b($$3);
         if ($$4 != ia.b && $$4 != ia.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jo.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      if ($$1.c_($$2) instanceof dhj $$4) {
         return h($$0) == djw.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bin.a(5));
      }
   }
}
