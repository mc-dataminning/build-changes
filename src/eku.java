import com.google.common.collect.Lists;
import java.util.List;

public class eku {
   private static final int a = 8;
   static final eku.b b = new eku.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emz $$0, int $$1, eku.a $$2, ja $$3, List<ejb> $$4, ayo $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlv $$6 = $$2.e().d();
            eku.a $$7 = eku.a($$4, eku.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 8, -1), "second_roof", $$6, false));
               eku.a($$0, eku.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 8, -1), "third_roof", $$6, true));
               eku.a($$0, eku.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azj<dlv, ja>> c = Lists.newArrayList(
      new azj[]{new azj<>(dlv.a, new ja(1, -1, 0)), new azj<>(dlv.b, new ja(6, -1, 1)), new azj<>(dlv.d, new ja(0, -1, 5)), new azj<>(dlv.c, new ja(5, -1, 6))}
   );
   static final eku.b d = new eku.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emz $$0, int $$1, eku.a $$2, ja $$3, List<ejb> $$4, ayo $$5) {
         dlv $$6 = $$2.e().d();
         eku.a $$7 = eku.a($$4, eku.a($$0, $$2, new ja(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eku.a($$4, eku.a($$0, $$7, new ja(0, 7, 0), "tower_piece", $$6, true));
         eku.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eku.a($$4, eku.a($$0, $$7, new ja(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azj<dlv, ja> $$11 : eku.c) {
               if ($$5.h()) {
                  eku.a $$12 = eku.a($$4, eku.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eku.a($$0, eku.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eku.a($$0, eku.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eku.b e = new eku.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emz $$0, int $$1, eku.a $$2, ja $$3, List<ejb> $$4, ayo $$5) {
         dlv $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eku.a $$8 = eku.a($$4, eku.a($$0, $$2, new ja(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eku.a($$4, eku.a($$0, $$8, new ja(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eku.a($$4, eku.a($$0, $$8, new ja(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eku.a($$4, eku.a($$0, $$8, new ja(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eku.a($$4, eku.a($$0, $$8, new ja(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eku.a($$0, eku.b, $$1 + 1, $$8, new ja(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eku.a($$4, eku.a($$0, $$8, new ja(4, $$9, 0), "bridge_end", $$6.a(dlv.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azj<dlv, ja>> f = Lists.newArrayList(
      new azj[]{
         new azj<>(dlv.a, new ja(4, -1, 0)), new azj<>(dlv.b, new ja(12, -1, 4)), new azj<>(dlv.d, new ja(0, -1, 8)), new azj<>(dlv.c, new ja(8, -1, 12))
      }
   );
   static final eku.b g = new eku.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emz $$0, int $$1, eku.a $$2, ja $$3, List<ejb> $$4, ayo $$5) {
         dlv $$6 = $$2.e().d();
         eku.a $$7 = eku.a($$4, eku.a($$0, $$2, new ja(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eku.a($$4, eku.a($$0, $$7, new ja(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eku.a($$4, eku.a($$0, $$7, new ja(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azj<dlv, ja> $$9 : eku.f) {
               if ($$5.h()) {
                  eku.a $$10 = eku.a($$4, eku.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eku.a($$0, eku.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eku.a($$4, eku.a($$0, $$7, new ja(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eku.a a(emz $$0, eku.a $$1, ja $$2, String $$3, dlv $$4, boolean $$5) {
      eku.a $$6 = new eku.a($$0, $$3, $$1.d(), $$4, $$5);
      ja $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ja.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emz $$0, ja $$1, dlv $$2, List<ejb> $$3, ayo $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eku.a $$5 = a($$3, new eku.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eku.a a(List<ejb> $$0, eku.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emz $$0, eku.b $$1, int $$2, eku.a $$3, ja $$4, List<ejb> $$5, ayo $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ejb> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ejb $$10 : $$7) {
               $$10.a($$9);
               ejb $$11 = ejb.a($$5, $$10.f());
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

   public static class a extends ejh {
      public a(emz $$0, String $$1, ja $$2, dlv $$3, boolean $$4) {
         super(ejo.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emz $$0, tx $$1) {
         super(ejo.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlv.valueOf($$1.l("Rot"))));
      }

      private static emu a(boolean $$0, dlv $$1) {
         ema $$2 = $$0 ? ema.b : ema.d;
         return new emu().a(true).a($$2).a($$1);
      }

      @Override
      protected akk b() {
         return a(this.a);
      }

      private static akk a(String $$0) {
         return new akk("end_city/" + $$0);
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ema.b);
      }

      @Override
      protected void a(String $$0, ja $$1, dcv $$2, ayo $$3, eip $$4) {
         if ($$0.startsWith("Chest")) {
            ja $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqp.a($$2, $$3, $$5, eqs.c);
            }
         } else if ($$4.b($$1) && dcg.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cjx $$6 = bsn.aK.a((dcg)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cio $$7 = new cio($$2.E(), $$1, this.c.d().a(jf.d));
               $$7.a(new cud(cug.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emz var1, int var2, eku.a var3, ja var4, List<ejb> var5, ayo var6);
   }
}
