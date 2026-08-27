import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dcg extends dcl implements bgt, bgu {
   private static final int f = 4;
   public static final bht[][] a = new bht[][]{{bhx.a, bhx.c}, {bhx.k, bhx.h}, {bhx.e}, {bhx.j}};
   private static final Set<bht> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final tf i = tf.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dcg.a> l = Lists.newArrayList();
   private List<dcg.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bht s;
   @Nullable
   bht t;
   @Nullable
   private tf u;
   private bgs v = bgs.a;
   private final cen w = new cen() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dcg.this.n;
            case 1 -> ceg.a(dcg.this.s);
            case 2 -> ceg.a(dcg.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcg.this.n = $$1;
               break;
            case 1:
               if (!dcg.this.o.B && !dcg.this.l.isEmpty()) {
                  dcg.a(dcg.this.o, dcg.this.p, aow.by);
               }

               dcg.this.s = dcg.a(ceg.e($$1));
               break;
            case 2:
               dcg.this.t = dcg.a(ceg.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bht a(@Nullable bht $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dcg(gu $$0, dez $$1) {
      super(dcn.o, $$0, $$1);
   }

   public static void a(cpl $$0, gu $$1, dez $$2, dcg $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      gu $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new gu($$4, $$3.r + 1, $$6);
      }

      dcg.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dki.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dez $$12 = $$0.a_($$7);
         csl $$13 = $$12.b();
         if ($$13 instanceof csc) {
            float[] $$14 = ((csc)$$13).a().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dcg.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dcg.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cor)$$0, $$7) >= 15 && !$$12.a(csm.F)) {
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
      if ($$0.V() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, aow.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.C_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aow.bv);

               for (akl $$18 : $$0.a(akl.class, new egy((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ai.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aow.bx);
            }
         }
      }
   }

   private static int a(cpl $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.C_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new gu($$8, $$6, $$9)).a(apl.aL)) {
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
   public void ao_() {
      a(this.o, this.p, aow.bx);
      super.ao_();
   }

   private static void a(cpl $$0, gu $$1, int $$2, @Nullable bht $$3, @Nullable bht $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         egy $$8 = new egy($$1).g($$5).b(0.0, (double)$$0.D_(), 0.0);
         List<cbm> $$9 = $$0.a(cbm.class, $$8);

         for (cbm $$10 : $$9) {
            $$10.b(new bhv($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cbm $$11 : $$9) {
               $$11.b(new bhv($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cpl $$0, gu $$1, aov $$2) {
      $$0.a(null, $$1, $$2, aox.e, 1.0F, 1.0F);
   }

   public List<dcg.a> c() {
      return (List<dcg.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public wx f() {
      return wx.a(this);
   }

   @Override
   public qr an_() {
      return this.o();
   }

   private static void a(qr $$0, String $$1, @Nullable bht $$2) {
      if ($$2 != null) {
         aer $$3 = jb.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bht a(qr $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         aer $$2 = aer.a($$0.l($$1));
         return a(jb.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = tf.a.a($$0.l("CustomName"));
      }

      this.v = bgs.b($$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", tf.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable tf $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public tf ad() {
      return this.u;
   }

   @Nullable
   @Override
   public ced createMenu(int $$0, cbl $$1, cbm $$2) {
      return dcf.a($$2, this.v, this.H_()) ? new ceg($$0, $$1, this.w, ceo.a(this.o, this.p())) : null;
   }

   @Override
   public tf H_() {
      return this.ab();
   }

   @Override
   public tf ab() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cpl $$0) {
      super.a($$0);
      this.r = $$0.C_() - 1;
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
