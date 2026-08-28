import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dvg extends dvl implements bts, btt, dvf {
   private static final int f = 4;
   public static final List<List<js<buu>>> a = List.of(List.of(buy.a, buy.c), List.of(buy.k, buy.h), List.of(buy.e), List.of(buy.j));
   private static final Set<js<buu>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wv i = wv.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dvf.a> l = new ArrayList<>();
   private List<dvf.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   js<buu> s;
   @Nullable
   js<buu> t;
   @Nullable
   private wv u;
   private btr v = btr.a;
   private final ctz w = new ctz() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dvg.this.q;
            case 1 -> cts.a(dvg.this.s);
            case 2 -> cts.a(dvg.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dvg.this.q = $$1;
               break;
            case 1:
               if (!dvg.this.n.C && !dvg.this.l.isEmpty()) {
                  dvg.a(dvg.this.n, dvg.this.o, awk.bN);
               }

               dvg.this.s = dvg.a(cts.e($$1));
               break;
            case 2:
               dvg.this.t = dvg.a(cts.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static js<buu> a(@Nullable js<buu> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dvg(jj $$0, dym $$1) {
      super(dvn.p, $$0, $$1);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dvg $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jj $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jj($$4, $$3.r + 1, $$6);
      }

      dvf.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(eel.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dym $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dkl $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dvf.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new dvf.a(axu.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dkw.I)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.d();
         $$3.r++;
      }

      int $$16 = $$3.q;
      if ($$0.ae() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, awk.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.G_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awk.bK);

               for (aro $$19 : $$0.a(aro.class, new fcp((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ap.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awk.bM);
            }
         }
      }
   }

   private static int a(dhp $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.G_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jj($$8, $$6, $$9)).a(awz.aP)) {
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
   public void ar_() {
      a(this.n, this.o, awk.bM);
      super.ar_();
   }

   private static void a(dhp $$0, jj $$1, int $$2, @Nullable js<buu> $$3, @Nullable js<buu> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fcp $$8 = new fcp($$1).g($$5).b(0.0, (double)$$0.H_(), 0.0);
         List<cqi> $$9 = $$0.a(cqi.class, $$8);

         for (cqi $$10 : $$9) {
            $$10.a(new buw($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cqi $$11 : $$9) {
               $$11.a(new buw($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dhp $$0, jj $$1, awj $$2) {
      $$0.a(null, $$1, $$2, awl.e, 1.0F, 1.0F);
   }

   @Override
   public List<dvf.a> a() {
      return (List<dvf.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public abx c() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   private static void a(tw $$0, String $$1, @Nullable js<buu> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static js<buu> a(tw $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         ald $$2 = ald.c($$0.l($$1));
         return $$2 == null ? null : md.d.c($$2).map(dvg::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.e("CustomName")) {
         this.u = a($$0.c("CustomName"), $$1);
      }

      this.v = btr.b($$0, $$1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", (ut)wx.a.encodeStart($$1.a(uk.a), this.u).getOrThrow());
      }

      this.v.a($$0, $$1);
   }

   public void a(@Nullable wv $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wv an() {
      return this.u;
   }

   @Nullable
   @Override
   public ctn createMenu(int $$0, cqh $$1, cqi $$2) {
      return dve.a($$2, this.v, this.m_()) ? new cts($$0, $$1, this.w, cua.a(this.n, this.aw_())) : null;
   }

   @Override
   public wv m_() {
      return this.al();
   }

   @Override
   public wv al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.u = $$0.a(kx.g);
      this.v = $$0.a(kx.aq, btr.a);
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.g, this.u);
      if (!this.v.equals(btr.a)) {
         $$0.a(kx.aq, this.v);
      }
   }

   @Override
   public void a(tw $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dhp $$0) {
      super.a($$0);
      this.r = $$0.G_() - 1;
   }
}
