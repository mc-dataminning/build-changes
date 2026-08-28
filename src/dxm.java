import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dxm extends dxr implements bui, buj, dxl {
   private static final int f = 4;
   public static final List<List<jf<bvk>>> a = List.of(List.of(bvo.a, bvo.c), List.of(bvo.k, bvo.h), List.of(bvo.e), List.of(bvo.j));
   private static final Set<jf<bvk>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wy i = wy.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dxl.a> l = new ArrayList<>();
   private List<dxl.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   jf<bvk> s;
   @Nullable
   jf<bvk> t;
   @Nullable
   private wy u;
   private buh v = buh.a;
   private final cvr w = new cvr() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dxm.this.q;
            case 1 -> cvk.a(dxm.this.s);
            case 2 -> cvk.a(dxm.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxm.this.q = $$1;
               break;
            case 1:
               if (!dxm.this.n.C && !dxm.this.l.isEmpty()) {
                  dxm.a(dxm.this.n, dxm.this.o, awn.bN);
               }

               dxm.this.s = dxm.a(cvk.e($$1));
               break;
            case 2:
               dxm.this.t = dxm.a(cvk.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jf<bvk> a(@Nullable jf<bvk> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dxm(iv $$0, eat $$1) {
      super(dxt.p, $$0, $$1);
   }

   public static void a(djm $$0, iv $$1, eat $$2, dxm $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      iv $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new iv($$4, $$3.r + 1, $$6);
      }

      dxl.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(egs.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         eat $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dmi $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dxl.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new dxl.a(axw.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dmt.I)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.d();
         $$3.r++;
      }

      int $$16 = $$3.q;
      if ($$0.ae() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, awn.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.G_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awn.bK);

               for (arr $$19 : $$0.a(arr.class, new fex((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  aq.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awn.bM);
            }
         }
      }
   }

   private static int a(djm $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.G_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iv($$8, $$6, $$9)).a(axc.aP)) {
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
   public void as_() {
      a(this.n, this.o, awn.bM);
      super.as_();
   }

   private static void a(djm $$0, iv $$1, int $$2, @Nullable jf<bvk> $$3, @Nullable jf<bvk> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fex $$8 = new fex($$1).g($$5).b(0.0, (double)$$0.H_(), 0.0);
         List<crm> $$9 = $$0.a(crm.class, $$8);

         for (crm $$10 : $$9) {
            $$10.a(new bvm($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (crm $$11 : $$9) {
               $$11.a(new bvm($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(djm $$0, iv $$1, awm $$2) {
      $$0.a(null, $$1, $$2, awo.e, 1.0F, 1.0F);
   }

   @Override
   public List<dxl.a> a() {
      return (List<dxl.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public aca c() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   private static void a(tz $$0, String $$1, @Nullable jf<bvk> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jf<bvk> a(tz $$0, String $$1) {
      return $$0.<jf<bvk>>a($$1, mg.d.r()).filter(g::contains).orElse(null);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      this.u = a($$0.a("CustomName"), $$1);
      this.v = buh.b($$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      $$0.b("CustomName", xa.a, $$1.a(un.a), this.u);
      this.v.a($$0, $$1);
   }

   public void a(@Nullable wy $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wy ak() {
      return this.u;
   }

   @Nullable
   @Override
   public cvf createMenu(int $$0, crl $$1, crm $$2) {
      return dxk.a($$2, this.v, this.m_()) ? new cvk($$0, $$1, this.w, cvs.a(this.n, this.ax_())) : null;
   }

   @Override
   public wy m_() {
      return this.ai();
   }

   @Override
   public wy ai() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.u = $$0.a(kk.g);
      this.v = $$0.a(kk.as, buh.a);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.u);
      if (!this.v.equals(buh.a)) {
         $$0.a(kk.as, this.v);
      }
   }

   @Override
   public void a(tz $$0) {
      $$0.p("CustomName");
      $$0.p("lock");
   }

   @Override
   public void a(djm $$0) {
      super.a($$0);
      this.r = $$0.G_() - 1;
   }
}
