import com.google.common.collect.Lists;
import java.util.List;

public class eks {
   private static final int a = 8;
   static final eks.b b = new eks.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emx $$0, int $$1, eks.a $$2, ja $$3, List<eja> $$4, ayo $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dlu $$6 = $$2.e().d();
            eks.a $$7 = eks.a($$4, eks.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 8, -1), "second_roof", $$6, false));
               eks.a($$0, eks.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 8, -1), "third_roof", $$6, true));
               eks.a($$0, eks.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azj<dlu, ja>> c = Lists.newArrayList(
      new azj[]{new azj<>(dlu.a, new ja(1, -1, 0)), new azj<>(dlu.b, new ja(6, -1, 1)), new azj<>(dlu.d, new ja(0, -1, 5)), new azj<>(dlu.c, new ja(5, -1, 6))}
   );
   static final eks.b d = new eks.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emx $$0, int $$1, eks.a $$2, ja $$3, List<eja> $$4, ayo $$5) {
         dlu $$6 = $$2.e().d();
         eks.a $$7 = eks.a($$4, eks.a($$0, $$2, new ja(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eks.a($$4, eks.a($$0, $$7, new ja(0, 7, 0), "tower_piece", $$6, true));
         eks.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eks.a($$4, eks.a($$0, $$7, new ja(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azj<dlu, ja> $$11 : eks.c) {
               if ($$5.h()) {
                  eks.a $$12 = eks.a($$4, eks.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eks.a($$0, eks.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eks.a($$0, eks.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eks.b e = new eks.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emx $$0, int $$1, eks.a $$2, ja $$3, List<eja> $$4, ayo $$5) {
         dlu $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eks.a $$8 = eks.a($$4, eks.a($$0, $$2, new ja(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eks.a($$4, eks.a($$0, $$8, new ja(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eks.a($$4, eks.a($$0, $$8, new ja(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eks.a($$4, eks.a($$0, $$8, new ja(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eks.a($$4, eks.a($$0, $$8, new ja(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eks.a($$0, eks.b, $$1 + 1, $$8, new ja(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eks.a($$4, eks.a($$0, $$8, new ja(4, $$9, 0), "bridge_end", $$6.a(dlu.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azj<dlu, ja>> f = Lists.newArrayList(
      new azj[]{
         new azj<>(dlu.a, new ja(4, -1, 0)), new azj<>(dlu.b, new ja(12, -1, 4)), new azj<>(dlu.d, new ja(0, -1, 8)), new azj<>(dlu.c, new ja(8, -1, 12))
      }
   );
   static final eks.b g = new eks.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emx $$0, int $$1, eks.a $$2, ja $$3, List<eja> $$4, ayo $$5) {
         dlu $$6 = $$2.e().d();
         eks.a $$7 = eks.a($$4, eks.a($$0, $$2, new ja(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eks.a($$4, eks.a($$0, $$7, new ja(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eks.a($$4, eks.a($$0, $$7, new ja(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azj<dlu, ja> $$9 : eks.f) {
               if ($$5.h()) {
                  eks.a $$10 = eks.a($$4, eks.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eks.a($$0, eks.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eks.a($$4, eks.a($$0, $$7, new ja(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eks.a a(emx $$0, eks.a $$1, ja $$2, String $$3, dlu $$4, boolean $$5) {
      eks.a $$6 = new eks.a($$0, $$3, $$1.d(), $$4, $$5);
      ja $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ja.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emx $$0, ja $$1, dlu $$2, List<eja> $$3, ayo $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eks.a $$5 = a($$3, new eks.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ja(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eks.a a(List<eja> $$0, eks.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emx $$0, eks.b $$1, int $$2, eks.a $$3, ja $$4, List<eja> $$5, ayo $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eja> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eja $$10 : $$7) {
               $$10.a($$9);
               eja $$11 = eja.a($$5, $$10.f());
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

   public static class a extends ejg {
      public a(emx $$0, String $$1, ja $$2, dlu $$3, boolean $$4) {
         super(ejn.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emx $$0, tx $$1) {
         super(ejn.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dlu.valueOf($$1.l("Rot"))));
      }

      private static ems a(boolean $$0, dlu $$1) {
         ely $$2 = $$0 ? ely.b : ely.d;
         return new ems().a(true).a($$2).a($$1);
      }

      @Override
      protected akk b() {
         return a(this.a);
      }

      private static akk a(String $$0) {
         return new akk("end_city/" + $$0);
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ely.b);
      }

      @Override
      protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
         if ($$0.startsWith("Chest")) {
            ja $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqo.a($$2, $$3, $$5, eqq.c);
            }
         } else if ($$4.b($$1) && dcf.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cjw $$6 = bsm.aK.a((dcf)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cin $$7 = new cin($$2.E(), $$1, this.c.d().a(jf.d));
               $$7.a(new cuc(cuf.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emx var1, int var2, eks.a var3, ja var4, List<eja> var5, ayo var6);
   }
}
