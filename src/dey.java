import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dey extends dfd implements bja, bjb {
   private static final int f = 4;
   public static final bkb[][] a = new bkb[][]{{bkf.a, bkf.c}, {bkf.k, bkf.h}, {bkf.e}, {bkf.j}};
   private static final Set<bkb> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final ur i = ur.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dey.a> l = Lists.newArrayList();
   private List<dey.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bkb s;
   @Nullable
   bkb t;
   @Nullable
   private ur u;
   private biz v = biz.a;
   private final cgw w = new cgw() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dey.this.n;
            case 1 -> cgp.a(dey.this.s);
            case 2 -> cgp.a(dey.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dey.this.n = $$1;
               break;
            case 1:
               if (!dey.this.o.B && !dey.this.l.isEmpty()) {
                  dey.a(dey.this.o, dey.this.p, aqr.by);
               }

               dey.this.s = dey.a(cgp.e($$1));
               break;
            case 2:
               dey.this.t = dey.a(cgp.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bkb a(@Nullable bkb $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dey(ht $$0, dhi $$1) {
      super(dff.o, $$0, $$1);
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dey $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ht $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ht($$4, $$3.r + 1, $$6);
      }

      dey.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dmr.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dhi $$12 = $$0.a_($$7);
         cva $$13 = $$12.b();
         if ($$13 instanceof cur) {
            float[] $$14 = ((cur)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dey.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dey.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((crg)$$0, $$7) >= 15 && !$$12.a(cvc.F)) {
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
      if ($$0.W() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, aqr.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aqr.bv);

               for (amf $$18 : $$0.a(amf.class, new ejp((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  al.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aqr.bx);
            }
         }
      }
   }

   private static int a(csa $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ht($$8, $$6, $$9)).a(arg.aL)) {
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
      a(this.o, this.p, aqr.bx);
      super.ax_();
   }

   private static void a(csa $$0, ht $$1, int $$2, @Nullable bkb $$3, @Nullable bkb $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ejp $$8 = new ejp($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cdu> $$9 = $$0.a(cdu.class, $$8);

         for (cdu $$10 : $$9) {
            $$10.b(new bkd($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cdu $$11 : $$9) {
               $$11.b(new bkd($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(csa $$0, ht $$1, aqq $$2) {
      $$0.a(null, $$1, $$2, aqs.e, 1.0F, 1.0F);
   }

   public List<dey.a> c() {
      return (List<dey.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public yk f() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      return this.o();
   }

   private static void a(rz $$0, String $$1, @Nullable bkb $$2) {
      if ($$2 != null) {
         agi $$3 = jy.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bkb a(rz $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         agi $$2 = agi.a($$0.l($$1));
         return a(jy.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = ur.a.a($$0.l("CustomName"));
      }

      this.v = biz.b($$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", ur.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable ur $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public ur af() {
      return this.u;
   }

   @Nullable
   @Override
   public cgm createMenu(int $$0, cdt $$1, cdu $$2) {
      return dex.a($$2, this.v, this.P_()) ? new cgp($$0, $$1, this.w, cgx.a(this.o, this.p())) : null;
   }

   @Override
   public ur P_() {
      return this.ad();
   }

   @Override
   public ur ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(csa $$0) {
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
