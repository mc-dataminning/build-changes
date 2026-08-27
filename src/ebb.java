import com.google.common.collect.Lists;
import java.util.List;

public class ebb {
   private static final int a = 8;
   static final ebb.b b = new ebb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edg $$0, int $$1, ebb.a $$2, hx $$3, List<dzj> $$4, auu $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            ddb $$6 = $$2.e().d();
            ebb.a $$7 = ebb.a($$4, ebb.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 8, -1), "second_roof", $$6, false));
               ebb.a($$0, ebb.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 8, -1), "third_roof", $$6, true));
               ebb.a($$0, ebb.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<avq<ddb, hx>> c = Lists.newArrayList(
      new avq[]{new avq<>(ddb.a, new hx(1, -1, 0)), new avq<>(ddb.b, new hx(6, -1, 1)), new avq<>(ddb.d, new hx(0, -1, 5)), new avq<>(ddb.c, new hx(5, -1, 6))}
   );
   static final ebb.b d = new ebb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edg $$0, int $$1, ebb.a $$2, hx $$3, List<dzj> $$4, auu $$5) {
         ddb $$6 = $$2.e().d();
         ebb.a $$7 = ebb.a($$4, ebb.a($$0, $$2, new hx(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(0, 7, 0), "tower_piece", $$6, true));
         ebb.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (avq<ddb, hx> $$11 : ebb.c) {
               if ($$5.h()) {
                  ebb.a $$12 = ebb.a($$4, ebb.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ebb.a($$0, ebb.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ebb.a($$0, ebb.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ebb.b e = new ebb.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(edg $$0, int $$1, ebb.a $$2, hx $$3, List<dzj> $$4, auu $$5) {
         ddb $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ebb.a $$8 = ebb.a($$4, ebb.a($$0, $$2, new hx(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ebb.a($$4, ebb.a($$0, $$8, new hx(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ebb.a($$4, ebb.a($$0, $$8, new hx(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ebb.a($$4, ebb.a($$0, $$8, new hx(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ebb.a($$4, ebb.a($$0, $$8, new hx(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ebb.a($$0, ebb.b, $$1 + 1, $$8, new hx(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ebb.a($$4, ebb.a($$0, $$8, new hx(4, $$9, 0), "bridge_end", $$6.a(ddb.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<avq<ddb, hx>> f = Lists.newArrayList(
      new avq[]{
         new avq<>(ddb.a, new hx(4, -1, 0)), new avq<>(ddb.b, new hx(12, -1, 4)), new avq<>(ddb.d, new hx(0, -1, 8)), new avq<>(ddb.c, new hx(8, -1, 12))
      }
   );
   static final ebb.b g = new ebb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edg $$0, int $$1, ebb.a $$2, hx $$3, List<dzj> $$4, auu $$5) {
         ddb $$6 = $$2.e().d();
         ebb.a $$7 = ebb.a($$4, ebb.a($$0, $$2, new hx(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(0, 8, 0), "fat_tower_middle", $$6, true));

            for (avq<ddb, hx> $$9 : ebb.f) {
               if ($$5.h()) {
                  ebb.a $$10 = ebb.a($$4, ebb.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ebb.a($$0, ebb.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ebb.a($$4, ebb.a($$0, $$7, new hx(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ebb.a a(edg $$0, ebb.a $$1, hx $$2, String $$3, ddb $$4, boolean $$5) {
      ebb.a $$6 = new ebb.a($$0, $$3, $$1.d(), $$4, $$5);
      hx $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hx.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(edg $$0, hx $$1, ddb $$2, List<dzj> $$3, auu $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ebb.a $$5 = a($$3, new ebb.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ebb.a a(List<dzj> $$0, ebb.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(edg $$0, ebb.b $$1, int $$2, ebb.a $$3, hx $$4, List<dzj> $$5, auu $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dzj> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dzj $$10 : $$7) {
               $$10.a($$9);
               dzj $$11 = dzj.a($$5, $$10.f());
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

   public static class a extends dzp {
      public a(edg $$0, String $$1, hx $$2, ddb $$3, boolean $$4) {
         super(dzw.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(edg $$0, sn $$1) {
         super(dzw.Y, $$1, $$0, $$1x -> a($$1.q("OW"), ddb.valueOf($$1.l("Rot"))));
      }

      private static edb a(boolean $$0, ddb $$1) {
         ech $$2 = $$0 ? ech.b : ech.d;
         return new edb().a(true).a($$2).a($$1);
      }

      @Override
      protected ahg b() {
         return a(this.a);
      }

      private static ahg a(String $$0) {
         return new ahg("end_city/" + $$0);
      }

      @Override
      protected void a(dzv $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ech.b);
      }

      @Override
      protected void a(String $$0, hx $$1, cud $$2, auu $$3, dyx $$4) {
         if ($$0.startsWith("Chest")) {
            hx $$5 = $$1.d();
            if ($$4.b($$5)) {
               bkh.a($$2, $$3, $$5, egt.c);
            }
         } else if ($$4.b($$1) && cto.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ccu $$6 = bly.aH.a((cto)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cbm $$7 = new cbm($$2.E(), $$1, this.c.d().a(ic.d));
               $$7.a(new cmx(cna.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(edg var1, int var2, ebb.a var3, hx var4, List<dzj> var5, auu var6);
   }
}
