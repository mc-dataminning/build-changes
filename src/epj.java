import com.google.common.collect.Lists;
import java.util.List;

public class epj {
   private static final int a = 8;
   static final epj.b b = new epj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erp $$0, int $$1, epj.a $$2, ji $$3, List<enq> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dqe $$6 = $$2.e().d();
            epj.a $$7 = epj.a($$4, epj.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 8, -1), "second_roof", $$6, false));
               epj.a($$0, epj.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 8, -1), "third_roof", $$6, true));
               epj.a($$0, epj.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bae<dqe, ji>> c = Lists.newArrayList(
      new bae[]{new bae<>(dqe.a, new ji(1, -1, 0)), new bae<>(dqe.b, new ji(6, -1, 1)), new bae<>(dqe.d, new ji(0, -1, 5)), new bae<>(dqe.c, new ji(5, -1, 6))}
   );
   static final epj.b d = new epj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erp $$0, int $$1, epj.a $$2, ji $$3, List<enq> $$4, azh $$5) {
         dqe $$6 = $$2.e().d();
         epj.a $$7 = epj.a($$4, epj.a($$0, $$2, new ji(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = epj.a($$4, epj.a($$0, $$7, new ji(0, 7, 0), "tower_piece", $$6, true));
         epj.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = epj.a($$4, epj.a($$0, $$7, new ji(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bae<dqe, ji> $$11 : epj.c) {
               if ($$5.h()) {
                  epj.a $$12 = epj.a($$4, epj.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  epj.a($$0, epj.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return epj.a($$0, epj.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final epj.b e = new epj.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(erp $$0, int $$1, epj.a $$2, ji $$3, List<enq> $$4, azh $$5) {
         dqe $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         epj.a $$8 = epj.a($$4, epj.a($$0, $$2, new ji(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = epj.a($$4, epj.a($$0, $$8, new ji(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = epj.a($$4, epj.a($$0, $$8, new ji(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = epj.a($$4, epj.a($$0, $$8, new ji(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            epj.a($$4, epj.a($$0, $$8, new ji(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!epj.a($$0, epj.b, $$1 + 1, $$8, new ji(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = epj.a($$4, epj.a($$0, $$8, new ji(4, $$9, 0), "bridge_end", $$6.a(dqe.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bae<dqe, ji>> f = Lists.newArrayList(
      new bae[]{
         new bae<>(dqe.a, new ji(4, -1, 0)), new bae<>(dqe.b, new ji(12, -1, 4)), new bae<>(dqe.d, new ji(0, -1, 8)), new bae<>(dqe.c, new ji(8, -1, 12))
      }
   );
   static final epj.b g = new epj.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erp $$0, int $$1, epj.a $$2, ji $$3, List<enq> $$4, azh $$5) {
         dqe $$6 = $$2.e().d();
         epj.a $$7 = epj.a($$4, epj.a($$0, $$2, new ji(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = epj.a($$4, epj.a($$0, $$7, new ji(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = epj.a($$4, epj.a($$0, $$7, new ji(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bae<dqe, ji> $$9 : epj.f) {
               if ($$5.h()) {
                  epj.a $$10 = epj.a($$4, epj.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  epj.a($$0, epj.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = epj.a($$4, epj.a($$0, $$7, new ji(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static epj.a a(erp $$0, epj.a $$1, ji $$2, String $$3, dqe $$4, boolean $$5) {
      epj.a $$6 = new epj.a($$0, $$3, $$1.d(), $$4, $$5);
      ji $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ji.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(erp $$0, ji $$1, dqe $$2, List<enq> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      epj.a $$5 = a($$3, new epj.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static epj.a a(List<enq> $$0, epj.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(erp $$0, epj.b $$1, int $$2, epj.a $$3, ji $$4, List<enq> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<enq> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (enq $$10 : $$7) {
               $$10.a($$9);
               enq $$11 = enq.a($$5, $$10.f());
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

   public static class a extends enw {
      public a(erp $$0, String $$1, ji $$2, dqe $$3, boolean $$4) {
         super(eod.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(erp $$0, tq $$1) {
         super(eod.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dqe.valueOf($$1.l("Rot"))));
      }

      private static erk a(boolean $$0, dqe $$1) {
         eqp $$2 = $$0 ? eqp.b : eqp.d;
         return new erk().a(true).a($$2).a($$1);
      }

      @Override
      protected aku b() {
         return a(this.a);
      }

      private static aku a(String $$0) {
         return aku.b("end_city/" + $$0);
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eqp.b);
      }

      @Override
      protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
         if ($$0.startsWith("Chest")) {
            ji $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsp.a($$2, $$3, $$5, evn.b);
            }
         } else if ($$4.b($$1) && dgi.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cmd $$6 = bur.bc.a($$2.a(), buq.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cku $$7 = new cku($$2.a(), $$1, this.c.d().a(jn.d));
               $$7.a(new cwp(cwt.ow), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(erp var1, int var2, epj.a var3, ji var4, List<enq> var5, azh var6);
   }
}
