import com.google.common.collect.Lists;
import java.util.List;

public class eic {
   private static final int a = 8;
   static final eic.b b = new eic.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekh $$0, int $$1, eic.a $$2, im $$3, List<egk> $$4, ayd $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dji $$6 = $$2.e().d();
            eic.a $$7 = eic.a($$4, eic.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 8, -1), "second_roof", $$6, false));
               eic.a($$0, eic.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 8, -1), "third_roof", $$6, true));
               eic.a($$0, eic.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<ayx<dji, im>> c = Lists.newArrayList(
      new ayx[]{new ayx<>(dji.a, new im(1, -1, 0)), new ayx<>(dji.b, new im(6, -1, 1)), new ayx<>(dji.d, new im(0, -1, 5)), new ayx<>(dji.c, new im(5, -1, 6))}
   );
   static final eic.b d = new eic.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekh $$0, int $$1, eic.a $$2, im $$3, List<egk> $$4, ayd $$5) {
         dji $$6 = $$2.e().d();
         eic.a $$7 = eic.a($$4, eic.a($$0, $$2, new im(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eic.a($$4, eic.a($$0, $$7, new im(0, 7, 0), "tower_piece", $$6, true));
         eic.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eic.a($$4, eic.a($$0, $$7, new im(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (ayx<dji, im> $$11 : eic.c) {
               if ($$5.h()) {
                  eic.a $$12 = eic.a($$4, eic.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eic.a($$0, eic.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eic.a($$0, eic.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eic.a($$4, eic.a($$0, $$7, new im(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eic.b e = new eic.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ekh $$0, int $$1, eic.a $$2, im $$3, List<egk> $$4, ayd $$5) {
         dji $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eic.a $$8 = eic.a($$4, eic.a($$0, $$2, new im(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eic.a($$4, eic.a($$0, $$8, new im(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eic.a($$4, eic.a($$0, $$8, new im(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eic.a($$4, eic.a($$0, $$8, new im(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eic.a($$4, eic.a($$0, $$8, new im(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eic.a($$0, eic.b, $$1 + 1, $$8, new im(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eic.a($$4, eic.a($$0, $$8, new im(4, $$9, 0), "bridge_end", $$6.a(dji.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<ayx<dji, im>> f = Lists.newArrayList(
      new ayx[]{
         new ayx<>(dji.a, new im(4, -1, 0)), new ayx<>(dji.b, new im(12, -1, 4)), new ayx<>(dji.d, new im(0, -1, 8)), new ayx<>(dji.c, new im(8, -1, 12))
      }
   );
   static final eic.b g = new eic.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekh $$0, int $$1, eic.a $$2, im $$3, List<egk> $$4, ayd $$5) {
         dji $$6 = $$2.e().d();
         eic.a $$7 = eic.a($$4, eic.a($$0, $$2, new im(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eic.a($$4, eic.a($$0, $$7, new im(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eic.a($$4, eic.a($$0, $$7, new im(0, 8, 0), "fat_tower_middle", $$6, true));

            for (ayx<dji, im> $$9 : eic.f) {
               if ($$5.h()) {
                  eic.a $$10 = eic.a($$4, eic.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eic.a($$0, eic.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eic.a($$4, eic.a($$0, $$7, new im(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eic.a a(ekh $$0, eic.a $$1, im $$2, String $$3, dji $$4, boolean $$5) {
      eic.a $$6 = new eic.a($$0, $$3, $$1.d(), $$4, $$5);
      im $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), im.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ekh $$0, im $$1, dji $$2, List<egk> $$3, ayd $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eic.a $$5 = a($$3, new eic.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new im(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new im(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new im(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eic.a a(List<egk> $$0, eic.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ekh $$0, eic.b $$1, int $$2, eic.a $$3, im $$4, List<egk> $$5, ayd $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<egk> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (egk $$10 : $$7) {
               $$10.a($$9);
               egk $$11 = egk.a($$5, $$10.f());
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

   public static class a extends egq {
      public a(ekh $$0, String $$1, im $$2, dji $$3, boolean $$4) {
         super(egx.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ekh $$0, ty $$1) {
         super(egx.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dji.valueOf($$1.l("Rot"))));
      }

      private static ekc a(boolean $$0, dji $$1) {
         eji $$2 = $$0 ? eji.b : eji.d;
         return new ekc().a(true).a($$2).a($$1);
      }

      @Override
      protected akf b() {
         return a(this.a);
      }

      private static akf a(String $$0) {
         return new akf("end_city/" + $$0);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eji.b);
      }

      @Override
      protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
         if ($$0.startsWith("Chest")) {
            im $$5 = $$1.d();
            if ($$4.b($$5)) {
               boy.a($$2, $$3, $$5, eny.c);
            }
         } else if ($$4.b($$1) && czu.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               chx $$6 = bqr.aJ.a((czu)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cgo $$7 = new cgo($$2.E(), $$1, this.c.d().a(ir.d));
               $$7.a(new csd(csg.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ekh var1, int var2, eic.a var3, im var4, List<egk> var5, ayd var6);
   }
}
