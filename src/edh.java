import com.google.common.collect.Lists;
import java.util.List;

public class edh {
   private static final int a = 8;
   static final edh.b b = new edh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(efm $$0, int $$1, edh.a $$2, hz $$3, List<ebp> $$4, awp $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dfe $$6 = $$2.e().d();
            edh.a $$7 = edh.a($$4, edh.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 8, -1), "second_roof", $$6, false));
               edh.a($$0, edh.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 8, -1), "third_roof", $$6, true));
               edh.a($$0, edh.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<axj<dfe, hz>> c = Lists.newArrayList(
      new axj[]{new axj<>(dfe.a, new hz(1, -1, 0)), new axj<>(dfe.b, new hz(6, -1, 1)), new axj<>(dfe.d, new hz(0, -1, 5)), new axj<>(dfe.c, new hz(5, -1, 6))}
   );
   static final edh.b d = new edh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(efm $$0, int $$1, edh.a $$2, hz $$3, List<ebp> $$4, awp $$5) {
         dfe $$6 = $$2.e().d();
         edh.a $$7 = edh.a($$4, edh.a($$0, $$2, new hz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = edh.a($$4, edh.a($$0, $$7, new hz(0, 7, 0), "tower_piece", $$6, true));
         edh.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = edh.a($$4, edh.a($$0, $$7, new hz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (axj<dfe, hz> $$11 : edh.c) {
               if ($$5.h()) {
                  edh.a $$12 = edh.a($$4, edh.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  edh.a($$0, edh.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return edh.a($$0, edh.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final edh.b e = new edh.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(efm $$0, int $$1, edh.a $$2, hz $$3, List<ebp> $$4, awp $$5) {
         dfe $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         edh.a $$8 = edh.a($$4, edh.a($$0, $$2, new hz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = edh.a($$4, edh.a($$0, $$8, new hz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = edh.a($$4, edh.a($$0, $$8, new hz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = edh.a($$4, edh.a($$0, $$8, new hz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            edh.a($$4, edh.a($$0, $$8, new hz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!edh.a($$0, edh.b, $$1 + 1, $$8, new hz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = edh.a($$4, edh.a($$0, $$8, new hz(4, $$9, 0), "bridge_end", $$6.a(dfe.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<axj<dfe, hz>> f = Lists.newArrayList(
      new axj[]{
         new axj<>(dfe.a, new hz(4, -1, 0)), new axj<>(dfe.b, new hz(12, -1, 4)), new axj<>(dfe.d, new hz(0, -1, 8)), new axj<>(dfe.c, new hz(8, -1, 12))
      }
   );
   static final edh.b g = new edh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(efm $$0, int $$1, edh.a $$2, hz $$3, List<ebp> $$4, awp $$5) {
         dfe $$6 = $$2.e().d();
         edh.a $$7 = edh.a($$4, edh.a($$0, $$2, new hz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = edh.a($$4, edh.a($$0, $$7, new hz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = edh.a($$4, edh.a($$0, $$7, new hz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (axj<dfe, hz> $$9 : edh.f) {
               if ($$5.h()) {
                  edh.a $$10 = edh.a($$4, edh.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  edh.a($$0, edh.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = edh.a($$4, edh.a($$0, $$7, new hz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static edh.a a(efm $$0, edh.a $$1, hz $$2, String $$3, dfe $$4, boolean $$5) {
      edh.a $$6 = new edh.a($$0, $$3, $$1.d(), $$4, $$5);
      hz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(efm $$0, hz $$1, dfe $$2, List<ebp> $$3, awp $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      edh.a $$5 = a($$3, new edh.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static edh.a a(List<ebp> $$0, edh.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(efm $$0, edh.b $$1, int $$2, edh.a $$3, hz $$4, List<ebp> $$5, awp $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ebp> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ebp $$10 : $$7) {
               $$10.a($$9);
               ebp $$11 = ebp.a($$5, $$10.f());
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

   public static class a extends ebv {
      public a(efm $$0, String $$1, hz $$2, dfe $$3, boolean $$4) {
         super(ecc.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(efm $$0, sw $$1) {
         super(ecc.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dfe.valueOf($$1.l("Rot"))));
      }

      private static efh a(boolean $$0, dfe $$1) {
         een $$2 = $$0 ? een.b : een.d;
         return new efh().a(true).a($$2).a($$1);
      }

      @Override
      protected aiy b() {
         return a(this.a);
      }

      private static aiy a(String $$0) {
         return new aiy("end_city/" + $$0);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == een.b);
      }

      @Override
      protected void a(String $$0, hz $$1, cwg $$2, awp $$3, ebd $$4) {
         if ($$0.startsWith("Chest")) {
            hz $$5 = $$1.d();
            if ($$4.b($$5)) {
               bme.a($$2, $$3, $$5, eja.c);
            }
         } else if ($$4.b($$1) && cvr.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cex $$6 = bnw.aI.a((cvr)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cdp $$7 = new cdp($$2.E(), $$1, this.c.d().a(ie.d));
               $$7.a(new cpd(cpg.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(efm var1, int var2, edh.a var3, hz var4, List<ebp> var5, awp var6);
   }
}
