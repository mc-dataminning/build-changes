import com.google.common.collect.Lists;
import java.util.List;

public class eqg {
   private static final int a = 8;
   static final eqg.b b = new eqg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esm $$0, int $$1, eqg.a $$2, jh $$3, List<eon> $$4, bam $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            drb $$6 = $$2.e().d();
            eqg.a $$7 = eqg.a($$4, eqg.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 8, -1), "second_roof", $$6, false));
               eqg.a($$0, eqg.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 8, -1), "third_roof", $$6, true));
               eqg.a($$0, eqg.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bbj<drb, jh>> c = Lists.newArrayList(
      new bbj[]{new bbj<>(drb.a, new jh(1, -1, 0)), new bbj<>(drb.b, new jh(6, -1, 1)), new bbj<>(drb.d, new jh(0, -1, 5)), new bbj<>(drb.c, new jh(5, -1, 6))}
   );
   static final eqg.b d = new eqg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esm $$0, int $$1, eqg.a $$2, jh $$3, List<eon> $$4, bam $$5) {
         drb $$6 = $$2.e().d();
         eqg.a $$7 = eqg.a($$4, eqg.a($$0, $$2, new jh(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(0, 7, 0), "tower_piece", $$6, true));
         eqg.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bbj<drb, jh> $$11 : eqg.c) {
               if ($$5.h()) {
                  eqg.a $$12 = eqg.a($$4, eqg.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eqg.a($$0, eqg.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eqg.a($$0, eqg.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eqg.b e = new eqg.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(esm $$0, int $$1, eqg.a $$2, jh $$3, List<eon> $$4, bam $$5) {
         drb $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eqg.a $$8 = eqg.a($$4, eqg.a($$0, $$2, new jh(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eqg.a($$4, eqg.a($$0, $$8, new jh(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eqg.a($$4, eqg.a($$0, $$8, new jh(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eqg.a($$4, eqg.a($$0, $$8, new jh(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eqg.a($$4, eqg.a($$0, $$8, new jh(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eqg.a($$0, eqg.b, $$1 + 1, $$8, new jh(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eqg.a($$4, eqg.a($$0, $$8, new jh(4, $$9, 0), "bridge_end", $$6.a(drb.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bbj<drb, jh>> f = Lists.newArrayList(
      new bbj[]{
         new bbj<>(drb.a, new jh(4, -1, 0)), new bbj<>(drb.b, new jh(12, -1, 4)), new bbj<>(drb.d, new jh(0, -1, 8)), new bbj<>(drb.c, new jh(8, -1, 12))
      }
   );
   static final eqg.b g = new eqg.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(esm $$0, int $$1, eqg.a $$2, jh $$3, List<eon> $$4, bam $$5) {
         drb $$6 = $$2.e().d();
         eqg.a $$7 = eqg.a($$4, eqg.a($$0, $$2, new jh(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bbj<drb, jh> $$9 : eqg.f) {
               if ($$5.h()) {
                  eqg.a $$10 = eqg.a($$4, eqg.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eqg.a($$0, eqg.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eqg.a($$4, eqg.a($$0, $$7, new jh(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eqg.a a(esm $$0, eqg.a $$1, jh $$2, String $$3, drb $$4, boolean $$5) {
      eqg.a $$6 = new eqg.a($$0, $$3, $$1.d(), $$4, $$5);
      jh $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jh.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(esm $$0, jh $$1, drb $$2, List<eon> $$3, bam $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eqg.a $$5 = a($$3, new eqg.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jh(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eqg.a a(List<eon> $$0, eqg.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(esm $$0, eqg.b $$1, int $$2, eqg.a $$3, jh $$4, List<eon> $$5, bam $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eon> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eon $$10 : $$7) {
               $$10.a($$9);
               eon $$11 = eon.a($$5, $$10.f());
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

   public static class a extends eot {
      public a(esm $$0, String $$1, jh $$2, drb $$3, boolean $$4) {
         super(epa.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(esm $$0, ux $$1) {
         super(epa.Y, $$1, $$0, $$1x -> a($$1.q("OW"), drb.valueOf($$1.l("Rot"))));
      }

      private static esh a(boolean $$0, drb $$1) {
         erm $$2 = $$0 ? erm.b : erm.d;
         return new esh().a(true).a($$2).a($$1);
      }

      @Override
      protected alz b() {
         return a(this.a);
      }

      private static alz a(String $$0) {
         return alz.b("end_city/" + $$0);
      }

      @Override
      protected void a(eoz $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == erm.b);
      }

      @Override
      protected void a(String $$0, jh $$1, dhy $$2, bam $$3, eob $$4) {
         if ($$0.startsWith("Chest")) {
            jh $$5 = $$1.e();
            if ($$4.b($$5)) {
               bto.a($$2, $$3, $$5, ewk.b);
            }
         } else if ($$4.b($$1) && dhh.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cnc $$6 = bvq.bc.a($$2.a(), bvp.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               clt $$7 = new clt($$2.a(), $$1, this.c.d().a(jm.d));
               $$7.a(new cxo(cxs.on), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(esm var1, int var2, eqg.a var3, jh var4, List<eon> var5, bam var6);
   }
}
