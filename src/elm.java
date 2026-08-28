import com.google.common.collect.Lists;
import java.util.List;

public class elm {
   private static final int a = 8;
   static final elm.b b = new elm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ens $$0, int $$1, elm.a $$2, jd $$3, List<ejt> $$4, ayw $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dmm $$6 = $$2.e().d();
            elm.a $$7 = elm.a($$4, elm.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 8, -1), "second_roof", $$6, false));
               elm.a($$0, elm.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 8, -1), "third_roof", $$6, true));
               elm.a($$0, elm.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azr<dmm, jd>> c = Lists.newArrayList(
      new azr[]{new azr<>(dmm.a, new jd(1, -1, 0)), new azr<>(dmm.b, new jd(6, -1, 1)), new azr<>(dmm.d, new jd(0, -1, 5)), new azr<>(dmm.c, new jd(5, -1, 6))}
   );
   static final elm.b d = new elm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ens $$0, int $$1, elm.a $$2, jd $$3, List<ejt> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         elm.a $$7 = elm.a($$4, elm.a($$0, $$2, new jd(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = elm.a($$4, elm.a($$0, $$7, new jd(0, 7, 0), "tower_piece", $$6, true));
         elm.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = elm.a($$4, elm.a($$0, $$7, new jd(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azr<dmm, jd> $$11 : elm.c) {
               if ($$5.h()) {
                  elm.a $$12 = elm.a($$4, elm.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  elm.a($$0, elm.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return elm.a($$0, elm.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final elm.b e = new elm.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ens $$0, int $$1, elm.a $$2, jd $$3, List<ejt> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         elm.a $$8 = elm.a($$4, elm.a($$0, $$2, new jd(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = elm.a($$4, elm.a($$0, $$8, new jd(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = elm.a($$4, elm.a($$0, $$8, new jd(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = elm.a($$4, elm.a($$0, $$8, new jd(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            elm.a($$4, elm.a($$0, $$8, new jd(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!elm.a($$0, elm.b, $$1 + 1, $$8, new jd(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = elm.a($$4, elm.a($$0, $$8, new jd(4, $$9, 0), "bridge_end", $$6.a(dmm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azr<dmm, jd>> f = Lists.newArrayList(
      new azr[]{
         new azr<>(dmm.a, new jd(4, -1, 0)), new azr<>(dmm.b, new jd(12, -1, 4)), new azr<>(dmm.d, new jd(0, -1, 8)), new azr<>(dmm.c, new jd(8, -1, 12))
      }
   );
   static final elm.b g = new elm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ens $$0, int $$1, elm.a $$2, jd $$3, List<ejt> $$4, ayw $$5) {
         dmm $$6 = $$2.e().d();
         elm.a $$7 = elm.a($$4, elm.a($$0, $$2, new jd(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = elm.a($$4, elm.a($$0, $$7, new jd(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = elm.a($$4, elm.a($$0, $$7, new jd(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azr<dmm, jd> $$9 : elm.f) {
               if ($$5.h()) {
                  elm.a $$10 = elm.a($$4, elm.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  elm.a($$0, elm.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = elm.a($$4, elm.a($$0, $$7, new jd(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static elm.a a(ens $$0, elm.a $$1, jd $$2, String $$3, dmm $$4, boolean $$5) {
      elm.a $$6 = new elm.a($$0, $$3, $$1.d(), $$4, $$5);
      jd $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jd.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ens $$0, jd $$1, dmm $$2, List<ejt> $$3, ayw $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      elm.a $$5 = a($$3, new elm.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static elm.a a(List<ejt> $$0, elm.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ens $$0, elm.b $$1, int $$2, elm.a $$3, jd $$4, List<ejt> $$5, ayw $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ejt> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ejt $$10 : $$7) {
               $$10.a($$9);
               ejt $$11 = ejt.a($$5, $$10.f());
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

   public static class a extends ejz {
      public a(ens $$0, String $$1, jd $$2, dmm $$3, boolean $$4) {
         super(ekg.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ens $$0, ub $$1) {
         super(ekg.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dmm.valueOf($$1.l("Rot"))));
      }

      private static enn a(boolean $$0, dmm $$1) {
         ems $$2 = $$0 ? ems.b : ems.d;
         return new enn().a(true).a($$2).a($$1);
      }

      @Override
      protected akr b() {
         return a(this.a);
      }

      private static akr a(String $$0) {
         return akr.b("end_city/" + $$0);
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ems.b);
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejh $$4) {
         if ($$0.startsWith("Chest")) {
            jd $$5 = $$1.e();
            if ($$4.b($$5)) {
               bqz.a($$2, $$3, $$5, erl.c);
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

      boolean a(ens var1, int var2, elm.a var3, jd var4, List<ejt> var5, ayw var6);
   }
}
