import com.google.common.collect.Lists;
import java.util.List;

public class eny {
   private static final int a = 8;
   static final eny.b b = new eny.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqe $$0, int $$1, eny.a $$2, jh $$3, List<emf> $$4, azv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dow $$6 = $$2.e().d();
            eny.a $$7 = eny.a($$4, eny.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 8, -1), "second_roof", $$6, false));
               eny.a($$0, eny.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 8, -1), "third_roof", $$6, true));
               eny.a($$0, eny.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bas<dow, jh>> c = Lists.newArrayList(
      new bas[]{new bas<>(dow.a, new jh(1, -1, 0)), new bas<>(dow.b, new jh(6, -1, 1)), new bas<>(dow.d, new jh(0, -1, 5)), new bas<>(dow.c, new jh(5, -1, 6))}
   );
   static final eny.b d = new eny.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqe $$0, int $$1, eny.a $$2, jh $$3, List<emf> $$4, azv $$5) {
         dow $$6 = $$2.e().d();
         eny.a $$7 = eny.a($$4, eny.a($$0, $$2, new jh(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eny.a($$4, eny.a($$0, $$7, new jh(0, 7, 0), "tower_piece", $$6, true));
         eny.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eny.a($$4, eny.a($$0, $$7, new jh(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bas<dow, jh> $$11 : eny.c) {
               if ($$5.h()) {
                  eny.a $$12 = eny.a($$4, eny.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eny.a($$0, eny.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eny.a($$0, eny.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eny.b e = new eny.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eqe $$0, int $$1, eny.a $$2, jh $$3, List<emf> $$4, azv $$5) {
         dow $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eny.a $$8 = eny.a($$4, eny.a($$0, $$2, new jh(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eny.a($$4, eny.a($$0, $$8, new jh(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eny.a($$4, eny.a($$0, $$8, new jh(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eny.a($$4, eny.a($$0, $$8, new jh(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eny.a($$4, eny.a($$0, $$8, new jh(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eny.a($$0, eny.b, $$1 + 1, $$8, new jh(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eny.a($$4, eny.a($$0, $$8, new jh(4, $$9, 0), "bridge_end", $$6.a(dow.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bas<dow, jh>> f = Lists.newArrayList(
      new bas[]{
         new bas<>(dow.a, new jh(4, -1, 0)), new bas<>(dow.b, new jh(12, -1, 4)), new bas<>(dow.d, new jh(0, -1, 8)), new bas<>(dow.c, new jh(8, -1, 12))
      }
   );
   static final eny.b g = new eny.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eqe $$0, int $$1, eny.a $$2, jh $$3, List<emf> $$4, azv $$5) {
         dow $$6 = $$2.e().d();
         eny.a $$7 = eny.a($$4, eny.a($$0, $$2, new jh(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eny.a($$4, eny.a($$0, $$7, new jh(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eny.a($$4, eny.a($$0, $$7, new jh(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bas<dow, jh> $$9 : eny.f) {
               if ($$5.h()) {
                  eny.a $$10 = eny.a($$4, eny.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eny.a($$0, eny.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eny.a($$4, eny.a($$0, $$7, new jh(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eny.a a(eqe $$0, eny.a $$1, jh $$2, String $$3, dow $$4, boolean $$5) {
      eny.a $$6 = new eny.a($$0, $$3, $$1.d(), $$4, $$5);
      jh $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jh.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eqe $$0, jh $$1, dow $$2, List<emf> $$3, azv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eny.a $$5 = a($$3, new eny.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eny.a a(List<emf> $$0, eny.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eqe $$0, eny.b $$1, int $$2, eny.a $$3, jh $$4, List<emf> $$5, azv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<emf> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (emf $$10 : $$7) {
               $$10.a($$9);
               emf $$11 = emf.a($$5, $$10.f());
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

   public static class a extends eml {
      public a(eqe $$0, String $$1, jh $$2, dow $$3, boolean $$4) {
         super(ems.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eqe $$0, un $$1) {
         super(ems.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dow.valueOf($$1.l("Rot"))));
      }

      private static epz a(boolean $$0, dow $$1) {
         epe $$2 = $$0 ? epe.b : epe.d;
         return new epz().a(true).a($$2).a($$1);
      }

      @Override
      protected all b() {
         return a(this.a);
      }

      private static all a(String $$0) {
         return all.b("end_city/" + $$0);
      }

      @Override
      protected void a(emr $$0, un $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == epe.b);
      }

      @Override
      protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
         if ($$0.startsWith("Chest")) {
            jh $$5 = $$1.e();
            if ($$4.b($$5)) {
               bsn.a($$2, $$3, $$5, euc.b);
            }
         } else if ($$4.b($$1) && dff.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cmb $$6 = bup.aK.a($$2.E(), buo.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cks $$7 = new cks($$2.E(), $$1, this.c.d().a(jm.d));
               $$7.a(new cwf(cwj.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eqe var1, int var2, eny.a var3, jh var4, List<emf> var5, azv var6);
   }
}
