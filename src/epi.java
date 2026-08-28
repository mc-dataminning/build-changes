import com.google.common.collect.Lists;
import java.util.List;

public class epi {
   private static final int a = 8;
   static final epi.b b = new epi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ero $$0, int $$1, epi.a $$2, ji $$3, List<enp> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dqd $$6 = $$2.e().d();
            epi.a $$7 = epi.a($$4, epi.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 8, -1), "second_roof", $$6, false));
               epi.a($$0, epi.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 8, -1), "third_roof", $$6, true));
               epi.a($$0, epi.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bae<dqd, ji>> c = Lists.newArrayList(
      new bae[]{new bae<>(dqd.a, new ji(1, -1, 0)), new bae<>(dqd.b, new ji(6, -1, 1)), new bae<>(dqd.d, new ji(0, -1, 5)), new bae<>(dqd.c, new ji(5, -1, 6))}
   );
   static final epi.b d = new epi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ero $$0, int $$1, epi.a $$2, ji $$3, List<enp> $$4, azh $$5) {
         dqd $$6 = $$2.e().d();
         epi.a $$7 = epi.a($$4, epi.a($$0, $$2, new ji(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = epi.a($$4, epi.a($$0, $$7, new ji(0, 7, 0), "tower_piece", $$6, true));
         epi.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = epi.a($$4, epi.a($$0, $$7, new ji(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bae<dqd, ji> $$11 : epi.c) {
               if ($$5.h()) {
                  epi.a $$12 = epi.a($$4, epi.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  epi.a($$0, epi.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return epi.a($$0, epi.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final epi.b e = new epi.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ero $$0, int $$1, epi.a $$2, ji $$3, List<enp> $$4, azh $$5) {
         dqd $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         epi.a $$8 = epi.a($$4, epi.a($$0, $$2, new ji(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = epi.a($$4, epi.a($$0, $$8, new ji(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = epi.a($$4, epi.a($$0, $$8, new ji(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = epi.a($$4, epi.a($$0, $$8, new ji(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            epi.a($$4, epi.a($$0, $$8, new ji(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!epi.a($$0, epi.b, $$1 + 1, $$8, new ji(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = epi.a($$4, epi.a($$0, $$8, new ji(4, $$9, 0), "bridge_end", $$6.a(dqd.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bae<dqd, ji>> f = Lists.newArrayList(
      new bae[]{
         new bae<>(dqd.a, new ji(4, -1, 0)), new bae<>(dqd.b, new ji(12, -1, 4)), new bae<>(dqd.d, new ji(0, -1, 8)), new bae<>(dqd.c, new ji(8, -1, 12))
      }
   );
   static final epi.b g = new epi.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ero $$0, int $$1, epi.a $$2, ji $$3, List<enp> $$4, azh $$5) {
         dqd $$6 = $$2.e().d();
         epi.a $$7 = epi.a($$4, epi.a($$0, $$2, new ji(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = epi.a($$4, epi.a($$0, $$7, new ji(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = epi.a($$4, epi.a($$0, $$7, new ji(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bae<dqd, ji> $$9 : epi.f) {
               if ($$5.h()) {
                  epi.a $$10 = epi.a($$4, epi.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  epi.a($$0, epi.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = epi.a($$4, epi.a($$0, $$7, new ji(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static epi.a a(ero $$0, epi.a $$1, ji $$2, String $$3, dqd $$4, boolean $$5) {
      epi.a $$6 = new epi.a($$0, $$3, $$1.d(), $$4, $$5);
      ji $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ji.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ero $$0, ji $$1, dqd $$2, List<enp> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      epi.a $$5 = a($$3, new epi.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static epi.a a(List<enp> $$0, epi.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ero $$0, epi.b $$1, int $$2, epi.a $$3, ji $$4, List<enp> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<enp> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (enp $$10 : $$7) {
               $$10.a($$9);
               enp $$11 = enp.a($$5, $$10.f());
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

   public static class a extends env {
      public a(ero $$0, String $$1, ji $$2, dqd $$3, boolean $$4) {
         super(eoc.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ero $$0, tq $$1) {
         super(eoc.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dqd.valueOf($$1.l("Rot"))));
      }

      private static erj a(boolean $$0, dqd $$1) {
         eqo $$2 = $$0 ? eqo.b : eqo.d;
         return new erj().a(true).a($$2).a($$1);
      }

      @Override
      protected akv b() {
         return a(this.a);
      }

      private static akv a(String $$0) {
         return akv.b("end_city/" + $$0);
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eqo.b);
      }

      @Override
      protected void a(String $$0, ji $$1, dgy $$2, azh $$3, end $$4) {
         if ($$0.startsWith("Chest")) {
            ji $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsp.a($$2, $$3, $$5, evm.b);
            }
         } else if ($$4.b($$1) && dgh.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cmd $$6 = bur.bb.a($$2.a(), buq.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cku $$7 = new cku($$2.a(), $$1, this.c.d().a(jn.d));
               $$7.a(new cwo(cws.ow), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ero var1, int var2, epi.a var3, ji var4, List<enp> var5, azh var6);
   }
}
