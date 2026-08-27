import com.google.common.collect.Lists;
import java.util.List;

public class elp {
   private static final int a = 8;
   static final elp.b b = new elp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elp.a $$2, ir $$3, List<ejx> $$4, ayt $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dmd $$6 = $$2.e().d();
            elp.a $$7 = elp.a($$4, elp.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 8, -1), "second_roof", $$6, false));
               elp.a($$0, elp.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 8, -1), "third_roof", $$6, true));
               elp.a($$0, elp.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azn<dmd, ir>> c = Lists.newArrayList(
      new azn[]{new azn<>(dmd.a, new ir(1, -1, 0)), new azn<>(dmd.b, new ir(6, -1, 1)), new azn<>(dmd.d, new ir(0, -1, 5)), new azn<>(dmd.c, new ir(5, -1, 6))}
   );
   static final elp.b d = new elp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elp.a $$2, ir $$3, List<ejx> $$4, ayt $$5) {
         dmd $$6 = $$2.e().d();
         elp.a $$7 = elp.a($$4, elp.a($$0, $$2, new ir(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = elp.a($$4, elp.a($$0, $$7, new ir(0, 7, 0), "tower_piece", $$6, true));
         elp.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = elp.a($$4, elp.a($$0, $$7, new ir(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azn<dmd, ir> $$11 : elp.c) {
               if ($$5.h()) {
                  elp.a $$12 = elp.a($$4, elp.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  elp.a($$0, elp.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return elp.a($$0, elp.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final elp.b e = new elp.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(enu $$0, int $$1, elp.a $$2, ir $$3, List<ejx> $$4, ayt $$5) {
         dmd $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         elp.a $$8 = elp.a($$4, elp.a($$0, $$2, new ir(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = elp.a($$4, elp.a($$0, $$8, new ir(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = elp.a($$4, elp.a($$0, $$8, new ir(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = elp.a($$4, elp.a($$0, $$8, new ir(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            elp.a($$4, elp.a($$0, $$8, new ir(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!elp.a($$0, elp.b, $$1 + 1, $$8, new ir(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = elp.a($$4, elp.a($$0, $$8, new ir(4, $$9, 0), "bridge_end", $$6.a(dmd.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azn<dmd, ir>> f = Lists.newArrayList(
      new azn[]{
         new azn<>(dmd.a, new ir(4, -1, 0)), new azn<>(dmd.b, new ir(12, -1, 4)), new azn<>(dmd.d, new ir(0, -1, 8)), new azn<>(dmd.c, new ir(8, -1, 12))
      }
   );
   static final elp.b g = new elp.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(enu $$0, int $$1, elp.a $$2, ir $$3, List<ejx> $$4, ayt $$5) {
         dmd $$6 = $$2.e().d();
         elp.a $$7 = elp.a($$4, elp.a($$0, $$2, new ir(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = elp.a($$4, elp.a($$0, $$7, new ir(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = elp.a($$4, elp.a($$0, $$7, new ir(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azn<dmd, ir> $$9 : elp.f) {
               if ($$5.h()) {
                  elp.a $$10 = elp.a($$4, elp.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  elp.a($$0, elp.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = elp.a($$4, elp.a($$0, $$7, new ir(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static elp.a a(enu $$0, elp.a $$1, ir $$2, String $$3, dmd $$4, boolean $$5) {
      elp.a $$6 = new elp.a($$0, $$3, $$1.d(), $$4, $$5);
      ir $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ir.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(enu $$0, ir $$1, dmd $$2, List<ejx> $$3, ayt $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      elp.a $$5 = a($$3, new elp.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ir(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ir(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ir(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static elp.a a(List<ejx> $$0, elp.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(enu $$0, elp.b $$1, int $$2, elp.a $$3, ir $$4, List<ejx> $$5, ayt $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ejx> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ejx $$10 : $$7) {
               $$10.a($$9);
               ejx $$11 = ejx.a($$5, $$10.f());
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

   public static class a extends ekd {
      public a(enu $$0, String $$1, ir $$2, dmd $$3, boolean $$4) {
         super(ekk.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(enu $$0, uk $$1) {
         super(ekk.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dmd.valueOf($$1.l("Rot"))));
      }

      private static enp a(boolean $$0, dmd $$1) {
         emv $$2 = $$0 ? emv.b : emv.d;
         return new enp().a(true).a($$2).a($$1);
      }

      @Override
      protected akt b() {
         return a(this.a);
      }

      private static akt a(String $$0) {
         return new akt("end_city/" + $$0);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == emv.b);
      }

      @Override
      protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
         if ($$0.startsWith("Chest")) {
            ir $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqi.a($$2, $$3, $$5, ern.c);
            }
         } else if ($$4.b($$1) && dca.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cjk $$6 = bsb.aM.a((dca)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               chz $$7 = new chz($$2.E(), $$1, this.c.d().a(iw.d));
               $$7.a(new cuh(cuk.pj), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(enu var1, int var2, elp.a var3, ir var4, List<ejx> var5, ayt var6);
   }
}
