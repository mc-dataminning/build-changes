import com.google.common.collect.Lists;
import java.util.List;

public class esy {
   private static final int a = 8;
   static final esy.b b = new esy.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eve $$0, int $$1, esy.a $$2, iu $$3, List<erf> $$4, azv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dsz $$6 = $$2.e().d();
            esy.a $$7 = esy.a($$4, esy.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 8, -1), "second_roof", $$6, false));
               esy.a($$0, esy.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 8, -1), "third_roof", $$6, true));
               esy.a($$0, esy.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bat<dsz, iu>> c = Lists.newArrayList(
      new bat[]{new bat<>(dsz.a, new iu(1, -1, 0)), new bat<>(dsz.b, new iu(6, -1, 1)), new bat<>(dsz.d, new iu(0, -1, 5)), new bat<>(dsz.c, new iu(5, -1, 6))}
   );
   static final esy.b d = new esy.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eve $$0, int $$1, esy.a $$2, iu $$3, List<erf> $$4, azv $$5) {
         dsz $$6 = $$2.e().d();
         esy.a $$7 = esy.a($$4, esy.a($$0, $$2, new iu(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = esy.a($$4, esy.a($$0, $$7, new iu(0, 7, 0), "tower_piece", $$6, true));
         esy.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = esy.a($$4, esy.a($$0, $$7, new iu(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bat<dsz, iu> $$11 : esy.c) {
               if ($$5.h()) {
                  esy.a $$12 = esy.a($$4, esy.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  esy.a($$0, esy.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return esy.a($$0, esy.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final esy.b e = new esy.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eve $$0, int $$1, esy.a $$2, iu $$3, List<erf> $$4, azv $$5) {
         dsz $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         esy.a $$8 = esy.a($$4, esy.a($$0, $$2, new iu(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = esy.a($$4, esy.a($$0, $$8, new iu(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = esy.a($$4, esy.a($$0, $$8, new iu(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = esy.a($$4, esy.a($$0, $$8, new iu(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            esy.a($$4, esy.a($$0, $$8, new iu(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!esy.a($$0, esy.b, $$1 + 1, $$8, new iu(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = esy.a($$4, esy.a($$0, $$8, new iu(4, $$9, 0), "bridge_end", $$6.a(dsz.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bat<dsz, iu>> f = Lists.newArrayList(
      new bat[]{
         new bat<>(dsz.a, new iu(4, -1, 0)), new bat<>(dsz.b, new iu(12, -1, 4)), new bat<>(dsz.d, new iu(0, -1, 8)), new bat<>(dsz.c, new iu(8, -1, 12))
      }
   );
   static final esy.b g = new esy.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eve $$0, int $$1, esy.a $$2, iu $$3, List<erf> $$4, azv $$5) {
         dsz $$6 = $$2.e().d();
         esy.a $$7 = esy.a($$4, esy.a($$0, $$2, new iu(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = esy.a($$4, esy.a($$0, $$7, new iu(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = esy.a($$4, esy.a($$0, $$7, new iu(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bat<dsz, iu> $$9 : esy.f) {
               if ($$5.h()) {
                  esy.a $$10 = esy.a($$4, esy.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  esy.a($$0, esy.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = esy.a($$4, esy.a($$0, $$7, new iu(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static esy.a a(eve $$0, esy.a $$1, iu $$2, String $$3, dsz $$4, boolean $$5) {
      esy.a $$6 = new esy.a($$0, $$3, $$1.d(), $$4, $$5);
      iu $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iu.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eve $$0, iu $$1, dsz $$2, List<erf> $$3, azv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      esy.a $$5 = a($$3, new esy.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static esy.a a(List<erf> $$0, esy.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eve $$0, esy.b $$1, int $$2, esy.a $$3, iu $$4, List<erf> $$5, azv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<erf> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (erf $$10 : $$7) {
               $$10.a($$9);
               erf $$11 = erf.a($$5, $$10.f());
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

   public static class a extends erl {
      public a(eve $$0, String $$1, iu $$2, dsz $$3, boolean $$4) {
         super(ers.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eve $$0, tz $$1) {
         super(ers.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dsz.valueOf($$1.l("Rot"))));
      }

      private static euz a(boolean $$0, dsz $$1) {
         eue $$2 = $$0 ? eue.b : eue.d;
         return new euz().a(true).a($$2).a($$1);
      }

      @Override
      protected alg b() {
         return a(this.a);
      }

      private static alg a(String $$0) {
         return alg.b("end_city/" + $$0);
      }

      @Override
      protected void a(err $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eue.b);
      }

      @Override
      protected void a(String $$0, iu $$1, djr $$2, azv $$3, eqt $$4) {
         if ($$0.startsWith("Chest")) {
            iu $$5 = $$1.e();
            if ($$4.b($$5)) {
               buj.a($$2, $$3, $$5, ezd.b);
            }
         } else if ($$4.b($$1) && dja.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               coj $$6 = bwo.bc.a($$2.a(), bwn.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cna $$7 = new cna($$2.a(), $$1, this.c.d().a(ja.d));
               $$7.a(new czd(czh.oD), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eve var1, int var2, esy.a var3, iu var4, List<erf> var5, azv var6);
   }
}
