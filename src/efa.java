import com.google.common.collect.Lists;
import java.util.List;

public class efa {
   private static final int a = 8;
   static final efa.b b = new efa.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehf $$0, int $$1, efa.a $$2, ib $$3, List<edi> $$4, axd $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dgo $$6 = $$2.e().d();
            efa.a $$7 = efa.a($$4, efa.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 8, -1), "second_roof", $$6, false));
               efa.a($$0, efa.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 8, -1), "third_roof", $$6, true));
               efa.a($$0, efa.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<axx<dgo, ib>> c = Lists.newArrayList(
      new axx[]{new axx<>(dgo.a, new ib(1, -1, 0)), new axx<>(dgo.b, new ib(6, -1, 1)), new axx<>(dgo.d, new ib(0, -1, 5)), new axx<>(dgo.c, new ib(5, -1, 6))}
   );
   static final efa.b d = new efa.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehf $$0, int $$1, efa.a $$2, ib $$3, List<edi> $$4, axd $$5) {
         dgo $$6 = $$2.e().d();
         efa.a $$7 = efa.a($$4, efa.a($$0, $$2, new ib(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = efa.a($$4, efa.a($$0, $$7, new ib(0, 7, 0), "tower_piece", $$6, true));
         efa.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = efa.a($$4, efa.a($$0, $$7, new ib(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (axx<dgo, ib> $$11 : efa.c) {
               if ($$5.h()) {
                  efa.a $$12 = efa.a($$4, efa.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  efa.a($$0, efa.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return efa.a($$0, efa.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final efa.b e = new efa.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ehf $$0, int $$1, efa.a $$2, ib $$3, List<edi> $$4, axd $$5) {
         dgo $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         efa.a $$8 = efa.a($$4, efa.a($$0, $$2, new ib(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = efa.a($$4, efa.a($$0, $$8, new ib(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = efa.a($$4, efa.a($$0, $$8, new ib(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = efa.a($$4, efa.a($$0, $$8, new ib(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            efa.a($$4, efa.a($$0, $$8, new ib(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!efa.a($$0, efa.b, $$1 + 1, $$8, new ib(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = efa.a($$4, efa.a($$0, $$8, new ib(4, $$9, 0), "bridge_end", $$6.a(dgo.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<axx<dgo, ib>> f = Lists.newArrayList(
      new axx[]{
         new axx<>(dgo.a, new ib(4, -1, 0)), new axx<>(dgo.b, new ib(12, -1, 4)), new axx<>(dgo.d, new ib(0, -1, 8)), new axx<>(dgo.c, new ib(8, -1, 12))
      }
   );
   static final efa.b g = new efa.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ehf $$0, int $$1, efa.a $$2, ib $$3, List<edi> $$4, axd $$5) {
         dgo $$6 = $$2.e().d();
         efa.a $$7 = efa.a($$4, efa.a($$0, $$2, new ib(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = efa.a($$4, efa.a($$0, $$7, new ib(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = efa.a($$4, efa.a($$0, $$7, new ib(0, 8, 0), "fat_tower_middle", $$6, true));

            for (axx<dgo, ib> $$9 : efa.f) {
               if ($$5.h()) {
                  efa.a $$10 = efa.a($$4, efa.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  efa.a($$0, efa.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = efa.a($$4, efa.a($$0, $$7, new ib(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static efa.a a(ehf $$0, efa.a $$1, ib $$2, String $$3, dgo $$4, boolean $$5) {
      efa.a $$6 = new efa.a($$0, $$3, $$1.d(), $$4, $$5);
      ib $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), ib.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ehf $$0, ib $$1, dgo $$2, List<edi> $$3, axd $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      efa.a $$5 = a($$3, new efa.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new ib(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static efa.a a(List<edi> $$0, efa.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ehf $$0, efa.b $$1, int $$2, efa.a $$3, ib $$4, List<edi> $$5, axd $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<edi> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (edi $$10 : $$7) {
               $$10.a($$9);
               edi $$11 = edi.a($$5, $$10.f());
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

   public static class a extends edo {
      public a(ehf $$0, String $$1, ib $$2, dgo $$3, boolean $$4) {
         super(edv.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ehf $$0, ta $$1) {
         super(edv.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dgo.valueOf($$1.l("Rot"))));
      }

      private static eha a(boolean $$0, dgo $$1) {
         egg $$2 = $$0 ? egg.b : egg.d;
         return new eha().a(true).a($$2).a($$1);
      }

      @Override
      protected ajh b() {
         return a(this.a);
      }

      private static ajh a(String $$0) {
         return new ajh("end_city/" + $$0);
      }

      @Override
      protected void a(edu $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == egg.b);
      }

      @Override
      protected void a(String $$0, ib $$1, cxq $$2, axd $$3, ecw $$4) {
         if ($$0.startsWith("Chest")) {
            ib $$5 = $$1.d();
            if ($$4.b($$5)) {
               bnl.a($$2, $$3, $$5, eku.c);
            }
         } else if ($$4.b($$1) && cxb.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cgg $$6 = bpd.aK.a((cxb)$$2.E());
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cex $$7 = new cex($$2.E(), $$1, this.c.d().a(ih.d));
               $$7.a(new cqm(cqp.nS), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ehf var1, int var2, efa.a var3, ib var4, List<edi> var5, axd var6);
   }
}
