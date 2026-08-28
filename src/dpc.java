import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpc extends dph implements bqy, bqz {
   private static final int f = 4;
   public static final List<List<ji<bsa>>> a = List.of(List.of(bse.a, bse.c), List.of(bse.k, bse.h), List.of(bse.e), List.of(bse.j));
   private static final Set<ji<bsa>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xp i = xp.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dpc.a> l = Lists.newArrayList();
   private List<dpc.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   ji<bsa> s;
   @Nullable
   ji<bsa> t;
   @Nullable
   private xp u;
   private bqx v = bqx.a;
   private final cqe w = new cqe() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpc.this.q;
            case 1 -> cpx.a(dpc.this.s);
            case 2 -> cpx.a(dpc.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpc.this.q = $$1;
               break;
            case 1:
               if (!dpc.this.n.B && !dpc.this.l.isEmpty()) {
                  dpc.a(dpc.this.n, dpc.this.o, awa.bN);
               }

               dpc.this.s = dpc.a(cpx.e($$1));
               break;
            case 2:
               dpc.this.t = dpc.a(cpx.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static ji<bsa> a(@Nullable ji<bsa> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dpc(iz $$0, dsc $$1) {
      super(dpj.o, $$0, $$1);
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dpc $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      iz $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new iz($$4, $$3.r + 1, $$6);
      }

      dpc.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dxu.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dsc $$12 = $$0.a_($$7);
         dez $$13 = $$12.b();
         if ($$13 instanceof deq) {
            float[] $$14 = ((deq)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dpc.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dpc.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((dbe)$$0, $$7) >= 15 && !$$12.a(dfb.F)) {
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
      if ($$0.Z() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, awa.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.I_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.q > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, awa.bK);

               for (arg $$18 : $$0.a(arg.class, new evm((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.q);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, awa.bM);
            }
         }
      }
   }

   private static int a(dby $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.I_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new iz($$8, $$6, $$9)).a(awp.aM)) {
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
   public void av_() {
      a(this.n, this.o, awa.bM);
      super.av_();
   }

   private static void a(dby $$0, iz $$1, int $$2, @Nullable ji<bsa> $$3, @Nullable ji<bsa> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         evm $$8 = new evm($$1).g($$5).b(0.0, (double)$$0.J_(), 0.0);
         List<cmx> $$9 = $$0.a(cmx.class, $$8);

         for (cmx $$10 : $$9) {
            $$10.b(new bsc($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cmx $$11 : $$9) {
               $$11.b(new bsc($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dby $$0, iz $$1, avz $$2) {
      $$0.a(null, $$1, $$2, awb.e, 1.0F, 1.0F);
   }

   public List<dpc.a> b() {
      return (List<dpc.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public acp c() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   private static void a(us $$0, String $$1, @Nullable ji<bsa> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static ji<bsa> a(us $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         alf $$2 = alf.a($$0.l($$1));
         return $$2 == null ? null : lp.d.c($$2).map(dpc::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = xp.a.a($$0.l("CustomName"), $$1);
      }

      this.v = bqx.b($$0);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", xp.a.a(this.u, $$1));
      }

      this.v.a($$0);
   }

   public void a(@Nullable xp $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xp ah() {
      return this.u;
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      return dpb.a($$2, this.v, this.O_()) ? new cpx($$0, $$1, this.w, cqf.a(this.n, this.ay_())) : null;
   }

   @Override
   public xp O_() {
      return this.af();
   }

   @Override
   public xp af() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dph.b $$0) {
      super.a($$0);
      this.u = $$0.a(km.g);
      this.v = $$0.a(km.ad, bqx.a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.g, this.u);
      if (!this.v.equals(bqx.a)) {
         $$0.a(km.ad, this.v);
      }
   }

   @Override
   public void a(us $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }

   @Override
   public void a(dby $$0) {
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
