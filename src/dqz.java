import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqz extends dre implements brm, brn {
   private static final int f = 4;
   public static final List<List<jn<bso>>> a = List.of(List.of(bss.a, bss.c), List.of(bss.k, bss.h), List.of(bss.e), List.of(bss.j));
   private static final Set<jn<bso>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xd i = xd.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dqz.a> l = Lists.newArrayList();
   private List<dqz.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   jn<bso> s;
   @Nullable
   jn<bso> t;
   @Nullable
   private xd u;
   private brl v = brl.a;
   private final crc w = new crc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqz.this.n;
            case 1 -> cqv.a(dqz.this.s);
            case 2 -> cqv.a(dqz.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqz.this.n = $$1;
               break;
            case 1:
               if (!dqz.this.o.B && !dqz.this.l.isEmpty()) {
                  dqz.a(dqz.this.o, dqz.this.p, awd.bN);
               }

               dqz.this.s = dqz.a(cqv.e($$1));
               break;
            case 2:
               dqz.this.t = dqz.a(cqv.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jn<bso> a(@Nullable jn<bso> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dqz(je $$0, dua $$1) {
      super(drg.o, $$0, $$1);
   }

   public static void a(dds $$0, je $$1, dua $$2, dqz $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      je $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new je($$4, $$3.r + 1, $$6);
      }

      dqz.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dzw.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dua $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dgm $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dqz.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dqz.a(axn.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dgx.F)) {
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
            a($$0, $$1, awd.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.G_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$18 = $$3.n > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awd.bK);

               for (arh $$19 : $$0.a(arh.class, new exz((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  an.m.a($$19, $$3.n);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awd.bM);
            }
         }
      }
   }

   private static int a(dds $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.G_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new je($$8, $$6, $$9)).a(aws.aN)) {
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
   public void ay_() {
      a(this.o, this.p, awd.bM);
      super.ay_();
   }

   private static void a(dds $$0, je $$1, int $$2, @Nullable jn<bso> $$3, @Nullable jn<bso> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         exz $$8 = new exz($$1).g($$5).b(0.0, (double)$$0.H_(), 0.0);
         List<cnp> $$9 = $$0.a(cnp.class, $$8);

         for (cnp $$10 : $$9) {
            $$10.b(new bsq($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cnp $$11 : $$9) {
               $$11.b(new bsq($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dds $$0, je $$1, awc $$2) {
      $$0.a(null, $$1, $$2, awe.e, 1.0F, 1.0F);
   }

   public List<dqz.a> b() {
      return (List<dqz.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public acg c() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.e($$0);
   }

   private static void a(uf $$0, String $$1, @Nullable jn<bso> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jn<bso> a(uf $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         alb $$2 = alb.c($$0.l($$1));
         return $$2 == null ? null : lu.d.c($$2).map(dqz::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = brl.b($$0);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", xd.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xd $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xd al() {
      return this.u;
   }

   @Nullable
   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      return dqy.a($$2, this.v, this.Q_()) ? new cqv($$0, $$1, this.w, crd.a(this.o, this.aD_())) : null;
   }

   @Override
   public xd Q_() {
      return this.aj();
   }

   @Override
   public xd aj() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      this.u = $$0.a(kr.g);
      this.v = $$0.a(kr.ag, brl.a);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.g, this.u);
      if (!this.v.equals(brl.a)) {
         $$0.a(kr.ag, this.v);
      }
   }

   @Override
   public void a(uf $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dds $$0) {
      super.a($$0);
      this.r = $$0.G_() - 1;
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
