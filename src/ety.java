import com.google.common.collect.Lists;
import java.util.List;

public class ety {
   private static final int a = 8;
   static final ety.b b = new ety.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewe $$0, int $$1, ety.a $$2, iv $$3, List<esf> $$4, azx $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dtw $$6 = $$2.e().d();
            ety.a $$7 = ety.a($$4, ety.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 8, -1), "second_roof", $$6, false));
               ety.a($$0, ety.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 8, -1), "third_roof", $$6, true));
               ety.a($$0, ety.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bav<dtw, iv>> c = Lists.newArrayList(
      new bav[]{new bav<>(dtw.a, new iv(1, -1, 0)), new bav<>(dtw.b, new iv(6, -1, 1)), new bav<>(dtw.d, new iv(0, -1, 5)), new bav<>(dtw.c, new iv(5, -1, 6))}
   );
   static final ety.b d = new ety.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewe $$0, int $$1, ety.a $$2, iv $$3, List<esf> $$4, azx $$5) {
         dtw $$6 = $$2.e().d();
         ety.a $$7 = ety.a($$4, ety.a($$0, $$2, new iv(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ety.a($$4, ety.a($$0, $$7, new iv(0, 7, 0), "tower_piece", $$6, true));
         ety.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ety.a($$4, ety.a($$0, $$7, new iv(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bav<dtw, iv> $$11 : ety.c) {
               if ($$5.h()) {
                  ety.a $$12 = ety.a($$4, ety.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ety.a($$0, ety.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ety.a($$0, ety.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ety.b e = new ety.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ewe $$0, int $$1, ety.a $$2, iv $$3, List<esf> $$4, azx $$5) {
         dtw $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ety.a $$8 = ety.a($$4, ety.a($$0, $$2, new iv(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ety.a($$4, ety.a($$0, $$8, new iv(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ety.a($$4, ety.a($$0, $$8, new iv(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ety.a($$4, ety.a($$0, $$8, new iv(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ety.a($$4, ety.a($$0, $$8, new iv(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ety.a($$0, ety.b, $$1 + 1, $$8, new iv(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ety.a($$4, ety.a($$0, $$8, new iv(4, $$9, 0), "bridge_end", $$6.a(dtw.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bav<dtw, iv>> f = Lists.newArrayList(
      new bav[]{
         new bav<>(dtw.a, new iv(4, -1, 0)), new bav<>(dtw.b, new iv(12, -1, 4)), new bav<>(dtw.d, new iv(0, -1, 8)), new bav<>(dtw.c, new iv(8, -1, 12))
      }
   );
   static final ety.b g = new ety.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewe $$0, int $$1, ety.a $$2, iv $$3, List<esf> $$4, azx $$5) {
         dtw $$6 = $$2.e().d();
         ety.a $$7 = ety.a($$4, ety.a($$0, $$2, new iv(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ety.a($$4, ety.a($$0, $$7, new iv(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ety.a($$4, ety.a($$0, $$7, new iv(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bav<dtw, iv> $$9 : ety.f) {
               if ($$5.h()) {
                  ety.a $$10 = ety.a($$4, ety.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ety.a($$0, ety.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ety.a($$4, ety.a($$0, $$7, new iv(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ety.a a(ewe $$0, ety.a $$1, iv $$2, String $$3, dtw $$4, boolean $$5) {
      ety.a $$6 = new ety.a($$0, $$3, $$1.d(), $$4, $$5);
      iv $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iv.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ewe $$0, iv $$1, dtw $$2, List<esf> $$3, azx $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ety.a $$5 = a($$3, new ety.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iv(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ety.a a(List<esf> $$0, ety.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ewe $$0, ety.b $$1, int $$2, ety.a $$3, iv $$4, List<esf> $$5, azx $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<esf> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (esf $$10 : $$7) {
               $$10.a($$9);
               esf $$11 = esf.a($$5, $$10.f());
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

   public static class a extends esl {
      public a(ewe $$0, String $$1, iv $$2, dtw $$3, boolean $$4) {
         super(ess.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ewe $$0, tz $$1) {
         super(ess.Y, $$1, $$0, $$1x -> a($$1.b("OW", false), $$1.<dtw>a("Rot", dtw.h).orElseThrow()));
      }

      private static evz a(boolean $$0, dtw $$1) {
         eve $$2 = $$0 ? eve.b : eve.d;
         return new evz().a(true).a($$2).a($$1);
      }

      @Override
      protected ali b() {
         return a(this.a);
      }

      private static ali a(String $$0) {
         return ali.b("end_city/" + $$0);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtw.h, this.c.d());
         $$1.a("OW", this.c.i().get(0) == eve.b);
      }

      @Override
      protected void a(String $$0, iv $$1, dko $$2, azx $$3, ert $$4) {
         if ($$0.startsWith("Chest")) {
            iv $$5 = $$1.e();
            if ($$4.b($$5)) {
               bux.a($$2, $$3, $$5, fad.b);
            }
         } else if ($$4.b($$1) && djx.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cpf $$6 = bxc.bd.a($$2.a(), bxb.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cnv $$7 = new cnv($$2.a(), $$1, this.c.d().a(jb.d));
               $$7.a(new czy(dac.oD), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ewe var1, int var2, ety.a var3, iv var4, List<esf> var5, azx var6);
   }
}
