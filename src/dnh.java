import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dnh extends dnm implements bpq, bpr {
   private static final int f = 4;
   public static final List<List<iw<bqr>>> a = List.of(List.of(bqv.a, bqv.c), List.of(bqv.k, bqv.h), List.of(bqv.e), List.of(bqv.j));
   private static final Set<iw<bqr>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wu i = wu.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dnh.a> l = Lists.newArrayList();
   private List<dnh.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   iw<bqr> s;
   @Nullable
   iw<bqr> t;
   @Nullable
   private wu u;
   private bpp v = bpp.a;
   private final coo w = new coo() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dnh.this.q;
            case 1 -> cog.a(dnh.this.s);
            case 2 -> cog.a(dnh.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dnh.this.q = $$1;
               break;
            case 1:
               if (!dnh.this.n.B && !dnh.this.l.isEmpty()) {
                  dnh.a(dnh.this.n, dnh.this.o, avc.bN);
               }

               dnh.this.s = dnh.a(cog.e($$1));
               break;
            case 2:
               dnh.this.t = dnh.a(cog.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static iw<bqr> a(@Nullable iw<bqr> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dnh(in $$0, dqh $$1) {
      super(dno.o, $$0, $$1);
   }

   public static void a(dad $$0, in $$1, dqh $$2, dnh $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      in $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new in($$4, $$3.r + 1, $$6);
      }

      dnh.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dvz.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dqh $$12 = $$0.a_($$7);
         dde $$13 = $$12.b();
         if ($$13 instanceof dcv) {
            float[] $$14 = ((dcv)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dnh.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dnh.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((czj)$$0, $$7) >= 15 && !$$12.a(ddg.F)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.r++;
      }

      int $$15 = $$3.q;
      if ($$0.Y() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, avc.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.q > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, avc.bK);

               for (aqi $$18 : $$0.a(aqi.class, new etk((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.q);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, avc.bM);
            }
         }
      }
   }

   private static int a(dad $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new in($$8, $$6, $$9)).a(avr.aM)) {
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
      a(this.n, this.o, avc.bM);
      super.aw_();
   }

   private static void a(dad $$0, in $$1, int $$2, @Nullable iw<bqr> $$3, @Nullable iw<bqr> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         etk $$8 = new etk($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<clh> $$9 = $$0.a(clh.class, $$8);

         for (clh $$10 : $$9) {
            $$10.b(new bqt($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (clh $$11 : $$9) {
               $$11.b(new bqt($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dad $$0, in $$1, avb $$2) {
      $$0.a(null, $$1, $$2, avd.e, 1.0F, 1.0F);
   }

   public List<dnh.a> b() {
      return (List<dnh.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public abt c() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   private static void a(ua $$0, String $$1, @Nullable iw<bqr> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static iw<bqr> a(ua $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         akh $$2 = akh.a($$0.l($$1));
         return $$2 == null ? null : ld.d.c($$2).map(dnh::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = wu.a.a($$0.l("CustomName"), $$1);
      }

      this.v = bpp.b($$0);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", wu.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable wu $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wu af() {
      return this.u;
   }

   @Nullable
   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      return dng.a($$2, this.v, this.O_()) ? new cog($$0, $$1, this.w, cop.a(this.n, this.az_())) : null;
   }

   @Override
   public wu O_() {
      return this.ad();
   }

   @Override
   public wu ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(jw $$0) {
      this.u = $$0.a(ka.f);
      this.v = $$0.a(ka.aa, bpp.a);
   }

   @Override
   public void a(jw.a $$0) {
      $$0.a(ka.f, this.u);
      if (!this.v.equals(bpp.a)) {
         $$0.a(ka.aa, this.v);
      }
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dad $$0) {
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
