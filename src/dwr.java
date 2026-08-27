import com.google.common.collect.Lists;
import java.util.List;

public class dwr {
   private static final int a = 8;
   static final dwr.b b = new dwr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyw $$0, int $$1, dwr.a $$2, gw $$3, List<dvg> $$4, ash $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            czn $$6 = $$2.e().d();
            dwr.a $$7 = dwr.a($$4, dwr.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 8, -1), "second_roof", $$6, false));
               dwr.a($$0, dwr.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 8, -1), "third_roof", $$6, true));
               dwr.a($$0, dwr.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<atb<czn, gw>> c = Lists.newArrayList(
      new atb[]{new atb<>(czn.a, new gw(1, -1, 0)), new atb<>(czn.b, new gw(6, -1, 1)), new atb<>(czn.d, new gw(0, -1, 5)), new atb<>(czn.c, new gw(5, -1, 6))}
   );
   static final dwr.b d = new dwr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyw $$0, int $$1, dwr.a $$2, gw $$3, List<dvg> $$4, ash $$5) {
         czn $$6 = $$2.e().d();
         dwr.a $$7 = dwr.a($$4, dwr.a($$0, $$2, new gw(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(0, 7, 0), "tower_piece", $$6, true));
         dwr.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (atb<czn, gw> $$11 : dwr.c) {
               if ($$5.h()) {
                  dwr.a $$12 = dwr.a($$4, dwr.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dwr.a($$0, dwr.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dwr.a($$0, dwr.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dwr.b e = new dwr.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dyw $$0, int $$1, dwr.a $$2, gw $$3, List<dvg> $$4, ash $$5) {
         czn $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dwr.a $$8 = dwr.a($$4, dwr.a($$0, $$2, new gw(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = dwr.a($$4, dwr.a($$0, $$8, new gw(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dwr.a($$4, dwr.a($$0, $$8, new gw(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dwr.a($$4, dwr.a($$0, $$8, new gw(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dwr.a($$4, dwr.a($$0, $$8, new gw(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dwr.a($$0, dwr.b, $$1 + 1, $$8, new gw(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dwr.a($$4, dwr.a($$0, $$8, new gw(4, $$9, 0), "bridge_end", $$6.a(czn.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<atb<czn, gw>> f = Lists.newArrayList(
      new atb[]{
         new atb<>(czn.a, new gw(4, -1, 0)), new atb<>(czn.b, new gw(12, -1, 4)), new atb<>(czn.d, new gw(0, -1, 8)), new atb<>(czn.c, new gw(8, -1, 12))
      }
   );
   static final dwr.b g = new dwr.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dyw $$0, int $$1, dwr.a $$2, gw $$3, List<dvg> $$4, ash $$5) {
         czn $$6 = $$2.e().d();
         dwr.a $$7 = dwr.a($$4, dwr.a($$0, $$2, new gw(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(0, 8, 0), "fat_tower_middle", $$6, true));

            for (atb<czn, gw> $$9 : dwr.f) {
               if ($$5.h()) {
                  dwr.a $$10 = dwr.a($$4, dwr.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dwr.a($$0, dwr.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dwr.a($$4, dwr.a($$0, $$7, new gw(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dwr.a a(dyw $$0, dwr.a $$1, gw $$2, String $$3, czn $$4, boolean $$5) {
      dwr.a $$6 = new dwr.a($$0, $$3, $$1.d(), $$4, $$5);
      gw $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gw.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dyw $$0, gw $$1, czn $$2, List<dvg> $$3, ash $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dwr.a $$5 = a($$3, new dwr.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gw(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dwr.a a(List<dvg> $$0, dwr.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dyw $$0, dwr.b $$1, int $$2, dwr.a $$3, gw $$4, List<dvg> $$5, ash $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dvg> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (dvg $$10 : $$7) {
               $$10.a($$9);
               dvg $$11 = dvg.a($$5, $$10.f());
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

   public static class a extends dvm {
      public a(dyw $$0, String $$1, gw $$2, czn $$3, boolean $$4) {
         super(dvt.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dyw $$0, qw $$1) {
         super(dvt.Y, $$1, $$0, $$1x -> a($$1.q("OW"), czn.valueOf($$1.l("Rot"))));
      }

      private static dyr a(boolean $$0, czn $$1) {
         dxx $$2 = $$0 ? dxx.b : dxx.d;
         return new dyr().a(true).a($$2).a($$1);
      }

      @Override
      protected aez b() {
         return a(this.a);
      }

      private static aez a(String $$0) {
         return new aez("end_city/" + $$0);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dxx.b);
      }

      @Override
      protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
         if ($$0.startsWith("Chest")) {
            gw $$5 = $$1.d();
            if ($$4.b($$5)) {
               dec.a($$2, $$3, $$5, eci.c);
            }
         } else if ($$4.b($$1) && cqb.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               bzu $$6 = bja.aG.a((cqb)$$2.C());
               if ($$6 != null) {
                  $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               bym $$7 = new bym($$2.C(), $$1, this.c.d().a(ha.d));
               $$7.a(new cjl(cjo.nh), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(dyw var1, int var2, dwr.a var3, gw var4, List<dvg> var5, ash var6);
   }
}
