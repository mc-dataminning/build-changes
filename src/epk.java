import com.google.common.collect.Lists;
import java.util.List;

public class epk {
   private static final int a = 8;
   static final epk.b b = new epk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erq $$0, int $$1, epk.a $$2, ji $$3, List<enr> $$4, azh $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dqf $$6 = $$2.e().d();
            epk.a $$7 = epk.a($$4, epk.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 8, -1), "second_roof", $$6, false));
               epk.a($$0, epk.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 8, -1), "third_roof", $$6, true));
               epk.a($$0, epk.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bae<dqf, ji>> c = Lists.newArrayList(
      new bae[]{new bae<>(dqf.a, new ji(1, -1, 0)), new bae<>(dqf.b, new ji(6, -1, 1)), new bae<>(dqf.d, new ji(0, -1, 5)), new bae<>(dqf.c, new ji(5, -1, 6))}
   );
   static final epk.b d = new epk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erq $$0, int $$1, epk.a $$2, ji $$3, List<enr> $$4, azh $$5) {
         dqf $$6 = $$2.e().d();
         epk.a $$7 = epk.a($$4, epk.a($$0, $$2, new ji(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = epk.a($$4, epk.a($$0, $$7, new ji(0, 7, 0), "tower_piece", $$6, true));
         epk.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = epk.a($$4, epk.a($$0, $$7, new ji(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bae<dqf, ji> $$11 : epk.c) {
               if ($$5.h()) {
                  epk.a $$12 = epk.a($$4, epk.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  epk.a($$0, epk.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return epk.a($$0, epk.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final epk.b e = new epk.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(erq $$0, int $$1, epk.a $$2, ji $$3, List<enr> $$4, azh $$5) {
         dqf $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         epk.a $$8 = epk.a($$4, epk.a($$0, $$2, new ji(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = epk.a($$4, epk.a($$0, $$8, new ji(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = epk.a($$4, epk.a($$0, $$8, new ji(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = epk.a($$4, epk.a($$0, $$8, new ji(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            epk.a($$4, epk.a($$0, $$8, new ji(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!epk.a($$0, epk.b, $$1 + 1, $$8, new ji(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = epk.a($$4, epk.a($$0, $$8, new ji(4, $$9, 0), "bridge_end", $$6.a(dqf.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bae<dqf, ji>> f = Lists.newArrayList(
      new bae[]{
         new bae<>(dqf.a, new ji(4, -1, 0)), new bae<>(dqf.b, new ji(12, -1, 4)), new bae<>(dqf.d, new ji(0, -1, 8)), new bae<>(dqf.c, new ji(8, -1, 12))
      }
   );
   static final epk.b g = new epk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(erq $$0, int $$1, epk.a $$2, ji $$3, List<enr> $$4, azh $$5) {
         dqf $$6 = $$2.e().d();
         epk.a $$7 = epk.a($$4, epk.a($$0, $$2, new ji(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = epk.a($$4, epk.a($$0, $$7, new ji(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = epk.a($$4, epk.a($$0, $$7, new ji(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bae<dqf, ji> $$9 : epk.f) {
               if ($$5.h()) {
                  epk.a $$10 = epk.a($$4, epk.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  epk.a($$0, epk.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = epk.a($$4, epk.a($$0, $$7, new ji(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static epk.a a(erq $$0, epk.a $$1, ji $$2, String $$3, dqf $$4, boolean $$5) {
      epk.a $$6 = new epk.a($$0, $$3, $$1.d(), $$4, $$5);
      ji $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ji.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(erq $$0, ji $$1, dqf $$2, List<enr> $$3, azh $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      epk.a $$5 = a($$3, new epk.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static epk.a a(List<enr> $$0, epk.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(erq $$0, epk.b $$1, int $$2, epk.a $$3, ji $$4, List<enr> $$5, azh $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<enr> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (enr $$10 : $$7) {
               $$10.a($$9);
               enr $$11 = enr.a($$5, $$10.f());
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

   public static class a extends enx {
      public a(erq $$0, String $$1, ji $$2, dqf $$3, boolean $$4) {
         super(eoe.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(erq $$0, tq $$1) {
         super(eoe.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dqf.valueOf($$1.l("Rot"))));
      }

      private static erl a(boolean $$0, dqf $$1) {
         eqq $$2 = $$0 ? eqq.b : eqq.d;
         return new erl().a(true).a($$2).a($$1);
      }

      @Override
      protected akv b() {
         return a(this.a);
      }

      private static akv a(String $$0) {
         return akv.b("end_city/" + $$0);
      }

      @Override
      protected void a(eod $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eqq.b);
      }

      @Override
      protected void a(String $$0, ji $$1, dha $$2, azh $$3, enf $$4) {
         if ($$0.startsWith("Chest")) {
            ji $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsr.a($$2, $$3, $$5, evo.b);
            }
         } else if ($$4.b($$1) && dgj.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cmf $$6 = but.bb.a($$2.a(), bus.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ckw $$7 = new ckw($$2.a(), $$1, this.c.d().a(jn.d));
               $$7.a(new cwq(cwu.ow), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(erq var1, int var2, epk.a var3, ji var4, List<enr> var5, azh var6);
   }
}
