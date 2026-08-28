import com.google.common.collect.Lists;
import java.util.List;

public class eqh {
   private static final int a = 8;
   static final eqh.b b = new eqh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esn $$0, int $$1, eqh.a $$2, jh $$3, List<eoo> $$4, bam $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            drc $$6 = $$2.e().d();
            eqh.a $$7 = eqh.a($$4, eqh.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 8, -1), "second_roof", $$6, false));
               eqh.a($$0, eqh.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 8, -1), "third_roof", $$6, true));
               eqh.a($$0, eqh.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bbj<drc, jh>> c = Lists.newArrayList(
      new bbj[]{new bbj<>(drc.a, new jh(1, -1, 0)), new bbj<>(drc.b, new jh(6, -1, 1)), new bbj<>(drc.d, new jh(0, -1, 5)), new bbj<>(drc.c, new jh(5, -1, 6))}
   );
   static final eqh.b d = new eqh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esn $$0, int $$1, eqh.a $$2, jh $$3, List<eoo> $$4, bam $$5) {
         drc $$6 = $$2.e().d();
         eqh.a $$7 = eqh.a($$4, eqh.a($$0, $$2, new jh(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(0, 7, 0), "tower_piece", $$6, true));
         eqh.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bbj<drc, jh> $$11 : eqh.c) {
               if ($$5.h()) {
                  eqh.a $$12 = eqh.a($$4, eqh.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eqh.a($$0, eqh.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eqh.a($$0, eqh.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eqh.b e = new eqh.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(esn $$0, int $$1, eqh.a $$2, jh $$3, List<eoo> $$4, bam $$5) {
         drc $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eqh.a $$8 = eqh.a($$4, eqh.a($$0, $$2, new jh(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eqh.a($$4, eqh.a($$0, $$8, new jh(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eqh.a($$4, eqh.a($$0, $$8, new jh(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eqh.a($$4, eqh.a($$0, $$8, new jh(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eqh.a($$4, eqh.a($$0, $$8, new jh(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eqh.a($$0, eqh.b, $$1 + 1, $$8, new jh(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eqh.a($$4, eqh.a($$0, $$8, new jh(4, $$9, 0), "bridge_end", $$6.a(drc.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bbj<drc, jh>> f = Lists.newArrayList(
      new bbj[]{
         new bbj<>(drc.a, new jh(4, -1, 0)), new bbj<>(drc.b, new jh(12, -1, 4)), new bbj<>(drc.d, new jh(0, -1, 8)), new bbj<>(drc.c, new jh(8, -1, 12))
      }
   );
   static final eqh.b g = new eqh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esn $$0, int $$1, eqh.a $$2, jh $$3, List<eoo> $$4, bam $$5) {
         drc $$6 = $$2.e().d();
         eqh.a $$7 = eqh.a($$4, eqh.a($$0, $$2, new jh(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bbj<drc, jh> $$9 : eqh.f) {
               if ($$5.h()) {
                  eqh.a $$10 = eqh.a($$4, eqh.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eqh.a($$0, eqh.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eqh.a($$4, eqh.a($$0, $$7, new jh(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eqh.a a(esn $$0, eqh.a $$1, jh $$2, String $$3, drc $$4, boolean $$5) {
      eqh.a $$6 = new eqh.a($$0, $$3, $$1.d(), $$4, $$5);
      jh $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jh.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(esn $$0, jh $$1, drc $$2, List<eoo> $$3, bam $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eqh.a $$5 = a($$3, new eqh.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eqh.a a(List<eoo> $$0, eqh.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(esn $$0, eqh.b $$1, int $$2, eqh.a $$3, jh $$4, List<eoo> $$5, bam $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eoo> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eoo $$10 : $$7) {
               $$10.a($$9);
               eoo $$11 = eoo.a($$5, $$10.f());
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

   public static class a extends eou {
      public a(esn $$0, String $$1, jh $$2, drc $$3, boolean $$4) {
         super(epb.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(esn $$0, ux $$1) {
         super(epb.Y, $$1, $$0, $$1x -> a($$1.q("OW"), drc.valueOf($$1.l("Rot"))));
      }

      private static esi a(boolean $$0, drc $$1) {
         ern $$2 = $$0 ? ern.b : ern.d;
         return new esi().a(true).a($$2).a($$1);
      }

      @Override
      protected alz b() {
         return a(this.a);
      }

      private static alz a(String $$0) {
         return alz.b("end_city/" + $$0);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ern.b);
      }

      @Override
      protected void a(String $$0, jh $$1, dhz $$2, bam $$3, eoc $$4) {
         if ($$0.startsWith("Chest")) {
            jh $$5 = $$1.e();
            if ($$4.b($$5)) {
               btp.a($$2, $$3, $$5, ewl.b);
            }
         } else if ($$4.b($$1) && dhi.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cnd $$6 = bvr.bc.a($$2.a(), bvq.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               clu $$7 = new clu($$2.a(), $$1, this.c.d().a(jm.d));
               $$7.a(new cxp(cxt.on), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(esn var1, int var2, eqh.a var3, jh var4, List<eoo> var5, bam var6);
   }
}
