import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dxx extends dyc implements but, buu, dxw {
   private static final int f = 4;
   public static final List<List<jf<bvv>>> a = List.of(List.of(bvz.a, bvz.c), List.of(bvz.k, bvz.h), List.of(bvz.e), List.of(bvz.j));
   private static final Set<jf<bvv>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xa i = xa.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dxw.a> l = new ArrayList<>();
   private List<dxw.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   jf<bvv> s;
   @Nullable
   jf<bvv> t;
   @Nullable
   private xa u;
   private bus v = bus.a;
   private final cwc w = new cwc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dxx.this.q;
            case 1 -> cvv.a(dxx.this.s);
            case 2 -> cvv.a(dxx.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxx.this.q = $$1;
               break;
            case 1:
               if (!dxx.this.n.C && !dxx.this.l.isEmpty()) {
                  dxx.a(dxx.this.n, dxx.this.o, awp.bN);
               }

               dxx.this.s = dxx.a(cvv.e($$1));
               break;
            case 2:
               dxx.this.t = dxx.a(cvv.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jf<bvv> a(@Nullable jf<bvv> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dxx(iv $$0, ebe $$1) {
      super(dye.p, $$0, $$1);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dxx $$3) {
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

      dxw.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(ehd.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         ebe $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dmt $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dxw.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new dxw.a(axy.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dne.I)) {
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
            a($$0, $$1, awp.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.K_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awp.bK);

               for (art $$19 : $$0.a(art.class, new ffl((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  aq.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awp.bM);
            }
         }
      }
   }

   private static int a(djx $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.K_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iv($$8, $$6, $$9)).a(axe.aP)) {
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
      a(this.n, this.o, awp.bM);
      super.aw_();
   }

   private static void a(djx $$0, iv $$1, int $$2, @Nullable jf<bvv> $$3, @Nullable jf<bvv> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ffl $$8 = new ffl($$1).g($$5).b(0.0, (double)$$0.L_(), 0.0);
         List<crx> $$9 = $$0.a(crx.class, $$8);

         for (crx $$10 : $$9) {
            $$10.a(new bvx($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (crx $$11 : $$9) {
               $$11.a(new bvx($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(djx $$0, iv $$1, awo $$2) {
      $$0.a(null, $$1, $$2, awq.e, 1.0F, 1.0F);
   }

   @Override
   public List<dxw.a> a() {
      return (List<dxw.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public acc c() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   private static void a(tz $$0, String $$1, @Nullable jf<bvv> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jf<bvv> a(tz $$0, String $$1) {
      return $$0.<jf<bvv>>a($$1, mg.d.r()).filter(g::contains).orElse(null);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      this.u = a($$0.a("CustomName"), $$1);
      this.v = bus.b($$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      $$0.b("CustomName", xc.a, $$1.a(un.a), this.u);
      this.v.a($$0, $$1);
   }

   public void a(@Nullable xa $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xa ak() {
      return this.u;
   }

   @Nullable
   @Override
   public cvq createMenu(int $$0, crw $$1, crx $$2) {
      return dxv.a($$2, this.v, this.m_()) ? new cvv($$0, $$1, this.w, cwd.a(this.n, this.aB_())) : null;
   }

   @Override
   public xa m_() {
      return this.ai();
   }

   @Override
   public xa ai() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.u = $$0.a(kk.g);
      this.v = $$0.a(kk.as, bus.a);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.u);
      if (!this.v.equals(bus.a)) {
         $$0.a(kk.as, this.v);
      }
   }

   @Override
   public void a(tz $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(djx $$0) {
      super.a($$0);
      this.r = $$0.K_() - 1;
   }
}
