import com.google.common.collect.Lists;
import java.util.List;

public class dws {
   private static final int a = 8;
   static final dws.b b = new dws.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyx $$0, int $$1, dws.a $$2, gw $$3, List<dvh> $$4, arx $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            czc $$6 = $$2.e().d();
            dws.a $$7 = dws.a($$4, dws.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 8, -1), "second_roof", $$6, false));
               dws.a($$0, dws.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 8, -1), "third_roof", $$6, true));
               dws.a($$0, dws.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<asr<czc, gw>> c = Lists.newArrayList(
      new asr[]{new asr<>(czc.a, new gw(1, -1, 0)), new asr<>(czc.b, new gw(6, -1, 1)), new asr<>(czc.d, new gw(0, -1, 5)), new asr<>(czc.c, new gw(5, -1, 6))}
   );
   static final dws.b d = new dws.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyx $$0, int $$1, dws.a $$2, gw $$3, List<dvh> $$4, arx $$5) {
         czc $$6 = $$2.e().d();
         dws.a $$7 = dws.a($$4, dws.a($$0, $$2, new gw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dws.a($$4, dws.a($$0, $$7, new gw(0, 7, 0), "tower_piece", $$6, true));
         dws.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dws.a($$4, dws.a($$0, $$7, new gw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (asr<czc, gw> $$11 : dws.c) {
               if ($$5.h()) {
                  dws.a $$12 = dws.a($$4, dws.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dws.a($$0, dws.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dws.a($$0, dws.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dws.b e = new dws.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dyx $$0, int $$1, dws.a $$2, gw $$3, List<dvh> $$4, arx $$5) {
         czc $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dws.a $$8 = dws.a($$4, dws.a($$0, $$2, new gw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dws.a($$4, dws.a($$0, $$8, new gw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dws.a($$4, dws.a($$0, $$8, new gw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dws.a($$4, dws.a($$0, $$8, new gw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dws.a($$4, dws.a($$0, $$8, new gw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dws.a($$0, dws.b, $$1 + 1, $$8, new gw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dws.a($$4, dws.a($$0, $$8, new gw(4, $$9, 0), "bridge_end", $$6.a(czc.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<asr<czc, gw>> f = Lists.newArrayList(
      new asr[]{
         new asr<>(czc.a, new gw(4, -1, 0)), new asr<>(czc.b, new gw(12, -1, 4)), new asr<>(czc.d, new gw(0, -1, 8)), new asr<>(czc.c, new gw(8, -1, 12))
      }
   );
   static final dws.b g = new dws.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyx $$0, int $$1, dws.a $$2, gw $$3, List<dvh> $$4, arx $$5) {
         czc $$6 = $$2.e().d();
         dws.a $$7 = dws.a($$4, dws.a($$0, $$2, new gw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dws.a($$4, dws.a($$0, $$7, new gw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dws.a($$4, dws.a($$0, $$7, new gw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (asr<czc, gw> $$9 : dws.f) {
               if ($$5.h()) {
                  dws.a $$10 = dws.a($$4, dws.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dws.a($$0, dws.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dws.a($$4, dws.a($$0, $$7, new gw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dws.a a(dyx $$0, dws.a $$1, gw $$2, String $$3, czc $$4, boolean $$5) {
      dws.a $$6 = new dws.a($$0, $$3, $$1.d(), $$4, $$5);
      gw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gw.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dyx $$0, gw $$1, czc $$2, List<dvh> $$3, arx $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dws.a $$5 = a($$3, new dws.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dws.a a(List<dvh> $$0, dws.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dyx $$0, dws.b $$1, int $$2, dws.a $$3, gw $$4, List<dvh> $$5, arx $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvh> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvh $$10 : $$7) {
               $$10.a($$9);
               dvh $$11 = dvh.a($$5, $$10.f());
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

   public static class a extends dvn {
      public a(dyx $$0, String $$1, gw $$2, czc $$3, boolean $$4) {
         super(dvu.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dyx $$0, qu $$1) {
         super(dvu.Y, $$1, $$0, $$1x -> a($$1.q("OW"), czc.valueOf($$1.l("Rot"))));
      }

      private static dys a(boolean $$0, czc $$1) {
         dxy $$2 = $$0 ? dxy.b : dxy.d;
         return new dys().a(true).a($$2).a($$1);
      }

      @Override
      protected aeu b() {
         return a(this.a);
      }

      private static aeu a(String $$0) {
         return new aeu("end_city/" + $$0);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dxy.b);
      }

      @Override
      protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
         if ($$0.startsWith("Chest")) {
            gw $$5 = $$1.d();
            if ($$4.b($$5)) {
               ddt.a($$2, $$3, $$5, ecj.c);
            }
         } else if ($$4.b($$1) && cpq.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzj $$6 = bip.aG.a((cpq)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               byb $$7 = new byb($$2.C(), $$1, this.c.d().a(hc.d));
               $$7.a(new cja(cjd.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dyx var1, int var2, dws.a var3, gw var4, List<dvh> var5, arx var6);
   }
}
