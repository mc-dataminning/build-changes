import com.google.common.collect.Lists;
import java.util.List;

public class eil {
   private static final int a = 8;
   static final eil.b b = new eil.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekq $$0, int $$1, eil.a $$2, in $$3, List<egt> $$4, ayg $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            djr $$6 = $$2.e().d();
            eil.a $$7 = eil.a($$4, eil.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 8, -1), "second_roof", $$6, false));
               eil.a($$0, eil.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 8, -1), "third_roof", $$6, true));
               eil.a($$0, eil.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<aza<djr, in>> c = Lists.newArrayList(
      new aza[]{new aza<>(djr.a, new in(1, -1, 0)), new aza<>(djr.b, new in(6, -1, 1)), new aza<>(djr.d, new in(0, -1, 5)), new aza<>(djr.c, new in(5, -1, 6))}
   );
   static final eil.b d = new eil.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekq $$0, int $$1, eil.a $$2, in $$3, List<egt> $$4, ayg $$5) {
         djr $$6 = $$2.e().d();
         eil.a $$7 = eil.a($$4, eil.a($$0, $$2, new in(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eil.a($$4, eil.a($$0, $$7, new in(0, 7, 0), "tower_piece", $$6, true));
         eil.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eil.a($$4, eil.a($$0, $$7, new in(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (aza<djr, in> $$11 : eil.c) {
               if ($$5.h()) {
                  eil.a $$12 = eil.a($$4, eil.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eil.a($$0, eil.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eil.a($$0, eil.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eil.a($$4, eil.a($$0, $$7, new in(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eil.b e = new eil.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ekq $$0, int $$1, eil.a $$2, in $$3, List<egt> $$4, ayg $$5) {
         djr $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eil.a $$8 = eil.a($$4, eil.a($$0, $$2, new in(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eil.a($$4, eil.a($$0, $$8, new in(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eil.a($$4, eil.a($$0, $$8, new in(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eil.a($$4, eil.a($$0, $$8, new in(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eil.a($$4, eil.a($$0, $$8, new in(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eil.a($$0, eil.b, $$1 + 1, $$8, new in(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eil.a($$4, eil.a($$0, $$8, new in(4, $$9, 0), "bridge_end", $$6.a(djr.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<aza<djr, in>> f = Lists.newArrayList(
      new aza[]{
         new aza<>(djr.a, new in(4, -1, 0)), new aza<>(djr.b, new in(12, -1, 4)), new aza<>(djr.d, new in(0, -1, 8)), new aza<>(djr.c, new in(8, -1, 12))
      }
   );
   static final eil.b g = new eil.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ekq $$0, int $$1, eil.a $$2, in $$3, List<egt> $$4, ayg $$5) {
         djr $$6 = $$2.e().d();
         eil.a $$7 = eil.a($$4, eil.a($$0, $$2, new in(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eil.a($$4, eil.a($$0, $$7, new in(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eil.a($$4, eil.a($$0, $$7, new in(0, 8, 0), "fat_tower_middle", $$6, true));

            for (aza<djr, in> $$9 : eil.f) {
               if ($$5.h()) {
                  eil.a $$10 = eil.a($$4, eil.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eil.a($$0, eil.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eil.a($$4, eil.a($$0, $$7, new in(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eil.a a(ekq $$0, eil.a $$1, in $$2, String $$3, djr $$4, boolean $$5) {
      eil.a $$6 = new eil.a($$0, $$3, $$1.d(), $$4, $$5);
      in $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), in.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ekq $$0, in $$1, djr $$2, List<egt> $$3, ayg $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eil.a $$5 = a($$3, new eil.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new in(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new in(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new in(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eil.a a(List<egt> $$0, eil.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ekq $$0, eil.b $$1, int $$2, eil.a $$3, in $$4, List<egt> $$5, ayg $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<egt> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (egt $$10 : $$7) {
               $$10.a($$9);
               egt $$11 = egt.a($$5, $$10.f());
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

   public static class a extends egz {
      public a(ekq $$0, String $$1, in $$2, djr $$3, boolean $$4) {
         super(ehg.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ekq $$0, ua $$1) {
         super(ehg.Y, $$1, $$0, $$1x -> a($$1.q("OW"), djr.valueOf($$1.l("Rot"))));
      }

      private static ekl a(boolean $$0, djr $$1) {
         ejr $$2 = $$0 ? ejr.b : ejr.d;
         return new ekl().a(true).a($$2).a($$1);
      }

      @Override
      protected akh b() {
         return a(this.a);
      }

      private static akh a(String $$0) {
         return new akh("end_city/" + $$0);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ejr.b);
      }

      @Override
      protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
         if ($$0.startsWith("Chest")) {
            in $$5 = $$1.d();
            if ($$4.b($$5)) {
               bpu.a($$2, $$3, $$5, eoj.c);
            }
         } else if ($$4.b($$1) && dad.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cit $$6 = brn.aJ.a((dad)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               chk $$7 = new chk($$2.E(), $$1, this.c.d().a(is.d));
               $$7.a(new csz(ctc.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ekq var1, int var2, eil.a var3, in var4, List<egt> var5, ayg var6);
   }
}
