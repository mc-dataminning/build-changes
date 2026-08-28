import com.google.common.collect.Lists;
import java.util.List;

public class ekg {
   private static final int a = 8;
   static final ekg.b b = new ekg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eml $$0, int $$1, ekg.a $$2, iz $$3, List<eio> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlm $$6 = $$2.e().d();
            ekg.a $$7 = ekg.a($$4, ekg.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               ekg.a($$0, ekg.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               ekg.a($$0, ekg.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bab<dlm, iz>> c = Lists.newArrayList(
      new bab[]{new bab<>(dlm.a, new iz(1, -1, 0)), new bab<>(dlm.b, new iz(6, -1, 1)), new bab<>(dlm.d, new iz(0, -1, 5)), new bab<>(dlm.c, new iz(5, -1, 6))}
   );
   static final ekg.b d = new ekg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eml $$0, int $$1, ekg.a $$2, iz $$3, List<eio> $$4, azh $$5) {
         dlm $$6 = $$2.e().d();
         ekg.a $$7 = ekg.a($$4, ekg.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         ekg.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bab<dlm, iz> $$11 : ekg.c) {
               if ($$5.h()) {
                  ekg.a $$12 = ekg.a($$4, ekg.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ekg.a($$0, ekg.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ekg.a($$0, ekg.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ekg.b e = new ekg.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eml $$0, int $$1, ekg.a $$2, iz $$3, List<eio> $$4, azh $$5) {
         dlm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ekg.a $$8 = ekg.a($$4, ekg.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ekg.a($$4, ekg.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ekg.a($$4, ekg.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ekg.a($$4, ekg.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ekg.a($$4, ekg.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ekg.a($$0, ekg.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ekg.a($$4, ekg.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dlm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bab<dlm, iz>> f = Lists.newArrayList(
      new bab[]{
         new bab<>(dlm.a, new iz(4, -1, 0)), new bab<>(dlm.b, new iz(12, -1, 4)), new bab<>(dlm.d, new iz(0, -1, 8)), new bab<>(dlm.c, new iz(8, -1, 12))
      }
   );
   static final ekg.b g = new ekg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eml $$0, int $$1, ekg.a $$2, iz $$3, List<eio> $$4, azh $$5) {
         dlm $$6 = $$2.e().d();
         ekg.a $$7 = ekg.a($$4, ekg.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bab<dlm, iz> $$9 : ekg.f) {
               if ($$5.h()) {
                  ekg.a $$10 = ekg.a($$4, ekg.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ekg.a($$0, ekg.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ekg.a($$4, ekg.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ekg.a a(eml $$0, ekg.a $$1, iz $$2, String $$3, dlm $$4, boolean $$5) {
      ekg.a $$6 = new ekg.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eml $$0, iz $$1, dlm $$2, List<eio> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ekg.a $$5 = a($$3, new ekg.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ekg.a a(List<eio> $$0, ekg.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eml $$0, ekg.b $$1, int $$2, ekg.a $$3, iz $$4, List<eio> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eio> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eio $$10 : $$7) {
               $$10.a($$9);
               eio $$11 = eio.a($$5, $$10.f());
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

   public static class a extends eiu {
      public a(eml $$0, String $$1, iz $$2, dlm $$3, boolean $$4) {
         super(ejb.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eml $$0, us $$1) {
         super(ejb.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlm.valueOf($$1.l("Rot"))));
      }

      private static emg a(boolean $$0, dlm $$1) {
         elm $$2 = $$0 ? elm.b : elm.d;
         return new emg().a(true).a($$2).a($$1);
      }

      @Override
      protected alf b() {
         return a(this.a);
      }

      private static alf a(String $$0) {
         return new alf("end_city/" + $$0);
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == elm.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dcn $$2, azh $$3, eic $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               brc.a($$2, $$3, $$5, eqe.c);
            }
         } else if ($$4.b($$1) && dby.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckj $$6 = bta.aK.a((dby)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cja $$7 = new cja($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cup(cus.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eml var1, int var2, ekg.a var3, iz var4, List<eio> var5, azh var6);
   }
}
