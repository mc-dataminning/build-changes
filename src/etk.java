import com.google.common.collect.Lists;
import java.util.List;

public class etk {
   private static final int a = 8;
   static final etk.b b = new etk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(evq $$0, int $$1, etk.a $$2, iv $$3, List<err> $$4, azv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dtl $$6 = $$2.e().d();
            etk.a $$7 = etk.a($$4, etk.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 8, -1), "second_roof", $$6, false));
               etk.a($$0, etk.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 8, -1), "third_roof", $$6, true));
               etk.a($$0, etk.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bat<dtl, iv>> c = Lists.newArrayList(
      new bat[]{new bat<>(dtl.a, new iv(1, -1, 0)), new bat<>(dtl.b, new iv(6, -1, 1)), new bat<>(dtl.d, new iv(0, -1, 5)), new bat<>(dtl.c, new iv(5, -1, 6))}
   );
   static final etk.b d = new etk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(evq $$0, int $$1, etk.a $$2, iv $$3, List<err> $$4, azv $$5) {
         dtl $$6 = $$2.e().d();
         etk.a $$7 = etk.a($$4, etk.a($$0, $$2, new iv(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = etk.a($$4, etk.a($$0, $$7, new iv(0, 7, 0), "tower_piece", $$6, true));
         etk.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = etk.a($$4, etk.a($$0, $$7, new iv(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bat<dtl, iv> $$11 : etk.c) {
               if ($$5.h()) {
                  etk.a $$12 = etk.a($$4, etk.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  etk.a($$0, etk.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return etk.a($$0, etk.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final etk.b e = new etk.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(evq $$0, int $$1, etk.a $$2, iv $$3, List<err> $$4, azv $$5) {
         dtl $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         etk.a $$8 = etk.a($$4, etk.a($$0, $$2, new iv(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = etk.a($$4, etk.a($$0, $$8, new iv(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = etk.a($$4, etk.a($$0, $$8, new iv(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = etk.a($$4, etk.a($$0, $$8, new iv(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            etk.a($$4, etk.a($$0, $$8, new iv(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!etk.a($$0, etk.b, $$1 + 1, $$8, new iv(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = etk.a($$4, etk.a($$0, $$8, new iv(4, $$9, 0), "bridge_end", $$6.a(dtl.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bat<dtl, iv>> f = Lists.newArrayList(
      new bat[]{
         new bat<>(dtl.a, new iv(4, -1, 0)), new bat<>(dtl.b, new iv(12, -1, 4)), new bat<>(dtl.d, new iv(0, -1, 8)), new bat<>(dtl.c, new iv(8, -1, 12))
      }
   );
   static final etk.b g = new etk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(evq $$0, int $$1, etk.a $$2, iv $$3, List<err> $$4, azv $$5) {
         dtl $$6 = $$2.e().d();
         etk.a $$7 = etk.a($$4, etk.a($$0, $$2, new iv(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = etk.a($$4, etk.a($$0, $$7, new iv(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = etk.a($$4, etk.a($$0, $$7, new iv(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bat<dtl, iv> $$9 : etk.f) {
               if ($$5.h()) {
                  etk.a $$10 = etk.a($$4, etk.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  etk.a($$0, etk.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = etk.a($$4, etk.a($$0, $$7, new iv(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static etk.a a(evq $$0, etk.a $$1, iv $$2, String $$3, dtl $$4, boolean $$5) {
      etk.a $$6 = new etk.a($$0, $$3, $$1.d(), $$4, $$5);
      iv $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iv.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(evq $$0, iv $$1, dtl $$2, List<err> $$3, azv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      etk.a $$5 = a($$3, new etk.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static etk.a a(List<err> $$0, etk.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(evq $$0, etk.b $$1, int $$2, etk.a $$3, iv $$4, List<err> $$5, azv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<err> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (err $$10 : $$7) {
               $$10.a($$9);
               err $$11 = err.a($$5, $$10.f());
               if ($$11 != null && $$11.g() != $$3.g()) {
                  $$8 = true;
                  break;
               }
            }

            if (!$$8) {
               $$5.addAll($$7);
               return true;
            }
         }

         return false;
      }
   }

   public static class a extends erx {
      public a(evq $$0, String $$1, iv $$2, dtl $$3, boolean $$4) {
         super(ese.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(evq $$0, tz $$1) {
         super(ese.Y, $$1, $$0, $$1x -> a($$1.o("OW"), $$1.<dtl>a("Rot", dtl.h).orElseThrow()));
      }

      private static evl a(boolean $$0, dtl $$1) {
         euq $$2 = $$0 ? euq.b : euq.d;
         return new evl().a(true).a($$2).a($$1);
      }

      @Override
      protected alg b() {
         return a(this.a);
      }

      private static alg a(String $$0) {
         return alg.b("end_city/" + $$0);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtl.h, this.c.d());
         $$1.a("OW", this.c.i().get(0) == euq.b);
      }

      @Override
      protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
         if ($$0.startsWith("Chest")) {
            iv $$5 = $$1.e();
            if ($$4.b($$5)) {
               bum.a($$2, $$3, $$5, ezp.b);
            }
         } else if ($$4.b($$1) && djm.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cou $$6 = bwr.bc.a($$2.a(), bwq.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cnk $$7 = new cnk($$2.a(), $$1, this.c.d().a(jb.d));
               $$7.a(new czn(czr.oD), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(evq var1, int var2, etk.a var3, iv var4, List<err> var5, azv var6);
   }
}
