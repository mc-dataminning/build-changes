import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dgy extends dhd implements bkg, bkh {
   private static final int f = 4;
   public static final List<List<ih<blh>>> a = List.of(List.of(bll.a, bll.c), List.of(bll.k, bll.h), List.of(bll.e), List.of(bll.j));
   private static final Set<ih<blh>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final vg i = vg.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dgy.a> l = Lists.newArrayList();
   private List<dgy.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   ih<blh> s;
   @Nullable
   ih<blh> t;
   @Nullable
   private vg u;
   private bkf v = bkf.a;
   private final cit w = new cit() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dgy.this.n;
            case 1 -> cim.a(dgy.this.s);
            case 2 -> cim.a(dgy.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgy.this.n = $$1;
               break;
            case 1:
               if (!dgy.this.o.B && !dgy.this.l.isEmpty()) {
                  dgy.a(dgy.this.o, dgy.this.p, art.bK);
               }

               dgy.this.s = dgy.a(cim.e($$1));
               break;
            case 2:
               dgy.this.t = dgy.a(cim.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static ih<blh> a(@Nullable ih<blh> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dgy(hx $$0, djp $$1) {
      super(dhf.o, $$0, $$1);
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dgy $$3) {
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

      dgy.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(doy.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         djp $$12 = $$0.a_($$7);
         cwy $$13 = $$12.b();
         if ($$13 instanceof cwp) {
            float[] $$14 = ((cwp)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dgy.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dgy.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((ctd)$$0, $$7) >= 15 && !$$12.a(cxa.F)) {
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
            a($$0, $$1, art.bI);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, art.bH);

               for (anf $$18 : $$0.a(anf.class, new elx((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, art.bJ);
            }
         }
      }
   }

   private static int a(ctx $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new hx($$8, $$6, $$9)).a(asi.aL)) {
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
   public void aB_() {
      a(this.o, this.p, art.bJ);
      super.aB_();
   }

   private static void a(ctx $$0, hx $$1, int $$2, @Nullable ih<blh> $$3, @Nullable ih<blh> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         elx $$8 = new elx($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cfq> $$9 = $$0.a(cfq.class, $$8);

         for (cfq $$10 : $$9) {
            $$10.b(new blj($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && Objects.equals($$3, $$4) && $$4 != null) {
            for (cfq $$11 : $$9) {
               $$11.b(new blj($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(ctx $$0, hx $$1, ars $$2) {
      $$0.a(null, $$1, $$2, aru.e, 1.0F, 1.0F);
   }

   public List<dgy.a> c() {
      return (List<dgy.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public zi f() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.q();
   }

   private static void a(so $$0, String $$1, @Nullable ih<blh> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static ih<blh> a(so $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ahh $$2 = ahh.a($$0.l($$1));
         return $$2 == null ? null : kd.d.c($$2).map(dgy::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = vg.a.a($$0.l("CustomName"));
      }

      this.v = bkf.b($$0);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", vg.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable vg $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public vg af() {
      return this.u;
   }

   @Nullable
   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      return dgx.a($$2, this.v, this.Q_()) ? new cim($$0, $$1, this.w, ciu.a(this.o, this.aE_())) : null;
   }

   @Override
   public vg Q_() {
      return this.ad();
   }

   @Override
   public vg ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(ctx $$0) {
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
