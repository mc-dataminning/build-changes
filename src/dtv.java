import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dtv extends dua implements bsn, bso {
   private static final int f = 4;
   public static final List<List<jr<btp>>> a = List.of(List.of(btt.a, btt.c), List.of(btt.k, btt.h), List.of(btt.e), List.of(btt.j));
   private static final Set<jr<btp>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wp i = wp.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dtv.a> l = Lists.newArrayList();
   private List<dtv.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   jr<btp> s;
   @Nullable
   jr<btp> t;
   @Nullable
   private wp u;
   private bsm v = bsm.a;
   private final csp w = new csp() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dtv.this.q;
            case 1 -> csi.a(dtv.this.s);
            case 2 -> csi.a(dtv.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dtv.this.q = $$1;
               break;
            case 1:
               if (!dtv.this.n.C && !dtv.this.l.isEmpty()) {
                  dtv.a(dtv.this.n, dtv.this.o, awa.bN);
               }

               dtv.this.s = dtv.a(csi.e($$1));
               break;
            case 2:
               dtv.this.t = dtv.a(csi.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jr<btp> a(@Nullable jr<btp> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dtv(ji $$0, dwy $$1) {
      super(duc.p, $$0, $$1);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dtv $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ji $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ji($$4, $$3.r + 1, $$6);
      }

      dtv.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(ect.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dwy $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dje $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dtv.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dtv.a(axk.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(djp.I)) {
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
      if ($$0.ad() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, awa.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.L_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awa.bK);

               for (are $$19 : $$0.a(are.class, new faw((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ap.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awa.bM);
            }
         }
      }
   }

   private static int a(dgj $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.L_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ji($$8, $$6, $$9)).a(awp.aP)) {
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
   public void av_() {
      a(this.n, this.o, awa.bM);
      super.av_();
   }

   private static void a(dgj $$0, ji $$1, int $$2, @Nullable jr<btp> $$3, @Nullable jr<btp> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         faw $$8 = new faw($$1).g($$5).b(0.0, (double)$$0.M_(), 0.0);
         List<coy> $$9 = $$0.a(coy.class, $$8);

         for (coy $$10 : $$9) {
            $$10.a(new btr($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (coy $$11 : $$9) {
               $$11.a(new btr($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dgj $$0, ji $$1, avz $$2) {
      $$0.a(null, $$1, $$2, awb.e, 1.0F, 1.0F);
   }

   public List<dtv.a> b() {
      return (List<dtv.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public abs c() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   private static void a(tq $$0, String $$1, @Nullable jr<btp> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jr<btp> a(tq $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akv $$2 = akv.c($$0.l($$1));
         return $$2 == null ? null : mb.d.c($$2).map(dtv::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = bsm.b($$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", wp.a.a(this.u, $$1));
      }

      this.v.a($$0, $$1);
   }

   public void a(@Nullable wp $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wp an() {
      return this.u;
   }

   @Nullable
   @Override
   public csd createMenu(int $$0, cox $$1, coy $$2) {
      return dtu.a($$2, this.v, this.p_()) ? new csi($$0, $$1, this.w, csq.a(this.n, this.aA_())) : null;
   }

   @Override
   public wp p_() {
      return this.al();
   }

   @Override
   public wp al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dua.b $$0) {
      super.a($$0);
      this.u = $$0.a(kv.g);
      this.v = $$0.a(kv.ao, bsm.a);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.u);
      if (!this.v.equals(bsm.a)) {
         $$0.a(kv.ao, this.v);
      }
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dgj $$0) {
      super.a($$0);
      this.r = $$0.L_() - 1;
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
