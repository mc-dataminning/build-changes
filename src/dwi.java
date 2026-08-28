import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dwi extends dwn implements bua, bub, dwh {
   private static final int f = 4;
   public static final List<List<je<bvc>>> a = List.of(List.of(bvg.a, bvg.c), List.of(bvg.k, bvg.h), List.of(bvg.e), List.of(bvg.j));
   private static final Set<je<bvc>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final ww i = ww.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dwh.a> l = new ArrayList<>();
   private List<dwh.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   je<bvc> s;
   @Nullable
   je<bvc> t;
   @Nullable
   private ww u;
   private btz v = btz.a;
   private final cuw w = new cuw() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dwi.this.q;
            case 1 -> cup.a(dwi.this.s);
            case 2 -> cup.a(dwi.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dwi.this.q = $$1;
               break;
            case 1:
               if (!dwi.this.n.C && !dwi.this.l.isEmpty()) {
                  dwi.a(dwi.this.n, dwi.this.o, awl.bN);
               }

               dwi.this.s = dwi.a(cup.e($$1));
               break;
            case 2:
               dwi.this.t = dwi.a(cup.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static je<bvc> a(@Nullable je<bvc> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dwi(iu $$0, dzo $$1) {
      super(dwp.p, $$0, $$1);
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dwi $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      iu $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new iu($$4, $$3.r + 1, $$6);
      }

      dwh.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(efn.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dzo $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dll $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dwh.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new dwh.a(axu.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dlw.I)) {
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
            a($$0, $$1, awl.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.G_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awl.bK);

               for (arp $$19 : $$0.a(arp.class, new fdr((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ap.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awl.bM);
            }
         }
      }
   }

   private static int a(dip $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.G_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iu($$8, $$6, $$9)).a(axa.aP)) {
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
   public void ar_() {
      a(this.n, this.o, awl.bM);
      super.ar_();
   }

   private static void a(dip $$0, iu $$1, int $$2, @Nullable je<bvc> $$3, @Nullable je<bvc> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fdr $$8 = new fdr($$1).g($$5).b(0.0, (double)$$0.H_(), 0.0);
         List<cqs> $$9 = $$0.a(cqs.class, $$8);

         for (cqs $$10 : $$9) {
            $$10.a(new bve($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cqs $$11 : $$9) {
               $$11.a(new bve($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dip $$0, iu $$1, awk $$2) {
      $$0.a(null, $$1, $$2, awm.e, 1.0F, 1.0F);
   }

   @Override
   public List<dwh.a> a() {
      return (List<dwh.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public aby c() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return this.e($$0);
   }

   private static void a(tx $$0, String $$1, @Nullable je<bvc> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static je<bvc> a(tx $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ale $$2 = ale.c($$0.l($$1));
         return $$2 == null ? null : mf.d.c($$2).map(dwi::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.e("CustomName")) {
         this.u = a($$0.c("CustomName"), $$1);
      }

      this.v = btz.b($$0, $$1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", (uu)wy.a.encodeStart($$1.a(ul.a), this.u).getOrThrow());
      }

      this.v.a($$0, $$1);
   }

   public void a(@Nullable ww $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public ww an() {
      return this.u;
   }

   @Nullable
   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      return dwg.a($$2, this.v, this.m_()) ? new cup($$0, $$1, this.w, cux.a(this.n, this.aw_())) : null;
   }

   @Override
   public ww m_() {
      return this.al();
   }

   @Override
   public ww al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.u = $$0.a(kj.g);
      this.v = $$0.a(kj.as, btz.a);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.u);
      if (!this.v.equals(btz.a)) {
         $$0.a(kj.as, this.v);
      }
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dip $$0) {
      super.a($$0);
      this.r = $$0.G_() - 1;
   }
}
