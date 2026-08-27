import com.google.common.collect.Lists;
import java.util.List;

public class dzd {
   private static final int a = 8;
   static final dzd.b b = new dzd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebi $$0, int $$1, dzd.a $$2, ht $$3, List<dxl> $$4, ats $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dbm $$6 = $$2.e().d();
            dzd.a $$7 = dzd.a($$4, dzd.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 8, -1), "second_roof", $$6, false));
               dzd.a($$0, dzd.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 8, -1), "third_roof", $$6, true));
               dzd.a($$0, dzd.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aun<dbm, ht>> c = Lists.newArrayList(
      new aun[]{new aun<>(dbm.a, new ht(1, -1, 0)), new aun<>(dbm.b, new ht(6, -1, 1)), new aun<>(dbm.d, new ht(0, -1, 5)), new aun<>(dbm.c, new ht(5, -1, 6))}
   );
   static final dzd.b d = new dzd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebi $$0, int $$1, dzd.a $$2, ht $$3, List<dxl> $$4, ats $$5) {
         dbm $$6 = $$2.e().d();
         dzd.a $$7 = dzd.a($$4, dzd.a($$0, $$2, new ht(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(0, 7, 0), "tower_piece", $$6, true));
         dzd.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aun<dbm, ht> $$11 : dzd.c) {
               if ($$5.h()) {
                  dzd.a $$12 = dzd.a($$4, dzd.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dzd.a($$0, dzd.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dzd.a($$0, dzd.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dzd.b e = new dzd.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ebi $$0, int $$1, dzd.a $$2, ht $$3, List<dxl> $$4, ats $$5) {
         dbm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dzd.a $$8 = dzd.a($$4, dzd.a($$0, $$2, new ht(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dzd.a($$4, dzd.a($$0, $$8, new ht(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dzd.a($$4, dzd.a($$0, $$8, new ht(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dzd.a($$4, dzd.a($$0, $$8, new ht(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dzd.a($$4, dzd.a($$0, $$8, new ht(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dzd.a($$0, dzd.b, $$1 + 1, $$8, new ht(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dzd.a($$4, dzd.a($$0, $$8, new ht(4, $$9, 0), "bridge_end", $$6.a(dbm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aun<dbm, ht>> f = Lists.newArrayList(
      new aun[]{
         new aun<>(dbm.a, new ht(4, -1, 0)), new aun<>(dbm.b, new ht(12, -1, 4)), new aun<>(dbm.d, new ht(0, -1, 8)), new aun<>(dbm.c, new ht(8, -1, 12))
      }
   );
   static final dzd.b g = new dzd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ebi $$0, int $$1, dzd.a $$2, ht $$3, List<dxl> $$4, ats $$5) {
         dbm $$6 = $$2.e().d();
         dzd.a $$7 = dzd.a($$4, dzd.a($$0, $$2, new ht(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aun<dbm, ht> $$9 : dzd.f) {
               if ($$5.h()) {
                  dzd.a $$10 = dzd.a($$4, dzd.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dzd.a($$0, dzd.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dzd.a($$4, dzd.a($$0, $$7, new ht(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dzd.a a(ebi $$0, dzd.a $$1, ht $$2, String $$3, dbm $$4, boolean $$5) {
      dzd.a $$6 = new dzd.a($$0, $$3, $$1.d(), $$4, $$5);
      ht $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ht.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ebi $$0, ht $$1, dbm $$2, List<dxl> $$3, ats $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dzd.a $$5 = a($$3, new dzd.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dzd.a a(List<dxl> $$0, dzd.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ebi $$0, dzd.b $$1, int $$2, dzd.a $$3, ht $$4, List<dxl> $$5, ats $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dxl> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dxl $$10 : $$7) {
               $$10.a($$9);
               dxl $$11 = dxl.a($$5, $$10.f());
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

   public static class a extends dxr {
      public a(ebi $$0, String $$1, ht $$2, dbm $$3, boolean $$4) {
         super(dxy.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ebi $$0, rz $$1) {
         super(dxy.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dbm.valueOf($$1.l("Rot"))));
      }

      private static ebd a(boolean $$0, dbm $$1) {
         eaj $$2 = $$0 ? eaj.b : eaj.d;
         return new ebd().a(true).a($$2).a($$1);
      }

      @Override
      protected agi b() {
         return a(this.a);
      }

      private static agi a(String $$0) {
         return new agi("end_city/" + $$0);
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eaj.b);
      }

      @Override
      protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
         if ($$0.startsWith("Chest")) {
            ht $$5 = $$1.d();
            if ($$4.b($$5)) {
               dgh.a($$2, $$3, $$5, eev.c);
            }
         } else if ($$4.b($$1) && csa.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               cbo $$6 = bku.aG.a((csa)$$2.D());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cag $$7 = new cag($$2.D(), $$1, this.c.d().a(hx.d));
               $$7.a(new clj(clm.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ebi var1, int var2, dzd.a var3, ht var4, List<dxl> var5, ats var6);
   }
}
