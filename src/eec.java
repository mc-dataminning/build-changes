import com.google.common.collect.Lists;
import java.util.List;

public class eec {
   private static final int a = 8;
   static final eec.b b = new eec.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(egh $$0, int $$1, eec.a $$2, ib $$3, List<eck> $$4, awt $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dfr $$6 = $$2.e().d();
            eec.a $$7 = eec.a($$4, eec.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 8, -1), "second_roof", $$6, false));
               eec.a($$0, eec.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 8, -1), "third_roof", $$6, true));
               eec.a($$0, eec.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<axn<dfr, ib>> c = Lists.newArrayList(
      new axn[]{new axn<>(dfr.a, new ib(1, -1, 0)), new axn<>(dfr.b, new ib(6, -1, 1)), new axn<>(dfr.d, new ib(0, -1, 5)), new axn<>(dfr.c, new ib(5, -1, 6))}
   );
   static final eec.b d = new eec.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(egh $$0, int $$1, eec.a $$2, ib $$3, List<eck> $$4, awt $$5) {
         dfr $$6 = $$2.e().d();
         eec.a $$7 = eec.a($$4, eec.a($$0, $$2, new ib(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eec.a($$4, eec.a($$0, $$7, new ib(0, 7, 0), "tower_piece", $$6, true));
         eec.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eec.a($$4, eec.a($$0, $$7, new ib(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (axn<dfr, ib> $$11 : eec.c) {
               if ($$5.h()) {
                  eec.a $$12 = eec.a($$4, eec.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eec.a($$0, eec.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eec.a($$0, eec.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eec.b e = new eec.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(egh $$0, int $$1, eec.a $$2, ib $$3, List<eck> $$4, awt $$5) {
         dfr $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eec.a $$8 = eec.a($$4, eec.a($$0, $$2, new ib(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eec.a($$4, eec.a($$0, $$8, new ib(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eec.a($$4, eec.a($$0, $$8, new ib(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eec.a($$4, eec.a($$0, $$8, new ib(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eec.a($$4, eec.a($$0, $$8, new ib(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eec.a($$0, eec.b, $$1 + 1, $$8, new ib(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eec.a($$4, eec.a($$0, $$8, new ib(4, $$9, 0), "bridge_end", $$6.a(dfr.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<axn<dfr, ib>> f = Lists.newArrayList(
      new axn[]{
         new axn<>(dfr.a, new ib(4, -1, 0)), new axn<>(dfr.b, new ib(12, -1, 4)), new axn<>(dfr.d, new ib(0, -1, 8)), new axn<>(dfr.c, new ib(8, -1, 12))
      }
   );
   static final eec.b g = new eec.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(egh $$0, int $$1, eec.a $$2, ib $$3, List<eck> $$4, awt $$5) {
         dfr $$6 = $$2.e().d();
         eec.a $$7 = eec.a($$4, eec.a($$0, $$2, new ib(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eec.a($$4, eec.a($$0, $$7, new ib(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eec.a($$4, eec.a($$0, $$7, new ib(0, 8, 0), "fat_tower_middle", $$6, true));

            for (axn<dfr, ib> $$9 : eec.f) {
               if ($$5.h()) {
                  eec.a $$10 = eec.a($$4, eec.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eec.a($$0, eec.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eec.a($$4, eec.a($$0, $$7, new ib(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eec.a a(egh $$0, eec.a $$1, ib $$2, String $$3, dfr $$4, boolean $$5) {
      eec.a $$6 = new eec.a($$0, $$3, $$1.d(), $$4, $$5);
      ib $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ib.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(egh $$0, ib $$1, dfr $$2, List<eck> $$3, awt $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eec.a $$5 = a($$3, new eec.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eec.a a(List<eck> $$0, eec.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(egh $$0, eec.b $$1, int $$2, eec.a $$3, ib $$4, List<eck> $$5, awt $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eck> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eck $$10 : $$7) {
               $$10.a($$9);
               eck $$11 = eck.a($$5, $$10.f());
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

   public static class a extends ecq {
      public a(egh $$0, String $$1, ib $$2, dfr $$3, boolean $$4) {
         super(ecx.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(egh $$0, sy $$1) {
         super(ecx.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dfr.valueOf($$1.l("Rot"))));
      }

      private static egc a(boolean $$0, dfr $$1) {
         efi $$2 = $$0 ? efi.b : efi.d;
         return new egc().a(true).a($$2).a($$1);
      }

      @Override
      protected ajc b() {
         return a(this.a);
      }

      private static ajc a(String $$0) {
         return new ajc("end_city/" + $$0);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == efi.b);
      }

      @Override
      protected void a(String $$0, ib $$1, cwt $$2, awt $$3, eby $$4) {
         if ($$0.startsWith("Chest")) {
            ib $$5 = $$1.d();
            if ($$4.b($$5)) {
               bmt.a($$2, $$3, $$5, ejw.c);
            }
         } else if ($$4.b($$1) && cwe.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cfm $$6 = bol.aI.a((cwe)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cee $$7 = new cee($$2.E(), $$1, this.c.d().a(ih.d));
               $$7.a(new cpq(cpt.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(egh var1, int var2, eec.a var3, ib var4, List<eck> var5, awt var6);
   }
}
