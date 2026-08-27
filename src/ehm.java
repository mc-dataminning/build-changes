import com.google.common.collect.Lists;
import java.util.List;

public class ehm {
   private static final int a = 8;
   static final ehm.b b = new ehm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ejr $$0, int $$1, ehm.a $$2, id $$3, List<efu> $$4, axt $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dit $$6 = $$2.e().d();
            ehm.a $$7 = ehm.a($$4, ehm.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 8, -1), "second_roof", $$6, false));
               ehm.a($$0, ehm.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 8, -1), "third_roof", $$6, true));
               ehm.a($$0, ehm.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<ayn<dit, id>> c = Lists.newArrayList(
      new ayn[]{new ayn<>(dit.a, new id(1, -1, 0)), new ayn<>(dit.b, new id(6, -1, 1)), new ayn<>(dit.d, new id(0, -1, 5)), new ayn<>(dit.c, new id(5, -1, 6))}
   );
   static final ehm.b d = new ehm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ejr $$0, int $$1, ehm.a $$2, id $$3, List<efu> $$4, axt $$5) {
         dit $$6 = $$2.e().d();
         ehm.a $$7 = ehm.a($$4, ehm.a($$0, $$2, new id(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(0, 7, 0), "tower_piece", $$6, true));
         ehm.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (ayn<dit, id> $$11 : ehm.c) {
               if ($$5.h()) {
                  ehm.a $$12 = ehm.a($$4, ehm.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ehm.a($$0, ehm.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ehm.a($$0, ehm.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ehm.b e = new ehm.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ejr $$0, int $$1, ehm.a $$2, id $$3, List<efu> $$4, axt $$5) {
         dit $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ehm.a $$8 = ehm.a($$4, ehm.a($$0, $$2, new id(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ehm.a($$4, ehm.a($$0, $$8, new id(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ehm.a($$4, ehm.a($$0, $$8, new id(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ehm.a($$4, ehm.a($$0, $$8, new id(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ehm.a($$4, ehm.a($$0, $$8, new id(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ehm.a($$0, ehm.b, $$1 + 1, $$8, new id(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ehm.a($$4, ehm.a($$0, $$8, new id(4, $$9, 0), "bridge_end", $$6.a(dit.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<ayn<dit, id>> f = Lists.newArrayList(
      new ayn[]{
         new ayn<>(dit.a, new id(4, -1, 0)), new ayn<>(dit.b, new id(12, -1, 4)), new ayn<>(dit.d, new id(0, -1, 8)), new ayn<>(dit.c, new id(8, -1, 12))
      }
   );
   static final ehm.b g = new ehm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ejr $$0, int $$1, ehm.a $$2, id $$3, List<efu> $$4, axt $$5) {
         dit $$6 = $$2.e().d();
         ehm.a $$7 = ehm.a($$4, ehm.a($$0, $$2, new id(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(0, 8, 0), "fat_tower_middle", $$6, true));

            for (ayn<dit, id> $$9 : ehm.f) {
               if ($$5.h()) {
                  ehm.a $$10 = ehm.a($$4, ehm.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ehm.a($$0, ehm.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ehm.a($$4, ehm.a($$0, $$7, new id(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ehm.a a(ejr $$0, ehm.a $$1, id $$2, String $$3, dit $$4, boolean $$5) {
      ehm.a $$6 = new ehm.a($$0, $$3, $$1.d(), $$4, $$5);
      id $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), id.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ejr $$0, id $$1, dit $$2, List<efu> $$3, axt $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ehm.a $$5 = a($$3, new ehm.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new id(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new id(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new id(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ehm.a a(List<efu> $$0, ehm.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ejr $$0, ehm.b $$1, int $$2, ehm.a $$3, id $$4, List<efu> $$5, axt $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<efu> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (efu $$10 : $$7) {
               $$10.a($$9);
               efu $$11 = efu.a($$5, $$10.f());
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

   public static class a extends ega {
      public a(ejr $$0, String $$1, id $$2, dit $$3, boolean $$4) {
         super(egh.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ejr $$0, to $$1) {
         super(egh.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dit.valueOf($$1.l("Rot"))));
      }

      private static ejm a(boolean $$0, dit $$1) {
         eis $$2 = $$0 ? eis.b : eis.d;
         return new ejm().a(true).a($$2).a($$1);
      }

      @Override
      protected ajv b() {
         return a(this.a);
      }

      private static ajv a(String $$0) {
         return new ajv("end_city/" + $$0);
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eis.b);
      }

      @Override
      protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
         if ($$0.startsWith("Chest")) {
            id $$5 = $$1.d();
            if ($$4.b($$5)) {
               bon.a($$2, $$3, $$5, eni.c);
            }
         } else if ($$4.b($$1) && czg.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               chm $$6 = bqg.aJ.a((czg)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cgd $$7 = new cgd($$2.E(), $$1, this.c.d().a(ij.d));
               $$7.a(new crs(crv.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ejr var1, int var2, ehm.a var3, id var4, List<efu> var5, axt var6);
   }
}
