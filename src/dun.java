import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dun extends dus implements bta, btb {
   private static final int f = 4;
   public static final List<List<jr<buc>>> a = List.of(List.of(bug.a, bug.c), List.of(bug.k, bug.h), List.of(bug.e), List.of(bug.j));
   private static final Set<jr<buc>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final wp i = wp.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dun.a> l = Lists.newArrayList();
   private List<dun.a> m = Lists.newArrayList();
   int q;
   private int r;
   @Nullable
   jr<buc> s;
   @Nullable
   jr<buc> t;
   @Nullable
   private wp u;
   private bsz v = bsz.a;
   private final cti w = new cti() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dun.this.q;
            case 1 -> ctb.a(dun.this.s);
            case 2 -> ctb.a(dun.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dun.this.q = $$1;
               break;
            case 1:
               if (!dun.this.n.C && !dun.this.l.isEmpty()) {
                  dun.a(dun.this.n, dun.this.o, awa.bN);
               }

               dun.this.s = dun.a(ctb.e($$1));
               break;
            case 2:
               dun.this.t = dun.a(ctb.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jr<buc> a(@Nullable jr<buc> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dun(ji $$0, dxq $$1) {
      super(duu.p, $$0, $$1);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dun $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ji $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new ji($$4, $$3.r + 1, $$6);
      }

      dun.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(edo.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dxq $$12 = $$0.a_($$7);
         if ($$12.b() instanceof djv $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dun.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.a) {
                  $$9.a();
               } else {
                  $$9 = new dun.a(axk.d($$9.a, $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dkg.I)) {
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
            a($$0, $$1, awa.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.G_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, awa.bK);

               for (are $$19 : $$0.a(are.class, new fbs((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  ap.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, awa.bM);
            }
         }
      }
   }

   private static int a(dgz $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.G_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new ji($$8, $$6, $$9)).a(awp.aP)) {
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

   private static void a(dgz $$0, ji $$1, int $$2, @Nullable jr<buc> $$3, @Nullable jr<buc> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fbs $$8 = new fbs($$1).g($$5).b(0.0, (double)$$0.H_(), 0.0);
         List<cpr> $$9 = $$0.a(cpr.class, $$8);

         for (cpr $$10 : $$9) {
            $$10.a(new bue($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cpr $$11 : $$9) {
               $$11.a(new bue($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dgz $$0, ji $$1, avz $$2) {
      $$0.a(null, $$1, $$2, awb.e, 1.0F, 1.0F);
   }

   public List<dun.a> b() {
      return (List<dun.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public abr c() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   private static void a(tq $$0, String $$1, @Nullable jr<buc> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jr<buc> a(tq $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         aku $$2 = aku.c($$0.l($$1));
         return $$2 == null ? null : mb.d.c($$2).map(dun::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.e("CustomName")) {
         this.u = a($$0.c("CustomName"), $$1);
      }

      this.v = bsz.b($$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      if (this.u != null) {
         $$0.a("CustomName", (un)wr.a.encodeStart($$1.a(ue.a), this.u).getOrThrow());
      }

      this.v.a($$0, $$1);
   }

   public void a(@Nullable wp $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public wp an() {
      return this.u;
   }

   @Nullable
   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      return dum.a($$2, this.v, this.m_()) ? new ctb($$0, $$1, this.w, ctj.a(this.n, this.aA_())) : null;
   }

   @Override
   public wp m_() {
      return this.al();
   }

   @Override
   public wp al() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.u = $$0.a(kv.g);
      this.v = $$0.a(kv.aq, bsz.a);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.u);
      if (!this.v.equals(bsz.a)) {
         $$0.a(kv.aq, this.v);
      }
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
   }

   @Override
   public void a(dgz $$0) {
      super.a($$0);
      this.r = $$0.G_() - 1;
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
