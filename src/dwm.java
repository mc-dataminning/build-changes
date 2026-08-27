import com.google.common.collect.Lists;
import java.util.List;

public class dwm {
   private static final int a = 8;
   static final dwm.b b = new dwm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyr $$0, int $$1, dwm.a $$2, gv $$3, List<dvb> $$4, art $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            cyw $$6 = $$2.e().d();
            dwm.a $$7 = dwm.a($$4, dwm.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 8, -1), "second_roof", $$6, false));
               dwm.a($$0, dwm.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 8, -1), "third_roof", $$6, true));
               dwm.a($$0, dwm.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<asm<cyw, gv>> c = Lists.newArrayList(
      new asm[]{new asm<>(cyw.a, new gv(1, -1, 0)), new asm<>(cyw.b, new gv(6, -1, 1)), new asm<>(cyw.d, new gv(0, -1, 5)), new asm<>(cyw.c, new gv(5, -1, 6))}
   );
   static final dwm.b d = new dwm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyr $$0, int $$1, dwm.a $$2, gv $$3, List<dvb> $$4, art $$5) {
         cyw $$6 = $$2.e().d();
         dwm.a $$7 = dwm.a($$4, dwm.a($$0, $$2, new gv(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(0, 7, 0), "tower_piece", $$6, true));
         dwm.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (asm<cyw, gv> $$11 : dwm.c) {
               if ($$5.h()) {
                  dwm.a $$12 = dwm.a($$4, dwm.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dwm.a($$0, dwm.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dwm.a($$0, dwm.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dwm.b e = new dwm.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dyr $$0, int $$1, dwm.a $$2, gv $$3, List<dvb> $$4, art $$5) {
         cyw $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dwm.a $$8 = dwm.a($$4, dwm.a($$0, $$2, new gv(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dwm.a($$4, dwm.a($$0, $$8, new gv(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dwm.a($$4, dwm.a($$0, $$8, new gv(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dwm.a($$4, dwm.a($$0, $$8, new gv(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dwm.a($$4, dwm.a($$0, $$8, new gv(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dwm.a($$0, dwm.b, $$1 + 1, $$8, new gv(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dwm.a($$4, dwm.a($$0, $$8, new gv(4, $$9, 0), "bridge_end", $$6.a(cyw.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<asm<cyw, gv>> f = Lists.newArrayList(
      new asm[]{
         new asm<>(cyw.a, new gv(4, -1, 0)), new asm<>(cyw.b, new gv(12, -1, 4)), new asm<>(cyw.d, new gv(0, -1, 8)), new asm<>(cyw.c, new gv(8, -1, 12))
      }
   );
   static final dwm.b g = new dwm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyr $$0, int $$1, dwm.a $$2, gv $$3, List<dvb> $$4, art $$5) {
         cyw $$6 = $$2.e().d();
         dwm.a $$7 = dwm.a($$4, dwm.a($$0, $$2, new gv(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(0, 8, 0), "fat_tower_middle", $$6, true));

            for (asm<cyw, gv> $$9 : dwm.f) {
               if ($$5.h()) {
                  dwm.a $$10 = dwm.a($$4, dwm.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dwm.a($$0, dwm.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dwm.a($$4, dwm.a($$0, $$7, new gv(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dwm.a a(dyr $$0, dwm.a $$1, gv $$2, String $$3, cyw $$4, boolean $$5) {
      dwm.a $$6 = new dwm.a($$0, $$3, $$1.d(), $$4, $$5);
      gv $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gv.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dyr $$0, gv $$1, cyw $$2, List<dvb> $$3, art $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dwm.a $$5 = a($$3, new dwm.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gv(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gv(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gv(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dwm.a a(List<dvb> $$0, dwm.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dyr $$0, dwm.b $$1, int $$2, dwm.a $$3, gv $$4, List<dvb> $$5, art $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvb> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvb $$10 : $$7) {
               $$10.a($$9);
               dvb $$11 = dvb.a($$5, $$10.f());
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

   public static class a extends dvh {
      public a(dyr $$0, String $$1, gv $$2, cyw $$3, boolean $$4) {
         super(dvo.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dyr $$0, qs $$1) {
         super(dvo.Y, $$1, $$0, $$1x -> a($$1.q("OW"), cyw.valueOf($$1.l("Rot"))));
      }

      private static dym a(boolean $$0, cyw $$1) {
         dxs $$2 = $$0 ? dxs.b : dxs.d;
         return new dym().a(true).a($$2).a($$1);
      }

      @Override
      protected aep b() {
         return a(this.a);
      }

      private static aep a(String $$0) {
         return new aep("end_city/" + $$0);
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dxs.b);
      }

      @Override
      protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
         if ($$0.startsWith("Chest")) {
            gv $$5 = $$1.d();
            if ($$4.b($$5)) {
               ddn.a($$2, $$3, $$5, ecd.c);
            }
         } else if ($$4.b($$1) && cpk.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzf $$6 = bik.aG.a((cpk)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               bxx $$7 = new bxx($$2.C(), $$1, this.c.d().a(hb.d));
               $$7.a(new ciw(ciz.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dyr var1, int var2, dwm.a var3, gv var4, List<dvb> var5, art var6);
   }
}
