import com.google.common.collect.Lists;
import java.util.List;

public class dzs {
   static final ebe a = a(cvc.I, cvc.J, eev.aG);
   static final ebe b = a(cvc.L, cvc.M, eev.aH);
   private static final agi[] c = new agi[]{
      new agi("underwater_ruin/warm_1"),
      new agi("underwater_ruin/warm_2"),
      new agi("underwater_ruin/warm_3"),
      new agi("underwater_ruin/warm_4"),
      new agi("underwater_ruin/warm_5"),
      new agi("underwater_ruin/warm_6"),
      new agi("underwater_ruin/warm_7"),
      new agi("underwater_ruin/warm_8")
   };
   private static final agi[] d = new agi[]{
      new agi("underwater_ruin/brick_1"),
      new agi("underwater_ruin/brick_2"),
      new agi("underwater_ruin/brick_3"),
      new agi("underwater_ruin/brick_4"),
      new agi("underwater_ruin/brick_5"),
      new agi("underwater_ruin/brick_6"),
      new agi("underwater_ruin/brick_7"),
      new agi("underwater_ruin/brick_8")
   };
   private static final agi[] e = new agi[]{
      new agi("underwater_ruin/cracked_1"),
      new agi("underwater_ruin/cracked_2"),
      new agi("underwater_ruin/cracked_3"),
      new agi("underwater_ruin/cracked_4"),
      new agi("underwater_ruin/cracked_5"),
      new agi("underwater_ruin/cracked_6"),
      new agi("underwater_ruin/cracked_7"),
      new agi("underwater_ruin/cracked_8")
   };
   private static final agi[] f = new agi[]{
      new agi("underwater_ruin/mossy_1"),
      new agi("underwater_ruin/mossy_2"),
      new agi("underwater_ruin/mossy_3"),
      new agi("underwater_ruin/mossy_4"),
      new agi("underwater_ruin/mossy_5"),
      new agi("underwater_ruin/mossy_6"),
      new agi("underwater_ruin/mossy_7"),
      new agi("underwater_ruin/mossy_8")
   };
   private static final agi[] g = new agi[]{
      new agi("underwater_ruin/big_brick_1"),
      new agi("underwater_ruin/big_brick_2"),
      new agi("underwater_ruin/big_brick_3"),
      new agi("underwater_ruin/big_brick_8")
   };
   private static final agi[] h = new agi[]{
      new agi("underwater_ruin/big_mossy_1"),
      new agi("underwater_ruin/big_mossy_2"),
      new agi("underwater_ruin/big_mossy_3"),
      new agi("underwater_ruin/big_mossy_8")
   };
   private static final agi[] i = new agi[]{
      new agi("underwater_ruin/big_cracked_1"),
      new agi("underwater_ruin/big_cracked_2"),
      new agi("underwater_ruin/big_cracked_3"),
      new agi("underwater_ruin/big_cracked_8")
   };
   private static final agi[] j = new agi[]{
      new agi("underwater_ruin/big_warm_4"),
      new agi("underwater_ruin/big_warm_5"),
      new agi("underwater_ruin/big_warm_6"),
      new agi("underwater_ruin/big_warm_7")
   };

   private static ebe a(cva $$0, cva $$1, agi $$2) {
      return new ean(new eba(List.of(new eaw(new eak($$0), eaf.b, eat.b, $$1.o(), new ebl($$2)))), bhz.a(5));
   }

   private static agi a(ats $$0) {
      return ac.a(c, $$0);
   }

   private static agi b(ats $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ebi $$0, ht $$1, dbm $$2, dxm $$3, ats $$4, dzt $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ebi $$0, ats $$1, dbm $$2, ht $$3, dzt $$4, dxm $$5) {
      ht $$6 = new ht($$3.u(), 90, $$3.w());
      ht $$7 = ebh.a(new ht(15, 0, 15), czw.a, $$2, ht.b).a((iw)$$6);
      dwz $$8 = dwz.a($$6, $$7);
      ht $$9 = new ht(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ht> $$10 = a($$1, $$9);
      int $$11 = atm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ht $$14 = $$10.remove($$13);
            dbm $$15 = dbm.a($$1);
            ht $$16 = ebh.a(new ht(5, 0, 6), czw.a, $$15, ht.b).a((iw)$$14);
            dwz $$17 = dwz.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ht> a(ats $$0, ht $$1) {
      List<ht> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + atm.a($$0, 1, 8), 0, 16 + atm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + atm.a($$0, 1, 8), 0, atm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + atm.a($$0, 1, 8), 0, -16 + atm.a($$0, 4, 8)));
      $$2.add($$1.b(atm.a($$0, 1, 7), 0, 16 + atm.a($$0, 1, 7)));
      $$2.add($$1.b(atm.a($$0, 1, 7), 0, -16 + atm.a($$0, 4, 6)));
      $$2.add($$1.b(16 + atm.a($$0, 1, 7), 0, 16 + atm.a($$0, 3, 8)));
      $$2.add($$1.b(16 + atm.a($$0, 1, 7), 0, atm.a($$0, 1, 7)));
      $$2.add($$1.b(16 + atm.a($$0, 1, 7), 0, -16 + atm.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ebi $$0, ht $$1, dbm $$2, dxm $$3, ats $$4, dzt $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            agi $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dzs.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            agi[] $$9 = $$6 ? g : d;
            agi[] $$10 = $$6 ? i : e;
            agi[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dzs.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dzs.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dzs.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dxr {
      private final dzt.a h;
      private final float i;
      private final boolean j;

      public a(ebi $$0, agi $$1, ht $$2, dbm $$3, float $$4, dzt.a $$5, boolean $$6) {
         super(dxy.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ebi $$0, rz $$1, dbm $$2, float $$3, dzt.a $$4, boolean $$5) {
         super(dxy.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ebd a(dbm $$0, float $$1, dzt.a $$2) {
         ebe $$3 = $$2 == dzt.a.b ? dzs.b : dzs.a;
         return new ebd().a($$0).a(czw.a).a(new eal($$1)).a(eaj.d).a($$3);
      }

      public static dzs.a a(ebi $$0, rz $$1) {
         dbm $$2 = dbm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dzt.a $$4 = dzt.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dzs.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cvc.cv.o().a(cwd.e, Boolean.valueOf($$2.b_($$1).a(arl.a))), 2);
            dfd $$5 = $$2.c_($$1);
            if ($$5 instanceof dfk) {
               ((dfk)$$5).a(this.j ? eev.F : eev.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            caw $$6 = bku.y.a((csa)$$2.D());
            if ($$6 != null) {
               $$6.fK();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), blk.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, cvc.a.o(), 2);
               } else {
                  $$2.a($$1, cvc.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
         int $$7 = $$0.a(dmr.a.c, this.d.u(), this.d.w());
         this.d = new ht(this.d.u(), $$7, this.d.w());
         ht $$8 = ebh.a(new ht(this.b.a().u() - 1, 0, this.b.a().w() - 1), czw.a, this.c.d(), ht.b).a((iw)this.d);
         this.d = new ht(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ht $$0, crg $$1, ht $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ht $$7 : ht.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ht.a $$11 = new ht.a($$8, $$10, $$9);
            dhi $$12 = $$1.a_($$11);

            for (ecs $$13 = $$1.b_($$11); ($$12.i() || $$13.a(arl.a) || $$12.a(arg.al)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
               $$11.d($$8, --$$10, $$9);
               $$12 = $$1.a_($$11);
            }

            $$4 = Math.min($$4, $$10);
            if ($$10 < $$5 - 2) {
               $$6++;
            }
         }

         int $$14 = Math.abs($$0.u() - $$2.u());
         if ($$5 - $$4 > 2 && $$6 > $$14 - 2) {
            $$3 = $$4 + 1;
         }

         return $$3;
      }
   }
}
