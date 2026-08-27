import com.google.common.collect.Lists;
import java.util.List;

public class dyr {
   private static final int a = 8;
   static final dyr.b b = new dyr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eaw $$0, int $$1, dyr.a $$2, ht $$3, List<dwz> $$4, ato $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dbf $$6 = $$2.e().d();
            dyr.a $$7 = dyr.a($$4, dyr.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 8, -1), "second_roof", $$6, false));
               dyr.a($$0, dyr.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 8, -1), "third_roof", $$6, true));
               dyr.a($$0, dyr.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aui<dbf, ht>> c = Lists.newArrayList(
      new aui[]{new aui<>(dbf.a, new ht(1, -1, 0)), new aui<>(dbf.b, new ht(6, -1, 1)), new aui<>(dbf.d, new ht(0, -1, 5)), new aui<>(dbf.c, new ht(5, -1, 6))}
   );
   static final dyr.b d = new dyr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eaw $$0, int $$1, dyr.a $$2, ht $$3, List<dwz> $$4, ato $$5) {
         dbf $$6 = $$2.e().d();
         dyr.a $$7 = dyr.a($$4, dyr.a($$0, $$2, new ht(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(0, 7, 0), "tower_piece", $$6, true));
         dyr.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aui<dbf, ht> $$11 : dyr.c) {
               if ($$5.h()) {
                  dyr.a $$12 = dyr.a($$4, dyr.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dyr.a($$0, dyr.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dyr.a($$0, dyr.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dyr.b e = new dyr.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eaw $$0, int $$1, dyr.a $$2, ht $$3, List<dwz> $$4, ato $$5) {
         dbf $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dyr.a $$8 = dyr.a($$4, dyr.a($$0, $$2, new ht(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dyr.a($$4, dyr.a($$0, $$8, new ht(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dyr.a($$4, dyr.a($$0, $$8, new ht(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dyr.a($$4, dyr.a($$0, $$8, new ht(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dyr.a($$4, dyr.a($$0, $$8, new ht(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dyr.a($$0, dyr.b, $$1 + 1, $$8, new ht(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dyr.a($$4, dyr.a($$0, $$8, new ht(4, $$9, 0), "bridge_end", $$6.a(dbf.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aui<dbf, ht>> f = Lists.newArrayList(
      new aui[]{
         new aui<>(dbf.a, new ht(4, -1, 0)), new aui<>(dbf.b, new ht(12, -1, 4)), new aui<>(dbf.d, new ht(0, -1, 8)), new aui<>(dbf.c, new ht(8, -1, 12))
      }
   );
   static final dyr.b g = new dyr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eaw $$0, int $$1, dyr.a $$2, ht $$3, List<dwz> $$4, ato $$5) {
         dbf $$6 = $$2.e().d();
         dyr.a $$7 = dyr.a($$4, dyr.a($$0, $$2, new ht(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aui<dbf, ht> $$9 : dyr.f) {
               if ($$5.h()) {
                  dyr.a $$10 = dyr.a($$4, dyr.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dyr.a($$0, dyr.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dyr.a($$4, dyr.a($$0, $$7, new ht(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dyr.a a(eaw $$0, dyr.a $$1, ht $$2, String $$3, dbf $$4, boolean $$5) {
      dyr.a $$6 = new dyr.a($$0, $$3, $$1.d(), $$4, $$5);
      ht $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ht.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eaw $$0, ht $$1, dbf $$2, List<dwz> $$3, ato $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dyr.a $$5 = a($$3, new dyr.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dyr.a a(List<dwz> $$0, dyr.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eaw $$0, dyr.b $$1, int $$2, dyr.a $$3, ht $$4, List<dwz> $$5, ato $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dwz> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dwz $$10 : $$7) {
               $$10.a($$9);
               dwz $$11 = dwz.a($$5, $$10.f());
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

   public static class a extends dxf {
      public a(eaw $$0, String $$1, ht $$2, dbf $$3, boolean $$4) {
         super(dxm.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eaw $$0, rz $$1) {
         super(dxm.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dbf.valueOf($$1.l("Rot"))));
      }

      private static ear a(boolean $$0, dbf $$1) {
         dzx $$2 = $$0 ? dzx.b : dzx.d;
         return new ear().a(true).a($$2).a($$1);
      }

      @Override
      protected agg b() {
         return a(this.a);
      }

      private static agg a(String $$0) {
         return new agg("end_city/" + $$0);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dzx.b);
      }

      @Override
      protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
         if ($$0.startsWith("Chest")) {
            ht $$5 = $$1.d();
            if ($$4.b($$5)) {
               dfv.a($$2, $$3, $$5, eej.c);
            }
         } else if ($$4.b($$1) && crs.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               cbg $$6 = bkm.aG.a((crs)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               bzy $$7 = new bzy($$2.C(), $$1, this.c.d().a(hx.d));
               $$7.a(new clb(cle.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eaw var1, int var2, dyr.a var3, ht var4, List<dwz> var5, ato var6);
   }
}
