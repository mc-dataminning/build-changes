import com.google.common.collect.Lists;
import java.util.List;

public class eey {
   private static final int a = 8;
   static final eey.b b = new eey.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehd $$0, int $$1, eey.a $$2, ib $$3, List<edg> $$4, axd $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dgm $$6 = $$2.e().d();
            eey.a $$7 = eey.a($$4, eey.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 8, -1), "second_roof", $$6, false));
               eey.a($$0, eey.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 8, -1), "third_roof", $$6, true));
               eey.a($$0, eey.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<axx<dgm, ib>> c = Lists.newArrayList(
      new axx[]{new axx<>(dgm.a, new ib(1, -1, 0)), new axx<>(dgm.b, new ib(6, -1, 1)), new axx<>(dgm.d, new ib(0, -1, 5)), new axx<>(dgm.c, new ib(5, -1, 6))}
   );
   static final eey.b d = new eey.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehd $$0, int $$1, eey.a $$2, ib $$3, List<edg> $$4, axd $$5) {
         dgm $$6 = $$2.e().d();
         eey.a $$7 = eey.a($$4, eey.a($$0, $$2, new ib(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eey.a($$4, eey.a($$0, $$7, new ib(0, 7, 0), "tower_piece", $$6, true));
         eey.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eey.a($$4, eey.a($$0, $$7, new ib(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (axx<dgm, ib> $$11 : eey.c) {
               if ($$5.h()) {
                  eey.a $$12 = eey.a($$4, eey.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eey.a($$0, eey.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eey.a($$0, eey.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eey.b e = new eey.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ehd $$0, int $$1, eey.a $$2, ib $$3, List<edg> $$4, axd $$5) {
         dgm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eey.a $$8 = eey.a($$4, eey.a($$0, $$2, new ib(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eey.a($$4, eey.a($$0, $$8, new ib(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eey.a($$4, eey.a($$0, $$8, new ib(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eey.a($$4, eey.a($$0, $$8, new ib(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eey.a($$4, eey.a($$0, $$8, new ib(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eey.a($$0, eey.b, $$1 + 1, $$8, new ib(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eey.a($$4, eey.a($$0, $$8, new ib(4, $$9, 0), "bridge_end", $$6.a(dgm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<axx<dgm, ib>> f = Lists.newArrayList(
      new axx[]{
         new axx<>(dgm.a, new ib(4, -1, 0)), new axx<>(dgm.b, new ib(12, -1, 4)), new axx<>(dgm.d, new ib(0, -1, 8)), new axx<>(dgm.c, new ib(8, -1, 12))
      }
   );
   static final eey.b g = new eey.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehd $$0, int $$1, eey.a $$2, ib $$3, List<edg> $$4, axd $$5) {
         dgm $$6 = $$2.e().d();
         eey.a $$7 = eey.a($$4, eey.a($$0, $$2, new ib(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eey.a($$4, eey.a($$0, $$7, new ib(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eey.a($$4, eey.a($$0, $$7, new ib(0, 8, 0), "fat_tower_middle", $$6, true));

            for (axx<dgm, ib> $$9 : eey.f) {
               if ($$5.h()) {
                  eey.a $$10 = eey.a($$4, eey.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eey.a($$0, eey.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eey.a($$4, eey.a($$0, $$7, new ib(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eey.a a(ehd $$0, eey.a $$1, ib $$2, String $$3, dgm $$4, boolean $$5) {
      eey.a $$6 = new eey.a($$0, $$3, $$1.d(), $$4, $$5);
      ib $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ib.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ehd $$0, ib $$1, dgm $$2, List<edg> $$3, axd $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eey.a $$5 = a($$3, new eey.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eey.a a(List<edg> $$0, eey.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ehd $$0, eey.b $$1, int $$2, eey.a $$3, ib $$4, List<edg> $$5, axd $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<edg> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (edg $$10 : $$7) {
               $$10.a($$9);
               edg $$11 = edg.a($$5, $$10.f());
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

   public static class a extends edm {
      public a(ehd $$0, String $$1, ib $$2, dgm $$3, boolean $$4) {
         super(edt.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ehd $$0, ta $$1) {
         super(edt.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dgm.valueOf($$1.l("Rot"))));
      }

      private static egy a(boolean $$0, dgm $$1) {
         ege $$2 = $$0 ? ege.b : ege.d;
         return new egy().a(true).a($$2).a($$1);
      }

      @Override
      protected ajh b() {
         return a(this.a);
      }

      private static ajh a(String $$0) {
         return new ajh("end_city/" + $$0);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ege.b);
      }

      @Override
      protected void a(String $$0, ib $$1, cxo $$2, axd $$3, ecu $$4) {
         if ($$0.startsWith("Chest")) {
            ib $$5 = $$1.d();
            if ($$4.b($$5)) {
               bnk.a($$2, $$3, $$5, eks.c);
            }
         } else if ($$4.b($$1) && cwz.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cge $$6 = bpc.aJ.a((cwz)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cew $$7 = new cew($$2.E(), $$1, this.c.d().a(ih.d));
               $$7.a(new cqk(cqn.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ehd var1, int var2, eey.a var3, ib var4, List<edg> var5, axd var6);
   }
}
