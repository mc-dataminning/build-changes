import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dcl extends dcq implements bgw, bgx {
   private static final int f = 4;
   public static final bhw[][] a = new bhw[][]{{bia.a, bia.c}, {bia.k, bia.h}, {bia.e}, {bia.j}};
   private static final Set<bhw> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final ti i = ti.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dcl.a> l = Lists.newArrayList();
   private List<dcl.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bhw s;
   @Nullable
   bhw t;
   @Nullable
   private ti u;
   private bgv v = bgv.a;
   private final ceq w = new ceq() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dcl.this.n;
            case 1 -> cej.a(dcl.this.s);
            case 2 -> cej.a(dcl.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcl.this.n = $$1;
               break;
            case 1:
               if (!dcl.this.o.B && !dcl.this.l.isEmpty()) {
                  dcl.a(dcl.this.o, dcl.this.p, aoz.by);
               }

               dcl.this.s = dcl.a(cej.e($$1));
               break;
            case 2:
               dcl.this.t = dcl.a(cej.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bhw a(@Nullable bhw $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dcl(gw $$0, dfe $$1) {
      super(dcs.o, $$0, $$1);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dcl $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      gw $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new gw($$4, $$3.r + 1, $$6);
      }

      dcl.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dkn.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dfe $$12 = $$0.a_($$7);
         csq $$13 = $$12.b();
         if ($$13 instanceof csh) {
            float[] $$14 = ((csh)$$13).a().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dcl.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dcl.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cow)$$0, $$7) >= 15 && !$$12.a(csr.F)) {
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
            a($$0, $$1, aoz.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.C_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, aoz.bv);

               for (ako $$18 : $$0.a(ako.class, new ehd((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  al.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, aoz.bx);
            }
         }
      }
   }

   private static int a(cpq $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.C_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new gw($$8, $$6, $$9)).a(apo.aL)) {
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
      a(this.o, this.p, aoz.bx);
      super.ao_();
   }

   private static void a(cpq $$0, gw $$1, int $$2, @Nullable bhw $$3, @Nullable bhw $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ehd $$8 = new ehd($$1).g($$5).b(0.0, (double)$$0.D_(), 0.0);
         List<cbp> $$9 = $$0.a(cbp.class, $$8);

         for (cbp $$10 : $$9) {
            $$10.b(new bhy($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cbp $$11 : $$9) {
               $$11.b(new bhy($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cpq $$0, gw $$1, aoy $$2) {
      $$0.a(null, $$1, $$2, apa.e, 1.0F, 1.0F);
   }

   public List<dcl.a> c() {
      return (List<dcl.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public xa f() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   private static void a(qu $$0, String $$1, @Nullable bhw $$2) {
      if ($$2 != null) {
         aeu $$3 = jd.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bhw a(qu $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         aeu $$2 = aeu.a($$0.l($$1));
         return a(jd.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = ti.a.a($$0.l("CustomName"));
      }

      this.v = bgv.b($$0);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", ti.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable ti $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public ti ad() {
      return this.u;
   }

   @Nullable
   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      return dck.a($$2, this.v, this.H_()) ? new cej($$0, $$1, this.w, cer.a(this.o, this.p())) : null;
   }

   @Override
   public ti H_() {
      return this.ab();
   }

   @Override
   public ti ab() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cpq $$0) {
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
