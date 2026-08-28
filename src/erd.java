import com.google.common.collect.Lists;
import java.util.List;

public class erd {
   private static final int a = 8;
   static final erd.b b = new erd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(etj $$0, int $$1, erd.a $$2, jj $$3, List<epk> $$4, azs $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            drm $$6 = $$2.e().d();
            erd.a $$7 = erd.a($$4, erd.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 8, -1), "second_roof", $$6, false));
               erd.a($$0, erd.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 8, -1), "third_roof", $$6, true));
               erd.a($$0, erd.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bap<drm, jj>> c = Lists.newArrayList(
      new bap[]{new bap<>(drm.a, new jj(1, -1, 0)), new bap<>(drm.b, new jj(6, -1, 1)), new bap<>(drm.d, new jj(0, -1, 5)), new bap<>(drm.c, new jj(5, -1, 6))}
   );
   static final erd.b d = new erd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(etj $$0, int $$1, erd.a $$2, jj $$3, List<epk> $$4, azs $$5) {
         drm $$6 = $$2.e().d();
         erd.a $$7 = erd.a($$4, erd.a($$0, $$2, new jj(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = erd.a($$4, erd.a($$0, $$7, new jj(0, 7, 0), "tower_piece", $$6, true));
         erd.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = erd.a($$4, erd.a($$0, $$7, new jj(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bap<drm, jj> $$11 : erd.c) {
               if ($$5.h()) {
                  erd.a $$12 = erd.a($$4, erd.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  erd.a($$0, erd.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return erd.a($$0, erd.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final erd.b e = new erd.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(etj $$0, int $$1, erd.a $$2, jj $$3, List<epk> $$4, azs $$5) {
         drm $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         erd.a $$8 = erd.a($$4, erd.a($$0, $$2, new jj(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = erd.a($$4, erd.a($$0, $$8, new jj(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = erd.a($$4, erd.a($$0, $$8, new jj(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = erd.a($$4, erd.a($$0, $$8, new jj(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            erd.a($$4, erd.a($$0, $$8, new jj(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!erd.a($$0, erd.b, $$1 + 1, $$8, new jj(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = erd.a($$4, erd.a($$0, $$8, new jj(4, $$9, 0), "bridge_end", $$6.a(drm.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bap<drm, jj>> f = Lists.newArrayList(
      new bap[]{
         new bap<>(drm.a, new jj(4, -1, 0)), new bap<>(drm.b, new jj(12, -1, 4)), new bap<>(drm.d, new jj(0, -1, 8)), new bap<>(drm.c, new jj(8, -1, 12))
      }
   );
   static final erd.b g = new erd.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(etj $$0, int $$1, erd.a $$2, jj $$3, List<epk> $$4, azs $$5) {
         drm $$6 = $$2.e().d();
         erd.a $$7 = erd.a($$4, erd.a($$0, $$2, new jj(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = erd.a($$4, erd.a($$0, $$7, new jj(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = erd.a($$4, erd.a($$0, $$7, new jj(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bap<drm, jj> $$9 : erd.f) {
               if ($$5.h()) {
                  erd.a $$10 = erd.a($$4, erd.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  erd.a($$0, erd.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = erd.a($$4, erd.a($$0, $$7, new jj(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static erd.a a(etj $$0, erd.a $$1, jj $$2, String $$3, drm $$4, boolean $$5) {
      erd.a $$6 = new erd.a($$0, $$3, $$1.d(), $$4, $$5);
      jj $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jj.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(etj $$0, jj $$1, drm $$2, List<epk> $$3, azs $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      erd.a $$5 = a($$3, new erd.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jj(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jj(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jj(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static erd.a a(List<epk> $$0, erd.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(etj $$0, erd.b $$1, int $$2, erd.a $$3, jj $$4, List<epk> $$5, azs $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<epk> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (epk $$10 : $$7) {
               $$10.a($$9);
               epk $$11 = epk.a($$5, $$10.f());
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

   public static class a extends epq {
      public a(etj $$0, String $$1, jj $$2, drm $$3, boolean $$4) {
         super(epx.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(etj $$0, tw $$1) {
         super(epx.Y, $$1, $$0, $$1x -> a($$1.q("OW"), drm.valueOf($$1.l("Rot"))));
      }

      private static ete a(boolean $$0, drm $$1) {
         esj $$2 = $$0 ? esj.b : esj.d;
         return new ete().a(true).a($$2).a($$1);
      }

      @Override
      protected ald b() {
         return a(this.a);
      }

      private static ald a(String $$0) {
         return ald.b("end_city/" + $$0);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == esj.b);
      }

      @Override
      protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
         if ($$0.startsWith("Chest")) {
            jj $$5 = $$1.e();
            if ($$4.b($$5)) {
               btw.a($$2, $$3, $$5, exh.b);
            }
         } else if ($$4.b($$1) && dhp.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cnp $$6 = bwb.bb.a($$2.a(), bwa.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cmg $$7 = new cmg($$2.a(), $$1, this.c.d().a(jo.d));
               $$7.a(new cxy(cyc.oy), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(etj var1, int var2, erd.a var3, jj var4, List<epk> var5, azs var6);
   }
}
