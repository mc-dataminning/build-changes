import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dyj extends dyo implements bve, bvf, dyi {
   private static final int f = 4;
   public static final List<List<jg<bwg>>> a = List.of(List.of(bwk.a, bwk.c), List.of(bwk.k, bwk.h), List.of(bwk.e), List.of(bwk.j));
   private static final Set<jg<bwg>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xg i = xg.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dyi.a> l = new ArrayList<>();
   private List<dyi.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   jg<bwg> s;
   @Nullable
   jg<bwg> t;
   @Nullable
   private xg u;
   private bvd v = bvd.a;
   private final cwn w = new cwn() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dyj.this.q;
            case 1 -> cwg.a(dyj.this.s);
            case 2 -> cwg.a(dyj.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dyj.this.q = $$1;
               break;
            case 1:
               if (!dyj.this.n.C && !dyj.this.l.isEmpty()) {
                  dyj.a(dyj.this.n, dyj.this.o, awy.bN);
               }

               dyj.this.s = dyj.a(cwg.e($$1));
               break;
            case 2:
               dyj.this.t = dyj.a(cwg.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jg<bwg> a(@Nullable jg<bwg> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dyj(iw $$0, ebq $$1) {
      super(dyq.p, $$0, $$1);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dyj $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      iw $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new iw($$4, $$3.r + 1, $$6);
      }

      dyi.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(ehp.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         ebq $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dnf $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dyi.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new dyi.a(ayh.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dnq.I)) {
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
            a($$0, $$1, awy.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.K_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awy.bK);

               for (asc $$19 : $$0.a(asc.class, new ffx((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  aq.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awy.bM);
            }
         }
      }
   }

   private static int a(dkj $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.K_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iw($$8, $$6, $$9)).a(axn.aP)) {
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
      a(this.n, this.o, awy.bM);
      super.as_();
   }

   private static void a(dkj $$0, iw $$1, int $$2, @Nullable jg<bwg> $$3, @Nullable jg<bwg> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ffx $$8 = new ffx($$1).g($$5).b(0.0, (double)$$0.L_(), 0.0);
         List<csi> $$9 = $$0.a(csi.class, $$8);

         for (csi $$10 : $$9) {
            $$10.a(new bwi($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (csi $$11 : $$9) {
               $$11.a(new bwi($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dkj $$0, iw $$1, awx $$2) {
      $$0.a(null, $$1, $$2, awz.e, 1.0F, 1.0F);
   }

   @Override
   public List<dyi.a> a() {
      return (List<dyi.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public acl c() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   private static void a(ua $$0, String $$1, @Nullable jg<bwg> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jg<bwg> a(ua $$0, String $$1) {
      return $$0.<jg<bwg>>a($$1, mh.d.r()).filter(g::contains).orElse(null);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      this.u = a($$0.a("CustomName"), $$1);
      this.v = bvd.b($$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      $$0.b("CustomName", xi.a, $$1.a(uo.a), this.u);
      this.v.a($$0, $$1);
   }

   public void a(@Nullable xg $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xg aj() {
      return this.u;
   }

   @Nullable
   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
      return dyh.a($$2, this.v, this.P_()) ? new cwg($$0, $$1, this.w, cwo.a(this.n, this.ax_())) : null;
   }

   @Override
   public xg P_() {
      return this.ah();
   }

   @Override
   public xg ah() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.u = $$0.a(kl.g);
      this.v = $$0.a(kl.as, bvd.a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.g, this.u);
      if (!this.v.equals(bvd.a)) {
         $$0.a(kl.as, this.v);
      }
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dkj $$0) {
      super.a($$0);
      this.r = $$0.K_() - 1;
   }
}
