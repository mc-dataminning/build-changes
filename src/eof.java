import com.google.common.collect.Lists;
import java.util.List;

public class eof {
   private static final int a = 8;
   static final eof.b b = new eof.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eql $$0, int $$1, eof.a $$2, jh $$3, List<emm> $$4, azu $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dpd $$6 = $$2.e().d();
            eof.a $$7 = eof.a($$4, eof.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 8, -1), "second_roof", $$6, false));
               eof.a($$0, eof.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 8, -1), "third_roof", $$6, true));
               eof.a($$0, eof.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bar<dpd, jh>> c = Lists.newArrayList(
      new bar[]{new bar<>(dpd.a, new jh(1, -1, 0)), new bar<>(dpd.b, new jh(6, -1, 1)), new bar<>(dpd.d, new jh(0, -1, 5)), new bar<>(dpd.c, new jh(5, -1, 6))}
   );
   static final eof.b d = new eof.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eql $$0, int $$1, eof.a $$2, jh $$3, List<emm> $$4, azu $$5) {
         dpd $$6 = $$2.e().d();
         eof.a $$7 = eof.a($$4, eof.a($$0, $$2, new jh(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eof.a($$4, eof.a($$0, $$7, new jh(0, 7, 0), "tower_piece", $$6, true));
         eof.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eof.a($$4, eof.a($$0, $$7, new jh(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bar<dpd, jh> $$11 : eof.c) {
               if ($$5.h()) {
                  eof.a $$12 = eof.a($$4, eof.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eof.a($$0, eof.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eof.a($$0, eof.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eof.b e = new eof.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eql $$0, int $$1, eof.a $$2, jh $$3, List<emm> $$4, azu $$5) {
         dpd $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eof.a $$8 = eof.a($$4, eof.a($$0, $$2, new jh(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eof.a($$4, eof.a($$0, $$8, new jh(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eof.a($$4, eof.a($$0, $$8, new jh(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eof.a($$4, eof.a($$0, $$8, new jh(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eof.a($$4, eof.a($$0, $$8, new jh(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eof.a($$0, eof.b, $$1 + 1, $$8, new jh(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eof.a($$4, eof.a($$0, $$8, new jh(4, $$9, 0), "bridge_end", $$6.a(dpd.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bar<dpd, jh>> f = Lists.newArrayList(
      new bar[]{
         new bar<>(dpd.a, new jh(4, -1, 0)), new bar<>(dpd.b, new jh(12, -1, 4)), new bar<>(dpd.d, new jh(0, -1, 8)), new bar<>(dpd.c, new jh(8, -1, 12))
      }
   );
   static final eof.b g = new eof.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eql $$0, int $$1, eof.a $$2, jh $$3, List<emm> $$4, azu $$5) {
         dpd $$6 = $$2.e().d();
         eof.a $$7 = eof.a($$4, eof.a($$0, $$2, new jh(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eof.a($$4, eof.a($$0, $$7, new jh(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eof.a($$4, eof.a($$0, $$7, new jh(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bar<dpd, jh> $$9 : eof.f) {
               if ($$5.h()) {
                  eof.a $$10 = eof.a($$4, eof.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eof.a($$0, eof.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eof.a($$4, eof.a($$0, $$7, new jh(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eof.a a(eql $$0, eof.a $$1, jh $$2, String $$3, dpd $$4, boolean $$5) {
      eof.a $$6 = new eof.a($$0, $$3, $$1.d(), $$4, $$5);
      jh $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jh.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eql $$0, jh $$1, dpd $$2, List<emm> $$3, azu $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eof.a $$5 = a($$3, new eof.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eof.a a(List<emm> $$0, eof.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eql $$0, eof.b $$1, int $$2, eof.a $$3, jh $$4, List<emm> $$5, azu $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<emm> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (emm $$10 : $$7) {
               $$10.a($$9);
               emm $$11 = emm.a($$5, $$10.f());
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

   public static class a extends ems {
      public a(eql $$0, String $$1, jh $$2, dpd $$3, boolean $$4) {
         super(emz.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eql $$0, ul $$1) {
         super(emz.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dpd.valueOf($$1.l("Rot"))));
      }

      private static eqg a(boolean $$0, dpd $$1) {
         epl $$2 = $$0 ? epl.b : epl.d;
         return new eqg().a(true).a($$2).a($$1);
      }

      @Override
      protected alj b() {
         return a(this.a);
      }

      private static alj a(String $$0) {
         return alj.b("end_city/" + $$0);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == epl.b);
      }

      @Override
      protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
         if ($$0.startsWith("Chest")) {
            jh $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsq.a($$2, $$3, $$5, euj.b);
            }
         } else if ($$4.b($$1) && dfm.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cme $$6 = bus.aY.a($$2.a(), bur.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ckv $$7 = new ckv($$2.a(), $$1, this.c.d().a(jm.d));
               $$7.a(new cwm(cwq.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eql var1, int var2, eof.a var3, jh var4, List<emm> var5, azu var6);
   }
}
