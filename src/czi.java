import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class czi extends czn implements bea, beb {
   private static final int f = 4;
   public static final bey[][] a = new bey[][]{{bfc.a, bfc.c}, {bfc.k, bfc.h}, {bfc.e}, {bfc.j}};
   private static final Set<bey> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final sw i = sw.c("container.beacon");
   List<czi.a> j = Lists.newArrayList();
   private List<czi.a> k = Lists.newArrayList();
   int l;
   private int m;
   @Nullable
   bey n;
   @Nullable
   bey r;
   @Nullable
   private sw s;
   private bdz t = bdz.a;
   private final cbp u = new cbp() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> czi.this.l;
            case 1 -> bey.b(czi.this.n);
            case 2 -> bey.b(czi.this.r);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               czi.this.l = $$1;
               break;
            case 1:
               if (!czi.this.o.B && !czi.this.j.isEmpty()) {
                  czi.a(czi.this.o, czi.this.p, amh.by);
               }

               czi.this.n = czi.a($$1);
               break;
            case 2:
               czi.this.r = czi.a($$1);
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   public czi(gu $$0, dcb $$1) {
      super(czp.o, $$0, $$1);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czi $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      gu $$7;
      if ($$3.m < $$5) {
         $$7 = $$1;
         $$3.k = Lists.newArrayList();
         $$3.m = $$1.v() - 1;
      } else {
         $$7 = new gu($$4, $$3.m + 1, $$6);
      }

      czi.a $$9 = $$3.k.isEmpty() ? null : $$3.k.get($$3.k.size() - 1);
      int $$10 = $$0.a(dhk.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dcb $$12 = $$0.a_($$7);
         cpn $$13 = $$12.b();
         if ($$13 instanceof cpe) {
            float[] $$14 = ((cpe)$$13).a().d();
            if ($$3.k.size() <= 1) {
               $$9 = new czi.a($$14);
               $$3.k.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new czi.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.k.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cls)$$0, $$7) >= 15 && !$$12.a(cpo.F)) {
               $$3.k.clear();
               $$3.m = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.c();
         $$3.m++;
      }

      int $$15 = $$3.l;
      if ($$0.V() % 80L == 0L) {
         if (!$$3.j.isEmpty()) {
            $$3.l = a($$0, $$4, $$5, $$6);
         }

         if ($$3.l > 0 && !$$3.j.isEmpty()) {
            a($$0, $$1, $$3.l, $$3.n, $$3.r);
            a($$0, $$1, amh.bw);
         }
      }

      if ($$3.m >= $$10) {
         $$3.m = $$0.C_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.j = $$3.k;
         if (!$$0.B) {
            boolean $$17 = $$3.l > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, amh.bv);

               for (aig $$18 : $$0.a(aig.class, new eed((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ai.l.a($$18, $$3.l);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, amh.bx);
            }
         }
      }
   }

   private static int a(cmm $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.C_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new gu($$8, $$6, $$9)).a(amw.aK)) {
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
   public void ap_() {
      a(this.o, this.p, amh.bx);
      super.ap_();
   }

   private static void a(cmm $$0, gu $$1, int $$2, @Nullable bey $$3, @Nullable bey $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         eed $$8 = new eed($$1).g($$5).b(0.0, (double)$$0.D_(), 0.0);
         List<byo> $$9 = $$0.a(byo.class, $$8);

         for (byo $$10 : $$9) {
            $$10.b(new bfa($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (byo $$11 : $$9) {
               $$11.b(new bfa($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cmm $$0, gu $$1, amg $$2) {
      $$0.a(null, $$1, $$2, ami.e, 1.0F, 1.0F);
   }

   public List<czi.a> c() {
      return (List<czi.a>)(this.l == 0 ? ImmutableList.of() : this.j);
   }

   public uz f() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   @Nullable
   static bey a(int $$0) {
      bey $$1 = bey.a($$0);
      return g.contains($$1) ? $$1 : null;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.n = a($$0.h("Primary"));
      this.r = a($$0.h("Secondary"));
      if ($$0.b("CustomName", 8)) {
         this.s = sw.a.a($$0.l("CustomName"));
      }

      this.t = bdz.b($$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("Primary", bey.b(this.n));
      $$0.a("Secondary", bey.b(this.r));
      $$0.a("Levels", this.l);
      if (this.s != null) {
         $$0.a("CustomName", sw.a.a(this.s));
      }

      this.t.a($$0);
   }

   public void a(@Nullable sw $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public sw ab() {
      return this.s;
   }

   @Nullable
   @Override
   public cbf createMenu(int $$0, byn $$1, byo $$2) {
      return czh.a($$2, this.t, this.H_()) ? new cbi($$0, $$1, this.u, cbq.a(this.o, this.p())) : null;
   }

   @Override
   public sw H_() {
      return this.Z();
   }

   @Override
   public sw Z() {
      return this.s != null ? this.s : i;
   }

   @Override
   public void a(cmm $$0) {
      super.a($$0);
      this.m = $$0.C_() - 1;
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
