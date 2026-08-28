import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpl extends dpq implements bql, bqm {
   private static final int f = 4;
   public static final List<List<jj<brn>>> a = List.of(List.of(brr.a, brr.c), List.of(brr.k, brr.h), List.of(brr.e), List.of(brr.j));
   private static final Set<jj<brn>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wu i = wu.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dpl.a> l = Lists.newArrayList();
   private List<dpl.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   jj<brn> s;
   @Nullable
   jj<brn> t;
   @Nullable
   private wu u;
   private bqk v = bqk.a;
   private final cpt w = new cpt() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpl.this.q;
            case 1 -> cpm.a(dpl.this.s);
            case 2 -> cpm.a(dpl.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpl.this.q = $$1;
               break;
            case 1:
               if (!dpl.this.n.B && !dpl.this.l.isEmpty()) {
                  dpl.a(dpl.this.n, dpl.this.o, avh.bN);
               }

               dpl.this.s = dpl.a(cpm.e($$1));
               break;
            case 2:
               dpl.this.t = dpl.a(cpm.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jj<brn> a(@Nullable jj<brn> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dpl(ja $$0, dsl $$1) {
      super(dps.o, $$0, $$1);
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dpl $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ja $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ja($$4, $$3.r + 1, $$6);
      }

      dpl.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dyg.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dsl $$12 = $$0.a_($$7);
         dfi $$13 = $$12.b();
         if ($$13 instanceof dez) {
            float[] $$14 = ((dez)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dpl.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dpl.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dbm)$$0, $$7) >= 15 && !$$12.a(dfk.F)) {
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
            a($$0, $$1, avh.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.q > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, avh.bK);

               for (aqn $$18 : $$0.a(aqn.class, new ewc((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.q);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, avh.bM);
            }
         }
      }
   }

   private static int a(dcg $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ja($$8, $$6, $$9)).a(avw.aM)) {
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
      a(this.n, this.o, avh.bM);
      super.aw_();
   }

   private static void a(dcg $$0, ja $$1, int $$2, @Nullable jj<brn> $$3, @Nullable jj<brn> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ewc $$8 = new ewc($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cml> $$9 = $$0.a(cml.class, $$8);

         for (cml $$10 : $$9) {
            $$10.b(new brp($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cml $$11 : $$9) {
               $$11.b(new brp($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dcg $$0, ja $$1, avg $$2) {
      $$0.a(null, $$1, $$2, avi.e, 1.0F, 1.0F);
   }

   public List<dpl.a> b() {
      return (List<dpl.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public abu c() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.e($$0);
   }

   private static void a(tx $$0, String $$1, @Nullable jj<brn> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jj<brn> a(tx $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akk $$2 = akk.a($$0.l($$1));
         return $$2 == null ? null : lq.d.c($$2).map(dpl::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = bqk.b($$0);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", wu.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wu $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wu aj() {
      return this.u;
   }

   @Nullable
   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      return dpk.a($$2, this.v, this.O_()) ? new cpm($$0, $$1, this.w, cpu.a(this.n, this.az_())) : null;
   }

   @Override
   public wu O_() {
      return this.ah();
   }

   @Override
   public wu ah() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      this.u = $$0.a(kn.g);
      this.v = $$0.a(kn.ad, bqk.a);
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.g, this.u);
      if (!this.v.equals(bqk.a)) {
         $$0.a(kn.ad, this.v);
      }
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dcg $$0) {
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
