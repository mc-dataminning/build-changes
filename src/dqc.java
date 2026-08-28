import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqc extends dqh implements bqv, bqw {
   private static final int f = 4;
   public static final List<List<jm<brx>>> a = List.of(List.of(bsb.a, bsb.c), List.of(bsb.k, bsb.h), List.of(bsb.e), List.of(bsb.j));
   private static final Set<jm<brx>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wz i = wz.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dqc.a> l = Lists.newArrayList();
   private List<dqc.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   jm<brx> s;
   @Nullable
   jm<brx> t;
   @Nullable
   private wz u;
   private bqu v = bqu.a;
   private final cqf w = new cqf() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqc.this.q;
            case 1 -> cpy.a(dqc.this.s);
            case 2 -> cpy.a(dqc.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqc.this.q = $$1;
               break;
            case 1:
               if (!dqc.this.n.B && !dqc.this.l.isEmpty()) {
                  dqc.a(dqc.this.n, dqc.this.o, avp.bN);
               }

               dqc.this.s = dqc.a(cpy.e($$1));
               break;
            case 2:
               dqc.this.t = dqc.a(cpy.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jm<brx> a(@Nullable jm<brx> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dqc(jd $$0, dtc $$1) {
      super(dqj.o, $$0, $$1);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dqc $$3) {
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

      dqc.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dyy.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dtc $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dfp $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dqc.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dqc.a(axy.b.c($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dcc)$$0, $$7) >= 15 && !$$12.a(dga.F)) {
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
      if ($$0.Z() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, avp.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, avp.bK);

               for (aqv $$19 : $$0.a(aqv.class, new ewv((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, avp.bM);
            }
         }
      }
   }

   private static int a(dcw $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jd($$8, $$6, $$9)).a(awe.aM)) {
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
   public void aA_() {
      a(this.n, this.o, avp.bM);
      super.aA_();
   }

   private static void a(dcw $$0, jd $$1, int $$2, @Nullable jm<brx> $$3, @Nullable jm<brx> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ewv $$8 = new ewv($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cmx> $$9 = $$0.a(cmx.class, $$8);

         for (cmx $$10 : $$9) {
            $$10.b(new brz($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cmx $$11 : $$9) {
               $$11.b(new brz($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dcw $$0, jd $$1, avo $$2) {
      $$0.a(null, $$1, $$2, avq.e, 1.0F, 1.0F);
   }

   public List<dqc.a> b() {
      return (List<dqc.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public acb c() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.e($$0);
   }

   private static void a(ub $$0, String $$1, @Nullable jm<brx> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jm<brx> a(ub $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akr $$2 = akr.c($$0.l($$1));
         return $$2 == null ? null : lt.d.c($$2).map(dqc::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = bqu.b($$0);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", wz.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wz $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wz aj() {
      return this.u;
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      return dqb.a($$2, this.v, this.S_()) ? new cpy($$0, $$1, this.w, cqg.a(this.n, this.aD_())) : null;
   }

   @Override
   public wz S_() {
      return this.ah();
   }

   @Override
   public wz ah() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.u = $$0.a(kq.g);
      this.v = $$0.a(kq.ae, bqu.a);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.u);
      if (!this.v.equals(bqu.a)) {
         $$0.a(kq.ae, this.v);
      }
   }

   @Override
   public void a(ub $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dcw $$0) {
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
