import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dsb extends dsg implements bsa, bsb {
   private static final int f = 4;
   public static final List<List<jp<btc>>> a = List.of(List.of(btg.a, btg.c), List.of(btg.k, btg.h), List.of(btg.e), List.of(btg.j));
   private static final Set<jp<btc>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xh i = xh.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dsb.a> l = Lists.newArrayList();
   private List<dsb.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   jp<btc> s;
   @Nullable
   jp<btc> t;
   @Nullable
   private xh u;
   private brz v = brz.a;
   private final crv w = new crv() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dsb.this.n;
            case 1 -> cro.a(dsb.this.s);
            case 2 -> cro.a(dsb.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsb.this.n = $$1;
               break;
            case 1:
               if (!dsb.this.o.C && !dsb.this.l.isEmpty()) {
                  dsb.a(dsb.this.o, dsb.this.p, awk.bN);
               }

               dsb.this.s = dsb.a(cro.e($$1));
               break;
            case 2:
               dsb.this.t = dsb.a(cro.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jp<btc> a(@Nullable jp<btc> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dsb(jg $$0, dvd $$1) {
      super(dsi.o, $$0, $$1);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dsb $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jg $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jg($$4, $$3.r + 1, $$6);
      }

      dsb.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(eaz.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dvd $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dhp $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dsb.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dsb.a(axu.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dia.F)) {
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
            a($$0, $$1, awk.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.n > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awk.bK);

               for (arn $$19 : $$0.a(arn.class, new ezc((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$19, $$3.n);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awk.bM);
            }
         }
      }
   }

   private static int a(dev $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jg($$8, $$6, $$9)).a(awz.aN)) {
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
      a(this.o, this.p, awk.bM);
      super.ax_();
   }

   private static void a(dev $$0, jg $$1, int $$2, @Nullable jp<btc> $$3, @Nullable jp<btc> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ezc $$8 = new ezc($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<coh> $$9 = $$0.a(coh.class, $$8);

         for (coh $$10 : $$9) {
            $$10.a(new bte($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (coh $$11 : $$9) {
               $$11.a(new bte($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dev $$0, jg $$1, awj $$2) {
      $$0.a(null, $$1, $$2, awl.e, 1.0F, 1.0F);
   }

   public List<dsb.a> b() {
      return (List<dsb.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public ack c() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.e($$0);
   }

   private static void a(uj $$0, String $$1, @Nullable jp<btc> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jp<btc> a(uj $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         alh $$2 = alh.c($$0.l($$1));
         return $$2 == null ? null : lx.d.c($$2).map(dsb::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = brz.b($$0);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", xh.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xh $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xh an() {
      return this.u;
   }

   @Nullable
   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      return dsa.a($$2, this.v, this.S_()) ? new cro($$0, $$1, this.w, crw.a(this.o, this.aC_())) : null;
   }

   @Override
   public xh S_() {
      return this.al();
   }

   @Override
   public xh al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.u = $$0.a(kt.g);
      this.v = $$0.a(kt.an, brz.a);
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.g, this.u);
      if (!this.v.equals(brz.a)) {
         $$0.a(kt.an, this.v);
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dev $$0) {
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
