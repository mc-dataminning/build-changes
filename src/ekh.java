import com.google.common.collect.Lists;
import java.util.List;

public class ekh {
   private static final int a = 8;
   static final ekh.b b = new ekh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emm $$0, int $$1, ekh.a $$2, iz $$3, List<eip> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dln $$6 = $$2.e().d();
            ekh.a $$7 = ekh.a($$4, ekh.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               ekh.a($$0, ekh.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               ekh.a($$0, ekh.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bab<dln, iz>> c = Lists.newArrayList(
      new bab[]{new bab<>(dln.a, new iz(1, -1, 0)), new bab<>(dln.b, new iz(6, -1, 1)), new bab<>(dln.d, new iz(0, -1, 5)), new bab<>(dln.c, new iz(5, -1, 6))}
   );
   static final ekh.b d = new ekh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emm $$0, int $$1, ekh.a $$2, iz $$3, List<eip> $$4, azh $$5) {
         dln $$6 = $$2.e().d();
         ekh.a $$7 = ekh.a($$4, ekh.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         ekh.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bab<dln, iz> $$11 : ekh.c) {
               if ($$5.h()) {
                  ekh.a $$12 = ekh.a($$4, ekh.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ekh.a($$0, ekh.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ekh.a($$0, ekh.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ekh.b e = new ekh.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emm $$0, int $$1, ekh.a $$2, iz $$3, List<eip> $$4, azh $$5) {
         dln $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ekh.a $$8 = ekh.a($$4, ekh.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ekh.a($$4, ekh.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ekh.a($$4, ekh.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ekh.a($$4, ekh.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ekh.a($$4, ekh.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ekh.a($$0, ekh.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ekh.a($$4, ekh.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dln.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bab<dln, iz>> f = Lists.newArrayList(
      new bab[]{
         new bab<>(dln.a, new iz(4, -1, 0)), new bab<>(dln.b, new iz(12, -1, 4)), new bab<>(dln.d, new iz(0, -1, 8)), new bab<>(dln.c, new iz(8, -1, 12))
      }
   );
   static final ekh.b g = new ekh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emm $$0, int $$1, ekh.a $$2, iz $$3, List<eip> $$4, azh $$5) {
         dln $$6 = $$2.e().d();
         ekh.a $$7 = ekh.a($$4, ekh.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bab<dln, iz> $$9 : ekh.f) {
               if ($$5.h()) {
                  ekh.a $$10 = ekh.a($$4, ekh.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ekh.a($$0, ekh.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ekh.a($$4, ekh.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ekh.a a(emm $$0, ekh.a $$1, iz $$2, String $$3, dln $$4, boolean $$5) {
      ekh.a $$6 = new ekh.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emm $$0, iz $$1, dln $$2, List<eip> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ekh.a $$5 = a($$3, new ekh.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ekh.a a(List<eip> $$0, ekh.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emm $$0, ekh.b $$1, int $$2, ekh.a $$3, iz $$4, List<eip> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eip> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eip $$10 : $$7) {
               $$10.a($$9);
               eip $$11 = eip.a($$5, $$10.f());
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

   public static class a extends eiv {
      public a(emm $$0, String $$1, iz $$2, dln $$3, boolean $$4) {
         super(ejc.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emm $$0, us $$1) {
         super(ejc.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dln.valueOf($$1.l("Rot"))));
      }

      private static emh a(boolean $$0, dln $$1) {
         eln $$2 = $$0 ? eln.b : eln.d;
         return new emh().a(true).a($$2).a($$1);
      }

      @Override
      protected alf b() {
         return a(this.a);
      }

      private static alf a(String $$0) {
         return new alf("end_city/" + $$0);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eln.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dco $$2, azh $$3, eid $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               brd.a($$2, $$3, $$5, eqf.c);
            }
         } else if ($$4.b($$1) && dbz.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckk $$6 = btb.aK.a((dbz)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cjb $$7 = new cjb($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cuq(cut.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emm var1, int var2, ekh.a var3, iz var4, List<eip> var5, azh var6);
   }
}
