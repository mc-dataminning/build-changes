import com.google.common.collect.Lists;
import java.util.List;

public class eno {
   private static final int a = 8;
   static final eno.b b = new eno.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epu $$0, int $$1, eno.a $$2, jg $$3, List<elv> $$4, azr $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dol $$6 = $$2.e().d();
            eno.a $$7 = eno.a($$4, eno.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 8, -1), "second_roof", $$6, false));
               eno.a($$0, eno.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 8, -1), "third_roof", $$6, true));
               eno.a($$0, eno.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<ban<dol, jg>> c = Lists.newArrayList(
      new ban[]{new ban<>(dol.a, new jg(1, -1, 0)), new ban<>(dol.b, new jg(6, -1, 1)), new ban<>(dol.d, new jg(0, -1, 5)), new ban<>(dol.c, new jg(5, -1, 6))}
   );
   static final eno.b d = new eno.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epu $$0, int $$1, eno.a $$2, jg $$3, List<elv> $$4, azr $$5) {
         dol $$6 = $$2.e().d();
         eno.a $$7 = eno.a($$4, eno.a($$0, $$2, new jg(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eno.a($$4, eno.a($$0, $$7, new jg(0, 7, 0), "tower_piece", $$6, true));
         eno.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eno.a($$4, eno.a($$0, $$7, new jg(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (ban<dol, jg> $$11 : eno.c) {
               if ($$5.h()) {
                  eno.a $$12 = eno.a($$4, eno.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eno.a($$0, eno.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eno.a($$0, eno.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eno.b e = new eno.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(epu $$0, int $$1, eno.a $$2, jg $$3, List<elv> $$4, azr $$5) {
         dol $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eno.a $$8 = eno.a($$4, eno.a($$0, $$2, new jg(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eno.a($$4, eno.a($$0, $$8, new jg(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eno.a($$4, eno.a($$0, $$8, new jg(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eno.a($$4, eno.a($$0, $$8, new jg(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eno.a($$4, eno.a($$0, $$8, new jg(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eno.a($$0, eno.b, $$1 + 1, $$8, new jg(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eno.a($$4, eno.a($$0, $$8, new jg(4, $$9, 0), "bridge_end", $$6.a(dol.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<ban<dol, jg>> f = Lists.newArrayList(
      new ban[]{
         new ban<>(dol.a, new jg(4, -1, 0)), new ban<>(dol.b, new jg(12, -1, 4)), new ban<>(dol.d, new jg(0, -1, 8)), new ban<>(dol.c, new jg(8, -1, 12))
      }
   );
   static final eno.b g = new eno.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(epu $$0, int $$1, eno.a $$2, jg $$3, List<elv> $$4, azr $$5) {
         dol $$6 = $$2.e().d();
         eno.a $$7 = eno.a($$4, eno.a($$0, $$2, new jg(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eno.a($$4, eno.a($$0, $$7, new jg(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eno.a($$4, eno.a($$0, $$7, new jg(0, 8, 0), "fat_tower_middle", $$6, true));

            for (ban<dol, jg> $$9 : eno.f) {
               if ($$5.h()) {
                  eno.a $$10 = eno.a($$4, eno.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eno.a($$0, eno.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eno.a($$4, eno.a($$0, $$7, new jg(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eno.a a(epu $$0, eno.a $$1, jg $$2, String $$3, dol $$4, boolean $$5) {
      eno.a $$6 = new eno.a($$0, $$3, $$1.d(), $$4, $$5);
      jg $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jg.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(epu $$0, jg $$1, dol $$2, List<elv> $$3, azr $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eno.a $$5 = a($$3, new eno.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jg(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jg(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jg(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eno.a a(List<elv> $$0, eno.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(epu $$0, eno.b $$1, int $$2, eno.a $$3, jg $$4, List<elv> $$5, azr $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<elv> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (elv $$10 : $$7) {
               $$10.a($$9);
               elv $$11 = elv.a($$5, $$10.f());
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

   public static class a extends emb {
      public a(epu $$0, String $$1, jg $$2, dol $$3, boolean $$4) {
         super(emi.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(epu $$0, uj $$1) {
         super(emi.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dol.valueOf($$1.l("Rot"))));
      }

      private static epp a(boolean $$0, dol $$1) {
         eou $$2 = $$0 ? eou.b : eou.d;
         return new epp().a(true).a($$2).a($$1);
      }

      @Override
      protected alh b() {
         return a(this.a);
      }

      private static alh a(String $$0) {
         return alh.b("end_city/" + $$0);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == eou.b);
      }

      @Override
      protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
         if ($$0.startsWith("Chest")) {
            jg $$5 = $$1.e();
            if ($$4.b($$5)) {
               bse.a($$2, $$3, $$5, ets.b);
            }
         } else if ($$4.b($$1) && dev.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cls $$6 = bug.aK.a($$2.E(), buf.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ckj $$7 = new ckj($$2.E(), $$1, this.c.d().a(jl.d));
               $$7.a(new cvx(cwb.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(epu var1, int var2, eno.a var3, jg var4, List<elv> var5, azr var6);
   }
}
