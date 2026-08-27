import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dem extends der implements bit, biu {
   private static final int f = 4;
   public static final bjt[][] a = new bjt[][]{{bjx.a, bjx.c}, {bjx.k, bjx.h}, {bjx.e}, {bjx.j}};
   private static final Set<bjt> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final ur i = ur.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dem.a> l = Lists.newArrayList();
   private List<dem.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bjt s;
   @Nullable
   bjt t;
   @Nullable
   private ur u;
   private bis v = bis.a;
   private final cgo w = new cgo() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dem.this.n;
            case 1 -> cgh.a(dem.this.s);
            case 2 -> cgh.a(dem.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dem.this.n = $$1;
               break;
            case 1:
               if (!dem.this.o.B && !dem.this.l.isEmpty()) {
                  dem.a(dem.this.o, dem.this.p, aqn.by);
               }

               dem.this.s = dem.a(cgh.e($$1));
               break;
            case 2:
               dem.this.t = dem.a(cgh.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bjt a(@Nullable bjt $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dem(ht $$0, dgw $$1) {
      super(det.o, $$0, $$1);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dem $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ht $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ht($$4, $$3.r + 1, $$6);
      }

      dem.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dmf.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dgw $$12 = $$0.a_($$7);
         cut $$13 = $$12.b();
         if ($$13 instanceof cuk) {
            float[] $$14 = ((cuk)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dem.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dem.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cqy)$$0, $$7) >= 15 && !$$12.a(cuv.F)) {
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
      if ($$0.V() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, aqn.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aqn.bv);

               for (amb $$18 : $$0.a(amb.class, new ejd((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  al.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aqn.bx);
            }
         }
      }
   }

   private static int a(crs $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ht($$8, $$6, $$9)).a(arc.aL)) {
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
   public void aw_() {
      a(this.o, this.p, aqn.bx);
      super.aw_();
   }

   private static void a(crs $$0, ht $$1, int $$2, @Nullable bjt $$3, @Nullable bjt $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ejd $$8 = new ejd($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cdm> $$9 = $$0.a(cdm.class, $$8);

         for (cdm $$10 : $$9) {
            $$10.b(new bjv($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cdm $$11 : $$9) {
               $$11.b(new bjv($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(crs $$0, ht $$1, aqm $$2) {
      $$0.a(null, $$1, $$2, aqo.e, 1.0F, 1.0F);
   }

   public List<dem.a> c() {
      return (List<dem.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public yk f() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      return this.o();
   }

   private static void a(rz $$0, String $$1, @Nullable bjt $$2) {
      if ($$2 != null) {
         agg $$3 = jy.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bjt a(rz $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         agg $$2 = agg.a($$0.l($$1));
         return a(jy.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = ur.a.a($$0.l("CustomName"));
      }

      this.v = bis.b($$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", ur.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable ur $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public ur ad() {
      return this.u;
   }

   @Nullable
   @Override
   public cge createMenu(int $$0, cdl $$1, cdm $$2) {
      return del.a($$2, this.v, this.O_()) ? new cgh($$0, $$1, this.w, cgp.a(this.o, this.p())) : null;
   }

   @Override
   public ur O_() {
      return this.ab();
   }

   @Override
   public ur ab() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(crs $$0) {
      super.a($$0);
      this.r = $$0.I_() - 1;
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
