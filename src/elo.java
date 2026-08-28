import com.google.common.collect.Lists;
import java.util.List;

public class elo {
   private static final int a = 8;
   static final elo.b b = new elo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elo.a $$2, jd $$3, List<ejv> $$4, ayw $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dmm $$6 = $$2.e().d();
            elo.a $$7 = elo.a($$4, elo.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 8, -1), "second_roof", $$6, false));
               elo.a($$0, elo.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 8, -1), "third_roof", $$6, true));
               elo.a($$0, elo.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azr<dmm, jd>> c = Lists.newArrayList(
      new azr[]{new azr<>(dmm.a, new jd(1, -1, 0)), new azr<>(dmm.b, new jd(6, -1, 1)), new azr<>(dmm.d, new jd(0, -1, 5)), new azr<>(dmm.c, new jd(5, -1, 6))}
   );
   static final elo.b d = new elo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elo.a $$2, jd $$3, List<ejv> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         elo.a $$7 = elo.a($$4, elo.a($$0, $$2, new jd(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = elo.a($$4, elo.a($$0, $$7, new jd(0, 7, 0), "tower_piece", $$6, true));
         elo.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = elo.a($$4, elo.a($$0, $$7, new jd(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azr<dmm, jd> $$11 : elo.c) {
               if ($$5.h()) {
                  elo.a $$12 = elo.a($$4, elo.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  elo.a($$0, elo.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return elo.a($$0, elo.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final elo.b e = new elo.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(enu $$0, int $$1, elo.a $$2, jd $$3, List<ejv> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         elo.a $$8 = elo.a($$4, elo.a($$0, $$2, new jd(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = elo.a($$4, elo.a($$0, $$8, new jd(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = elo.a($$4, elo.a($$0, $$8, new jd(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = elo.a($$4, elo.a($$0, $$8, new jd(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            elo.a($$4, elo.a($$0, $$8, new jd(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!elo.a($$0, elo.b, $$1 + 1, $$8, new jd(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = elo.a($$4, elo.a($$0, $$8, new jd(4, $$9, 0), "bridge_end", $$6.a(dmm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azr<dmm, jd>> f = Lists.newArrayList(
      new azr[]{
         new azr<>(dmm.a, new jd(4, -1, 0)), new azr<>(dmm.b, new jd(12, -1, 4)), new azr<>(dmm.d, new jd(0, -1, 8)), new azr<>(dmm.c, new jd(8, -1, 12))
      }
   );
   static final elo.b g = new elo.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elo.a $$2, jd $$3, List<ejv> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         elo.a $$7 = elo.a($$4, elo.a($$0, $$2, new jd(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = elo.a($$4, elo.a($$0, $$7, new jd(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = elo.a($$4, elo.a($$0, $$7, new jd(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azr<dmm, jd> $$9 : elo.f) {
               if ($$5.h()) {
                  elo.a $$10 = elo.a($$4, elo.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  elo.a($$0, elo.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = elo.a($$4, elo.a($$0, $$7, new jd(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static elo.a a(enu $$0, elo.a $$1, jd $$2, String $$3, dmm $$4, boolean $$5) {
      elo.a $$6 = new elo.a($$0, $$3, $$1.d(), $$4, $$5);
      jd $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jd.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(enu $$0, jd $$1, dmm $$2, List<ejv> $$3, ayw $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      elo.a $$5 = a($$3, new elo.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static elo.a a(List<ejv> $$0, elo.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(enu $$0, elo.b $$1, int $$2, elo.a $$3, jd $$4, List<ejv> $$5, ayw $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ejv> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ejv $$10 : $$7) {
               $$10.a($$9);
               ejv $$11 = ejv.a($$5, $$10.f());
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

   public static class a extends ekb {
      public a(enu $$0, String $$1, jd $$2, dmm $$3, boolean $$4) {
         super(eki.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(enu $$0, ub $$1) {
         super(eki.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dmm.valueOf($$1.l("Rot"))));
      }

      private static enp a(boolean $$0, dmm $$1) {
         emu $$2 = $$0 ? emu.b : emu.d;
         return new enp().a(true).a($$2).a($$1);
      }

      @Override
      protected akr b() {
         return a(this.a);
      }

      private static akr a(String $$0) {
         return akr.b("end_city/" + $$0);
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == emu.b);
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
         if ($$0.startsWith("Chest")) {
            jd $$5 = $$1.e();
            if ($$4.b($$5)) {
               bqz.a($$2, $$3, $$5, ern.c);
            }
         } else if ($$4.b($$1) && dcw.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckj $$6 = bsx.aK.a((dcw)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cja $$7 = new cja($$2.E(), $$1, this.c.d().a(ji.d));
               $$7.a(new cuq(cut.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(enu var1, int var2, elo.a var3, jd var4, List<ejv> var5, ayw var6);
   }
}
