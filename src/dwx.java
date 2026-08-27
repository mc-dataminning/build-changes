import com.google.common.collect.Lists;
import java.util.List;

public class dwx {
   private static final int a = 8;
   static final dwx.b b = new dwx.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzc $$0, int $$1, dwx.a $$2, gw $$3, List<dvm> $$4, asc $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            czh $$6 = $$2.e().d();
            dwx.a $$7 = dwx.a($$4, dwx.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 8, -1), "second_roof", $$6, false));
               dwx.a($$0, dwx.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 8, -1), "third_roof", $$6, true));
               dwx.a($$0, dwx.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<asw<czh, gw>> c = Lists.newArrayList(
      new asw[]{new asw<>(czh.a, new gw(1, -1, 0)), new asw<>(czh.b, new gw(6, -1, 1)), new asw<>(czh.d, new gw(0, -1, 5)), new asw<>(czh.c, new gw(5, -1, 6))}
   );
   static final dwx.b d = new dwx.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzc $$0, int $$1, dwx.a $$2, gw $$3, List<dvm> $$4, asc $$5) {
         czh $$6 = $$2.e().d();
         dwx.a $$7 = dwx.a($$4, dwx.a($$0, $$2, new gw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(0, 7, 0), "tower_piece", $$6, true));
         dwx.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (asw<czh, gw> $$11 : dwx.c) {
               if ($$5.h()) {
                  dwx.a $$12 = dwx.a($$4, dwx.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dwx.a($$0, dwx.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dwx.a($$0, dwx.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dwx.b e = new dwx.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dzc $$0, int $$1, dwx.a $$2, gw $$3, List<dvm> $$4, asc $$5) {
         czh $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dwx.a $$8 = dwx.a($$4, dwx.a($$0, $$2, new gw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dwx.a($$4, dwx.a($$0, $$8, new gw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dwx.a($$4, dwx.a($$0, $$8, new gw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dwx.a($$4, dwx.a($$0, $$8, new gw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dwx.a($$4, dwx.a($$0, $$8, new gw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dwx.a($$0, dwx.b, $$1 + 1, $$8, new gw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dwx.a($$4, dwx.a($$0, $$8, new gw(4, $$9, 0), "bridge_end", $$6.a(czh.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<asw<czh, gw>> f = Lists.newArrayList(
      new asw[]{
         new asw<>(czh.a, new gw(4, -1, 0)), new asw<>(czh.b, new gw(12, -1, 4)), new asw<>(czh.d, new gw(0, -1, 8)), new asw<>(czh.c, new gw(8, -1, 12))
      }
   );
   static final dwx.b g = new dwx.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzc $$0, int $$1, dwx.a $$2, gw $$3, List<dvm> $$4, asc $$5) {
         czh $$6 = $$2.e().d();
         dwx.a $$7 = dwx.a($$4, dwx.a($$0, $$2, new gw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (asw<czh, gw> $$9 : dwx.f) {
               if ($$5.h()) {
                  dwx.a $$10 = dwx.a($$4, dwx.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dwx.a($$0, dwx.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dwx.a($$4, dwx.a($$0, $$7, new gw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dwx.a a(dzc $$0, dwx.a $$1, gw $$2, String $$3, czh $$4, boolean $$5) {
      dwx.a $$6 = new dwx.a($$0, $$3, $$1.d(), $$4, $$5);
      gw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gw.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dzc $$0, gw $$1, czh $$2, List<dvm> $$3, asc $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dwx.a $$5 = a($$3, new dwx.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dwx.a a(List<dvm> $$0, dwx.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dzc $$0, dwx.b $$1, int $$2, dwx.a $$3, gw $$4, List<dvm> $$5, asc $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvm> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvm $$10 : $$7) {
               $$10.a($$9);
               dvm $$11 = dvm.a($$5, $$10.f());
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

   public static class a extends dvs {
      public a(dzc $$0, String $$1, gw $$2, czh $$3, boolean $$4) {
         super(dvz.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dzc $$0, qw $$1) {
         super(dvz.Y, $$1, $$0, $$1x -> a($$1.q("OW"), czh.valueOf($$1.l("Rot"))));
      }

      private static dyx a(boolean $$0, czh $$1) {
         dyd $$2 = $$0 ? dyd.b : dyd.d;
         return new dyx().a(true).a($$2).a($$1);
      }

      @Override
      protected aew b() {
         return a(this.a);
      }

      private static aew a(String $$0) {
         return new aew("end_city/" + $$0);
      }

      @Override
      protected void a(dvy $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dyd.b);
      }

      @Override
      protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
         if ($$0.startsWith("Chest")) {
            gw $$5 = $$1.d();
            if ($$4.b($$5)) {
               ddy.a($$2, $$3, $$5, eco.c);
            }
         } else if ($$4.b($$1) && cpv.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzo $$6 = biu.aG.a((cpv)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               byg $$7 = new byg($$2.C(), $$1, this.c.d().a(ha.d));
               $$7.a(new cjf(cji.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dzc var1, int var2, dwx.a var3, gw var4, List<dvm> var5, asc var6);
   }
}
