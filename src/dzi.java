import com.google.common.collect.Lists;
import java.util.List;

public class dzi {
   private static final int a = 8;
   static final dzi.b b = new dzi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebn $$0, int $$1, dzi.a $$2, hx $$3, List<dxq> $$4, atw $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dbr $$6 = $$2.e().d();
            dzi.a $$7 = dzi.a($$4, dzi.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 8, -1), "second_roof", $$6, false));
               dzi.a($$0, dzi.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 8, -1), "third_roof", $$6, true));
               dzi.a($$0, dzi.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aur<dbr, hx>> c = Lists.newArrayList(
      new aur[]{new aur<>(dbr.a, new hx(1, -1, 0)), new aur<>(dbr.b, new hx(6, -1, 1)), new aur<>(dbr.d, new hx(0, -1, 5)), new aur<>(dbr.c, new hx(5, -1, 6))}
   );
   static final dzi.b d = new dzi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebn $$0, int $$1, dzi.a $$2, hx $$3, List<dxq> $$4, atw $$5) {
         dbr $$6 = $$2.e().d();
         dzi.a $$7 = dzi.a($$4, dzi.a($$0, $$2, new hx(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(0, 7, 0), "tower_piece", $$6, true));
         dzi.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aur<dbr, hx> $$11 : dzi.c) {
               if ($$5.h()) {
                  dzi.a $$12 = dzi.a($$4, dzi.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dzi.a($$0, dzi.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dzi.a($$0, dzi.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dzi.b e = new dzi.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ebn $$0, int $$1, dzi.a $$2, hx $$3, List<dxq> $$4, atw $$5) {
         dbr $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dzi.a $$8 = dzi.a($$4, dzi.a($$0, $$2, new hx(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dzi.a($$4, dzi.a($$0, $$8, new hx(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dzi.a($$4, dzi.a($$0, $$8, new hx(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dzi.a($$4, dzi.a($$0, $$8, new hx(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dzi.a($$4, dzi.a($$0, $$8, new hx(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dzi.a($$0, dzi.b, $$1 + 1, $$8, new hx(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dzi.a($$4, dzi.a($$0, $$8, new hx(4, $$9, 0), "bridge_end", $$6.a(dbr.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aur<dbr, hx>> f = Lists.newArrayList(
      new aur[]{
         new aur<>(dbr.a, new hx(4, -1, 0)), new aur<>(dbr.b, new hx(12, -1, 4)), new aur<>(dbr.d, new hx(0, -1, 8)), new aur<>(dbr.c, new hx(8, -1, 12))
      }
   );
   static final dzi.b g = new dzi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebn $$0, int $$1, dzi.a $$2, hx $$3, List<dxq> $$4, atw $$5) {
         dbr $$6 = $$2.e().d();
         dzi.a $$7 = dzi.a($$4, dzi.a($$0, $$2, new hx(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aur<dbr, hx> $$9 : dzi.f) {
               if ($$5.h()) {
                  dzi.a $$10 = dzi.a($$4, dzi.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dzi.a($$0, dzi.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dzi.a($$4, dzi.a($$0, $$7, new hx(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dzi.a a(ebn $$0, dzi.a $$1, hx $$2, String $$3, dbr $$4, boolean $$5) {
      dzi.a $$6 = new dzi.a($$0, $$3, $$1.d(), $$4, $$5);
      hx $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hx.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ebn $$0, hx $$1, dbr $$2, List<dxq> $$3, atw $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dzi.a $$5 = a($$3, new dzi.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dzi.a a(List<dxq> $$0, dzi.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ebn $$0, dzi.b $$1, int $$2, dzi.a $$3, hx $$4, List<dxq> $$5, atw $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dxq> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dxq $$10 : $$7) {
               $$10.a($$9);
               dxq $$11 = dxq.a($$5, $$10.f());
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

   public static class a extends dxw {
      public a(ebn $$0, String $$1, hx $$2, dbr $$3, boolean $$4) {
         super(dyd.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ebn $$0, sd $$1) {
         super(dyd.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dbr.valueOf($$1.l("Rot"))));
      }

      private static ebi a(boolean $$0, dbr $$1) {
         eao $$2 = $$0 ? eao.b : eao.d;
         return new ebi().a(true).a($$2).a($$1);
      }

      @Override
      protected agm b() {
         return a(this.a);
      }

      private static agm a(String $$0) {
         return new agm("end_city/" + $$0);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eao.b);
      }

      @Override
      protected void a(String $$0, hx $$1, csu $$2, atw $$3, dxe $$4) {
         if ($$0.startsWith("Chest")) {
            hx $$5 = $$1.d();
            if ($$4.b($$5)) {
               bji.a($$2, $$3, $$5, efa.c);
            }
         } else if ($$4.b($$1) && csf.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               cbt $$6 = bkz.aG.a((csf)$$2.D());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cal $$7 = new cal($$2.D(), $$1, this.c.d().a(ib.d));
               $$7.a(new clo(clr.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ebn var1, int var2, dzi.a var3, hx var4, List<dxq> var5, atw var6);
   }
}
