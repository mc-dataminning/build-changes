import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dfd extends dfi implements bje, bjf {
   private static final int f = 4;
   public static final bkg[][] a = new bkg[][]{{bkk.a, bkk.c}, {bkk.k, bkk.h}, {bkk.e}, {bkk.j}};
   private static final Set<bkg> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final uv i = uv.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dfd.a> l = Lists.newArrayList();
   private List<dfd.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bkg s;
   @Nullable
   bkg t;
   @Nullable
   private uv u;
   private bjd v = bjd.a;
   private final chb w = new chb() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dfd.this.n;
            case 1 -> cgu.a(dfd.this.s);
            case 2 -> cgu.a(dfd.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dfd.this.n = $$1;
               break;
            case 1:
               if (!dfd.this.o.B && !dfd.this.l.isEmpty()) {
                  dfd.a(dfd.this.o, dfd.this.p, aqv.by);
               }

               dfd.this.s = dfd.a(cgu.e($$1));
               break;
            case 2:
               dfd.this.t = dfd.a(cgu.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bkg a(@Nullable bkg $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dfd(hx $$0, dhn $$1) {
      super(dfk.o, $$0, $$1);
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dfd $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      hx $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new hx($$4, $$3.r + 1, $$6);
      }

      dfd.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dmw.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dhn $$12 = $$0.a_($$7);
         cvf $$13 = $$12.b();
         if ($$13 instanceof cuw) {
            float[] $$14 = ((cuw)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dfd.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dfd.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((crl)$$0, $$7) >= 15 && !$$12.a(cvh.F)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.r++;
      }

      int $$15 = $$3.n;
      if ($$0.W() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, aqv.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aqv.bv);

               for (amj $$18 : $$0.a(amj.class, new eju((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  al.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aqv.bx);
            }
         }
      }
   }

   private static int a(csf $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new hx($$8, $$6, $$9)).a(ark.aL)) {
                  $$7 = false;
                  break;
               }
            }
         }

         if (!$$7) {
            break;
         }
      }

      return $$4;
   }

   @Override
   public void az_() {
      a(this.o, this.p, aqv.bx);
      super.az_();
   }

   private static void a(csf $$0, hx $$1, int $$2, @Nullable bkg $$3, @Nullable bkg $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         eju $$8 = new eju($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cdz> $$9 = $$0.a(cdz.class, $$8);

         for (cdz $$10 : $$9) {
            $$10.b(new bki($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cdz $$11 : $$9) {
               $$11.b(new bki($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(csf $$0, hx $$1, aqu $$2) {
      $$0.a(null, $$1, $$2, aqw.e, 1.0F, 1.0F);
   }

   public List<dfd.a> c() {
      return (List<dfd.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public yo f() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
      return this.q();
   }

   private static void a(sd $$0, String $$1, @Nullable bkg $$2) {
      if ($$2 != null) {
         agm $$3 = kc.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bkg a(sd $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         agm $$2 = agm.a($$0.l($$1));
         return a(kc.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = uv.a.a($$0.l("CustomName"));
      }

      this.v = bjd.b($$0);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", uv.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable uv $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public uv af() {
      return this.u;
   }

   @Nullable
   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      return dfc.a($$2, this.v, this.Q_()) ? new cgu($$0, $$1, this.w, chc.a(this.o, this.aC_())) : null;
   }

   @Override
   public uv Q_() {
      return this.ad();
   }

   @Override
   public uv ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(csf $$0) {
      super.a($$0);
      this.r = $$0.J_() - 1;
   }

   public static class a {
      final float[] a;
      private int b;

      public a(float[] $$0) {
         this.a = $$0;
         this.b = 1;
      }

      protected void a() {
         this.b++;
      }

      public float[] b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
