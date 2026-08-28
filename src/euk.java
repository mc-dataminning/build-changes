import com.google.common.collect.Lists;
import java.util.List;

public class euk {
   private static final int a = 8;
   static final euk.b b = new euk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewq $$0, int $$1, euk.a $$2, iw $$3, List<esr> $$4, bai $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dui $$6 = $$2.e().d();
            euk.a $$7 = euk.a($$4, euk.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 8, -1), "second_roof", $$6, false));
               euk.a($$0, euk.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 8, -1), "third_roof", $$6, true));
               euk.a($$0, euk.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bbg<dui, iw>> c = Lists.newArrayList(
      new bbg[]{new bbg<>(dui.a, new iw(1, -1, 0)), new bbg<>(dui.b, new iw(6, -1, 1)), new bbg<>(dui.d, new iw(0, -1, 5)), new bbg<>(dui.c, new iw(5, -1, 6))}
   );
   static final euk.b d = new euk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewq $$0, int $$1, euk.a $$2, iw $$3, List<esr> $$4, bai $$5) {
         dui $$6 = $$2.e().d();
         euk.a $$7 = euk.a($$4, euk.a($$0, $$2, new iw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = euk.a($$4, euk.a($$0, $$7, new iw(0, 7, 0), "tower_piece", $$6, true));
         euk.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = euk.a($$4, euk.a($$0, $$7, new iw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bbg<dui, iw> $$11 : euk.c) {
               if ($$5.h()) {
                  euk.a $$12 = euk.a($$4, euk.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  euk.a($$0, euk.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return euk.a($$0, euk.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final euk.b e = new euk.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ewq $$0, int $$1, euk.a $$2, iw $$3, List<esr> $$4, bai $$5) {
         dui $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         euk.a $$8 = euk.a($$4, euk.a($$0, $$2, new iw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = euk.a($$4, euk.a($$0, $$8, new iw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = euk.a($$4, euk.a($$0, $$8, new iw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = euk.a($$4, euk.a($$0, $$8, new iw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            euk.a($$4, euk.a($$0, $$8, new iw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!euk.a($$0, euk.b, $$1 + 1, $$8, new iw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = euk.a($$4, euk.a($$0, $$8, new iw(4, $$9, 0), "bridge_end", $$6.a(dui.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bbg<dui, iw>> f = Lists.newArrayList(
      new bbg[]{
         new bbg<>(dui.a, new iw(4, -1, 0)), new bbg<>(dui.b, new iw(12, -1, 4)), new bbg<>(dui.d, new iw(0, -1, 8)), new bbg<>(dui.c, new iw(8, -1, 12))
      }
   );
   static final euk.b g = new euk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ewq $$0, int $$1, euk.a $$2, iw $$3, List<esr> $$4, bai $$5) {
         dui $$6 = $$2.e().d();
         euk.a $$7 = euk.a($$4, euk.a($$0, $$2, new iw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = euk.a($$4, euk.a($$0, $$7, new iw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = euk.a($$4, euk.a($$0, $$7, new iw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bbg<dui, iw> $$9 : euk.f) {
               if ($$5.h()) {
                  euk.a $$10 = euk.a($$4, euk.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  euk.a($$0, euk.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = euk.a($$4, euk.a($$0, $$7, new iw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static euk.a a(ewq $$0, euk.a $$1, iw $$2, String $$3, dui $$4, boolean $$5) {
      euk.a $$6 = new euk.a($$0, $$3, $$1.d(), $$4, $$5);
      iw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iw.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ewq $$0, iw $$1, dui $$2, List<esr> $$3, bai $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      euk.a $$5 = a($$3, new euk.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static euk.a a(List<esr> $$0, euk.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ewq $$0, euk.b $$1, int $$2, euk.a $$3, iw $$4, List<esr> $$5, bai $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<esr> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (esr $$10 : $$7) {
               $$10.a($$9);
               esr $$11 = esr.a($$5, $$10.f());
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

   public static class a extends esx {
      public a(ewq $$0, String $$1, iw $$2, dui $$3, boolean $$4) {
         super(ete.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ewq $$0, ua $$1) {
         super(ete.Y, $$1, $$0, $$1x -> a($$1.b("OW", false), $$1.<dui>a("Rot", dui.h).orElseThrow()));
      }

      private static ewl a(boolean $$0, dui $$1) {
         evq $$2 = $$0 ? evq.b : evq.d;
         return new ewl().a(true).a($$2).a($$1);
      }

      @Override
      protected alr b() {
         return a(this.a);
      }

      private static alr a(String $$0) {
         return alr.b("end_city/" + $$0);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dui.h, this.c.d());
         $$1.a("OW", this.c.i().get(0) == evq.b);
      }

      @Override
      protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
         if ($$0.startsWith("Chest")) {
            iw $$5 = $$1.e();
            if ($$4.b($$5)) {
               bvi.a($$2, $$3, $$5, fap.b);
            }
         } else if ($$4.b($$1) && dkj.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cpq $$6 = bxn.bd.a($$2.a(), bxm.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cog $$7 = new cog($$2.a(), $$1, this.c.d().a(jc.d));
               $$7.a(new dak(dao.oD), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ewq var1, int var2, euk.a var3, iw var4, List<esr> var5, bai var6);
   }
}
