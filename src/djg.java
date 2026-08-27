import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class djg extends djl implements bmp, bmq {
   private static final int f = 4;
   public static final List<List<il<bnq>>> a = List.of(List.of(bnu.a, bnu.c), List.of(bnu.k, bnu.h), List.of(bnu.e), List.of(bnu.j));
   private static final Set<il<bnq>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final vs i = vs.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<djg.a> l = Lists.newArrayList();
   private List<djg.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   il<bnq> s;
   @Nullable
   il<bnq> t;
   @Nullable
   private vs u;
   private bmo v = bmo.a;
   private final cle w = new cle() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> djg.this.n;
            case 1 -> ckx.a(djg.this.s);
            case 2 -> ckx.a(djg.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               djg.this.n = $$1;
               break;
            case 1:
               if (!djg.this.o.B && !djg.this.l.isEmpty()) {
                  djg.a(djg.this.o, djg.this.p, atp.bL);
               }

               djg.this.s = djg.a(ckx.e($$1));
               break;
            case 2:
               djg.this.t = djg.a(ckx.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static il<bnq> a(@Nullable il<bnq> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public djg(ib $$0, dme $$1) {
      super(djn.o, $$0, $$1);
   }

   public static void a(cwe $$0, ib $$1, dme $$2, djg $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ib $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ib($$4, $$3.r + 1, $$6);
      }

      djg.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(drq.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dme $$12 = $$0.a_($$7);
         czf $$13 = $$12.b();
         if ($$13 instanceof cyw) {
            float[] $$14 = ((cyw)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new djg.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new djg.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cvk)$$0, $$7) >= 15 && !$$12.a(czh.F)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.r++;
      }

      int $$15 = $$3.n;
      if ($$0.X() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, atp.bJ);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, atp.bI);

               for (apb $$18 : $$0.a(apb.class, new eoq((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, atp.bK);
            }
         }
      }
   }

   private static int a(cwe $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ib($$8, $$6, $$9)).a(aue.aL)) {
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
      a(this.o, this.p, atp.bK);
      super.aA_();
   }

   private static void a(cwe $$0, ib $$1, int $$2, @Nullable il<bnq> $$3, @Nullable il<bnq> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         eoq $$8 = new eoq($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cia> $$9 = $$0.a(cia.class, $$8);

         for (cia $$10 : $$9) {
            $$10.b(new bns($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cia $$11 : $$9) {
               $$11.b(new bns($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cwe $$0, ib $$1, ato $$2) {
      $$0.a(null, $$1, $$2, atq.e, 1.0F, 1.0F);
   }

   public List<djg.a> b() {
      return (List<djg.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public aap c() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   private static void a(sy $$0, String $$1, @Nullable il<bnq> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static il<bnq> a(sy $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ajc $$2 = ajc.a($$0.l($$1));
         return $$2 == null ? null : kh.d.c($$2).map(djg::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = vs.a.a($$0.l("CustomName"));
      }

      this.v = bmo.b($$0);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", vs.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable vs $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public vs af() {
      return this.u;
   }

   @Nullable
   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      return djf.a($$2, this.v, this.Q_()) ? new ckx($$0, $$1, this.w, clf.a(this.o, this.aD_())) : null;
   }

   @Override
   public vs Q_() {
      return this.ad();
   }

   @Override
   public vs ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cwe $$0) {
      super.a($$0);
      this.r = $$0.J_() - 1;
   }

   public static class a {
      final float[] a;
      private int b;

      public a(float[] $$0) {
         this.a = $$0;
         this.b = 1;
      }

      protected void a() {
         this.b++;
      }

      public float[] b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
