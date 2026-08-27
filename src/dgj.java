import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dgj extends dgo implements bjy, bjz {
   private static final int f = 4;
   public static final bla[][] a = new bla[][]{{ble.a, ble.c}, {ble.k, ble.h}, {ble.e}, {ble.j}};
   private static final Set<bla> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final vd i = vd.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dgj.a> l = Lists.newArrayList();
   private List<dgj.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bla s;
   @Nullable
   bla t;
   @Nullable
   private vd u;
   private bjx v = bjx.a;
   private final cie w = new cie() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dgj.this.n;
            case 1 -> chx.a(dgj.this.s);
            case 2 -> chx.a(dgj.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgj.this.n = $$1;
               break;
            case 1:
               if (!dgj.this.o.B && !dgj.this.l.isEmpty()) {
                  dgj.a(dgj.this.o, dgj.this.p, arm.by);
               }

               dgj.this.s = dgj.a(chx.e($$1));
               break;
            case 2:
               dgj.this.t = dgj.a(chx.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bla a(@Nullable bla $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dgj(hx $$0, dja $$1) {
      super(dgq.o, $$0, $$1);
   }

   public static void a(cti $$0, hx $$1, dja $$2, dgj $$3) {
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

      dgj.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(doj.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dja $$12 = $$0.a_($$7);
         cwj $$13 = $$12.b();
         if ($$13 instanceof cwa) {
            float[] $$14 = ((cwa)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dgj.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dgj.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cso)$$0, $$7) >= 15 && !$$12.a(cwl.F)) {
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
      if ($$0.X() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, arm.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, arm.bv);

               for (ana $$18 : $$0.a(ana.class, new elh((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, arm.bx);
            }
         }
      }
   }

   private static int a(cti $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new hx($$8, $$6, $$9)).a(asb.aL)) {
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
   public void ay_() {
      a(this.o, this.p, arm.bx);
      super.ay_();
   }

   private static void a(cti $$0, hx $$1, int $$2, @Nullable bla $$3, @Nullable bla $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         elh $$8 = new elh($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cfb> $$9 = $$0.a(cfb.class, $$8);

         for (cfb $$10 : $$9) {
            $$10.b(new blc($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cfb $$11 : $$9) {
               $$11.b(new blc($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cti $$0, hx $$1, arl $$2) {
      $$0.a(null, $$1, $$2, arn.e, 1.0F, 1.0F);
   }

   public List<dgj.a> c() {
      return (List<dgj.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public ze f() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      return this.q();
   }

   private static void a(sl $$0, String $$1, @Nullable bla $$2) {
      if ($$2 != null) {
         ahd $$3 = kd.d.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bla a(sl $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ahd $$2 = ahd.a($$0.l($$1));
         return a(kd.d.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = vd.a.a($$0.l("CustomName"));
      }

      this.v = bjx.b($$0);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", vd.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable vd $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public vd af() {
      return this.u;
   }

   @Nullable
   @Override
   public chu createMenu(int $$0, cfa $$1, cfb $$2) {
      return dgi.a($$2, this.v, this.Q_()) ? new chx($$0, $$1, this.w, cif.a(this.o, this.aB_())) : null;
   }

   @Override
   public vd Q_() {
      return this.ad();
   }

   @Override
   public vd ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cti $$0) {
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
