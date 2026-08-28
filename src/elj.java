import com.google.common.collect.Lists;
import java.util.List;

public class elj {
   private static final int a = 8;
   static final elj.b b = new elj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eno $$0, int $$1, elj.a $$2, jd $$3, List<ejq> $$4, ayv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dmk $$6 = $$2.e().d();
            elj.a $$7 = elj.a($$4, elj.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 8, -1), "second_roof", $$6, false));
               elj.a($$0, elj.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 8, -1), "third_roof", $$6, true));
               elj.a($$0, elj.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azq<dmk, jd>> c = Lists.newArrayList(
      new azq[]{new azq<>(dmk.a, new jd(1, -1, 0)), new azq<>(dmk.b, new jd(6, -1, 1)), new azq<>(dmk.d, new jd(0, -1, 5)), new azq<>(dmk.c, new jd(5, -1, 6))}
   );
   static final elj.b d = new elj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eno $$0, int $$1, elj.a $$2, jd $$3, List<ejq> $$4, ayv $$5) {
         dmk $$6 = $$2.e().d();
         elj.a $$7 = elj.a($$4, elj.a($$0, $$2, new jd(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = elj.a($$4, elj.a($$0, $$7, new jd(0, 7, 0), "tower_piece", $$6, true));
         elj.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = elj.a($$4, elj.a($$0, $$7, new jd(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azq<dmk, jd> $$11 : elj.c) {
               if ($$5.h()) {
                  elj.a $$12 = elj.a($$4, elj.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  elj.a($$0, elj.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return elj.a($$0, elj.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final elj.b e = new elj.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eno $$0, int $$1, elj.a $$2, jd $$3, List<ejq> $$4, ayv $$5) {
         dmk $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         elj.a $$8 = elj.a($$4, elj.a($$0, $$2, new jd(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = elj.a($$4, elj.a($$0, $$8, new jd(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = elj.a($$4, elj.a($$0, $$8, new jd(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = elj.a($$4, elj.a($$0, $$8, new jd(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            elj.a($$4, elj.a($$0, $$8, new jd(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!elj.a($$0, elj.b, $$1 + 1, $$8, new jd(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = elj.a($$4, elj.a($$0, $$8, new jd(4, $$9, 0), "bridge_end", $$6.a(dmk.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azq<dmk, jd>> f = Lists.newArrayList(
      new azq[]{
         new azq<>(dmk.a, new jd(4, -1, 0)), new azq<>(dmk.b, new jd(12, -1, 4)), new azq<>(dmk.d, new jd(0, -1, 8)), new azq<>(dmk.c, new jd(8, -1, 12))
      }
   );
   static final elj.b g = new elj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eno $$0, int $$1, elj.a $$2, jd $$3, List<ejq> $$4, ayv $$5) {
         dmk $$6 = $$2.e().d();
         elj.a $$7 = elj.a($$4, elj.a($$0, $$2, new jd(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = elj.a($$4, elj.a($$0, $$7, new jd(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = elj.a($$4, elj.a($$0, $$7, new jd(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azq<dmk, jd> $$9 : elj.f) {
               if ($$5.h()) {
                  elj.a $$10 = elj.a($$4, elj.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  elj.a($$0, elj.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = elj.a($$4, elj.a($$0, $$7, new jd(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static elj.a a(eno $$0, elj.a $$1, jd $$2, String $$3, dmk $$4, boolean $$5) {
      elj.a $$6 = new elj.a($$0, $$3, $$1.d(), $$4, $$5);
      jd $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jd.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eno $$0, jd $$1, dmk $$2, List<ejq> $$3, ayv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      elj.a $$5 = a($$3, new elj.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jd(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static elj.a a(List<ejq> $$0, elj.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eno $$0, elj.b $$1, int $$2, elj.a $$3, jd $$4, List<ejq> $$5, ayv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ejq> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ejq $$10 : $$7) {
               $$10.a($$9);
               ejq $$11 = ejq.a($$5, $$10.f());
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

   public static class a extends ejw {
      public a(eno $$0, String $$1, jd $$2, dmk $$3, boolean $$4) {
         super(ekd.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eno $$0, ua $$1) {
         super(ekd.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dmk.valueOf($$1.l("Rot"))));
      }

      private static enj a(boolean $$0, dmk $$1) {
         emp $$2 = $$0 ? emp.b : emp.d;
         return new enj().a(true).a($$2).a($$1);
      }

      @Override
      protected akq b() {
         return a(this.a);
      }

      private static akq a(String $$0) {
         return akq.b("end_city/" + $$0);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == emp.b);
      }

      @Override
      protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
         if ($$0.startsWith("Chest")) {
            jd $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqy.a($$2, $$3, $$5, erh.c);
            }
         } else if ($$4.b($$1) && dcu.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckh $$6 = bsw.aK.a((dcu)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ciy $$7 = new ciy($$2.E(), $$1, this.c.d().a(ji.d));
               $$7.a(new cuo(cur.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eno var1, int var2, elj.a var3, jd var4, List<ejq> var5, ayv var6);
   }
}
