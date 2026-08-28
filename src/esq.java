import com.google.common.collect.Lists;
import java.util.List;

public class esq {
   private static final int a = 8;
   static final esq.b b = new esq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(euw $$0, int $$1, esq.a $$2, iu $$3, List<eqx> $$4, azv $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dst $$6 = $$2.e().d();
            esq.a $$7 = esq.a($$4, esq.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 8, -1), "second_roof", $$6, false));
               esq.a($$0, esq.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 8, -1), "third_roof", $$6, true));
               esq.a($$0, esq.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bat<dst, iu>> c = Lists.newArrayList(
      new bat[]{new bat<>(dst.a, new iu(1, -1, 0)), new bat<>(dst.b, new iu(6, -1, 1)), new bat<>(dst.d, new iu(0, -1, 5)), new bat<>(dst.c, new iu(5, -1, 6))}
   );
   static final esq.b d = new esq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(euw $$0, int $$1, esq.a $$2, iu $$3, List<eqx> $$4, azv $$5) {
         dst $$6 = $$2.e().d();
         esq.a $$7 = esq.a($$4, esq.a($$0, $$2, new iu(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = esq.a($$4, esq.a($$0, $$7, new iu(0, 7, 0), "tower_piece", $$6, true));
         esq.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = esq.a($$4, esq.a($$0, $$7, new iu(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bat<dst, iu> $$11 : esq.c) {
               if ($$5.h()) {
                  esq.a $$12 = esq.a($$4, esq.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  esq.a($$0, esq.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return esq.a($$0, esq.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final esq.b e = new esq.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(euw $$0, int $$1, esq.a $$2, iu $$3, List<eqx> $$4, azv $$5) {
         dst $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         esq.a $$8 = esq.a($$4, esq.a($$0, $$2, new iu(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = esq.a($$4, esq.a($$0, $$8, new iu(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = esq.a($$4, esq.a($$0, $$8, new iu(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = esq.a($$4, esq.a($$0, $$8, new iu(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            esq.a($$4, esq.a($$0, $$8, new iu(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!esq.a($$0, esq.b, $$1 + 1, $$8, new iu(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = esq.a($$4, esq.a($$0, $$8, new iu(4, $$9, 0), "bridge_end", $$6.a(dst.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bat<dst, iu>> f = Lists.newArrayList(
      new bat[]{
         new bat<>(dst.a, new iu(4, -1, 0)), new bat<>(dst.b, new iu(12, -1, 4)), new bat<>(dst.d, new iu(0, -1, 8)), new bat<>(dst.c, new iu(8, -1, 12))
      }
   );
   static final esq.b g = new esq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(euw $$0, int $$1, esq.a $$2, iu $$3, List<eqx> $$4, azv $$5) {
         dst $$6 = $$2.e().d();
         esq.a $$7 = esq.a($$4, esq.a($$0, $$2, new iu(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = esq.a($$4, esq.a($$0, $$7, new iu(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = esq.a($$4, esq.a($$0, $$7, new iu(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bat<dst, iu> $$9 : esq.f) {
               if ($$5.h()) {
                  esq.a $$10 = esq.a($$4, esq.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  esq.a($$0, esq.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = esq.a($$4, esq.a($$0, $$7, new iu(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static esq.a a(euw $$0, esq.a $$1, iu $$2, String $$3, dst $$4, boolean $$5) {
      esq.a $$6 = new esq.a($$0, $$3, $$1.d(), $$4, $$5);
      iu $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), iu.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(euw $$0, iu $$1, dst $$2, List<eqx> $$3, azv $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      esq.a $$5 = a($$3, new esq.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new iu(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static esq.a a(List<eqx> $$0, esq.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(euw $$0, esq.b $$1, int $$2, esq.a $$3, iu $$4, List<eqx> $$5, azv $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<eqx> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (eqx $$10 : $$7) {
               $$10.a($$9);
               eqx $$11 = eqx.a($$5, $$10.f());
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

   public static class a extends erd {
      public a(euw $$0, String $$1, iu $$2, dst $$3, boolean $$4) {
         super(erk.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(euw $$0, tz $$1) {
         super(erk.Y, $$1, $$0, $$1x -> a($$1.q("OW"), dst.valueOf($$1.l("Rot"))));
      }

      private static eur a(boolean $$0, dst $$1) {
         etw $$2 = $$0 ? etw.b : etw.d;
         return new eur().a(true).a($$2).a($$1);
      }

      @Override
      protected alg b() {
         return a(this.a);
      }

      private static alg a(String $$0) {
         return alg.b("end_city/" + $$0);
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == etw.b);
      }

      @Override
      protected void a(String $$0, iu $$1, djm $$2, azv $$3, eql $$4) {
         if ($$0.startsWith("Chest")) {
            iu $$5 = $$1.e();
            if ($$4.b($$5)) {
               buh.a($$2, $$3, $$5, eyv.b);
            }
         } else if ($$4.b($$1) && div.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               cof $$6 = bwm.bc.a($$2.a(), bwl.d);
               if ($$6 != null) {
                  $$6.a_((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cmw $$7 = new cmw($$2.a(), $$1, this.c.d().a(ja.d));
               $$7.a(new cyy(czc.oA), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(euw var1, int var2, esq.a var3, iu var4, List<eqx> var5, azv var6);
   }
}
