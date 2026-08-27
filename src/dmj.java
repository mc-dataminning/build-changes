import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dmj extends dmo implements boj, bok {
   private static final int f = 4;
   public static final List<List<in<bpk>>> a = List.of(List.of(bpo.a, bpo.c), List.of(bpo.k, bpo.h), List.of(bpo.e), List.of(bpo.j));
   private static final Set<in<bpk>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wi i = wi.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dmj.a> l = Lists.newArrayList();
   private List<dmj.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   in<bpk> s;
   @Nullable
   in<bpk> t;
   @Nullable
   private wi u;
   private boi v = boi.a;
   private final cng w = new cng() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dmj.this.n;
            case 1 -> cmz.a(dmj.this.s);
            case 2 -> cmz.a(dmj.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dmj.this.n = $$1;
               break;
            case 1:
               if (!dmj.this.o.B && !dmj.this.l.isEmpty()) {
                  dmj.a(dmj.this.o, dmj.this.p, auo.bN);
               }

               dmj.this.s = dmj.a(cmz.e($$1));
               break;
            case 2:
               dmj.this.t = dmj.a(cmz.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static in<bpk> a(@Nullable in<bpk> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dmj(id $$0, dpi $$1) {
      super(dmq.o, $$0, $$1);
   }

   public static void a(czg $$0, id $$1, dpi $$2, dmj $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      id $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new id($$4, $$3.r + 1, $$6);
      }

      dmj.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dva.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dpi $$12 = $$0.a_($$7);
         dch $$13 = $$12.b();
         if ($$13 instanceof dby) {
            float[] $$14 = ((dby)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dmj.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dmj.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cym)$$0, $$7) >= 15 && !$$12.a(dcj.F)) {
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
      if ($$0.Y() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, auo.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, auo.bK);

               for (apv $$18 : $$0.a(apv.class, new ese((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, auo.bM);
            }
         }
      }
   }

   private static int a(czg $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new id($$8, $$6, $$9)).a(ave.aM)) {
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
      a(this.o, this.p, auo.bM);
      super.aw_();
   }

   private static void a(czg $$0, id $$1, int $$2, @Nullable in<bpk> $$3, @Nullable in<bpk> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ese $$8 = new ese($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cka> $$9 = $$0.a(cka.class, $$8);

         for (cka $$10 : $$9) {
            $$10.b(new bpm($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cka $$11 : $$9) {
               $$11.b(new bpm($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(czg $$0, id $$1, aun $$2) {
      $$0.a(null, $$1, $$2, aup.e, 1.0F, 1.0F);
   }

   public List<dmj.a> b() {
      return (List<dmj.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public abh c() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   private static void a(to $$0, String $$1, @Nullable in<bpk> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static in<bpk> a(to $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ajv $$2 = ajv.a($$0.l($$1));
         return $$2 == null ? null : kt.d.c($$2).map(dmj::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = wi.a.a($$0.l("CustomName"), $$1);
      }

      this.v = boi.b($$0);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", wi.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wi $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wi af() {
      return this.u;
   }

   @Nullable
   @Override
   public cmw createMenu(int $$0, cjz $$1, cka $$2) {
      return dmi.a($$2, this.v, this.O_()) ? new cmz($$0, $$1, this.w, cnh.a(this.o, this.az_())) : null;
   }

   @Override
   public wi O_() {
      return this.ad();
   }

   @Override
   public wi ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(jn $$0) {
      this.u = $$0.a(jr.d);
      this.v = $$0.a(jr.T, boi.a);
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.d, this.u);
      if (!this.v.equals(boi.a)) {
         $$0.a(jr.T, this.v);
      }
   }

   @Override
   public void a(to $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(czg $$0) {
      super.a($$0);
      this.r = $$0.I_() - 1;
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
