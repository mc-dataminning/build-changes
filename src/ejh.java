import com.google.common.collect.Lists;
import java.util.List;

public class ejh {
   private static final int a = 8;
   static final ejh.b b = new ejh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(elm $$0, int $$1, ejh.a $$2, io $$3, List<ehp> $$4, aym $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dkn $$6 = $$2.e().d();
            ejh.a $$7 = ejh.a($$4, ejh.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 8, -1), "second_roof", $$6, false));
               ejh.a($$0, ejh.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 8, -1), "third_roof", $$6, true));
               ejh.a($$0, ejh.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<azg<dkn, io>> c = Lists.newArrayList(
      new azg[]{new azg<>(dkn.a, new io(1, -1, 0)), new azg<>(dkn.b, new io(6, -1, 1)), new azg<>(dkn.d, new io(0, -1, 5)), new azg<>(dkn.c, new io(5, -1, 6))}
   );
   static final ejh.b d = new ejh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(elm $$0, int $$1, ejh.a $$2, io $$3, List<ehp> $$4, aym $$5) {
         dkn $$6 = $$2.e().d();
         ejh.a $$7 = ejh.a($$4, ejh.a($$0, $$2, new io(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(0, 7, 0), "tower_piece", $$6, true));
         ejh.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (azg<dkn, io> $$11 : ejh.c) {
               if ($$5.h()) {
                  ejh.a $$12 = ejh.a($$4, ejh.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ejh.a($$0, ejh.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ejh.a($$0, ejh.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ejh.b e = new ejh.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(elm $$0, int $$1, ejh.a $$2, io $$3, List<ehp> $$4, aym $$5) {
         dkn $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ejh.a $$8 = ejh.a($$4, ejh.a($$0, $$2, new io(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ejh.a($$4, ejh.a($$0, $$8, new io(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ejh.a($$4, ejh.a($$0, $$8, new io(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ejh.a($$4, ejh.a($$0, $$8, new io(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ejh.a($$4, ejh.a($$0, $$8, new io(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ejh.a($$0, ejh.b, $$1 + 1, $$8, new io(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ejh.a($$4, ejh.a($$0, $$8, new io(4, $$9, 0), "bridge_end", $$6.a(dkn.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<azg<dkn, io>> f = Lists.newArrayList(
      new azg[]{
         new azg<>(dkn.a, new io(4, -1, 0)), new azg<>(dkn.b, new io(12, -1, 4)), new azg<>(dkn.d, new io(0, -1, 8)), new azg<>(dkn.c, new io(8, -1, 12))
      }
   );
   static final ejh.b g = new ejh.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(elm $$0, int $$1, ejh.a $$2, io $$3, List<ehp> $$4, aym $$5) {
         dkn $$6 = $$2.e().d();
         ejh.a $$7 = ejh.a($$4, ejh.a($$0, $$2, new io(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(0, 8, 0), "fat_tower_middle", $$6, true));

            for (azg<dkn, io> $$9 : ejh.f) {
               if ($$5.h()) {
                  ejh.a $$10 = ejh.a($$4, ejh.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ejh.a($$0, ejh.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ejh.a($$4, ejh.a($$0, $$7, new io(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ejh.a a(elm $$0, ejh.a $$1, io $$2, String $$3, dkn $$4, boolean $$5) {
      ejh.a $$6 = new ejh.a($$0, $$3, $$1.d(), $$4, $$5);
      io $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), io.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(elm $$0, io $$1, dkn $$2, List<ehp> $$3, aym $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ejh.a $$5 = a($$3, new ejh.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new io(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new io(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new io(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ejh.a a(List<ehp> $$0, ejh.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(elm $$0, ejh.b $$1, int $$2, ejh.a $$3, io $$4, List<ehp> $$5, aym $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<ehp> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (ehp $$10 : $$7) {
               $$10.a($$9);
               ehp $$11 = ehp.a($$5, $$10.f());
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

   public static class a extends ehv {
      public a(elm $$0, String $$1, io $$2, dkn $$3, boolean $$4) {
         super(eic.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(elm $$0, ud $$1) {
         super(eic.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dkn.valueOf($$1.l("Rot"))));
      }

      private static elh a(boolean $$0, dkn $$1) {
         ekn $$2 = $$0 ? ekn.b : ekn.d;
         return new elh().a(true).a($$2).a($$1);
      }

      @Override
      protected akn b() {
         return a(this.a);
      }

      private static akn a(String $$0) {
         return new akn("end_city/" + $$0);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == ekn.b);
      }

      @Override
      protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
         if ($$0.startsWith("Chest")) {
            io $$5 = $$1.d();
            if ($$4.b($$5)) {
               bqe.a($$2, $$3, $$5, epf.c);
            }
         } else if ($$4.b($$1) && daz.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cjk $$6 = bsc.aK.a((daz)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cib $$7 = new cib($$2.E(), $$1, this.c.d().a(it.d));
               $$7.a(new ctq(ctt.nT), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(elm var1, int var2, ejh.a var3, io var4, List<ehp> var5, aym var6);
   }
}
