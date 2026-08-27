import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dma extends dmf implements boe, bof {
   private static final int f = 4;
   public static final List<List<il<bpf>>> a = List.of(List.of(bpj.a, bpj.c), List.of(bpj.k, bpj.h), List.of(bpj.e), List.of(bpj.j));
   private static final Set<il<bpf>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wg i = wg.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dma.a> l = Lists.newArrayList();
   private List<dma.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   il<bpf> s;
   @Nullable
   il<bpf> t;
   @Nullable
   private wg u;
   private bod v = bod.a;
   private final cmz w = new cmz() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dma.this.n;
            case 1 -> cms.a(dma.this.s);
            case 2 -> cms.a(dma.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dma.this.n = $$1;
               break;
            case 1:
               if (!dma.this.o.B && !dma.this.l.isEmpty()) {
                  dma.a(dma.this.o, dma.this.p, aum.bN);
               }

               dma.this.s = dma.a(cms.e($$1));
               break;
            case 2:
               dma.this.t = dma.a(cms.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static il<bpf> a(@Nullable il<bpf> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dma(ib $$0, doz $$1) {
      super(dmh.o, $$0, $$1);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dma $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ib $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ib($$4, $$3.r + 1, $$6);
      }

      dma.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dur.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         doz $$12 = $$0.a_($$7);
         dby $$13 = $$12.b();
         if ($$13 instanceof dbp) {
            float[] $$14 = ((dbp)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dma.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dma.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cyd)$$0, $$7) >= 15 && !$$12.a(dca.F)) {
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
      if ($$0.Y() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, aum.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aum.bK);

               for (apt $$18 : $$0.a(apt.class, new erv((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aum.bM);
            }
         }
      }
   }

   private static int a(cyx $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ib($$8, $$6, $$9)).a(avc.aM)) {
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
   public void ax_() {
      a(this.o, this.p, aum.bM);
      super.ax_();
   }

   private static void a(cyx $$0, ib $$1, int $$2, @Nullable il<bpf> $$3, @Nullable il<bpf> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         erv $$8 = new erv($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cjt> $$9 = $$0.a(cjt.class, $$8);

         for (cjt $$10 : $$9) {
            $$10.b(new bph($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cjt $$11 : $$9) {
               $$11.b(new bph($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cyx $$0, ib $$1, aul $$2) {
      $$0.a(null, $$1, $$2, aun.e, 1.0F, 1.0F);
   }

   public List<dma.a> b() {
      return (List<dma.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public abf c() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   private static void a(tm $$0, String $$1, @Nullable il<bpf> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static il<bpf> a(tm $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ajt $$2 = ajt.a($$0.l($$1));
         return $$2 == null ? null : kr.d.c($$2).map(dma::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = wg.a.a($$0.l("CustomName"), $$1);
      }

      this.v = bod.b($$0);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", wg.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wg $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wg af() {
      return this.u;
   }

   @Nullable
   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      return dlz.a($$2, this.v, this.O_()) ? new cms($$0, $$1, this.w, cna.a(this.o, this.aA_())) : null;
   }

   @Override
   public wg O_() {
      return this.ad();
   }

   @Override
   public wg ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(jl $$0) {
      this.u = $$0.a(jp.d);
      this.v = $$0.a(jp.T, bod.a);
   }

   @Override
   public void a(jl.a $$0) {
      $$0.a(jp.d, this.u);
      $$0.a(jp.T, this.v);
   }

   @Override
   public void a(tm $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(cyx $$0) {
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
