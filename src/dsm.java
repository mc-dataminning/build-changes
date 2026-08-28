import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dsm extends dsr implements bsj, bsk {
   private static final int f = 4;
   public static final List<List<jq<btl>>> a = List.of(List.of(btp.a, btp.c), List.of(btp.k, btp.h), List.of(btp.e), List.of(btp.j));
   private static final Set<jq<btl>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xl i = xl.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dsm.a> l = Lists.newArrayList();
   private List<dsm.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   jq<btl> s;
   @Nullable
   jq<btl> t;
   @Nullable
   private xl u;
   private bsi v = bsi.a;
   private final cse w = new cse() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dsm.this.n;
            case 1 -> crx.a(dsm.this.s);
            case 2 -> crx.a(dsm.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsm.this.n = $$1;
               break;
            case 1:
               if (!dsm.this.o.C && !dsm.this.l.isEmpty()) {
                  dsm.a(dsm.this.o, dsm.this.p, awo.bN);
               }

               dsm.this.s = dsm.a(crx.e($$1));
               break;
            case 2:
               dsm.this.t = dsm.a(crx.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jq<btl> a(@Nullable jq<btl> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dsm(jh $$0, dvo $$1) {
      super(dst.o, $$0, $$1);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dsm $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jh $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jh($$4, $$3.r + 1, $$6);
      }

      dsm.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(ebj.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dvo $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dia $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dsm.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dsm.a(axy.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dil.F)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.d();
         $$3.r++;
      }

      int $$16 = $$3.n;
      if ($$0.aa() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, awo.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.n > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awo.bK);

               for (arr $$19 : $$0.a(arr.class, new ezm((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ao.m.a($$19, $$3.n);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awo.bM);
            }
         }
      }
   }

   private static int a(dff $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jh($$8, $$6, $$9)).a(axd.aO)) {
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
      a(this.o, this.p, awo.bM);
      super.aw_();
   }

   private static void a(dff $$0, jh $$1, int $$2, @Nullable jq<btl> $$3, @Nullable jq<btl> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ezm $$8 = new ezm($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cor> $$9 = $$0.a(cor.class, $$8);

         for (cor $$10 : $$9) {
            $$10.a(new btn($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cor $$11 : $$9) {
               $$11.a(new btn($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dff $$0, jh $$1, awn $$2) {
      $$0.a(null, $$1, $$2, awp.e, 1.0F, 1.0F);
   }

   public List<dsm.a> b() {
      return (List<dsm.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public aco c() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   private static void a(un $$0, String $$1, @Nullable jq<btl> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jq<btl> a(un $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         all $$2 = all.c($$0.l($$1));
         return $$2 == null ? null : lz.d.c($$2).map(dsm::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = bsi.b($$0);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", xl.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xl $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xl ao() {
      return this.u;
   }

   @Nullable
   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      return dsl.a($$2, this.v, this.S_()) ? new crx($$0, $$1, this.w, csf.a(this.o, this.aB_())) : null;
   }

   @Override
   public xl S_() {
      return this.am();
   }

   @Override
   public xl am() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.u = $$0.a(ku.g);
      this.v = $$0.a(ku.ao, bsi.a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.u);
      if (!this.v.equals(bsi.a)) {
         $$0.a(ku.ao, this.v);
      }
   }

   @Override
   public void a(un $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dff $$0) {
      super.a($$0);
      this.r = $$0.I_() - 1;
   }

   public static class a {
      final int a;
      private int b;

      public a(int $$0) {
         this.a = $$0;
         this.b = 1;
      }

      protected void a() {
         this.b++;
      }

      public int b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
