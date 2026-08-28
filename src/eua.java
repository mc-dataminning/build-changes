import com.google.common.collect.Lists;
import java.util.List;

public class eua {
   private static final int a = 8;
   static final eua.b b = new eua.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewg $$0, int $$1, eua.a $$2, iw $$3, List<esh> $$4, azz $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dty $$6 = $$2.e().d();
            eua.a $$7 = eua.a($$4, eua.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 8, -1), "second_roof", $$6, false));
               eua.a($$0, eua.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 8, -1), "third_roof", $$6, true));
               eua.a($$0, eua.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bax<dty, iw>> c = Lists.newArrayList(
      new bax[]{new bax<>(dty.a, new iw(1, -1, 0)), new bax<>(dty.b, new iw(6, -1, 1)), new bax<>(dty.d, new iw(0, -1, 5)), new bax<>(dty.c, new iw(5, -1, 6))}
   );
   static final eua.b d = new eua.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewg $$0, int $$1, eua.a $$2, iw $$3, List<esh> $$4, azz $$5) {
         dty $$6 = $$2.e().d();
         eua.a $$7 = eua.a($$4, eua.a($$0, $$2, new iw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eua.a($$4, eua.a($$0, $$7, new iw(0, 7, 0), "tower_piece", $$6, true));
         eua.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eua.a($$4, eua.a($$0, $$7, new iw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bax<dty, iw> $$11 : eua.c) {
               if ($$5.h()) {
                  eua.a $$12 = eua.a($$4, eua.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eua.a($$0, eua.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eua.a($$0, eua.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eua.b e = new eua.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ewg $$0, int $$1, eua.a $$2, iw $$3, List<esh> $$4, azz $$5) {
         dty $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eua.a $$8 = eua.a($$4, eua.a($$0, $$2, new iw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eua.a($$4, eua.a($$0, $$8, new iw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eua.a($$4, eua.a($$0, $$8, new iw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eua.a($$4, eua.a($$0, $$8, new iw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eua.a($$4, eua.a($$0, $$8, new iw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eua.a($$0, eua.b, $$1 + 1, $$8, new iw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eua.a($$4, eua.a($$0, $$8, new iw(4, $$9, 0), "bridge_end", $$6.a(dty.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bax<dty, iw>> f = Lists.newArrayList(
      new bax[]{
         new bax<>(dty.a, new iw(4, -1, 0)), new bax<>(dty.b, new iw(12, -1, 4)), new bax<>(dty.d, new iw(0, -1, 8)), new bax<>(dty.c, new iw(8, -1, 12))
      }
   );
   static final eua.b g = new eua.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewg $$0, int $$1, eua.a $$2, iw $$3, List<esh> $$4, azz $$5) {
         dty $$6 = $$2.e().d();
         eua.a $$7 = eua.a($$4, eua.a($$0, $$2, new iw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eua.a($$4, eua.a($$0, $$7, new iw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eua.a($$4, eua.a($$0, $$7, new iw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bax<dty, iw> $$9 : eua.f) {
               if ($$5.h()) {
                  eua.a $$10 = eua.a($$4, eua.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eua.a($$0, eua.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eua.a($$4, eua.a($$0, $$7, new iw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eua.a a(ewg $$0, eua.a $$1, iw $$2, String $$3, dty $$4, boolean $$5) {
      eua.a $$6 = new eua.a($$0, $$3, $$1.d(), $$4, $$5);
      iw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iw.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ewg $$0, iw $$1, dty $$2, List<esh> $$3, azz $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eua.a $$5 = a($$3, new eua.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eua.a a(List<esh> $$0, eua.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ewg $$0, eua.b $$1, int $$2, eua.a $$3, iw $$4, List<esh> $$5, azz $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<esh> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (esh $$10 : $$7) {
               $$10.a($$9);
               esh $$11 = esh.a($$5, $$10.f());
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

   public static class a extends esn {
      public a(ewg $$0, String $$1, iw $$2, dty $$3, boolean $$4) {
         super(esu.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ewg $$0, ua $$1) {
         super(esu.Y, $$1, $$0, $$1x -> a($$1.b("OW", false), $$1.<dty>a("Rot", dty.h).orElseThrow()));
      }

      private static ewb a(boolean $$0, dty $$1) {
         evg $$2 = $$0 ? evg.b : evg.d;
         return new ewb().a(true).a($$2).a($$1);
      }

      @Override
      protected alk b() {
         return a(this.a);
      }

      private static alk a(String $$0) {
         return alk.b("end_city/" + $$0);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dty.h, this.c.d());
         $$1.a("OW", this.c.i().get(0) == evg.b);
      }

      @Override
      protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
         if ($$0.startsWith("Chest")) {
            iw $$5 = $$1.e();
            if ($$4.b($$5)) {
               buz.a($$2, $$3, $$5, faf.b);
            }
         } else if ($$4.b($$1) && djz.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cph $$6 = bxe.bd.a($$2.a(), bxd.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cnx $$7 = new cnx($$2.a(), $$1, this.c.d().a(jc.d));
               $$7.a(new daa(dae.oD), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ewg var1, int var2, eua.a var3, iw var4, List<esh> var5, azz var6);
   }
}
