import com.google.common.collect.Lists;
import java.util.List;

public class eki {
   private static final int a = 8;
   static final eki.b b = new eki.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emn $$0, int $$1, eki.a $$2, iz $$3, List<eiq> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlo $$6 = $$2.e().d();
            eki.a $$7 = eki.a($$4, eki.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               eki.a($$0, eki.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               eki.a($$0, eki.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bab<dlo, iz>> c = Lists.newArrayList(
      new bab[]{new bab<>(dlo.a, new iz(1, -1, 0)), new bab<>(dlo.b, new iz(6, -1, 1)), new bab<>(dlo.d, new iz(0, -1, 5)), new bab<>(dlo.c, new iz(5, -1, 6))}
   );
   static final eki.b d = new eki.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emn $$0, int $$1, eki.a $$2, iz $$3, List<eiq> $$4, azh $$5) {
         dlo $$6 = $$2.e().d();
         eki.a $$7 = eki.a($$4, eki.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eki.a($$4, eki.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         eki.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eki.a($$4, eki.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bab<dlo, iz> $$11 : eki.c) {
               if ($$5.h()) {
                  eki.a $$12 = eki.a($$4, eki.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eki.a($$0, eki.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eki.a($$0, eki.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eki.b e = new eki.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emn $$0, int $$1, eki.a $$2, iz $$3, List<eiq> $$4, azh $$5) {
         dlo $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eki.a $$8 = eki.a($$4, eki.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eki.a($$4, eki.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eki.a($$4, eki.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eki.a($$4, eki.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eki.a($$4, eki.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eki.a($$0, eki.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eki.a($$4, eki.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dlo.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bab<dlo, iz>> f = Lists.newArrayList(
      new bab[]{
         new bab<>(dlo.a, new iz(4, -1, 0)), new bab<>(dlo.b, new iz(12, -1, 4)), new bab<>(dlo.d, new iz(0, -1, 8)), new bab<>(dlo.c, new iz(8, -1, 12))
      }
   );
   static final eki.b g = new eki.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emn $$0, int $$1, eki.a $$2, iz $$3, List<eiq> $$4, azh $$5) {
         dlo $$6 = $$2.e().d();
         eki.a $$7 = eki.a($$4, eki.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eki.a($$4, eki.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eki.a($$4, eki.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bab<dlo, iz> $$9 : eki.f) {
               if ($$5.h()) {
                  eki.a $$10 = eki.a($$4, eki.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eki.a($$0, eki.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eki.a($$4, eki.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eki.a a(emn $$0, eki.a $$1, iz $$2, String $$3, dlo $$4, boolean $$5) {
      eki.a $$6 = new eki.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emn $$0, iz $$1, dlo $$2, List<eiq> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eki.a $$5 = a($$3, new eki.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eki.a a(List<eiq> $$0, eki.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emn $$0, eki.b $$1, int $$2, eki.a $$3, iz $$4, List<eiq> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eiq> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eiq $$10 : $$7) {
               $$10.a($$9);
               eiq $$11 = eiq.a($$5, $$10.f());
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

   public static class a extends eiw {
      public a(emn $$0, String $$1, iz $$2, dlo $$3, boolean $$4) {
         super(ejd.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emn $$0, us $$1) {
         super(ejd.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlo.valueOf($$1.l("Rot"))));
      }

      private static emi a(boolean $$0, dlo $$1) {
         elo $$2 = $$0 ? elo.b : elo.d;
         return new emi().a(true).a($$2).a($$1);
      }

      @Override
      protected alf b() {
         return a(this.a);
      }

      private static alf a(String $$0) {
         return new alf("end_city/" + $$0);
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == elo.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dcp $$2, azh $$3, eie $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               bre.a($$2, $$3, $$5, eqg.c);
            }
         } else if ($$4.b($$1) && dca.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               ckl $$6 = btc.aK.a((dca)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cjc $$7 = new cjc($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cur(cuu.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emn var1, int var2, eki.a var3, iz var4, List<eiq> var5, azh var6);
   }
}
