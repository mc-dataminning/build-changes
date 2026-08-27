import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dio extends dit implements bly, blz {
   private static final int f = 4;
   public static final List<List<ij<bmz>>> a = List.of(List.of(bnd.a, bnd.c), List.of(bnd.k, bnd.h), List.of(bnd.e), List.of(bnd.j));
   private static final Set<ij<bmz>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final vq i = vq.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<dio.a> l = Lists.newArrayList();
   private List<dio.a> m = Lists.newArrayList();
   int n;
   private int r;
   @Nullable
   ij<bmz> s;
   @Nullable
   ij<bmz> t;
   @Nullable
   private vq u;
   private blx v = blx.a;
   private final ckl w = new ckl() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dio.this.n;
            case 1 -> cke.a(dio.this.s);
            case 2 -> cke.a(dio.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dio.this.n = $$1;
               break;
            case 1:
               if (!dio.this.o.B && !dio.this.l.isEmpty()) {
                  dio.a(dio.this.o, dio.this.p, atk.bK);
               }

               dio.this.s = dio.a(cke.e($$1));
               break;
            case 2:
               dio.this.t = dio.a(cke.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static ij<bmz> a(@Nullable ij<bmz> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public dio(hz $$0, dlf $$1) {
      super(div.o, $$0, $$1);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dio $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      hz $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new hz($$4, $$3.r + 1, $$6);
      }

      dio.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(dqo.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         dlf $$12 = $$0.a_($$7);
         cyo $$13 = $$12.b();
         if ($$13 instanceof cyf) {
            float[] $$14 = ((cyf)$$13).b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new dio.a($$14);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new dio.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cut)$$0, $$7) >= 15 && !$$12.a(cyq.F)) {
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
            a($$0, $$1, atk.bI);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.J_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.l = $$3.m;
         if (!$$0.B) {
            boolean $$17 = $$3.n > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, atk.bH);

               for (aow $$18 : $$0.a(aow.class, new enn((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  am.m.a($$18, $$3.n);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, atk.bJ);
            }
         }
      }
   }

   private static int a(cvn $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.J_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new hz($$8, $$6, $$9)).a(atz.aL)) {
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
   public void aB_() {
      a(this.o, this.p, atk.bJ);
      super.aB_();
   }

   private static void a(cvn $$0, hz $$1, int $$2, @Nullable ij<bmz> $$3, @Nullable ij<bmz> $$4) {
      if (!$$0.B && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         enn $$8 = new enn($$1).g($$5).b(0.0, (double)$$0.K_(), 0.0);
         List<chh> $$9 = $$0.a(chh.class, $$8);

         for (chh $$10 : $$9) {
            $$10.b(new bnb($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (chh $$11 : $$9) {
               $$11.b(new bnb($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(cvn $$0, hz $$1, atj $$2) {
      $$0.a(null, $$1, $$2, atl.e, 1.0F, 1.0F);
   }

   public List<dio.a> c() {
      return (List<dio.a>)(this.n == 0 ? ImmutableList.of() : this.l);
   }

   public aan f() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   private static void a(sw $$0, String $$1, @Nullable ij<bmz> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static ij<bmz> a(sw $$0, String $$1) {
      if ($$0.b($$1, 8)) {
         aiy $$2 = aiy.a($$0.l($$1));
         return $$2 == null ? null : kf.d.c($$2).map(dio::a).orElse(null);
      } else {
         return null;
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.s = a($$0, "primary_effect");
      this.t = a($$0, "secondary_effect");
      if ($$0.b("CustomName", 8)) {
         this.u = vq.a.a($$0.l("CustomName"));
      }

      this.v = blx.b($$0);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.n);
      if (this.u != null) {
         $$0.a("CustomName", vq.a.a(this.u));
      }

      this.v.a($$0);
   }

   public void a(@Nullable vq $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public vq af() {
      return this.u;
   }

   @Nullable
   @Override
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      return din.a($$2, this.v, this.Q_()) ? new cke($$0, $$1, this.w, ckm.a(this.o, this.aE_())) : null;
   }

   @Override
   public vq Q_() {
      return this.ad();
   }

   @Override
   public vq ad() {
      return this.u != null ? this.u : i;
   }

   @Override
   public void a(cvn $$0) {
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
