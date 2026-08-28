import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duf extends dmq implements dup {
   public static final MapCodec<duf> c = b(duf::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final ece<ecn> f = ebw.br;
   public static final ecg g = ebw.aW;
   public static final ebx h = ebw.I;
   private static final fgm a = dne.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dsu.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends duf> a() {
      return c;
   }

   public duf(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, ecn.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      iw $$1 = $$0.a();
      exq $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == exr.c));
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(h) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (o($$0) != ecn.b) {
         if (o($$0) == ecn.c) {
            $$1.a($$2, $$0.b(f, ecn.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awr.wX, aws.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      if (!$$0.A_() && q($$2) && $$3.an() != bxe.bH && $$0.c_($$1) instanceof dzp $$5 && $$0 instanceof aru $$6 && $$5.gu().a($$6, $$1, egg.P, egg.a.a($$2))) {
         $$5.f().b($$6, egg.P, egg.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (o($$0) == ecn.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(djz $$0, iw $$1, ebg $$2) {
      dne $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return !$$0.C ? a($$2, dyg.J, ($$0x, $$1x, $$2x, $$3) -> egp.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ecn o(ebg $$0) {
      return $$0.c(f);
   }

   public static boolean q(ebg $$0) {
      return o($$0) == ecn.a;
   }

   public static void a(djz $$0, iw $$1, ebg $$2) {
      $$0.a($$1, $$2.b(f, ecn.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwv $$0, djz $$1, iw $$2, ebg $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ecn.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, egg.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awr.wW, aws.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwv $$0, djz $$1, iw $$2, int $$3) {
      for (jc $$4 : jc.values()) {
         iw $$5 = $$2.a($$4);
         ebg $$6 = $$1.a_($$5);
         if ($$6.a(axg.bZ)) {
            $$1.a(egp.b($$3), $$5, egg.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awr.I, aws.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if (o($$0) == ecn.b) {
         jc $$4 = jc.b($$3);
         if ($$4 != jc.b && $$4 != jc.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lt.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      if ($$1.c_($$2) instanceof dzp $$4) {
         return o($$0) == ecn.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btv.a(5));
      }
   }
}
