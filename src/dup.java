import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dup extends dna implements duz {
   public static final MapCodec<dup> c = b(dup::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final eco<ecx> f = ecg.br;
   public static final ecq g = ecg.aW;
   public static final ech h = ecg.I;
   private static final fgw a = dno.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dte.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dup> a() {
      return c;
   }

   public dup(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, ecx.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      iw $$1 = $$0.a();
      eya $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == eyb.c));
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(h) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (o($$0) != ecx.b) {
         if (o($$0) == ecx.c) {
            $$1.a($$2, $$0.b(f, ecx.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awy.wX, awz.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      if (!$$0.A_() && q($$2) && $$3.an() != bxn.bH && $$0.c_($$1) instanceof dzz $$5 && $$0 instanceof asb $$6 && $$5.gu().a($$6, $$1, egq.P, egq.a.a($$2))) {
         $$5.f().b($$6, egq.P, egq.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (o($$0) == ecx.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dkj $$0, iw $$1, ebq $$2) {
      dno $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return !$$0.C ? a($$2, dyq.J, ($$0x, $$1x, $$2x, $$3) -> egz.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ecx o(ebq $$0) {
      return $$0.c(f);
   }

   public static boolean q(ebq $$0) {
      return o($$0) == ecx.a;
   }

   public static void a(dkj $$0, iw $$1, ebq $$2) {
      $$0.a($$1, $$2.b(f, ecx.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bxe $$0, dkj $$1, iw $$2, ebq $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ecx.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, egq.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.wW, awz.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bxe $$0, dkj $$1, iw $$2, int $$3) {
      for (jc $$4 : jc.values()) {
         iw $$5 = $$2.a($$4);
         ebq $$6 = $$1.a_($$5);
         if ($$6.a(axn.bZ)) {
            $$1.a(egz.b($$3), $$5, egq.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awy.I, awz.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if (o($$0) == ecx.b) {
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
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      if ($$1.c_($$2) instanceof dzz $$4) {
         return o($$0) == ecx.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bue.a(5));
      }
   }
}
