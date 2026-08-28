import com.google.common.collect.Lists;
import java.util.List;

public class ekb {
   private static final int a = 8;
   static final ekb.b b = new ekb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emg $$0, int $$1, ekb.a $$2, iz $$3, List<eij> $$4, azc $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlh $$6 = $$2.e().d();
            ekb.a $$7 = ekb.a($$4, ekb.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               ekb.a($$0, ekb.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               ekb.a($$0, ekb.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azw<dlh, iz>> c = Lists.newArrayList(
      new azw[]{new azw<>(dlh.a, new iz(1, -1, 0)), new azw<>(dlh.b, new iz(6, -1, 1)), new azw<>(dlh.d, new iz(0, -1, 5)), new azw<>(dlh.c, new iz(5, -1, 6))}
   );
   static final ekb.b d = new ekb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emg $$0, int $$1, ekb.a $$2, iz $$3, List<eij> $$4, azc $$5) {
         dlh $$6 = $$2.e().d();
         ekb.a $$7 = ekb.a($$4, ekb.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         ekb.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azw<dlh, iz> $$11 : ekb.c) {
               if ($$5.h()) {
                  ekb.a $$12 = ekb.a($$4, ekb.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ekb.a($$0, ekb.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ekb.a($$0, ekb.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ekb.b e = new ekb.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emg $$0, int $$1, ekb.a $$2, iz $$3, List<eij> $$4, azc $$5) {
         dlh $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ekb.a $$8 = ekb.a($$4, ekb.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ekb.a($$4, ekb.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ekb.a($$4, ekb.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ekb.a($$4, ekb.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ekb.a($$4, ekb.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ekb.a($$0, ekb.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ekb.a($$4, ekb.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dlh.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azw<dlh, iz>> f = Lists.newArrayList(
      new azw[]{
         new azw<>(dlh.a, new iz(4, -1, 0)), new azw<>(dlh.b, new iz(12, -1, 4)), new azw<>(dlh.d, new iz(0, -1, 8)), new azw<>(dlh.c, new iz(8, -1, 12))
      }
   );
   static final ekb.b g = new ekb.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emg $$0, int $$1, ekb.a $$2, iz $$3, List<eij> $$4, azc $$5) {
         dlh $$6 = $$2.e().d();
         ekb.a $$7 = ekb.a($$4, ekb.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azw<dlh, iz> $$9 : ekb.f) {
               if ($$5.h()) {
                  ekb.a $$10 = ekb.a($$4, ekb.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ekb.a($$0, ekb.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ekb.a($$4, ekb.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ekb.a a(emg $$0, ekb.a $$1, iz $$2, String $$3, dlh $$4, boolean $$5) {
      ekb.a $$6 = new ekb.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emg $$0, iz $$1, dlh $$2, List<eij> $$3, azc $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ekb.a $$5 = a($$3, new ekb.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ekb.a a(List<eij> $$0, ekb.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emg $$0, ekb.b $$1, int $$2, ekb.a $$3, iz $$4, List<eij> $$5, azc $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eij> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eij $$10 : $$7) {
               $$10.a($$9);
               eij $$11 = eij.a($$5, $$10.f());
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

   public static class a extends eip {
      public a(emg $$0, String $$1, iz $$2, dlh $$3, boolean $$4) {
         super(eiw.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emg $$0, ur $$1) {
         super(eiw.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlh.valueOf($$1.l("Rot"))));
      }

      private static emb a(boolean $$0, dlh $$1) {
         elh $$2 = $$0 ? elh.b : elh.d;
         return new emb().a(true).a($$2).a($$1);
      }

      @Override
      protected alb b() {
         return a(this.a);
      }

      private static alb a(String $$0) {
         return new alb("end_city/" + $$0);
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == elh.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dci $$2, azc $$3, ehx $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqx.a($$2, $$3, $$5, epz.c);
            }
         } else if ($$4.b($$1) && dbt.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cke $$6 = bsv.aK.a((dbt)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               civ $$7 = new civ($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cuk(cun.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emg var1, int var2, ekb.a var3, iz var4, List<eij> var5, azc var6);
   }
}
