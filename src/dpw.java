import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpw extends dqc implements bqe, bqf {
   private static final int f = 4;
   public static final List<List<ja<brf>>> a = List.of(List.of(brj.a, brj.c), List.of(brj.k, brj.h), List.of(brj.e), List.of(brj.j));
   private static final Set<ja<brf>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xe i = xe.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dpw.a> l = Lists.newArrayList();
   private List<dpw.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   ja<brf> s;
   @Nullable
   ja<brf> t;
   @Nullable
   private xe u;
   private bqd v = bqd.a;
   private final cpq w = new cpq() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpw.this.q;
            case 1 -> cpj.a(dpw.this.s);
            case 2 -> cpj.a(dpw.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpw.this.q = $$1;
               break;
            case 1:
               if (!dpw.this.n.C && !dpw.this.l.isEmpty()) {
                  dpw.a(dpw.this.n, dpw.this.o, avo.bS);
               }

               dpw.this.s = dpw.a(cpj.e($$1));
               break;
            case 2:
               dpw.this.t = dpw.a(cpj.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static ja<brf> a(@Nullable ja<brf> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dpw(ir $$0, dtc $$1) {
      super(dqe.p, $$0, $$1);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dpw $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ir $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ir($$4, $$3.r + 1, $$6);
      }

      dpw.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dyu.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dtc $$12 = $$0.a_($$7);
         dfc $$13 = $$12.b();
         if ($$13 instanceof des) {
            float[] $$14 = ((des)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dpw.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dpw.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dbg)$$0, $$7) >= 15 && !$$12.a(dfe.ak)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.r++;
      }

      int $$15 = $$3.q;
      if ($$0.Z() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, avo.bQ);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$17 = $$3.q > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, avo.bP);

               for (aqu $$18 : $$0.a(aqu.class, new ewp((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$18, $$3.q);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, avo.bR);
            }
         }
      }
   }

   private static int a(dca $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ir($$8, $$6, $$9)).a(awe.aO)) {
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
      a(this.n, this.o, avo.bR);
      super.aw_();
   }

   private static void a(dca $$0, ir $$1, int $$2, @Nullable ja<brf> $$3, @Nullable ja<brf> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ewp $$8 = new ewp($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cly> $$9 = $$0.a(cly.class, $$8);

         for (cly $$10 : $$9) {
            $$10.b(new brh($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cly $$11 : $$9) {
               $$11.b(new brh($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dca $$0, ir $$1, avn $$2) {
      $$0.a(null, $$1, $$2, avq.e, 1.0F, 1.0F);
   }

   public List<dpw.a> b() {
      return (List<dpw.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public ace c() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   private static void a(uk $$0, String $$1, @Nullable ja<brf> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static ja<brf> a(uk $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akt $$2 = akt.a($$0.l($$1));
         return $$2 == null ? null : lh.d.c($$2).map(dpw::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = xe.a.a($$0.l("CustomName"), $$1);
      }

      this.v = bqd.b($$0);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", xe.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xe $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xe ah() {
      return this.u;
   }

   @Nullable
   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      return dpv.a($$2, this.v, this.P_()) ? new cpj($$0, $$1, this.w, cpr.a(this.n, this.az_())) : null;
   }

   @Override
   public xe P_() {
      return this.af();
   }

   @Override
   public xe af() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(ka $$0) {
      this.u = $$0.a(ke.f);
      this.v = $$0.a(ke.ac, bqd.a);
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.f, this.u);
      if (!this.v.equals(bqd.a)) {
         $$0.a(ke.ac, this.v);
      }
   }

   @Override
   public void a(uk $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dca $$0) {
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
