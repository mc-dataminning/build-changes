import com.google.common.collect.Lists;
import java.util.List;

public class ebk {
   private static final int a = 8;
   static final ebk.b b = new ebk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edp $$0, int $$1, ebk.a $$2, hx $$3, List<dzs> $$4, auw $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            ddk $$6 = $$2.e().d();
            ebk.a $$7 = ebk.a($$4, ebk.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 8, -1), "second_roof", $$6, false));
               ebk.a($$0, ebk.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 8, -1), "third_roof", $$6, true));
               ebk.a($$0, ebk.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<avs<ddk, hx>> c = Lists.newArrayList(
      new avs[]{new avs<>(ddk.a, new hx(1, -1, 0)), new avs<>(ddk.b, new hx(6, -1, 1)), new avs<>(ddk.d, new hx(0, -1, 5)), new avs<>(ddk.c, new hx(5, -1, 6))}
   );
   static final ebk.b d = new ebk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edp $$0, int $$1, ebk.a $$2, hx $$3, List<dzs> $$4, auw $$5) {
         ddk $$6 = $$2.e().d();
         ebk.a $$7 = ebk.a($$4, ebk.a($$0, $$2, new hx(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(0, 7, 0), "tower_piece", $$6, true));
         ebk.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (avs<ddk, hx> $$11 : ebk.c) {
               if ($$5.h()) {
                  ebk.a $$12 = ebk.a($$4, ebk.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ebk.a($$0, ebk.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ebk.a($$0, ebk.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ebk.b e = new ebk.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(edp $$0, int $$1, ebk.a $$2, hx $$3, List<dzs> $$4, auw $$5) {
         ddk $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ebk.a $$8 = ebk.a($$4, ebk.a($$0, $$2, new hx(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ebk.a($$4, ebk.a($$0, $$8, new hx(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ebk.a($$4, ebk.a($$0, $$8, new hx(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ebk.a($$4, ebk.a($$0, $$8, new hx(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ebk.a($$4, ebk.a($$0, $$8, new hx(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ebk.a($$0, ebk.b, $$1 + 1, $$8, new hx(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ebk.a($$4, ebk.a($$0, $$8, new hx(4, $$9, 0), "bridge_end", $$6.a(ddk.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<avs<ddk, hx>> f = Lists.newArrayList(
      new avs[]{
         new avs<>(ddk.a, new hx(4, -1, 0)), new avs<>(ddk.b, new hx(12, -1, 4)), new avs<>(ddk.d, new hx(0, -1, 8)), new avs<>(ddk.c, new hx(8, -1, 12))
      }
   );
   static final ebk.b g = new ebk.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(edp $$0, int $$1, ebk.a $$2, hx $$3, List<dzs> $$4, auw $$5) {
         ddk $$6 = $$2.e().d();
         ebk.a $$7 = ebk.a($$4, ebk.a($$0, $$2, new hx(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(0, 8, 0), "fat_tower_middle", $$6, true));

            for (avs<ddk, hx> $$9 : ebk.f) {
               if ($$5.h()) {
                  ebk.a $$10 = ebk.a($$4, ebk.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ebk.a($$0, ebk.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ebk.a($$4, ebk.a($$0, $$7, new hx(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ebk.a a(edp $$0, ebk.a $$1, hx $$2, String $$3, ddk $$4, boolean $$5) {
      ebk.a $$6 = new ebk.a($$0, $$3, $$1.d(), $$4, $$5);
      hx $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), hx.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(edp $$0, hx $$1, ddk $$2, List<dzs> $$3, auw $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ebk.a $$5 = a($$3, new ebk.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new hx(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ebk.a a(List<dzs> $$0, ebk.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(edp $$0, ebk.b $$1, int $$2, ebk.a $$3, hx $$4, List<dzs> $$5, auw $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dzs> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dzs $$10 : $$7) {
               $$10.a($$9);
               dzs $$11 = dzs.a($$5, $$10.f());
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

   public static class a extends dzy {
      public a(edp $$0, String $$1, hx $$2, ddk $$3, boolean $$4) {
         super(eaf.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(edp $$0, so $$1) {
         super(eaf.Y, $$1, $$0, $$1x -> a($$1.q("OW"), ddk.valueOf($$1.l("Rot"))));
      }

      private static edk a(boolean $$0, ddk $$1) {
         ecq $$2 = $$0 ? ecq.b : ecq.d;
         return new edk().a(true).a($$2).a($$1);
      }

      @Override
      protected ahh b() {
         return a(this.a);
      }

      private static ahh a(String $$0) {
         return new ahh("end_city/" + $$0);
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ecq.b);
      }

      @Override
      protected void a(String $$0, hx $$1, cum $$2, auw $$3, dzg $$4) {
         if ($$0.startsWith("Chest")) {
            hx $$5 = $$1.d();
            if ($$4.b($$5)) {
               bkk.a($$2, $$3, $$5, ehd.c);
            }
         } else if ($$4.b($$1) && ctx.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cdc $$6 = bmc.aI.a((ctx)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cbu $$7 = new cbu($$2.E(), $$1, this.c.d().a(ic.d));
               $$7.a(new cng(cnj.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(edp var1, int var2, ebk.a var3, hx var4, List<dzs> var5, auw var6);
   }
}
