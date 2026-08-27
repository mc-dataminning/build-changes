import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgs extends czm implements dha {
   public static final MapCodec<dgs> c = b(dgs::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dnx<dog> f = dnp.bo;
   public static final dnz g = dnp.aT;
   public static final dnq h = dnp.C;
   protected static final eqk i = daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dfi.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dgs> a() {
      return c;
   }

   public dgs(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dog.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ib $$1 = $$0.a();
      ein $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eio.c));
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(h) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (m($$0) != dog.b) {
         if (m($$0) == dog.c) {
            $$1.a($$2, $$0.a(f, dog.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aty.vD, atz.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bpc.bl && $$0.c_($$1) instanceof dlm $$5 && $$0 instanceof apf $$6 && $$5.gq().a($$6, $$1, drn.P, drn.a.a($$2))) {
         $$5.f().b($$6, drn.P, drn.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dog.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cwz $$0, ib $$1, dmz $$2) {
      daa $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return !$$0.B ? a($$2, dki.I, ($$0x, $$1x, $$2x, $$3) -> drw.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return i;
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dog m(dmz $$0) {
      return $$0.c(f);
   }

   public static boolean n(dmz $$0) {
      return m($$0) == dog.a;
   }

   public static void a(cwz $$0, ib $$1, dmz $$2) {
      $$0.a($$1, $$2.a(f, dog.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dog.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, drn.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.vC, atz.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bow $$0, cwz $$1, ib $$2, int $$3) {
      for (ih $$4 : ih.values()) {
         ib $$5 = $$2.a($$4);
         dmz $$6 = $$1.a_($$5);
         if ($$6.a(aun.bP)) {
            $$1.a(drw.b($$3), $$5, drn.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aty.I, atz.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if (m($$0) == dog.b) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b && $$4 != ih.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jv.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlm $$4) {
         return m($$0) == dog.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bme.a(5));
      }
   }
}
