import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dgp extends dgu implements bkd, bke {
   private static final int f = 4;
   public static final blf[][] a = new blf[][]{{blj.a, blj.c}, {blj.k, blj.h}, {blj.e}, {blj.j}};
   private static final Set<blf> g = Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final vf i = vf.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dgp.a> l = Lists.newArrayList();
   private List<dgp.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   blf s;
   @Nullable
   blf t;
   @Nullable
   private vf u;
   private bkc v = bkc.a;
   private final cik w = new cik() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dgp.this.n;
            case 1 -> cid.a(dgp.this.s);
            case 2 -> cid.a(dgp.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgp.this.n = $$1;
               break;
            case 1:
               if (!dgp.this.o.B && !dgp.this.l.isEmpty()) {
                  dgp.a(dgp.this.o, dgp.this.p, arr.by);
               }

               dgp.this.s = dgp.a(cid.e($$1));
               break;
            case 2:
               dgp.this.t = dgp.a(cid.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static blf a(@Nullable blf $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dgp(hx $$0, djg $$1) {
      super(dgw.o, $$0, $$1);
   }

   public static void a(cto $$0, hx $$1, djg $$2, dgp $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      hx $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new hx($$4, $$3.r + 1, $$6);
      }

      dgp.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dop.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         djg $$12 = $$0.a_($$7);
         cwp $$13 = $$12.b();
         if ($$13 instanceof cwg) {
            float[] $$14 = ((cwg)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dgp.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dgp.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((csu)$$0, $$7) >= 15 && !$$12.a(cwr.F)) {
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
            a($$0, $$1, arr.bw);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, arr.bv);

               for (ane $$18 : $$0.a(ane.class, new eln((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, arr.bx);
            }
         }
      }
   }

   private static int a(cto $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new hx($$8, $$6, $$9)).a(asg.aL)) {
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
      a(this.o, this.p, arr.bx);
      super.ay_();
   }

   private static void a(cto $$0, hx $$1, int $$2, @Nullable blf $$3, @Nullable blf $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         eln $$8 = new eln($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<cfh> $$9 = $$0.a(cfh.class, $$8);

         for (cfh $$10 : $$9) {
            $$10.b(new blh($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for (cfh $$11 : $$9) {
               $$11.b(new blh($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cto $$0, hx $$1, arq $$2) {
      $$0.a(null, $$1, $$2, ars.e, 1.0F, 1.0F);
   }

   public List<dgp.a> c() {
      return (List<dgp.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public zh f() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   private static void a(sn $$0, String $$1, @Nullable blf $$2) {
      if ($$2 != null) {
         ahg $$3 = kd.d.b($$2);
         if ($$3 != null) {
            $$0.a($$1, $$3.toString());
         }
      }
   }

   @Nullable
   private static blf a(sn $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ahg $$2 = ahg.a($$0.l($$1));
         return a(kd.d.a($$2));
      } else {
         return null;
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = vf.a.a($$0.l("CustomName"));
      }

      this.v = bkc.b($$0);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", vf.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable vf $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public vf af() {
      return this.u;
   }

   @Nullable
   @Override
   public cia createMenu(int $$0, cfg $$1, cfh $$2) {
      return dgo.a($$2, this.v, this.Q_()) ? new cid($$0, $$1, this.w, cil.a(this.o, this.aB_())) : null;
   }

   @Override
   public vf Q_() {
      return this.ad();
   }

   @Override
   public vf ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cto $$0) {
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
