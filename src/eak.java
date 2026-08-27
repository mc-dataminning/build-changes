import com.google.common.collect.Lists;
import java.util.List;

public class eak {
   private static final int a = 8;
   static final eak.b b = new eak.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ecp $$0, int $$1, eak.a $$2, hv $$3, List<dys> $$4, auf $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dcl $$6 = $$2.e().d();
            eak.a $$7 = eak.a($$4, eak.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 8, -1), "second_roof", $$6, false));
               eak.a($$0, eak.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 8, -1), "third_roof", $$6, true));
               eak.a($$0, eak.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<avb<dcl, hv>> c = Lists.newArrayList(
      new avb[]{new avb<>(dcl.a, new hv(1, -1, 0)), new avb<>(dcl.b, new hv(6, -1, 1)), new avb<>(dcl.d, new hv(0, -1, 5)), new avb<>(dcl.c, new hv(5, -1, 6))}
   );
   static final eak.b d = new eak.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ecp $$0, int $$1, eak.a $$2, hv $$3, List<dys> $$4, auf $$5) {
         dcl $$6 = $$2.e().d();
         eak.a $$7 = eak.a($$4, eak.a($$0, $$2, new hv(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eak.a($$4, eak.a($$0, $$7, new hv(0, 7, 0), "tower_piece", $$6, true));
         eak.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eak.a($$4, eak.a($$0, $$7, new hv(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (avb<dcl, hv> $$11 : eak.c) {
               if ($$5.h()) {
                  eak.a $$12 = eak.a($$4, eak.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eak.a($$0, eak.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eak.a($$0, eak.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eak.b e = new eak.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ecp $$0, int $$1, eak.a $$2, hv $$3, List<dys> $$4, auf $$5) {
         dcl $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eak.a $$8 = eak.a($$4, eak.a($$0, $$2, new hv(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eak.a($$4, eak.a($$0, $$8, new hv(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eak.a($$4, eak.a($$0, $$8, new hv(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eak.a($$4, eak.a($$0, $$8, new hv(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eak.a($$4, eak.a($$0, $$8, new hv(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eak.a($$0, eak.b, $$1 + 1, $$8, new hv(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eak.a($$4, eak.a($$0, $$8, new hv(4, $$9, 0), "bridge_end", $$6.a(dcl.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<avb<dcl, hv>> f = Lists.newArrayList(
      new avb[]{
         new avb<>(dcl.a, new hv(4, -1, 0)), new avb<>(dcl.b, new hv(12, -1, 4)), new avb<>(dcl.d, new hv(0, -1, 8)), new avb<>(dcl.c, new hv(8, -1, 12))
      }
   );
   static final eak.b g = new eak.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ecp $$0, int $$1, eak.a $$2, hv $$3, List<dys> $$4, auf $$5) {
         dcl $$6 = $$2.e().d();
         eak.a $$7 = eak.a($$4, eak.a($$0, $$2, new hv(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eak.a($$4, eak.a($$0, $$7, new hv(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eak.a($$4, eak.a($$0, $$7, new hv(0, 8, 0), "fat_tower_middle", $$6, true));

            for (avb<dcl, hv> $$9 : eak.f) {
               if ($$5.h()) {
                  eak.a $$10 = eak.a($$4, eak.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eak.a($$0, eak.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eak.a($$4, eak.a($$0, $$7, new hv(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eak.a a(ecp $$0, eak.a $$1, hv $$2, String $$3, dcl $$4, boolean $$5) {
      eak.a $$6 = new eak.a($$0, $$3, $$1.d(), $$4, $$5);
      hv $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hv.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ecp $$0, hv $$1, dcl $$2, List<dys> $$3, auf $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eak.a $$5 = a($$3, new eak.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hv(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hv(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hv(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eak.a a(List<dys> $$0, eak.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ecp $$0, eak.b $$1, int $$2, eak.a $$3, hv $$4, List<dys> $$5, auf $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dys> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dys $$10 : $$7) {
               $$10.a($$9);
               dys $$11 = dys.a($$5, $$10.f());
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

   public static class a extends dyy {
      public a(ecp $$0, String $$1, hv $$2, dcl $$3, boolean $$4) {
         super(dzf.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ecp $$0, sj $$1) {
         super(dzf.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dcl.valueOf($$1.l("Rot"))));
      }

      private static eck a(boolean $$0, dcl $$1) {
         ebq $$2 = $$0 ? ebq.b : ebq.d;
         return new eck().a(true).a($$2).a($$1);
      }

      @Override
      protected agt b() {
         return a(this.a);
      }

      private static agt a(String $$0) {
         return new agt("end_city/" + $$0);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ebq.b);
      }

      @Override
      protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
         if ($$0.startsWith("Chest")) {
            hv $$5 = $$1.d();
            if ($$4.b($$5)) {
               bjs.a($$2, $$3, $$5, egc.c);
            }
         } else if ($$4.b($$1) && csy.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               ccf $$6 = blj.aH.a((csy)$$2.D());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cax $$7 = new cax($$2.D(), $$1, this.c.d().a(ia.d));
               $$7.a(new cmh(cmk.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ecp var1, int var2, eak.a var3, hv var4, List<dys> var5, auf var6);
   }
}
