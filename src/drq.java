import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class drq extends drv implements bru, brv {
   private static final int f = 4;
   public static final List<List<jo<bsw>>> a = List.of(List.of(bta.a, bta.c), List.of(bta.k, bta.h), List.of(bta.e), List.of(bta.j));
   private static final Set<jo<bsw>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xe i = xe.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<drq.a> l = Lists.newArrayList();
   private List<drq.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   jo<bsw> s;
   @Nullable
   jo<bsw> t;
   @Nullable
   private xe u;
   private brt v = brt.a;
   private final crl w = new crl() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> drq.this.n;
            case 1 -> cre.a(drq.this.s);
            case 2 -> cre.a(drq.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               drq.this.n = $$1;
               break;
            case 1:
               if (!drq.this.o.B && !drq.this.l.isEmpty()) {
                  drq.a(drq.this.o, drq.this.p, awg.bN);
               }

               drq.this.s = drq.a(cre.e($$1));
               break;
            case 2:
               drq.this.t = drq.a(cre.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jo<bsw> a(@Nullable jo<bsw> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public drq(jf $$0, dus $$1) {
      super(drx.o, $$0, $$1);
   }

   public static void a(dej $$0, jf $$1, dus $$2, drq $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jf $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jf($$4, $$3.r + 1, $$6);
      }

      drq.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(eao.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dus $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dhd $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new drq.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new drq.a(axq.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dho.F)) {
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
            a($$0, $$1, awg.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.H_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$18 = $$3.n > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awg.bK);

               for (ark $$19 : $$0.a(ark.class, new eyr((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$19, $$3.n);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awg.bM);
            }
         }
      }
   }

   private static int a(dej $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.H_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jf($$8, $$6, $$9)).a(awv.aN)) {
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
      a(this.o, this.p, awg.bM);
      super.ax_();
   }

   private static void a(dej $$0, jf $$1, int $$2, @Nullable jo<bsw> $$3, @Nullable jo<bsw> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         eyr $$8 = new eyr($$1).g($$5).b(0.0, (double)$$0.I_(), 0.0);
         List<cnx> $$9 = $$0.a(cnx.class, $$8);

         for (cnx $$10 : $$9) {
            $$10.a(new bsy($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cnx $$11 : $$9) {
               $$11.a(new bsy($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dej $$0, jf $$1, awf $$2) {
      $$0.a(null, $$1, $$2, awh.e, 1.0F, 1.0F);
   }

   public List<drq.a> b() {
      return (List<drq.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public ach c() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.e($$0);
   }

   private static void a(ug $$0, String $$1, @Nullable jo<bsw> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jo<bsw> a(ug $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ale $$2 = ale.c($$0.l($$1));
         return $$2 == null ? null : lv.d.c($$2).map(drq::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = brt.b($$0);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", xe.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xe $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xe al() {
      return this.u;
   }

   @Nullable
   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      return drp.a($$2, this.v, this.R_()) ? new cre($$0, $$1, this.w, crm.a(this.o, this.aC_())) : null;
   }

   @Override
   public xe R_() {
      return this.aj();
   }

   @Override
   public xe aj() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.u = $$0.a(ks.g);
      this.v = $$0.a(ks.aj, brt.a);
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.g, this.u);
      if (!this.v.equals(brt.a)) {
         $$0.a(ks.aj, this.v);
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dej $$0) {
      super.a($$0);
      this.r = $$0.H_() - 1;
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
