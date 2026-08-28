import com.google.common.collect.Lists;
import java.util.List;

public class enu {
   private static final int a = 8;
   static final enu.b b = new enu.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqa $$0, int $$1, enu.a $$2, jh $$3, List<emb> $$4, azs $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dor $$6 = $$2.e().d();
            enu.a $$7 = enu.a($$4, enu.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 8, -1), "second_roof", $$6, false));
               enu.a($$0, enu.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 8, -1), "third_roof", $$6, true));
               enu.a($$0, enu.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bao<dor, jh>> c = Lists.newArrayList(
      new bao[]{new bao<>(dor.a, new jh(1, -1, 0)), new bao<>(dor.b, new jh(6, -1, 1)), new bao<>(dor.d, new jh(0, -1, 5)), new bao<>(dor.c, new jh(5, -1, 6))}
   );
   static final enu.b d = new enu.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqa $$0, int $$1, enu.a $$2, jh $$3, List<emb> $$4, azs $$5) {
         dor $$6 = $$2.e().d();
         enu.a $$7 = enu.a($$4, enu.a($$0, $$2, new jh(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = enu.a($$4, enu.a($$0, $$7, new jh(0, 7, 0), "tower_piece", $$6, true));
         enu.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = enu.a($$4, enu.a($$0, $$7, new jh(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bao<dor, jh> $$11 : enu.c) {
               if ($$5.h()) {
                  enu.a $$12 = enu.a($$4, enu.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  enu.a($$0, enu.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return enu.a($$0, enu.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final enu.b e = new enu.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eqa $$0, int $$1, enu.a $$2, jh $$3, List<emb> $$4, azs $$5) {
         dor $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         enu.a $$8 = enu.a($$4, enu.a($$0, $$2, new jh(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = enu.a($$4, enu.a($$0, $$8, new jh(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = enu.a($$4, enu.a($$0, $$8, new jh(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = enu.a($$4, enu.a($$0, $$8, new jh(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            enu.a($$4, enu.a($$0, $$8, new jh(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!enu.a($$0, enu.b, $$1 + 1, $$8, new jh(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = enu.a($$4, enu.a($$0, $$8, new jh(4, $$9, 0), "bridge_end", $$6.a(dor.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bao<dor, jh>> f = Lists.newArrayList(
      new bao[]{
         new bao<>(dor.a, new jh(4, -1, 0)), new bao<>(dor.b, new jh(12, -1, 4)), new bao<>(dor.d, new jh(0, -1, 8)), new bao<>(dor.c, new jh(8, -1, 12))
      }
   );
   static final enu.b g = new enu.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqa $$0, int $$1, enu.a $$2, jh $$3, List<emb> $$4, azs $$5) {
         dor $$6 = $$2.e().d();
         enu.a $$7 = enu.a($$4, enu.a($$0, $$2, new jh(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = enu.a($$4, enu.a($$0, $$7, new jh(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = enu.a($$4, enu.a($$0, $$7, new jh(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bao<dor, jh> $$9 : enu.f) {
               if ($$5.h()) {
                  enu.a $$10 = enu.a($$4, enu.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  enu.a($$0, enu.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = enu.a($$4, enu.a($$0, $$7, new jh(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static enu.a a(eqa $$0, enu.a $$1, jh $$2, String $$3, dor $$4, boolean $$5) {
      enu.a $$6 = new enu.a($$0, $$3, $$1.d(), $$4, $$5);
      jh $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jh.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eqa $$0, jh $$1, dor $$2, List<emb> $$3, azs $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      enu.a $$5 = a($$3, new enu.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static enu.a a(List<emb> $$0, enu.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eqa $$0, enu.b $$1, int $$2, enu.a $$3, jh $$4, List<emb> $$5, azs $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<emb> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (emb $$10 : $$7) {
               $$10.a($$9);
               emb $$11 = emb.a($$5, $$10.f());
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

   public static class a extends emh {
      public a(eqa $$0, String $$1, jh $$2, dor $$3, boolean $$4) {
         super(emo.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eqa $$0, uk $$1) {
         super(emo.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dor.valueOf($$1.l("Rot"))));
      }

      private static epv a(boolean $$0, dor $$1) {
         epa $$2 = $$0 ? epa.b : epa.d;
         return new epv().a(true).a($$2).a($$1);
      }

      @Override
      protected ali b() {
         return a(this.a);
      }

      private static ali a(String $$0) {
         return ali.b("end_city/" + $$0);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == epa.b);
      }

      @Override
      protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
         if ($$0.startsWith("Chest")) {
            jh $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsj.a($$2, $$3, $$5, ety.b);
            }
         } else if ($$4.b($$1) && dfb.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               clx $$6 = bul.aK.a($$2.E(), buk.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cko $$7 = new cko($$2.E(), $$1, this.c.d().a(jm.d));
               $$7.a(new cwb(cwf.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eqa var1, int var2, enu.a var3, jh var4, List<emb> var5, azs var6);
   }
}
