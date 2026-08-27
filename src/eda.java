import com.google.common.collect.Lists;
import java.util.List;

public class eda {
   private static final int a = 8;
   static final eda.b b = new eda.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eff $$0, int $$1, eda.a $$2, hz $$3, List<ebi> $$4, awo $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dfa $$6 = $$2.e().d();
            eda.a $$7 = eda.a($$4, eda.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 8, -1), "second_roof", $$6, false));
               eda.a($$0, eda.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 8, -1), "third_roof", $$6, true));
               eda.a($$0, eda.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<axj<dfa, hz>> c = Lists.newArrayList(
      new axj[]{new axj<>(dfa.a, new hz(1, -1, 0)), new axj<>(dfa.b, new hz(6, -1, 1)), new axj<>(dfa.d, new hz(0, -1, 5)), new axj<>(dfa.c, new hz(5, -1, 6))}
   );
   static final eda.b d = new eda.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eff $$0, int $$1, eda.a $$2, hz $$3, List<ebi> $$4, awo $$5) {
         dfa $$6 = $$2.e().d();
         eda.a $$7 = eda.a($$4, eda.a($$0, $$2, new hz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eda.a($$4, eda.a($$0, $$7, new hz(0, 7, 0), "tower_piece", $$6, true));
         eda.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eda.a($$4, eda.a($$0, $$7, new hz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (axj<dfa, hz> $$11 : eda.c) {
               if ($$5.h()) {
                  eda.a $$12 = eda.a($$4, eda.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eda.a($$0, eda.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eda.a($$0, eda.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eda.b e = new eda.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eff $$0, int $$1, eda.a $$2, hz $$3, List<ebi> $$4, awo $$5) {
         dfa $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eda.a $$8 = eda.a($$4, eda.a($$0, $$2, new hz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eda.a($$4, eda.a($$0, $$8, new hz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eda.a($$4, eda.a($$0, $$8, new hz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eda.a($$4, eda.a($$0, $$8, new hz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eda.a($$4, eda.a($$0, $$8, new hz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eda.a($$0, eda.b, $$1 + 1, $$8, new hz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eda.a($$4, eda.a($$0, $$8, new hz(4, $$9, 0), "bridge_end", $$6.a(dfa.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<axj<dfa, hz>> f = Lists.newArrayList(
      new axj[]{
         new axj<>(dfa.a, new hz(4, -1, 0)), new axj<>(dfa.b, new hz(12, -1, 4)), new axj<>(dfa.d, new hz(0, -1, 8)), new axj<>(dfa.c, new hz(8, -1, 12))
      }
   );
   static final eda.b g = new eda.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eff $$0, int $$1, eda.a $$2, hz $$3, List<ebi> $$4, awo $$5) {
         dfa $$6 = $$2.e().d();
         eda.a $$7 = eda.a($$4, eda.a($$0, $$2, new hz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eda.a($$4, eda.a($$0, $$7, new hz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eda.a($$4, eda.a($$0, $$7, new hz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (axj<dfa, hz> $$9 : eda.f) {
               if ($$5.h()) {
                  eda.a $$10 = eda.a($$4, eda.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eda.a($$0, eda.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eda.a($$4, eda.a($$0, $$7, new hz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eda.a a(eff $$0, eda.a $$1, hz $$2, String $$3, dfa $$4, boolean $$5) {
      eda.a $$6 = new eda.a($$0, $$3, $$1.d(), $$4, $$5);
      hz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eff $$0, hz $$1, dfa $$2, List<ebi> $$3, awo $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eda.a $$5 = a($$3, new eda.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eda.a a(List<ebi> $$0, eda.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eff $$0, eda.b $$1, int $$2, eda.a $$3, hz $$4, List<ebi> $$5, awo $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ebi> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ebi $$10 : $$7) {
               $$10.a($$9);
               ebi $$11 = ebi.a($$5, $$10.f());
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

   public static class a extends ebo {
      public a(eff $$0, String $$1, hz $$2, dfa $$3, boolean $$4) {
         super(ebv.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eff $$0, sw $$1) {
         super(ebv.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dfa.valueOf($$1.l("Rot"))));
      }

      private static efa a(boolean $$0, dfa $$1) {
         eeg $$2 = $$0 ? eeg.b : eeg.d;
         return new efa().a(true).a($$2).a($$1);
      }

      @Override
      protected aiy b() {
         return a(this.a);
      }

      private static aiy a(String $$0) {
         return new aiy("end_city/" + $$0);
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eeg.b);
      }

      @Override
      protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
         if ($$0.startsWith("Chest")) {
            hz $$5 = $$1.d();
            if ($$4.b($$5)) {
               bmc.a($$2, $$3, $$5, eit.c);
            }
         } else if ($$4.b($$1) && cvn.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cet $$6 = bnu.aI.a((cvn)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cdl $$7 = new cdl($$2.E(), $$1, this.c.d().a(ie.d));
               $$7.a(new coz(cpc.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eff var1, int var2, eda.a var3, hz var4, List<ebi> var5, awo var6);
   }
}
