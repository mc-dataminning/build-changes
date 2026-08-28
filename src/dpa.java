import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpa extends dpf implements bqw, bqx {
   private static final int f = 4;
   public static final List<List<ji<bry>>> a = List.of(List.of(bsc.a, bsc.c), List.of(bsc.k, bsc.h), List.of(bsc.e), List.of(bsc.j));
   private static final Set<ji<bry>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xo i = xo.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dpa.a> l = Lists.newArrayList();
   private List<dpa.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   ji<bry> s;
   @Nullable
   ji<bry> t;
   @Nullable
   private xo u;
   private bqv v = bqv.a;
   private final cqc w = new cqc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpa.this.q;
            case 1 -> cpv.a(dpa.this.s);
            case 2 -> cpv.a(dpa.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpa.this.q = $$1;
               break;
            case 1:
               if (!dpa.this.n.B && !dpa.this.l.isEmpty()) {
                  dpa.a(dpa.this.n, dpa.this.o, avz.bN);
               }

               dpa.this.s = dpa.a(cpv.e($$1));
               break;
            case 2:
               dpa.this.t = dpa.a(cpv.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static ji<bry> a(@Nullable ji<bry> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dpa(iz $$0, dsa $$1) {
      super(dph.o, $$0, $$1);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dpa $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      iz $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new iz($$4, $$3.r + 1, $$6);
      }

      dpa.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dxs.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dsa $$12 = $$0.a_($$7);
         dex $$13 = $$12.b();
         if ($$13 instanceof deo) {
            float[] $$14 = ((deo)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dpa.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dpa.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dbc)$$0, $$7) >= 15 && !$$12.a(dez.F)) {
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
            a($$0, $$1, avz.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.q > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, avz.bK);

               for (arf $$18 : $$0.a(arf.class, new evk((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.q);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, avz.bM);
            }
         }
      }
   }

   private static int a(dbw $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iz($$8, $$6, $$9)).a(awo.aM)) {
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
      a(this.n, this.o, avz.bM);
      super.aw_();
   }

   private static void a(dbw $$0, iz $$1, int $$2, @Nullable ji<bry> $$3, @Nullable ji<bry> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         evk $$8 = new evk($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cmv> $$9 = $$0.a(cmv.class, $$8);

         for (cmv $$10 : $$9) {
            $$10.b(new bsa($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cmv $$11 : $$9) {
               $$11.b(new bsa($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dbw $$0, iz $$1, avy $$2) {
      $$0.a(null, $$1, $$2, awa.e, 1.0F, 1.0F);
   }

   public List<dpa.a> b() {
      return (List<dpa.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public aco c() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   private static void a(ur $$0, String $$1, @Nullable ji<bry> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static ji<bry> a(ur $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ale $$2 = ale.a($$0.l($$1));
         return $$2 == null ? null : lp.d.c($$2).map(dpa::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = xo.a.a($$0.l("CustomName"), $$1);
      }

      this.v = bqv.b($$0);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", xo.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xo $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xo ah() {
      return this.u;
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      return doz.a($$2, this.v, this.O_()) ? new cpv($$0, $$1, this.w, cqd.a(this.n, this.az_())) : null;
   }

   @Override
   public xo O_() {
      return this.af();
   }

   @Override
   public xo af() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      this.u = $$0.a(km.f);
      this.v = $$0.a(km.ac, bqv.a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.f, this.u);
      if (!this.v.equals(bqv.a)) {
         $$0.a(km.ac, this.v);
      }
   }

   @Override
   public void a(ur $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dbw $$0) {
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
