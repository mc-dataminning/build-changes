import com.google.common.collect.Lists;
import java.util.List;

public class eav {
   private static final int a = 8;
   static final eav.b b = new eav.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eda $$0, int $$1, eav.a $$2, hx $$3, List<dzd> $$4, aup $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dcv $$6 = $$2.e().d();
            eav.a $$7 = eav.a($$4, eav.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 8, -1), "second_roof", $$6, false));
               eav.a($$0, eav.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 8, -1), "third_roof", $$6, true));
               eav.a($$0, eav.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<avl<dcv, hx>> c = Lists.newArrayList(
      new avl[]{new avl<>(dcv.a, new hx(1, -1, 0)), new avl<>(dcv.b, new hx(6, -1, 1)), new avl<>(dcv.d, new hx(0, -1, 5)), new avl<>(dcv.c, new hx(5, -1, 6))}
   );
   static final eav.b d = new eav.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eda $$0, int $$1, eav.a $$2, hx $$3, List<dzd> $$4, aup $$5) {
         dcv $$6 = $$2.e().d();
         eav.a $$7 = eav.a($$4, eav.a($$0, $$2, new hx(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eav.a($$4, eav.a($$0, $$7, new hx(0, 7, 0), "tower_piece", $$6, true));
         eav.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eav.a($$4, eav.a($$0, $$7, new hx(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (avl<dcv, hx> $$11 : eav.c) {
               if ($$5.h()) {
                  eav.a $$12 = eav.a($$4, eav.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eav.a($$0, eav.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eav.a($$0, eav.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eav.b e = new eav.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eda $$0, int $$1, eav.a $$2, hx $$3, List<dzd> $$4, aup $$5) {
         dcv $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eav.a $$8 = eav.a($$4, eav.a($$0, $$2, new hx(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eav.a($$4, eav.a($$0, $$8, new hx(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eav.a($$4, eav.a($$0, $$8, new hx(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eav.a($$4, eav.a($$0, $$8, new hx(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eav.a($$4, eav.a($$0, $$8, new hx(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eav.a($$0, eav.b, $$1 + 1, $$8, new hx(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eav.a($$4, eav.a($$0, $$8, new hx(4, $$9, 0), "bridge_end", $$6.a(dcv.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<avl<dcv, hx>> f = Lists.newArrayList(
      new avl[]{
         new avl<>(dcv.a, new hx(4, -1, 0)), new avl<>(dcv.b, new hx(12, -1, 4)), new avl<>(dcv.d, new hx(0, -1, 8)), new avl<>(dcv.c, new hx(8, -1, 12))
      }
   );
   static final eav.b g = new eav.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eda $$0, int $$1, eav.a $$2, hx $$3, List<dzd> $$4, aup $$5) {
         dcv $$6 = $$2.e().d();
         eav.a $$7 = eav.a($$4, eav.a($$0, $$2, new hx(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eav.a($$4, eav.a($$0, $$7, new hx(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eav.a($$4, eav.a($$0, $$7, new hx(0, 8, 0), "fat_tower_middle", $$6, true));

            for (avl<dcv, hx> $$9 : eav.f) {
               if ($$5.h()) {
                  eav.a $$10 = eav.a($$4, eav.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eav.a($$0, eav.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eav.a($$4, eav.a($$0, $$7, new hx(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eav.a a(eda $$0, eav.a $$1, hx $$2, String $$3, dcv $$4, boolean $$5) {
      eav.a $$6 = new eav.a($$0, $$3, $$1.d(), $$4, $$5);
      hx $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hx.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eda $$0, hx $$1, dcv $$2, List<dzd> $$3, aup $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eav.a $$5 = a($$3, new eav.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eav.a a(List<dzd> $$0, eav.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eda $$0, eav.b $$1, int $$2, eav.a $$3, hx $$4, List<dzd> $$5, aup $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dzd> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dzd $$10 : $$7) {
               $$10.a($$9);
               dzd $$11 = dzd.a($$5, $$10.f());
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

   public static class a extends dzj {
      public a(eda $$0, String $$1, hx $$2, dcv $$3, boolean $$4) {
         super(dzq.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eda $$0, sl $$1) {
         super(dzq.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dcv.valueOf($$1.l("Rot"))));
      }

      private static ecv a(boolean $$0, dcv $$1) {
         ecb $$2 = $$0 ? ecb.b : ecb.d;
         return new ecv().a(true).a($$2).a($$1);
      }

      @Override
      protected ahd b() {
         return a(this.a);
      }

      private static ahd a(String $$0) {
         return new ahd("end_city/" + $$0);
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ecb.b);
      }

      @Override
      protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
         if ($$0.startsWith("Chest")) {
            hx $$5 = $$1.d();
            if ($$4.b($$5)) {
               bkc.a($$2, $$3, $$5, egn.c);
            }
         } else if ($$4.b($$1) && cti.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ccp $$6 = blt.aH.a((cti)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cbh $$7 = new cbh($$2.E(), $$1, this.c.d().a(ic.d));
               $$7.a(new cmr(cmu.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eda var1, int var2, eav.a var3, hx var4, List<dzd> var5, aup var6);
   }
}
