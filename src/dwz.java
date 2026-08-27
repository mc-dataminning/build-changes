import com.google.common.collect.Lists;
import java.util.List;

public class dwz {
   private static final int a = 8;
   static final dwz.b b = new dwz.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dze $$0, int $$1, dwz.a $$2, gw $$3, List<dvo> $$4, ase $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            czj $$6 = $$2.e().d();
            dwz.a $$7 = dwz.a($$4, dwz.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 8, -1), "second_roof", $$6, false));
               dwz.a($$0, dwz.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 8, -1), "third_roof", $$6, true));
               dwz.a($$0, dwz.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<asy<czj, gw>> c = Lists.newArrayList(
      new asy[]{new asy<>(czj.a, new gw(1, -1, 0)), new asy<>(czj.b, new gw(6, -1, 1)), new asy<>(czj.d, new gw(0, -1, 5)), new asy<>(czj.c, new gw(5, -1, 6))}
   );
   static final dwz.b d = new dwz.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dze $$0, int $$1, dwz.a $$2, gw $$3, List<dvo> $$4, ase $$5) {
         czj $$6 = $$2.e().d();
         dwz.a $$7 = dwz.a($$4, dwz.a($$0, $$2, new gw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(0, 7, 0), "tower_piece", $$6, true));
         dwz.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (asy<czj, gw> $$11 : dwz.c) {
               if ($$5.h()) {
                  dwz.a $$12 = dwz.a($$4, dwz.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dwz.a($$0, dwz.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dwz.a($$0, dwz.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dwz.b e = new dwz.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dze $$0, int $$1, dwz.a $$2, gw $$3, List<dvo> $$4, ase $$5) {
         czj $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dwz.a $$8 = dwz.a($$4, dwz.a($$0, $$2, new gw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dwz.a($$4, dwz.a($$0, $$8, new gw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dwz.a($$4, dwz.a($$0, $$8, new gw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dwz.a($$4, dwz.a($$0, $$8, new gw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dwz.a($$4, dwz.a($$0, $$8, new gw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dwz.a($$0, dwz.b, $$1 + 1, $$8, new gw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dwz.a($$4, dwz.a($$0, $$8, new gw(4, $$9, 0), "bridge_end", $$6.a(czj.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<asy<czj, gw>> f = Lists.newArrayList(
      new asy[]{
         new asy<>(czj.a, new gw(4, -1, 0)), new asy<>(czj.b, new gw(12, -1, 4)), new asy<>(czj.d, new gw(0, -1, 8)), new asy<>(czj.c, new gw(8, -1, 12))
      }
   );
   static final dwz.b g = new dwz.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dze $$0, int $$1, dwz.a $$2, gw $$3, List<dvo> $$4, ase $$5) {
         czj $$6 = $$2.e().d();
         dwz.a $$7 = dwz.a($$4, dwz.a($$0, $$2, new gw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (asy<czj, gw> $$9 : dwz.f) {
               if ($$5.h()) {
                  dwz.a $$10 = dwz.a($$4, dwz.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dwz.a($$0, dwz.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dwz.a($$4, dwz.a($$0, $$7, new gw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dwz.a a(dze $$0, dwz.a $$1, gw $$2, String $$3, czj $$4, boolean $$5) {
      dwz.a $$6 = new dwz.a($$0, $$3, $$1.d(), $$4, $$5);
      gw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gw.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dze $$0, gw $$1, czj $$2, List<dvo> $$3, ase $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dwz.a $$5 = a($$3, new dwz.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dwz.a a(List<dvo> $$0, dwz.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dze $$0, dwz.b $$1, int $$2, dwz.a $$3, gw $$4, List<dvo> $$5, ase $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvo> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvo $$10 : $$7) {
               $$10.a($$9);
               dvo $$11 = dvo.a($$5, $$10.f());
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

   public static class a extends dvu {
      public a(dze $$0, String $$1, gw $$2, czj $$3, boolean $$4) {
         super(dwb.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dze $$0, qy $$1) {
         super(dwb.Y, $$1, $$0, $$1x -> a($$1.q("OW"), czj.valueOf($$1.l("Rot"))));
      }

      private static dyz a(boolean $$0, czj $$1) {
         dyf $$2 = $$0 ? dyf.b : dyf.d;
         return new dyz().a(true).a($$2).a($$1);
      }

      @Override
      protected aey b() {
         return a(this.a);
      }

      private static aey a(String $$0) {
         return new aey("end_city/" + $$0);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dyf.b);
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
         if ($$0.startsWith("Chest")) {
            gw $$5 = $$1.d();
            if ($$4.b($$5)) {
               dea.a($$2, $$3, $$5, ecq.c);
            }
         } else if ($$4.b($$1) && cpx.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzq $$6 = biw.aG.a((cpx)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               byi $$7 = new byi($$2.C(), $$1, this.c.d().a(hc.d));
               $$7.a(new cjh(cjk.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dze var1, int var2, dwz.a var3, gw var4, List<dvo> var5, ase var6);
   }
}
