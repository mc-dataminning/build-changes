import com.google.common.collect.Lists;
import java.util.List;

public class dxp {
   private static final int a = 8;
   static final dxp.b b = new dxp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzu $$0, int $$1, dxp.a $$2, ht $$3, List<dwe> $$4, ate $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dal $$6 = $$2.e().d();
            dxp.a $$7 = dxp.a($$4, dxp.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 8, -1), "second_roof", $$6, false));
               dxp.a($$0, dxp.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 8, -1), "third_roof", $$6, true));
               dxp.a($$0, dxp.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aty<dal, ht>> c = Lists.newArrayList(
      new aty[]{new aty<>(dal.a, new ht(1, -1, 0)), new aty<>(dal.b, new ht(6, -1, 1)), new aty<>(dal.d, new ht(0, -1, 5)), new aty<>(dal.c, new ht(5, -1, 6))}
   );
   static final dxp.b d = new dxp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzu $$0, int $$1, dxp.a $$2, ht $$3, List<dwe> $$4, ate $$5) {
         dal $$6 = $$2.e().d();
         dxp.a $$7 = dxp.a($$4, dxp.a($$0, $$2, new ht(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(0, 7, 0), "tower_piece", $$6, true));
         dxp.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aty<dal, ht> $$11 : dxp.c) {
               if ($$5.h()) {
                  dxp.a $$12 = dxp.a($$4, dxp.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dxp.a($$0, dxp.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dxp.a($$0, dxp.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dxp.b e = new dxp.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dzu $$0, int $$1, dxp.a $$2, ht $$3, List<dwe> $$4, ate $$5) {
         dal $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dxp.a $$8 = dxp.a($$4, dxp.a($$0, $$2, new ht(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dxp.a($$4, dxp.a($$0, $$8, new ht(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dxp.a($$4, dxp.a($$0, $$8, new ht(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dxp.a($$4, dxp.a($$0, $$8, new ht(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dxp.a($$4, dxp.a($$0, $$8, new ht(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dxp.a($$0, dxp.b, $$1 + 1, $$8, new ht(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dxp.a($$4, dxp.a($$0, $$8, new ht(4, $$9, 0), "bridge_end", $$6.a(dal.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aty<dal, ht>> f = Lists.newArrayList(
      new aty[]{
         new aty<>(dal.a, new ht(4, -1, 0)), new aty<>(dal.b, new ht(12, -1, 4)), new aty<>(dal.d, new ht(0, -1, 8)), new aty<>(dal.c, new ht(8, -1, 12))
      }
   );
   static final dxp.b g = new dxp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dzu $$0, int $$1, dxp.a $$2, ht $$3, List<dwe> $$4, ate $$5) {
         dal $$6 = $$2.e().d();
         dxp.a $$7 = dxp.a($$4, dxp.a($$0, $$2, new ht(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aty<dal, ht> $$9 : dxp.f) {
               if ($$5.h()) {
                  dxp.a $$10 = dxp.a($$4, dxp.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dxp.a($$0, dxp.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dxp.a($$4, dxp.a($$0, $$7, new ht(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dxp.a a(dzu $$0, dxp.a $$1, ht $$2, String $$3, dal $$4, boolean $$5) {
      dxp.a $$6 = new dxp.a($$0, $$3, $$1.d(), $$4, $$5);
      ht $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ht.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dzu $$0, ht $$1, dal $$2, List<dwe> $$3, ate $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dxp.a $$5 = a($$3, new dxp.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ht(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dxp.a a(List<dwe> $$0, dxp.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dzu $$0, dxp.b $$1, int $$2, dxp.a $$3, ht $$4, List<dwe> $$5, ate $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dwe> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dwe $$10 : $$7) {
               $$10.a($$9);
               dwe $$11 = dwe.a($$5, $$10.f());
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

   public static class a extends dwk {
      public a(dzu $$0, String $$1, ht $$2, dal $$3, boolean $$4) {
         super(dwr.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dzu $$0, rt $$1) {
         super(dwr.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dal.valueOf($$1.l("Rot"))));
      }

      private static dzp a(boolean $$0, dal $$1) {
         dyv $$2 = $$0 ? dyv.b : dyv.d;
         return new dzp().a(true).a($$2).a($$1);
      }

      @Override
      protected afw b() {
         return a(this.a);
      }

      private static afw a(String $$0) {
         return new afw("end_city/" + $$0);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dyv.b);
      }

      @Override
      protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
         if ($$0.startsWith("Chest")) {
            ht $$5 = $$1.d();
            if ($$4.b($$5)) {
               dfa.a($$2, $$3, $$5, edg.c);
            }
         } else if ($$4.b($$1) && cqz.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               car $$6 = bjx.aG.a((cqz)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               bzj $$7 = new bzj($$2.C(), $$1, this.c.d().a(hx.d));
               $$7.a(new ckj(ckm.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dzu var1, int var2, dxp.a var3, ht var4, List<dwe> var5, ate var6);
   }
}
