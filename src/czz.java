import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class czz extends czn {
   private static final int b = 2;
   private static final int c = 13;
   private static final float d = -0.0375F;
   private static final int e = 16;
   private static final int f = 42;
   private static final int g = 8;
   private static final cpn[] h = new cpn[]{cpo.hZ, cpo.ia, cpo.ii, cpo.ib};
   public int a;
   private float i;
   private boolean j;
   private boolean k;
   private final List<gu> l = Lists.newArrayList();
   @Nullable
   private bfz m;
   @Nullable
   private UUID n;
   private long r;

   public czz(gu $$0, dcb $$1) {
      super(czp.z, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Target")) {
         this.n = $$0.a("Target");
      } else {
         this.n = null;
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (this.m != null) {
         $$0.a("Target", this.m.ct());
      }
   }

   public uz c() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czz $$3) {
      $$3.a++;
      long $$4 = $$0.V();
      List<gu> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         $$3.j = a($$0, $$1, $$5);
         a($$3, $$5);
      }

      a($$0, $$1, $$3);
      a($$0, $$1, $$5, $$3.m, $$3.a);
      if ($$3.d()) {
         $$3.i++;
      }
   }

   public static void b(cmm $$0, gu $$1, dcb $$2, czz $$3) {
      $$3.a++;
      long $$4 = $$0.V();
      List<gu> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         boolean $$6 = a($$0, $$1, $$5);
         if ($$6 != $$3.j) {
            amg $$7 = $$6 ? amh.eK : amh.eO;
            $$0.a(null, $$1, $$7, ami.e, 1.0F, 1.0F);
         }

         $$3.j = $$6;
         a($$3, $$5);
         if ($$6) {
            b($$0, $$1, $$5);
            a($$0, $$1, $$2, $$5, $$3);
         }
      }

      if ($$3.d()) {
         if ($$4 % 80L == 0L) {
            $$0.a(null, $$1, amh.eL, ami.e, 1.0F, 1.0F);
         }

         if ($$4 > $$3.r) {
            $$3.r = $$4 + 60L + (long)$$0.y_().a(40);
            $$0.a(null, $$1, amh.eM, ami.e, 1.0F, 1.0F);
         }
      }
   }

   private static void a(czz $$0, List<gu> $$1) {
      $$0.a($$1.size() >= 42);
   }

   private static boolean a(cmm $$0, gu $$1, List<gu> $$2) {
      $$2.clear();

      for (int $$3 = -1; $$3 <= 1; $$3++) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               gu $$6 = $$1.b($$3, $$4, $$5);
               if (!$$0.y($$6)) {
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
                  gu $$13 = $$1.b($$7, $$8, $$9);
                  dcb $$14 = $$0.a_($$13);

                  for (cpn $$15 : h) {
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

   private static void b(cmm $$0, gu $$1, List<gu> $$2) {
      int $$3 = $$2.size();
      int $$4 = $$3 / 7 * 16;
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      eed $$8 = new eed((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1))
         .g((double)$$4)
         .b(0.0, (double)$$0.D_(), 0.0);
      List<byo> $$9 = $$0.a(byo.class, $$8);
      if (!$$9.isEmpty()) {
         for (byo $$10 : $$9) {
            if ($$1.a($$10.di(), (double)$$4) && $$10.aW()) {
               $$10.b(new bfa(bfc.C, 260, 0, true, true));
            }
         }
      }
   }

   private static void a(cmm $$0, gu $$1, dcb $$2, List<gu> $$3, czz $$4) {
      bfz $$5 = $$4.m;
      int $$6 = $$3.size();
      if ($$6 < 42) {
         $$4.m = null;
      } else if ($$4.m == null && $$4.n != null) {
         $$4.m = a($$0, $$1, $$4.n);
         $$4.n = null;
      } else if ($$4.m == null) {
         List<bfz> $$7 = $$0.a(bfz.class, a($$1), $$0x -> $$0x instanceof bvu && $$0x.aW());
         if (!$$7.isEmpty()) {
            $$4.m = $$7.get($$0.z.a($$7.size()));
         }
      } else if (!$$4.m.bs() || !$$1.a($$4.m.di(), 8.0)) {
         $$4.m = null;
      }

      if ($$4.m != null) {
         $$0.a(null, $$4.m.dn(), $$4.m.dp(), $$4.m.dt(), amh.eN, ami.e, 1.0F, 1.0F);
         $$4.m.a($$0.ag().o(), 4.0F);
      }

      if ($$5 != $$4.m) {
         $$0.a($$1, $$2, $$2, 2);
      }
   }

   private static void a(cmm $$0, gu $$1, czz $$2) {
      if ($$2.n == null) {
         $$2.m = null;
      } else if ($$2.m == null || !$$2.m.ct().equals($$2.n)) {
         $$2.m = a($$0, $$1, $$2.n);
         if ($$2.m == null) {
            $$2.n = null;
         }
      }
   }

   private static eed a(gu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      return new eed((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 1), (double)($$2 + 1), (double)($$3 + 1)).g(8.0);
   }

   @Nullable
   private static bfz a(cmm $$0, gu $$1, UUID $$2) {
      List<bfz> $$3 = $$0.a(bfz.class, a($$1), $$1x -> $$1x.ct().equals($$2));
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   private static void a(cmm $$0, gu $$1, List<gu> $$2, @Nullable bfj $$3, int $$4) {
      apf $$5 = $$0.z;
      double $$6 = (double)(apa.a((float)($$4 + 35) * 0.1F) / 2.0F + 0.5F);
      $$6 = ($$6 * $$6 + $$6) * 0.3F;
      eei $$7 = new eei((double)$$1.u() + 0.5, (double)$$1.v() + 1.5 + $$6, (double)$$1.w() + 0.5);

      for (gu $$8 : $$2) {
         if ($$5.a(50) == 0) {
            gu $$9 = $$8.b($$1);
            float $$10 = -0.5F + $$5.i() + (float)$$9.u();
            float $$11 = -2.0F + $$5.i() + (float)$$9.v();
            float $$12 = -0.5F + $$5.i() + (float)$$9.w();
            $$0.a(iv.al, $$7.c, $$7.d, $$7.e, (double)$$10, (double)$$11, (double)$$12);
         }
      }

      if ($$3 != null) {
         eei $$13 = new eei($$3.dn(), $$3.dr(), $$3.dt());
         float $$14 = (-0.5F + $$5.i()) * (3.0F + $$3.dd());
         float $$15 = -1.0F + $$5.i() * $$3.de();
         float $$16 = (-0.5F + $$5.i()) * (3.0F + $$3.dd());
         eei $$17 = new eei((double)$$14, (double)$$15, (double)$$16);
         $$0.a(iv.al, $$13.c, $$13.d, $$13.e, $$17.c, $$17.d, $$17.e);
      }
   }

   public boolean d() {
      return this.j;
   }

   public boolean f() {
      return this.k;
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   public float a(float $$0) {
      return (this.i + $$0) * -0.0375F;
   }
}
