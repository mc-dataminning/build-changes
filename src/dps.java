import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class dps extends dpg {
   private static final int b = 2;
   private static final int c = 13;
   private static final float d = -0.0375F;
   private static final int e = 16;
   private static final int f = 42;
   private static final int g = 8;
   private static final dey[] h = new dey[]{dfa.hZ, dfa.ia, dfa.ii, dfa.ib};
   public int a;
   private float i;
   private boolean j;
   private boolean k;
   private final List<iz> l = Lists.newArrayList();
   @Nullable
   private bto m;
   @Nullable
   private UUID q;
   private long r;

   public dps(iz $$0, dsb $$1) {
      super(dpi.z, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Target")) {
         this.q = $$0.a("Target");
      } else {
         this.q = null;
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (this.m != null) {
         $$0.a("Target", this.m.cz());
      }
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dps $$3) {
      $$3.a++;
      long $$4 = $$0.Z();
      List<iz> $$5 = $$3.l;
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

   public static void b(dbx $$0, iz $$1, dsb $$2, dps $$3) {
      $$3.a++;
      long $$4 = $$0.Z();
      List<iz> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         boolean $$6 = a($$0, $$1, $$5);
         if ($$6 != $$3.j) {
            avy $$7 = $$6 ? avz.fw : avz.fA;
            $$0.a(null, $$1, $$7, awa.e, 1.0F, 1.0F);
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
            $$0.a(null, $$1, avz.fx, awa.e, 1.0F, 1.0F);
         }

         if ($$4 > $$3.r) {
            $$3.r = $$4 + 60L + (long)$$0.E_().a(40);
            $$0.a(null, $$1, avz.fy, awa.e, 1.0F, 1.0F);
         }
      }
   }

   private static void a(dps $$0, List<iz> $$1) {
      $$0.a($$1.size() >= 42);
   }

   private static boolean a(dbx $$0, iz $$1, List<iz> $$2) {
      $$2.clear();

      for (int $$3 = -1; $$3 <= 1; $$3++) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               iz $$6 = $$1.b($$3, $$4, $$5);
               if (!$$0.z($$6)) {
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
                  iz $$13 = $$1.b($$7, $$8, $$9);
                  dsb $$14 = $$0.a_($$13);

                  for (dey $$15 : h) {
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

   private static void b(dbx $$0, iz $$1, List<iz> $$2) {
      int $$3 = $$2.size();
      int $$4 = $$3 / 7 * 16;
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      evl $$8 = new evl((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1))
         .g((double)$$4)
         .b(0.0, (double)$$0.J_(), 0.0);
      List<cmw> $$9 = $$0.a(cmw.class, $$8);
      if (!$$9.isEmpty()) {
         for (cmw $$10 : $$9) {
            if ($$1.a($$10.dp(), (double)$$4) && $$10.bf()) {
               $$10.b(new bsb(bsd.C, 260, 0, true, true));
            }
         }
      }
   }

   private static void a(dbx $$0, iz $$1, dsb $$2, List<iz> $$3, dps $$4) {
      bto $$5 = $$4.m;
      int $$6 = $$3.size();
      if ($$6 < 42) {
         $$4.m = null;
      } else if ($$4.m == null && $$4.q != null) {
         $$4.m = a($$0, $$1, $$4.q);
         $$4.q = null;
      } else if ($$4.m == null) {
         List<bto> $$7 = $$0.a(bto.class, a($$1), $$0x -> $$0x instanceof cju && $$0x.bf());
         if (!$$7.isEmpty()) {
            $$4.m = $$7.get($$0.z.a($$7.size()));
         }
      } else if (!$$4.m.bD() || !$$1.a($$4.m.dp(), 8.0)) {
         $$4.m = null;
      }

      if ($$4.m != null) {
         $$0.a(null, $$4.m.du(), $$4.m.dw(), $$4.m.dA(), avz.fz, awa.e, 1.0F, 1.0F);
         $$4.m.a($$0.aj().o(), 4.0F);
      }

      if ($$5 != $$4.m) {
         $$0.a($$1, $$2, $$2, 2);
      }
   }

   private static void a(dbx $$0, iz $$1, dps $$2) {
      if ($$2.q == null) {
         $$2.m = null;
      } else if ($$2.m == null || !$$2.m.cz().equals($$2.q)) {
         $$2.m = a($$0, $$1, $$2.q);
         if ($$2.m == null) {
            $$2.q = null;
         }
      }
   }

   private static evl a(iz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      return new evl((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 1), (double)($$2 + 1), (double)($$3 + 1)).g(8.0);
   }

   @Nullable
   private static bto a(dbx $$0, iz $$1, UUID $$2) {
      List<bto> $$3 = $$0.a(bto.class, a($$1), $$1x -> $$1x.cz().equals($$2));
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   private static void a(dbx $$0, iz $$1, List<iz> $$2, @Nullable bst $$3, int $$4) {
      azg $$5 = $$0.z;
      double $$6 = (double)(ayy.a((float)($$4 + 35) * 0.1F) / 2.0F + 0.5F);
      $$6 = ($$6 * $$6 + $$6) * 0.3F;
      evq $$7 = new evq((double)$$1.u() + 0.5, (double)$$1.v() + 1.5 + $$6, (double)$$1.w() + 0.5);

      for (iz $$8 : $$2) {
         if ($$5.a(50) == 0) {
            iz $$9 = $$8.b($$1);
            float $$10 = -0.5F + $$5.i() + (float)$$9.u();
            float $$11 = -2.0F + $$5.i() + (float)$$9.v();
            float $$12 = -0.5F + $$5.i() + (float)$$9.w();
            $$0.a(li.ar, $$7.c, $$7.d, $$7.e, (double)$$10, (double)$$11, (double)$$12);
         }
      }

      if ($$3 != null) {
         evq $$13 = new evq($$3.du(), $$3.dy(), $$3.dA());
         float $$14 = (-0.5F + $$5.i()) * (3.0F + $$3.dj());
         float $$15 = -1.0F + $$5.i() * $$3.dk();
         float $$16 = (-0.5F + $$5.i()) * (3.0F + $$3.dj());
         evq $$17 = new evq((double)$$14, (double)$$15, (double)$$16);
         $$0.a(li.ar, $$13.c, $$13.d, $$13.e, $$17.c, $$17.d, $$17.e);
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
