import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class dyp extends dyc {
   private static final int b = 2;
   private static final int c = 13;
   private static final float d = -0.0375F;
   private static final int e = 16;
   private static final int f = 42;
   private static final int g = 8;
   private static final dnc[] h = new dnc[]{dne.iB, dne.iC, dne.iK, dne.iD};
   public int a;
   private float i;
   private boolean j;
   private boolean k;
   private final List<iv> l = Lists.newArrayList();
   @Nullable
   private bxu m;
   @Nullable
   private UUID q;
   private long r;

   public dyp(iv $$0, ebe $$1) {
      super(dye.A, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.q = $$0.<UUID>a("Target", jz.a).orElse(null);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (this.m != null) {
         $$0.a("Target", jz.a, this.m.cG());
      }
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dyp $$3) {
      $$3.a++;
      long $$4 = $$0.ae();
      List<iv> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         $$3.j = a($$0, $$1, $$5);
         a($$3, $$5);
      }

      a($$0, $$1, $$3);
      a($$0, $$1, $$5, $$3.m, $$3.a);
      if ($$3.c()) {
         $$3.i++;
      }
   }

   public static void b(djx $$0, iv $$1, ebe $$2, dyp $$3) {
      $$3.a++;
      long $$4 = $$0.ae();
      List<iv> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         boolean $$6 = a($$0, $$1, $$5);
         if ($$6 != $$3.j) {
            awo $$7 = $$6 ? awp.fA : awp.fE;
            $$0.a(null, $$1, $$7, awq.e, 1.0F, 1.0F);
         }

         $$3.j = $$6;
         a($$3, $$5);
         if ($$6) {
            b($$0, $$1, $$5);
            a($$0, $$1, $$2, $$5, $$3);
         }
      }

      if ($$3.c()) {
         if ($$4 % 80L == 0L) {
            $$0.a(null, $$1, awp.fB, awq.e, 1.0F, 1.0F);
         }

         if ($$4 > $$3.r) {
            $$3.r = $$4 + 60L + (long)$$0.G_().a(40);
            $$0.a(null, $$1, awp.fC, awq.e, 1.0F, 1.0F);
         }
      }
   }

   private static void a(dyp $$0, List<iv> $$1) {
      $$0.a($$1.size() >= 42);
   }

   private static boolean a(djx $$0, iv $$1, List<iv> $$2) {
      $$2.clear();

      for (int $$3 = -1; $$3 <= 1; $$3++) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               iv $$6 = $$1.b($$3, $$4, $$5);
               if (!$$0.A($$6)) {
                  return false;
               }
            }
         }
      }

      for (int $$7 = -2; $$7 <= 2; $$7++) {
         for (int $$8 = -2; $$8 <= 2; $$8++) {
            for (int $$9 = -2; $$9 <= 2; $$9++) {
               int $$10 = Math.abs($$7);
               int $$11 = Math.abs($$8);
               int $$12 = Math.abs($$9);
               if (($$10 > 1 || $$11 > 1 || $$12 > 1)
                  && ($$7 == 0 && ($$11 == 2 || $$12 == 2) || $$8 == 0 && ($$10 == 2 || $$12 == 2) || $$9 == 0 && ($$10 == 2 || $$11 == 2))) {
                  iv $$13 = $$1.b($$7, $$8, $$9);
                  ebe $$14 = $$0.a_($$13);

                  for (dnc $$15 : h) {
                     if ($$14.a($$15)) {
                        $$2.add($$13);
                     }
                  }
               }
            }
         }
      }

      return $$2.size() >= 16;
   }

   private static void b(djx $$0, iv $$1, List<iv> $$2) {
      int $$3 = $$2.size();
      int $$4 = $$3 / 7 * 16;
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      ffl $$8 = new ffl((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1))
         .g((double)$$4)
         .b(0.0, (double)$$0.L_(), 0.0);
      List<crx> $$9 = $$0.a(crx.class, $$8);
      if (!$$9.isEmpty()) {
         for (crx $$10 : $$9) {
            if ($$1.a($$10.dv(), (double)$$4) && $$10.bk()) {
               $$10.a(new bvx(bvz.C, 260, 0, true, true));
            }
         }
      }
   }

   private static void a(djx $$0, iv $$1, ebe $$2, List<iv> $$3, dyp $$4) {
      bxu $$5 = $$4.m;
      int $$6 = $$3.size();
      if ($$6 < 42) {
         $$4.m = null;
      } else if ($$4.m == null && $$4.q != null) {
         $$4.m = a($$0, $$1, $$4.q);
         $$4.q = null;
      } else if ($$4.m == null) {
         List<bxu> $$7 = $$0.a(bxu.class, a($$1), $$0x -> $$0x instanceof cor && $$0x.bk());
         if (!$$7.isEmpty()) {
            $$4.m = $$7.get($$0.A.a($$7.size()));
         }
      } else if (!$$4.m.bJ() || !$$1.a($$4.m.dv(), 8.0)) {
         $$4.m = null;
      }

      if ($$4.m != null) {
         $$0.a(null, $$4.m.dA(), $$4.m.dC(), $$4.m.dG(), awp.fD, awq.e, 1.0F, 1.0F);
         $$4.m.a($$0.al().q(), 4.0F);
      }

      if ($$5 != $$4.m) {
         $$0.a($$1, $$2, $$2, 2);
      }
   }

   private static void a(djx $$0, iv $$1, dyp $$2) {
      if ($$2.q == null) {
         $$2.m = null;
      } else if ($$2.m == null || !$$2.m.cG().equals($$2.q)) {
         $$2.m = a($$0, $$1, $$2.q);
         if ($$2.m == null) {
            $$2.q = null;
         }
      }
   }

   private static ffl a(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      return new ffl((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 1), (double)($$2 + 1), (double)($$3 + 1)).g(8.0);
   }

   @Nullable
   private static bxu a(djx $$0, iv $$1, UUID $$2) {
      List<bxu> $$3 = $$0.a(bxu.class, a($$1), $$1x -> $$1x.cG().equals($$2));
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   private static void a(djx $$0, iv $$1, List<iv> $$2, @Nullable bwt $$3, int $$4) {
      azx $$5 = $$0.A;
      double $$6 = (double)(azo.a((float)($$4 + 35) * 0.1F) / 2.0F + 0.5F);
      $$6 = ($$6 * $$6 + $$6) * 0.3F;
      ffq $$7 = new ffq((double)$$1.u() + 0.5, (double)$$1.v() + 1.5 + $$6, (double)$$1.w() + 0.5);

      for (iv $$8 : $$2) {
         if ($$5.a(50) == 0) {
            iv $$9 = $$8.b($$1);
            float $$10 = -0.5F + $$5.i() + (float)$$9.u();
            float $$11 = -2.0F + $$5.i() + (float)$$9.v();
            float $$12 = -0.5F + $$5.i() + (float)$$9.w();
            $$0.a(ly.au, $$7.d, $$7.e, $$7.f, (double)$$10, (double)$$11, (double)$$12);
         }
      }

      if ($$3 != null) {
         ffq $$13 = new ffq($$3.dA(), $$3.dE(), $$3.dG());
         float $$14 = (-0.5F + $$5.i()) * (3.0F + $$3.dq());
         float $$15 = -1.0F + $$5.i() * $$3.dr();
         float $$16 = (-0.5F + $$5.i()) * (3.0F + $$3.dq());
         ffq $$17 = new ffq((double)$$14, (double)$$15, (double)$$16);
         $$0.a(ly.au, $$13.d, $$13.e, $$13.f, $$17.d, $$17.e, $$17.f);
      }
   }

   public boolean c() {
      return this.j;
   }

   public boolean d() {
      return this.k;
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   public float a(float $$0) {
      return (this.i + $$0) * -0.0375F;
   }
}
