import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dus extends dux implements btl, btm {
   private static final int f = 4;
   public static final List<List<jq<bun>>> a = List.of(List.of(bur.a, bur.c), List.of(bur.k, bur.h), List.of(bur.e), List.of(bur.j));
   private static final Set<jq<bun>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xv i = xv.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dus.a> l = Lists.newArrayList();
   private List<dus.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   jq<bun> s;
   @Nullable
   jq<bun> t;
   @Nullable
   private xv u;
   private btk v = btk.a;
   private final cto w = new cto() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dus.this.n;
            case 1 -> cth.a(dus.this.s);
            case 2 -> cth.a(dus.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dus.this.n = $$1;
               break;
            case 1:
               if (!dus.this.o.C && !dus.this.l.isEmpty()) {
                  dus.a(dus.this.o, dus.this.p, axf.bN);
               }

               dus.this.s = dus.a(cth.e($$1));
               break;
            case 2:
               dus.this.t = dus.a(cth.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jq<bun> a(@Nullable jq<bun> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dus(jh $$0, dxv $$1) {
      super(duz.p, $$0, $$1);
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dus $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jh $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jh($$4, $$3.r + 1, $$6);
      }

      dus.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(edq.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dxv $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dkd $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dus.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dus.a(ayp.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dko.I)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.d();
         $$3.r++;
      }

      int $$16 = $$3.n;
      if ($$0.ac() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.n = a($$0, $$4, $$5, $$6);
         }

         if ($$3.n > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.n, $$3.s, $$3.t);
            a($$0, $$1, axf.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.L_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.n > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, axf.bK);

               for (asi $$19 : $$0.a(asi.class, new fbt((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ao.m.a($$19, $$3.n);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, axf.bM);
            }
         }
      }
   }

   private static int a(dhi $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.L_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jh($$8, $$6, $$9)).a(axu.aP)) {
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
      a(this.o, this.p, axf.bM);
      super.aw_();
   }

   private static void a(dhi $$0, jh $$1, int $$2, @Nullable jq<bun> $$3, @Nullable jq<bun> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fbt $$8 = new fbt($$1).g($$5).b(0.0, (double)$$0.M_(), 0.0);
         List<cpx> $$9 = $$0.a(cpx.class, $$8);

         for (cpx $$10 : $$9) {
            $$10.a(new bup($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cpx $$11 : $$9) {
               $$11.a(new bup($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dhi $$0, jh $$1, axe $$2) {
      $$0.a(null, $$1, $$2, axg.e, 1.0F, 1.0F);
   }

   public List<dus.a> b() {
      return (List<dus.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public acy c() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   private static void a(ux $$0, String $$1, @Nullable jq<bun> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jq<bun> a(ux $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         alz $$2 = alz.c($$0.l($$1));
         return $$2 == null ? null : ma.d.c($$2).map(dus::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = a($$0.l("CustomName"), $$1);
      }

      this.v = btk.b($$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", xv.a.a(this.u, $$1));
      }

      this.v.a($$0, $$1);
   }

   public void a(@Nullable xv $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xv an() {
      return this.u;
   }

   @Nullable
   @Override
   public ctc createMenu(int $$0, cpw $$1, cpx $$2) {
      return dur.a($$2, this.v, this.p_()) ? new cth($$0, $$1, this.w, ctp.a(this.o, this.aB_())) : null;
   }

   @Override
   public xv p_() {
      return this.al();
   }

   @Override
   public xv al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      this.u = $$0.a(ku.g);
      this.v = $$0.a(ku.ao, btk.a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.u);
      if (!this.v.equals(btk.a)) {
         $$0.a(ku.ao, this.v);
      }
   }

   @Override
   public void a(ux $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dhi $$0) {
      super.a($$0);
      this.r = $$0.L_() - 1;
   }

   public static class a {
      final int a;
      private int b;

      public a(int $$0) {
         this.a = $$0;
         this.b = 1;
      }

      protected void a() {
         this.b++;
      }

      public int b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
