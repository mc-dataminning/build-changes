import com.google.common.collect.Lists;
import java.util.List;

public class ehd {
   private static final int a = 8;
   static final ehd.b b = new ehd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eji $$0, int $$1, ehd.a $$2, ib $$3, List<efl> $$4, axr $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dik $$6 = $$2.e().d();
            ehd.a $$7 = ehd.a($$4, ehd.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 8, -1), "second_roof", $$6, false));
               ehd.a($$0, ehd.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 8, -1), "third_roof", $$6, true));
               ehd.a($$0, ehd.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<ayl<dik, ib>> c = Lists.newArrayList(
      new ayl[]{new ayl<>(dik.a, new ib(1, -1, 0)), new ayl<>(dik.b, new ib(6, -1, 1)), new ayl<>(dik.d, new ib(0, -1, 5)), new ayl<>(dik.c, new ib(5, -1, 6))}
   );
   static final ehd.b d = new ehd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eji $$0, int $$1, ehd.a $$2, ib $$3, List<efl> $$4, axr $$5) {
         dik $$6 = $$2.e().d();
         ehd.a $$7 = ehd.a($$4, ehd.a($$0, $$2, new ib(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(0, 7, 0), "tower_piece", $$6, true));
         ehd.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (ayl<dik, ib> $$11 : ehd.c) {
               if ($$5.h()) {
                  ehd.a $$12 = ehd.a($$4, ehd.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ehd.a($$0, ehd.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ehd.a($$0, ehd.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ehd.b e = new ehd.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eji $$0, int $$1, ehd.a $$2, ib $$3, List<efl> $$4, axr $$5) {
         dik $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ehd.a $$8 = ehd.a($$4, ehd.a($$0, $$2, new ib(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ehd.a($$4, ehd.a($$0, $$8, new ib(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ehd.a($$4, ehd.a($$0, $$8, new ib(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ehd.a($$4, ehd.a($$0, $$8, new ib(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ehd.a($$4, ehd.a($$0, $$8, new ib(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ehd.a($$0, ehd.b, $$1 + 1, $$8, new ib(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ehd.a($$4, ehd.a($$0, $$8, new ib(4, $$9, 0), "bridge_end", $$6.a(dik.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<ayl<dik, ib>> f = Lists.newArrayList(
      new ayl[]{
         new ayl<>(dik.a, new ib(4, -1, 0)), new ayl<>(dik.b, new ib(12, -1, 4)), new ayl<>(dik.d, new ib(0, -1, 8)), new ayl<>(dik.c, new ib(8, -1, 12))
      }
   );
   static final ehd.b g = new ehd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eji $$0, int $$1, ehd.a $$2, ib $$3, List<efl> $$4, axr $$5) {
         dik $$6 = $$2.e().d();
         ehd.a $$7 = ehd.a($$4, ehd.a($$0, $$2, new ib(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(0, 8, 0), "fat_tower_middle", $$6, true));

            for (ayl<dik, ib> $$9 : ehd.f) {
               if ($$5.h()) {
                  ehd.a $$10 = ehd.a($$4, ehd.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ehd.a($$0, ehd.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ehd.a($$4, ehd.a($$0, $$7, new ib(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ehd.a a(eji $$0, ehd.a $$1, ib $$2, String $$3, dik $$4, boolean $$5) {
      ehd.a $$6 = new ehd.a($$0, $$3, $$1.d(), $$4, $$5);
      ib $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ib.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eji $$0, ib $$1, dik $$2, List<efl> $$3, axr $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ehd.a $$5 = a($$3, new ehd.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ehd.a a(List<efl> $$0, ehd.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eji $$0, ehd.b $$1, int $$2, ehd.a $$3, ib $$4, List<efl> $$5, axr $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<efl> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (efl $$10 : $$7) {
               $$10.a($$9);
               efl $$11 = efl.a($$5, $$10.f());
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

   public static class a extends efr {
      public a(eji $$0, String $$1, ib $$2, dik $$3, boolean $$4) {
         super(efy.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eji $$0, tm $$1) {
         super(efy.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dik.valueOf($$1.l("Rot"))));
      }

      private static ejd a(boolean $$0, dik $$1) {
         eij $$2 = $$0 ? eij.b : eij.d;
         return new ejd().a(true).a($$2).a($$1);
      }

      @Override
      protected ajt b() {
         return a(this.a);
      }

      private static ajt a(String $$0) {
         return new ajt("end_city/" + $$0);
      }

      @Override
      protected void a(efx $$0, tm $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eij.b);
      }

      @Override
      protected void a(String $$0, ib $$1, czm $$2, axr $$3, eez $$4) {
         if ($$0.startsWith("Chest")) {
            ib $$5 = $$1.d();
            if ($$4.b($$5)) {
               boi.a($$2, $$3, $$5, emz.c);
            }
         } else if ($$4.b($$1) && cyx.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               chf $$6 = bqb.aJ.a((cyx)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cfw $$7 = new cfw($$2.E(), $$1, this.c.d().a(ih.d));
               $$7.a(new crj(crm.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eji var1, int var2, ehd.a var3, ib var4, List<efl> var5, axr var6);
   }
}
