import com.google.common.collect.Lists;
import java.util.List;

public class esf {
   private static final int a = 8;
   static final esf.b b = new esf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eul $$0, int $$1, esf.a $$2, iu $$3, List<eqm> $$4, azt $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dsm $$6 = $$2.e().d();
            esf.a $$7 = esf.a($$4, esf.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 8, -1), "second_roof", $$6, false));
               esf.a($$0, esf.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 8, -1), "third_roof", $$6, true));
               esf.a($$0, esf.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bar<dsm, iu>> c = Lists.newArrayList(
      new bar[]{new bar<>(dsm.a, new iu(1, -1, 0)), new bar<>(dsm.b, new iu(6, -1, 1)), new bar<>(dsm.d, new iu(0, -1, 5)), new bar<>(dsm.c, new iu(5, -1, 6))}
   );
   static final esf.b d = new esf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eul $$0, int $$1, esf.a $$2, iu $$3, List<eqm> $$4, azt $$5) {
         dsm $$6 = $$2.e().d();
         esf.a $$7 = esf.a($$4, esf.a($$0, $$2, new iu(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = esf.a($$4, esf.a($$0, $$7, new iu(0, 7, 0), "tower_piece", $$6, true));
         esf.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = esf.a($$4, esf.a($$0, $$7, new iu(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bar<dsm, iu> $$11 : esf.c) {
               if ($$5.h()) {
                  esf.a $$12 = esf.a($$4, esf.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  esf.a($$0, esf.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return esf.a($$0, esf.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final esf.b e = new esf.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eul $$0, int $$1, esf.a $$2, iu $$3, List<eqm> $$4, azt $$5) {
         dsm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         esf.a $$8 = esf.a($$4, esf.a($$0, $$2, new iu(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = esf.a($$4, esf.a($$0, $$8, new iu(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = esf.a($$4, esf.a($$0, $$8, new iu(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = esf.a($$4, esf.a($$0, $$8, new iu(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            esf.a($$4, esf.a($$0, $$8, new iu(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!esf.a($$0, esf.b, $$1 + 1, $$8, new iu(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = esf.a($$4, esf.a($$0, $$8, new iu(4, $$9, 0), "bridge_end", $$6.a(dsm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bar<dsm, iu>> f = Lists.newArrayList(
      new bar[]{
         new bar<>(dsm.a, new iu(4, -1, 0)), new bar<>(dsm.b, new iu(12, -1, 4)), new bar<>(dsm.d, new iu(0, -1, 8)), new bar<>(dsm.c, new iu(8, -1, 12))
      }
   );
   static final esf.b g = new esf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eul $$0, int $$1, esf.a $$2, iu $$3, List<eqm> $$4, azt $$5) {
         dsm $$6 = $$2.e().d();
         esf.a $$7 = esf.a($$4, esf.a($$0, $$2, new iu(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = esf.a($$4, esf.a($$0, $$7, new iu(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = esf.a($$4, esf.a($$0, $$7, new iu(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bar<dsm, iu> $$9 : esf.f) {
               if ($$5.h()) {
                  esf.a $$10 = esf.a($$4, esf.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  esf.a($$0, esf.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = esf.a($$4, esf.a($$0, $$7, new iu(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static esf.a a(eul $$0, esf.a $$1, iu $$2, String $$3, dsm $$4, boolean $$5) {
      esf.a $$6 = new esf.a($$0, $$3, $$1.d(), $$4, $$5);
      iu $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iu.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eul $$0, iu $$1, dsm $$2, List<eqm> $$3, azt $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      esf.a $$5 = a($$3, new esf.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static esf.a a(List<eqm> $$0, esf.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eul $$0, esf.b $$1, int $$2, esf.a $$3, iu $$4, List<eqm> $$5, azt $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eqm> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eqm $$10 : $$7) {
               $$10.a($$9);
               eqm $$11 = eqm.a($$5, $$10.f());
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

   public static class a extends eqs {
      public a(eul $$0, String $$1, iu $$2, dsm $$3, boolean $$4) {
         super(eqz.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eul $$0, tx $$1) {
         super(eqz.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dsm.valueOf($$1.l("Rot"))));
      }

      private static eug a(boolean $$0, dsm $$1) {
         etl $$2 = $$0 ? etl.b : etl.d;
         return new eug().a(true).a($$2).a($$1);
      }

      @Override
      protected ale b() {
         return a(this.a);
      }

      private static ale a(String $$0) {
         return ale.b("end_city/" + $$0);
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == etl.b);
      }

      @Override
      protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
         if ($$0.startsWith("Chest")) {
            iu $$5 = $$1.e();
            if ($$4.b($$5)) {
               bue.a($$2, $$3, $$5, eyj.b);
            }
         } else if ($$4.b($$1) && dip.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cnz $$6 = bwj.bc.a($$2.a(), bwi.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cmq $$7 = new cmq($$2.a(), $$1, this.c.d().a(ja.d));
               $$7.a(new cys(cyw.oy), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eul var1, int var2, esf.a var3, iu var4, List<eqm> var5, azt var6);
   }
}
