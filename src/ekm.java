import com.google.common.collect.Lists;
import java.util.List;

public class ekm {
   private static final int a = 8;
   static final ekm.b b = new ekm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emr $$0, int $$1, ekm.a $$2, ja $$3, List<eiu> $$4, aym $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dls $$6 = $$2.e().d();
            ekm.a $$7 = ekm.a($$4, ekm.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 8, -1), "second_roof", $$6, false));
               ekm.a($$0, ekm.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 8, -1), "third_roof", $$6, true));
               ekm.a($$0, ekm.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azg<dls, ja>> c = Lists.newArrayList(
      new azg[]{new azg<>(dls.a, new ja(1, -1, 0)), new azg<>(dls.b, new ja(6, -1, 1)), new azg<>(dls.d, new ja(0, -1, 5)), new azg<>(dls.c, new ja(5, -1, 6))}
   );
   static final ekm.b d = new ekm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emr $$0, int $$1, ekm.a $$2, ja $$3, List<eiu> $$4, aym $$5) {
         dls $$6 = $$2.e().d();
         ekm.a $$7 = ekm.a($$4, ekm.a($$0, $$2, new ja(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(0, 7, 0), "tower_piece", $$6, true));
         ekm.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azg<dls, ja> $$11 : ekm.c) {
               if ($$5.h()) {
                  ekm.a $$12 = ekm.a($$4, ekm.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ekm.a($$0, ekm.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ekm.a($$0, ekm.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ekm.b e = new ekm.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emr $$0, int $$1, ekm.a $$2, ja $$3, List<eiu> $$4, aym $$5) {
         dls $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ekm.a $$8 = ekm.a($$4, ekm.a($$0, $$2, new ja(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ekm.a($$4, ekm.a($$0, $$8, new ja(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ekm.a($$4, ekm.a($$0, $$8, new ja(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ekm.a($$4, ekm.a($$0, $$8, new ja(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ekm.a($$4, ekm.a($$0, $$8, new ja(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ekm.a($$0, ekm.b, $$1 + 1, $$8, new ja(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ekm.a($$4, ekm.a($$0, $$8, new ja(4, $$9, 0), "bridge_end", $$6.a(dls.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azg<dls, ja>> f = Lists.newArrayList(
      new azg[]{
         new azg<>(dls.a, new ja(4, -1, 0)), new azg<>(dls.b, new ja(12, -1, 4)), new azg<>(dls.d, new ja(0, -1, 8)), new azg<>(dls.c, new ja(8, -1, 12))
      }
   );
   static final ekm.b g = new ekm.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emr $$0, int $$1, ekm.a $$2, ja $$3, List<eiu> $$4, aym $$5) {
         dls $$6 = $$2.e().d();
         ekm.a $$7 = ekm.a($$4, ekm.a($$0, $$2, new ja(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azg<dls, ja> $$9 : ekm.f) {
               if ($$5.h()) {
                  ekm.a $$10 = ekm.a($$4, ekm.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ekm.a($$0, ekm.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ekm.a($$4, ekm.a($$0, $$7, new ja(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ekm.a a(emr $$0, ekm.a $$1, ja $$2, String $$3, dls $$4, boolean $$5) {
      ekm.a $$6 = new ekm.a($$0, $$3, $$1.d(), $$4, $$5);
      ja $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ja.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emr $$0, ja $$1, dls $$2, List<eiu> $$3, aym $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ekm.a $$5 = a($$3, new ekm.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ekm.a a(List<eiu> $$0, ekm.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emr $$0, ekm.b $$1, int $$2, ekm.a $$3, ja $$4, List<eiu> $$5, aym $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eiu> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eiu $$10 : $$7) {
               $$10.a($$9);
               eiu $$11 = eiu.a($$5, $$10.f());
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

   public static class a extends eja {
      public a(emr $$0, String $$1, ja $$2, dls $$3, boolean $$4) {
         super(ejh.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emr $$0, tx $$1) {
         super(ejh.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dls.valueOf($$1.l("Rot"))));
      }

      private static emm a(boolean $$0, dls $$1) {
         els $$2 = $$0 ? els.b : els.d;
         return new emm().a(true).a($$2).a($$1);
      }

      @Override
      protected akk b() {
         return a(this.a);
      }

      private static akk a(String $$0) {
         return new akk("end_city/" + $$0);
      }

      @Override
      protected void a(ejg $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == els.b);
      }

      @Override
      protected void a(String $$0, ja $$1, dcs $$2, aym $$3, eii $$4) {
         if ($$0.startsWith("Chest")) {
            ja $$5 = $$1.d();
            if ($$4.b($$5)) {
               bql.a($$2, $$3, $$5, eqk.c);
            }
         } else if ($$4.b($$1) && dcd.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cjt $$6 = bsj.aK.a((dcd)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cik $$7 = new cik($$2.E(), $$1, this.c.d().a(jf.d));
               $$7.a(new cua(cud.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emr var1, int var2, ekm.a var3, ja var4, List<eiu> var5, aym var6);
   }
}
