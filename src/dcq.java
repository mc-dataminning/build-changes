import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dcq extends dcv implements bhb, bhc {
   private static final int f = 4;
   public static final bib[][] a = new bib[][]{{bif.a, bif.c}, {bif.k, bif.h}, {bif.e}, {bif.j}};
   private static final Set<bib> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final tl i = tl.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dcq.a> l = Lists.newArrayList();
   private List<dcq.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   bib s;
   @Nullable
   bib t;
   @Nullable
   private tl u;
   private bha v = bha.a;
   private final cev w = new cev() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dcq.this.n;
            case 1 -> ceo.a(dcq.this.s);
            case 2 -> ceo.a(dcq.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcq.this.n = $$1;
               break;
            case 1:
               if (!dcq.this.o.B && !dcq.this.l.isEmpty()) {
                  dcq.a(dcq.this.o, dcq.this.p, ape.by);
               }

               dcq.this.s = dcq.a(ceo.e($$1));
               break;
            case 2:
               dcq.this.t = dcq.a(ceo.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static bib a(@Nullable bib $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dcq(gw $$0, dfj $$1) {
      super(dcx.o, $$0, $$1);
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dcq $$3) {
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

      dcq.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dks.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dfj $$12 = $$0.a_($$7);
         csv $$13 = $$12.b();
         if ($$13 instanceof csm) {
            float[] $$14 = ((csm)$$13).a().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dcq.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dcq.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cpb)$$0, $$7) >= 15 && !$$12.a(csw.F)) {
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
            a($$0, $$1, ape.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.H_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, ape.bv);

               for (aks $$18 : $$0.a(aks.class, new ehi((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  al.l.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, ape.bx);
            }
         }
      }
   }

   private static int a(cpv $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.H_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new gw($$8, $$6, $$9)).a(apt.aL)) {
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
   public void at_() {
      a(this.o, this.p, ape.bx);
      super.at_();
   }

   private static void a(cpv $$0, gw $$1, int $$2, @Nullable bib $$3, @Nullable bib $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         ehi $$8 = new ehi($$1).g($$5).b(0.0, (double)$$0.I_(), 0.0);
         List<cbu> $$9 = $$0.a(cbu.class, $$8);

         for (cbu $$10 : $$9) {
            $$10.b(new bid($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cbu $$11 : $$9) {
               $$11.b(new bid($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cpv $$0, gw $$1, apd $$2) {
      $$0.a(null, $$1, $$2, apf.e, 1.0F, 1.0F);
   }

   public List<dcq.a> c() {
      return (List<dcq.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public xe f() {
      return xe.a(this);
   }

   @Override
   public qx as_() {
      return this.o();
   }

   private static void a(qx $$0, String $$1, @Nullable bib $$2) {
      if ($$2 != null) {
         aex $$3 = jd.e.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static bib a(qx $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         aex $$2 = aex.a($$0.l($$1));
         return a(jd.e.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = tl.a.a($$0.l("CustomName"));
      }

      this.v = bha.b($$0);
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", tl.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable tl $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public tl ae() {
      return this.u;
   }

   @Nullable
   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      return dcp.a($$2, this.v, this.N_()) ? new ceo($$0, $$1, this.w, cew.a(this.o, this.p())) : null;
   }

   @Override
   public tl N_() {
      return this.ac();
   }

   @Override
   public tl ac() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cpv $$0) {
      super.a($$0);
      this.r = $$0.H_() - 1;
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
