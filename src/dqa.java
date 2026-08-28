import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqa extends dqf implements bqu, bqv {
   private static final int f = 4;
   public static final List<List<jm<brw>>> a = List.of(List.of(bsa.a, bsa.c), List.of(bsa.k, bsa.h), List.of(bsa.e), List.of(bsa.j));
   private static final Set<jm<brw>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wy i = wy.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dqa.a> l = Lists.newArrayList();
   private List<dqa.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   jm<brw> s;
   @Nullable
   jm<brw> t;
   @Nullable
   private wy u;
   private bqt v = bqt.a;
   private final cqd w = new cqd() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqa.this.q;
            case 1 -> cpw.a(dqa.this.s);
            case 2 -> cpw.a(dqa.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqa.this.q = $$1;
               break;
            case 1:
               if (!dqa.this.n.B && !dqa.this.l.isEmpty()) {
                  dqa.a(dqa.this.n, dqa.this.o, avo.bN);
               }

               dqa.this.s = dqa.a(cpw.e($$1));
               break;
            case 2:
               dqa.this.t = dqa.a(cpw.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jm<brw> a(@Nullable jm<brw> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dqa(jd $$0, dta $$1) {
      super(dqh.o, $$0, $$1);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dqa $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jd $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jd($$4, $$3.r + 1, $$6);
      }

      dqa.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dyv.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dta $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dfn $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dqa.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dqa.a(axx.b.c($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dca)$$0, $$7) >= 15 && !$$12.a(dfy.F)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.r++;
      }

      int $$16 = $$3.q;
      if ($$0.Z() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, avo.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, avo.bK);

               for (aqu $$19 : $$0.a(aqu.class, new ewr((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, avo.bM);
            }
         }
      }
   }

   private static int a(dcu $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jd($$8, $$6, $$9)).a(awd.aM)) {
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
      a(this.n, this.o, avo.bM);
      super.aw_();
   }

   private static void a(dcu $$0, jd $$1, int $$2, @Nullable jm<brw> $$3, @Nullable jm<brw> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ewr $$8 = new ewr($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cmv> $$9 = $$0.a(cmv.class, $$8);

         for (cmv $$10 : $$9) {
            $$10.b(new bry($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cmv $$11 : $$9) {
               $$11.b(new bry($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dcu $$0, jd $$1, avn $$2) {
      $$0.a(null, $$1, $$2, avp.e, 1.0F, 1.0F);
   }

   public List<dqa.a> b() {
      return (List<dqa.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public aca c() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.e($$0);
   }

   private static void a(ua $$0, String $$1, @Nullable jm<brw> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jm<brw> a(ua $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akq $$2 = akq.c($$0.l($$1));
         return $$2 == null ? null : lt.d.c($$2).map(dqa::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = bqt.b($$0);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", wy.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wy $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wy aj() {
      return this.u;
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      return dpz.a($$2, this.v, this.O_()) ? new cpw($$0, $$1, this.w, cqe.a(this.n, this.az_())) : null;
   }

   @Override
   public wy O_() {
      return this.ah();
   }

   @Override
   public wy ah() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.u = $$0.a(kq.g);
      this.v = $$0.a(kq.ae, bqt.a);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.u);
      if (!this.v.equals(bqt.a)) {
         $$0.a(kq.ae, this.v);
      }
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dcu $$0) {
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
