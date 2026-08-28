import com.google.common.collect.Lists;
import java.util.List;

public class eph {
   private static final int a = 8;
   static final eph.b b = new eph.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ern $$0, int $$1, eph.a $$2, ji $$3, List<eno> $$4, azg $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dqc $$6 = $$2.e().d();
            eph.a $$7 = eph.a($$4, eph.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 8, -1), "second_roof", $$6, false));
               eph.a($$0, eph.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 8, -1), "third_roof", $$6, true));
               eph.a($$0, eph.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bad<dqc, ji>> c = Lists.newArrayList(
      new bad[]{new bad<>(dqc.a, new ji(1, -1, 0)), new bad<>(dqc.b, new ji(6, -1, 1)), new bad<>(dqc.d, new ji(0, -1, 5)), new bad<>(dqc.c, new ji(5, -1, 6))}
   );
   static final eph.b d = new eph.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ern $$0, int $$1, eph.a $$2, ji $$3, List<eno> $$4, azg $$5) {
         dqc $$6 = $$2.e().d();
         eph.a $$7 = eph.a($$4, eph.a($$0, $$2, new ji(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eph.a($$4, eph.a($$0, $$7, new ji(0, 7, 0), "tower_piece", $$6, true));
         eph.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eph.a($$4, eph.a($$0, $$7, new ji(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bad<dqc, ji> $$11 : eph.c) {
               if ($$5.h()) {
                  eph.a $$12 = eph.a($$4, eph.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eph.a($$0, eph.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eph.a($$0, eph.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eph.b e = new eph.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ern $$0, int $$1, eph.a $$2, ji $$3, List<eno> $$4, azg $$5) {
         dqc $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eph.a $$8 = eph.a($$4, eph.a($$0, $$2, new ji(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eph.a($$4, eph.a($$0, $$8, new ji(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eph.a($$4, eph.a($$0, $$8, new ji(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eph.a($$4, eph.a($$0, $$8, new ji(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eph.a($$4, eph.a($$0, $$8, new ji(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eph.a($$0, eph.b, $$1 + 1, $$8, new ji(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eph.a($$4, eph.a($$0, $$8, new ji(4, $$9, 0), "bridge_end", $$6.a(dqc.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bad<dqc, ji>> f = Lists.newArrayList(
      new bad[]{
         new bad<>(dqc.a, new ji(4, -1, 0)), new bad<>(dqc.b, new ji(12, -1, 4)), new bad<>(dqc.d, new ji(0, -1, 8)), new bad<>(dqc.c, new ji(8, -1, 12))
      }
   );
   static final eph.b g = new eph.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ern $$0, int $$1, eph.a $$2, ji $$3, List<eno> $$4, azg $$5) {
         dqc $$6 = $$2.e().d();
         eph.a $$7 = eph.a($$4, eph.a($$0, $$2, new ji(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eph.a($$4, eph.a($$0, $$7, new ji(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eph.a($$4, eph.a($$0, $$7, new ji(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bad<dqc, ji> $$9 : eph.f) {
               if ($$5.h()) {
                  eph.a $$10 = eph.a($$4, eph.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eph.a($$0, eph.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eph.a($$4, eph.a($$0, $$7, new ji(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eph.a a(ern $$0, eph.a $$1, ji $$2, String $$3, dqc $$4, boolean $$5) {
      eph.a $$6 = new eph.a($$0, $$3, $$1.d(), $$4, $$5);
      ji $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ji.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ern $$0, ji $$1, dqc $$2, List<eno> $$3, azg $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eph.a $$5 = a($$3, new eph.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ji(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eph.a a(List<eno> $$0, eph.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ern $$0, eph.b $$1, int $$2, eph.a $$3, ji $$4, List<eno> $$5, azg $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eno> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eno $$10 : $$7) {
               $$10.a($$9);
               eno $$11 = eno.a($$5, $$10.f());
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

   public static class a extends enu {
      public a(ern $$0, String $$1, ji $$2, dqc $$3, boolean $$4) {
         super(eob.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ern $$0, tq $$1) {
         super(eob.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dqc.valueOf($$1.l("Rot"))));
      }

      private static eri a(boolean $$0, dqc $$1) {
         eqn $$2 = $$0 ? eqn.b : eqn.d;
         return new eri().a(true).a($$2).a($$1);
      }

      @Override
      protected aku b() {
         return a(this.a);
      }

      private static aku a(String $$0) {
         return aku.b("end_city/" + $$0);
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eqn.b);
      }

      @Override
      protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
         if ($$0.startsWith("Chest")) {
            ji $$5 = $$1.e();
            if ($$4.b($$5)) {
               bso.a($$2, $$3, $$5, evl.b);
            }
         } else if ($$4.b($$1) && dgg.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cmc $$6 = buq.bb.a($$2.a(), bup.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ckt $$7 = new ckt($$2.a(), $$1, this.c.d().a(jn.d));
               $$7.a(new cwn(cwr.ow), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ern var1, int var2, eph.a var3, ji var4, List<eno> var5, azg var6);
   }
}
