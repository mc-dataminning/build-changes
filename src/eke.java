import com.google.common.collect.Lists;
import java.util.List;

public class eke {
   private static final int a = 8;
   static final eke.b b = new eke.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emj $$0, int $$1, eke.a $$2, iz $$3, List<eim> $$4, azf $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlk $$6 = $$2.e().d();
            eke.a $$7 = eke.a($$4, eke.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               eke.a($$0, eke.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               eke.a($$0, eke.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azz<dlk, iz>> c = Lists.newArrayList(
      new azz[]{new azz<>(dlk.a, new iz(1, -1, 0)), new azz<>(dlk.b, new iz(6, -1, 1)), new azz<>(dlk.d, new iz(0, -1, 5)), new azz<>(dlk.c, new iz(5, -1, 6))}
   );
   static final eke.b d = new eke.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emj $$0, int $$1, eke.a $$2, iz $$3, List<eim> $$4, azf $$5) {
         dlk $$6 = $$2.e().d();
         eke.a $$7 = eke.a($$4, eke.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eke.a($$4, eke.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         eke.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eke.a($$4, eke.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azz<dlk, iz> $$11 : eke.c) {
               if ($$5.h()) {
                  eke.a $$12 = eke.a($$4, eke.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eke.a($$0, eke.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eke.a($$0, eke.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eke.b e = new eke.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emj $$0, int $$1, eke.a $$2, iz $$3, List<eim> $$4, azf $$5) {
         dlk $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eke.a $$8 = eke.a($$4, eke.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eke.a($$4, eke.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eke.a($$4, eke.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eke.a($$4, eke.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eke.a($$4, eke.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eke.a($$0, eke.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eke.a($$4, eke.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dlk.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azz<dlk, iz>> f = Lists.newArrayList(
      new azz[]{
         new azz<>(dlk.a, new iz(4, -1, 0)), new azz<>(dlk.b, new iz(12, -1, 4)), new azz<>(dlk.d, new iz(0, -1, 8)), new azz<>(dlk.c, new iz(8, -1, 12))
      }
   );
   static final eke.b g = new eke.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emj $$0, int $$1, eke.a $$2, iz $$3, List<eim> $$4, azf $$5) {
         dlk $$6 = $$2.e().d();
         eke.a $$7 = eke.a($$4, eke.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eke.a($$4, eke.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eke.a($$4, eke.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azz<dlk, iz> $$9 : eke.f) {
               if ($$5.h()) {
                  eke.a $$10 = eke.a($$4, eke.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eke.a($$0, eke.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eke.a($$4, eke.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eke.a a(emj $$0, eke.a $$1, iz $$2, String $$3, dlk $$4, boolean $$5) {
      eke.a $$6 = new eke.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emj $$0, iz $$1, dlk $$2, List<eim> $$3, azf $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eke.a $$5 = a($$3, new eke.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eke.a a(List<eim> $$0, eke.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emj $$0, eke.b $$1, int $$2, eke.a $$3, iz $$4, List<eim> $$5, azf $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eim> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eim $$10 : $$7) {
               $$10.a($$9);
               eim $$11 = eim.a($$5, $$10.f());
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

   public static class a extends eis {
      public a(emj $$0, String $$1, iz $$2, dlk $$3, boolean $$4) {
         super(eiz.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emj $$0, ur $$1) {
         super(eiz.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlk.valueOf($$1.l("Rot"))));
      }

      private static eme a(boolean $$0, dlk $$1) {
         elk $$2 = $$0 ? elk.b : elk.d;
         return new eme().a(true).a($$2).a($$1);
      }

      @Override
      protected ale b() {
         return a(this.a);
      }

      private static ale a(String $$0) {
         return new ale("end_city/" + $$0);
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == elk.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               bra.a($$2, $$3, $$5, eqc.c);
            }
         } else if ($$4.b($$1) && dbw.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckh $$6 = bsy.aK.a((dbw)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ciy $$7 = new ciy($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cun(cuq.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emj var1, int var2, eke.a var3, iz var4, List<eim> var5, azf var6);
   }
}
