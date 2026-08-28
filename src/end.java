import com.google.common.collect.Lists;
import java.util.List;

public class end {
   private static final int a = 8;
   static final end.b b = new end.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epj $$0, int $$1, end.a $$2, jf $$3, List<elk> $$4, azn $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            doa $$6 = $$2.e().d();
            end.a $$7 = end.a($$4, end.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 8, -1), "second_roof", $$6, false));
               end.a($$0, end.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 8, -1), "third_roof", $$6, true));
               end.a($$0, end.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<baj<doa, jf>> c = Lists.newArrayList(
      new baj[]{new baj<>(doa.a, new jf(1, -1, 0)), new baj<>(doa.b, new jf(6, -1, 1)), new baj<>(doa.d, new jf(0, -1, 5)), new baj<>(doa.c, new jf(5, -1, 6))}
   );
   static final end.b d = new end.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epj $$0, int $$1, end.a $$2, jf $$3, List<elk> $$4, azn $$5) {
         doa $$6 = $$2.e().d();
         end.a $$7 = end.a($$4, end.a($$0, $$2, new jf(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = end.a($$4, end.a($$0, $$7, new jf(0, 7, 0), "tower_piece", $$6, true));
         end.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = end.a($$4, end.a($$0, $$7, new jf(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (baj<doa, jf> $$11 : end.c) {
               if ($$5.h()) {
                  end.a $$12 = end.a($$4, end.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  end.a($$0, end.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return end.a($$0, end.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = end.a($$4, end.a($$0, $$7, new jf(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final end.b e = new end.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(epj $$0, int $$1, end.a $$2, jf $$3, List<elk> $$4, azn $$5) {
         doa $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         end.a $$8 = end.a($$4, end.a($$0, $$2, new jf(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = end.a($$4, end.a($$0, $$8, new jf(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = end.a($$4, end.a($$0, $$8, new jf(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = end.a($$4, end.a($$0, $$8, new jf(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            end.a($$4, end.a($$0, $$8, new jf(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!end.a($$0, end.b, $$1 + 1, $$8, new jf(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = end.a($$4, end.a($$0, $$8, new jf(4, $$9, 0), "bridge_end", $$6.a(doa.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<baj<doa, jf>> f = Lists.newArrayList(
      new baj[]{
         new baj<>(doa.a, new jf(4, -1, 0)), new baj<>(doa.b, new jf(12, -1, 4)), new baj<>(doa.d, new jf(0, -1, 8)), new baj<>(doa.c, new jf(8, -1, 12))
      }
   );
   static final end.b g = new end.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epj $$0, int $$1, end.a $$2, jf $$3, List<elk> $$4, azn $$5) {
         doa $$6 = $$2.e().d();
         end.a $$7 = end.a($$4, end.a($$0, $$2, new jf(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = end.a($$4, end.a($$0, $$7, new jf(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = end.a($$4, end.a($$0, $$7, new jf(0, 8, 0), "fat_tower_middle", $$6, true));

            for (baj<doa, jf> $$9 : end.f) {
               if ($$5.h()) {
                  end.a $$10 = end.a($$4, end.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  end.a($$0, end.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = end.a($$4, end.a($$0, $$7, new jf(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static end.a a(epj $$0, end.a $$1, jf $$2, String $$3, doa $$4, boolean $$5) {
      end.a $$6 = new end.a($$0, $$3, $$1.d(), $$4, $$5);
      jf $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jf.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(epj $$0, jf $$1, doa $$2, List<elk> $$3, azn $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      end.a $$5 = a($$3, new end.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jf(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jf(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jf(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static end.a a(List<elk> $$0, end.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(epj $$0, end.b $$1, int $$2, end.a $$3, jf $$4, List<elk> $$5, azn $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<elk> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (elk $$10 : $$7) {
               $$10.a($$9);
               elk $$11 = elk.a($$5, $$10.f());
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

   public static class a extends elq {
      public a(epj $$0, String $$1, jf $$2, doa $$3, boolean $$4) {
         super(elx.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(epj $$0, ug $$1) {
         super(elx.Y, $$1, $$0, $$1x -> a($$1.q("OW"), doa.valueOf($$1.l("Rot"))));
      }

      private static epe a(boolean $$0, doa $$1) {
         eoj $$2 = $$0 ? eoj.b : eoj.d;
         return new epe().a(true).a($$2).a($$1);
      }

      @Override
      protected ale b() {
         return a(this.a);
      }

      private static ale a(String $$0) {
         return ale.b("end_city/" + $$0);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eoj.b);
      }

      @Override
      protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
         if ($$0.startsWith("Chest")) {
            jf $$5 = $$1.e();
            if ($$4.b($$5)) {
               bry.a($$2, $$3, $$5, eth.b);
            }
         } else if ($$4.b($$1) && dej.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               clj $$6 = bty.aK.a($$2.E(), btx.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cka $$7 = new cka($$2.E(), $$1, this.c.d().a(jk.d));
               $$7.a(new cvs(cvw.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(epj var1, int var2, end.a var3, jf var4, List<elk> var5, azn var6);
   }
}
