import com.google.common.collect.Lists;
import java.util.List;

public class dwo {
   private static final int a = 8;
   static final dwo.b b = new dwo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyt $$0, int $$1, dwo.a $$2, gu $$3, List<dvd> $$4, aru $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            cyy $$6 = $$2.e().d();
            dwo.a $$7 = dwo.a($$4, dwo.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 8, -1), "second_roof", $$6, false));
               dwo.a($$0, dwo.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 8, -1), "third_roof", $$6, true));
               dwo.a($$0, dwo.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aso<cyy, gu>> c = Lists.newArrayList(
      new aso[]{new aso<>(cyy.a, new gu(1, -1, 0)), new aso<>(cyy.b, new gu(6, -1, 1)), new aso<>(cyy.d, new gu(0, -1, 5)), new aso<>(cyy.c, new gu(5, -1, 6))}
   );
   static final dwo.b d = new dwo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyt $$0, int $$1, dwo.a $$2, gu $$3, List<dvd> $$4, aru $$5) {
         cyy $$6 = $$2.e().d();
         dwo.a $$7 = dwo.a($$4, dwo.a($$0, $$2, new gu(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(0, 7, 0), "tower_piece", $$6, true));
         dwo.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aso<cyy, gu> $$11 : dwo.c) {
               if ($$5.h()) {
                  dwo.a $$12 = dwo.a($$4, dwo.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dwo.a($$0, dwo.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dwo.a($$0, dwo.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dwo.b e = new dwo.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dyt $$0, int $$1, dwo.a $$2, gu $$3, List<dvd> $$4, aru $$5) {
         cyy $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dwo.a $$8 = dwo.a($$4, dwo.a($$0, $$2, new gu(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dwo.a($$4, dwo.a($$0, $$8, new gu(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dwo.a($$4, dwo.a($$0, $$8, new gu(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dwo.a($$4, dwo.a($$0, $$8, new gu(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dwo.a($$4, dwo.a($$0, $$8, new gu(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dwo.a($$0, dwo.b, $$1 + 1, $$8, new gu(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dwo.a($$4, dwo.a($$0, $$8, new gu(4, $$9, 0), "bridge_end", $$6.a(cyy.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aso<cyy, gu>> f = Lists.newArrayList(
      new aso[]{
         new aso<>(cyy.a, new gu(4, -1, 0)), new aso<>(cyy.b, new gu(12, -1, 4)), new aso<>(cyy.d, new gu(0, -1, 8)), new aso<>(cyy.c, new gu(8, -1, 12))
      }
   );
   static final dwo.b g = new dwo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyt $$0, int $$1, dwo.a $$2, gu $$3, List<dvd> $$4, aru $$5) {
         cyy $$6 = $$2.e().d();
         dwo.a $$7 = dwo.a($$4, dwo.a($$0, $$2, new gu(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aso<cyy, gu> $$9 : dwo.f) {
               if ($$5.h()) {
                  dwo.a $$10 = dwo.a($$4, dwo.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dwo.a($$0, dwo.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dwo.a($$4, dwo.a($$0, $$7, new gu(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dwo.a a(dyt $$0, dwo.a $$1, gu $$2, String $$3, cyy $$4, boolean $$5) {
      dwo.a $$6 = new dwo.a($$0, $$3, $$1.d(), $$4, $$5);
      gu $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gu.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dyt $$0, gu $$1, cyy $$2, List<dvd> $$3, aru $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dwo.a $$5 = a($$3, new dwo.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gu(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gu(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gu(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dwo.a a(List<dvd> $$0, dwo.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dyt $$0, dwo.b $$1, int $$2, dwo.a $$3, gu $$4, List<dvd> $$5, aru $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvd> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvd $$10 : $$7) {
               $$10.a($$9);
               dvd $$11 = dvd.a($$5, $$10.f());
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

   public static class a extends dvj {
      public a(dyt $$0, String $$1, gu $$2, cyy $$3, boolean $$4) {
         super(dvq.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dyt $$0, qr $$1) {
         super(dvq.Y, $$1, $$0, $$1x -> a($$1.q("OW"), cyy.valueOf($$1.l("Rot"))));
      }

      private static dyo a(boolean $$0, cyy $$1) {
         dxu $$2 = $$0 ? dxu.b : dxu.d;
         return new dyo().a(true).a($$2).a($$1);
      }

      @Override
      protected aer b() {
         return a(this.a);
      }

      private static aer a(String $$0) {
         return new aer("end_city/" + $$0);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dxu.b);
      }

      @Override
      protected void a(String $$0, gu $$1, cqb $$2, aru $$3, dur $$4) {
         if ($$0.startsWith("Chest")) {
            gu $$5 = $$1.d();
            if ($$4.b($$5)) {
               ddp.a($$2, $$3, $$5, ecf.c);
            }
         } else if ($$4.b($$1) && cpm.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzh $$6 = bim.aG.a((cpm)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               bxz $$7 = new bxz($$2.C(), $$1, this.c.d().a(ha.d));
               $$7.a(new ciy(cjb.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dyt var1, int var2, dwo.a var3, gu var4, List<dvd> var5, aru var6);
   }
}
