import com.google.common.collect.Lists;
import java.util.List;

public class eml {
   private static final int a = 8;
   static final eml.b b = new eml.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eor $$0, int $$1, eml.a $$2, je $$3, List<eks> $$4, azk $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dnj $$6 = $$2.e().d();
            eml.a $$7 = eml.a($$4, eml.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 8, -1), "second_roof", $$6, false));
               eml.a($$0, eml.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 8, -1), "third_roof", $$6, true));
               eml.a($$0, eml.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bag<dnj, je>> c = Lists.newArrayList(
      new bag[]{new bag<>(dnj.a, new je(1, -1, 0)), new bag<>(dnj.b, new je(6, -1, 1)), new bag<>(dnj.d, new je(0, -1, 5)), new bag<>(dnj.c, new je(5, -1, 6))}
   );
   static final eml.b d = new eml.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eor $$0, int $$1, eml.a $$2, je $$3, List<eks> $$4, azk $$5) {
         dnj $$6 = $$2.e().d();
         eml.a $$7 = eml.a($$4, eml.a($$0, $$2, new je(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = eml.a($$4, eml.a($$0, $$7, new je(0, 7, 0), "tower_piece", $$6, true));
         eml.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = eml.a($$4, eml.a($$0, $$7, new je(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bag<dnj, je> $$11 : eml.c) {
               if ($$5.h()) {
                  eml.a $$12 = eml.a($$4, eml.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  eml.a($$0, eml.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return eml.a($$0, eml.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = eml.a($$4, eml.a($$0, $$7, new je(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final eml.b e = new eml.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(eor $$0, int $$1, eml.a $$2, je $$3, List<eks> $$4, azk $$5) {
         dnj $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         eml.a $$8 = eml.a($$4, eml.a($$0, $$2, new je(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = eml.a($$4, eml.a($$0, $$8, new je(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = eml.a($$4, eml.a($$0, $$8, new je(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = eml.a($$4, eml.a($$0, $$8, new je(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            eml.a($$4, eml.a($$0, $$8, new je(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!eml.a($$0, eml.b, $$1 + 1, $$8, new je(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = eml.a($$4, eml.a($$0, $$8, new je(4, $$9, 0), "bridge_end", $$6.a(dnj.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bag<dnj, je>> f = Lists.newArrayList(
      new bag[]{
         new bag<>(dnj.a, new je(4, -1, 0)), new bag<>(dnj.b, new je(12, -1, 4)), new bag<>(dnj.d, new je(0, -1, 8)), new bag<>(dnj.c, new je(8, -1, 12))
      }
   );
   static final eml.b g = new eml.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(eor $$0, int $$1, eml.a $$2, je $$3, List<eks> $$4, azk $$5) {
         dnj $$6 = $$2.e().d();
         eml.a $$7 = eml.a($$4, eml.a($$0, $$2, new je(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = eml.a($$4, eml.a($$0, $$7, new je(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = eml.a($$4, eml.a($$0, $$7, new je(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bag<dnj, je> $$9 : eml.f) {
               if ($$5.h()) {
                  eml.a $$10 = eml.a($$4, eml.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  eml.a($$0, eml.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = eml.a($$4, eml.a($$0, $$7, new je(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static eml.a a(eor $$0, eml.a $$1, je $$2, String $$3, dnj $$4, boolean $$5) {
      eml.a $$6 = new eml.a($$0, $$3, $$1.d(), $$4, $$5);
      je $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), je.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(eor $$0, je $$1, dnj $$2, List<eks> $$3, azk $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      eml.a $$5 = a($$3, new eml.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new je(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new je(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new je(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static eml.a a(List<eks> $$0, eml.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(eor $$0, eml.b $$1, int $$2, eml.a $$3, je $$4, List<eks> $$5, azk $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eks> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eks $$10 : $$7) {
               $$10.a($$9);
               eks $$11 = eks.a($$5, $$10.f());
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

   public static class a extends eky {
      public a(eor $$0, String $$1, je $$2, dnj $$3, boolean $$4) {
         super(elf.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(eor $$0, uf $$1) {
         super(elf.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dnj.valueOf($$1.l("Rot"))));
      }

      private static eom a(boolean $$0, dnj $$1) {
         enr $$2 = $$0 ? enr.b : enr.d;
         return new eom().a(true).a($$2).a($$1);
      }

      @Override
      protected alb b() {
         return a(this.a);
      }

      private static alb a(String $$0) {
         return alb.b("end_city/" + $$0);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == enr.b);
      }

      @Override
      protected void a(String $$0, je $$1, dei $$2, azk $$3, ekg $$4) {
         if ($$0.startsWith("Chest")) {
            je $$5 = $$1.e();
            if ($$4.b($$5)) {
               brq.a($$2, $$3, $$5, esp.c);
            }
         } else if ($$4.b($$1) && dds.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               clb $$6 = btq.aK.a($$2.E(), btp.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cjs $$7 = new cjs($$2.E(), $$1, this.c.d().a(jj.d));
               $$7.a(new cvl(cvo.nU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(eor var1, int var2, eml.a var3, je var4, List<eks> var5, azk var6);
   }
}
