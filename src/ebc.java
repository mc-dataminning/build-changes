import com.google.common.collect.Lists;
import java.util.List;

public class ebc {
   private static final int a = 8;
   static final ebc.b b = new ebc.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edh $$0, int $$1, ebc.a $$2, hx $$3, List<dzk> $$4, auv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            ddc $$6 = $$2.e().d();
            ebc.a $$7 = ebc.a($$4, ebc.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 8, -1), "second_roof", $$6, false));
               ebc.a($$0, ebc.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 8, -1), "third_roof", $$6, true));
               ebc.a($$0, ebc.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<avr<ddc, hx>> c = Lists.newArrayList(
      new avr[]{new avr<>(ddc.a, new hx(1, -1, 0)), new avr<>(ddc.b, new hx(6, -1, 1)), new avr<>(ddc.d, new hx(0, -1, 5)), new avr<>(ddc.c, new hx(5, -1, 6))}
   );
   static final ebc.b d = new ebc.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edh $$0, int $$1, ebc.a $$2, hx $$3, List<dzk> $$4, auv $$5) {
         ddc $$6 = $$2.e().d();
         ebc.a $$7 = ebc.a($$4, ebc.a($$0, $$2, new hx(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(0, 7, 0), "tower_piece", $$6, true));
         ebc.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (avr<ddc, hx> $$11 : ebc.c) {
               if ($$5.h()) {
                  ebc.a $$12 = ebc.a($$4, ebc.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ebc.a($$0, ebc.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ebc.a($$0, ebc.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ebc.b e = new ebc.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(edh $$0, int $$1, ebc.a $$2, hx $$3, List<dzk> $$4, auv $$5) {
         ddc $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ebc.a $$8 = ebc.a($$4, ebc.a($$0, $$2, new hx(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ebc.a($$4, ebc.a($$0, $$8, new hx(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ebc.a($$4, ebc.a($$0, $$8, new hx(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ebc.a($$4, ebc.a($$0, $$8, new hx(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ebc.a($$4, ebc.a($$0, $$8, new hx(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ebc.a($$0, ebc.b, $$1 + 1, $$8, new hx(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ebc.a($$4, ebc.a($$0, $$8, new hx(4, $$9, 0), "bridge_end", $$6.a(ddc.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<avr<ddc, hx>> f = Lists.newArrayList(
      new avr[]{
         new avr<>(ddc.a, new hx(4, -1, 0)), new avr<>(ddc.b, new hx(12, -1, 4)), new avr<>(ddc.d, new hx(0, -1, 8)), new avr<>(ddc.c, new hx(8, -1, 12))
      }
   );
   static final ebc.b g = new ebc.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edh $$0, int $$1, ebc.a $$2, hx $$3, List<dzk> $$4, auv $$5) {
         ddc $$6 = $$2.e().d();
         ebc.a $$7 = ebc.a($$4, ebc.a($$0, $$2, new hx(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(0, 8, 0), "fat_tower_middle", $$6, true));

            for (avr<ddc, hx> $$9 : ebc.f) {
               if ($$5.h()) {
                  ebc.a $$10 = ebc.a($$4, ebc.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ebc.a($$0, ebc.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ebc.a($$4, ebc.a($$0, $$7, new hx(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ebc.a a(edh $$0, ebc.a $$1, hx $$2, String $$3, ddc $$4, boolean $$5) {
      ebc.a $$6 = new ebc.a($$0, $$3, $$1.d(), $$4, $$5);
      hx $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hx.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(edh $$0, hx $$1, ddc $$2, List<dzk> $$3, auv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ebc.a $$5 = a($$3, new ebc.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ebc.a a(List<dzk> $$0, ebc.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(edh $$0, ebc.b $$1, int $$2, ebc.a $$3, hx $$4, List<dzk> $$5, auv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dzk> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dzk $$10 : $$7) {
               $$10.a($$9);
               dzk $$11 = dzk.a($$5, $$10.f());
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

   public static class a extends dzq {
      public a(edh $$0, String $$1, hx $$2, ddc $$3, boolean $$4) {
         super(dzx.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(edh $$0, sn $$1) {
         super(dzx.Y, $$1, $$0, $$1x -> a($$1.q("OW"), ddc.valueOf($$1.l("Rot"))));
      }

      private static edc a(boolean $$0, ddc $$1) {
         eci $$2 = $$0 ? eci.b : eci.d;
         return new edc().a(true).a($$2).a($$1);
      }

      @Override
      protected ahg b() {
         return a(this.a);
      }

      private static ahg a(String $$0) {
         return new ahg("end_city/" + $$0);
      }

      @Override
      protected void a(dzw $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eci.b);
      }

      @Override
      protected void a(String $$0, hx $$1, cue $$2, auv $$3, dyy $$4) {
         if ($$0.startsWith("Chest")) {
            hx $$5 = $$1.d();
            if ($$4.b($$5)) {
               bki.a($$2, $$3, $$5, egu.c);
            }
         } else if ($$4.b($$1) && ctp.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ccv $$6 = blz.aH.a((ctp)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cbn $$7 = new cbn($$2.E(), $$1, this.c.d().a(ic.d));
               $$7.a(new cmy(cnb.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(edh var1, int var2, ebc.a var3, hx var4, List<dzk> var5, auv var6);
   }
}
