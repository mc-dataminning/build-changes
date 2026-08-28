import com.google.common.collect.Lists;
import java.util.List;

public class ekf {
   private static final int a = 8;
   static final ekf.b b = new ekf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emk $$0, int $$1, ekf.a $$2, iz $$3, List<ein> $$4, azg $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dll $$6 = $$2.e().d();
            ekf.a $$7 = ekf.a($$4, ekf.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 8, -1), "second_roof", $$6, false));
               ekf.a($$0, ekf.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 8, -1), "third_roof", $$6, true));
               ekf.a($$0, ekf.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<baa<dll, iz>> c = Lists.newArrayList(
      new baa[]{new baa<>(dll.a, new iz(1, -1, 0)), new baa<>(dll.b, new iz(6, -1, 1)), new baa<>(dll.d, new iz(0, -1, 5)), new baa<>(dll.c, new iz(5, -1, 6))}
   );
   static final ekf.b d = new ekf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emk $$0, int $$1, ekf.a $$2, iz $$3, List<ein> $$4, azg $$5) {
         dll $$6 = $$2.e().d();
         ekf.a $$7 = ekf.a($$4, ekf.a($$0, $$2, new iz(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(0, 7, 0), "tower_piece", $$6, true));
         ekf.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (baa<dll, iz> $$11 : ekf.c) {
               if ($$5.h()) {
                  ekf.a $$12 = ekf.a($$4, ekf.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ekf.a($$0, ekf.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ekf.a($$0, ekf.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ekf.b e = new ekf.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(emk $$0, int $$1, ekf.a $$2, iz $$3, List<ein> $$4, azg $$5) {
         dll $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ekf.a $$8 = ekf.a($$4, ekf.a($$0, $$2, new iz(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ekf.a($$4, ekf.a($$0, $$8, new iz(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ekf.a($$4, ekf.a($$0, $$8, new iz(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ekf.a($$4, ekf.a($$0, $$8, new iz(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ekf.a($$4, ekf.a($$0, $$8, new iz(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ekf.a($$0, ekf.b, $$1 + 1, $$8, new iz(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ekf.a($$4, ekf.a($$0, $$8, new iz(4, $$9, 0), "bridge_end", $$6.a(dll.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<baa<dll, iz>> f = Lists.newArrayList(
      new baa[]{
         new baa<>(dll.a, new iz(4, -1, 0)), new baa<>(dll.b, new iz(12, -1, 4)), new baa<>(dll.d, new iz(0, -1, 8)), new baa<>(dll.c, new iz(8, -1, 12))
      }
   );
   static final ekf.b g = new ekf.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(emk $$0, int $$1, ekf.a $$2, iz $$3, List<ein> $$4, azg $$5) {
         dll $$6 = $$2.e().d();
         ekf.a $$7 = ekf.a($$4, ekf.a($$0, $$2, new iz(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(0, 8, 0), "fat_tower_middle", $$6, true));

            for (baa<dll, iz> $$9 : ekf.f) {
               if ($$5.h()) {
                  ekf.a $$10 = ekf.a($$4, ekf.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ekf.a($$0, ekf.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ekf.a($$4, ekf.a($$0, $$7, new iz(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ekf.a a(emk $$0, ekf.a $$1, iz $$2, String $$3, dll $$4, boolean $$5) {
      ekf.a $$6 = new ekf.a($$0, $$3, $$1.d(), $$4, $$5);
      iz $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iz.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(emk $$0, iz $$1, dll $$2, List<ein> $$3, azg $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ekf.a $$5 = a($$3, new ekf.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iz(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ekf.a a(List<ein> $$0, ekf.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(emk $$0, ekf.b $$1, int $$2, ekf.a $$3, iz $$4, List<ein> $$5, azg $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ein> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ein $$10 : $$7) {
               $$10.a($$9);
               ein $$11 = ein.a($$5, $$10.f());
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

   public static class a extends eit {
      public a(emk $$0, String $$1, iz $$2, dll $$3, boolean $$4) {
         super(eja.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(emk $$0, ur $$1) {
         super(eja.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dll.valueOf($$1.l("Rot"))));
      }

      private static emf a(boolean $$0, dll $$1) {
         ell $$2 = $$0 ? ell.b : ell.d;
         return new emf().a(true).a($$2).a($$1);
      }

      @Override
      protected ale b() {
         return a(this.a);
      }

      private static ale a(String $$0) {
         return new ale("end_city/" + $$0);
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ell.b);
      }

      @Override
      protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
         if ($$0.startsWith("Chest")) {
            iz $$5 = $$1.d();
            if ($$4.b($$5)) {
               brb.a($$2, $$3, $$5, eqd.c);
            }
         } else if ($$4.b($$1) && dbx.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cki $$6 = bsz.aK.a((dbx)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               ciz $$7 = new ciz($$2.E(), $$1, this.c.d().a(je.d));
               $$7.a(new cuo(cur.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(emk var1, int var2, ekf.a var3, iz var4, List<ein> var5, azg var6);
   }
}
