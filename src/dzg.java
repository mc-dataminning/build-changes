import com.google.common.collect.Lists;
import java.util.List;

public class dzg {
   static final eas a = a(cuv.I, cuv.J, eej.aG);
   static final eas b = a(cuv.L, cuv.M, eej.aH);
   private static final agg[] c = new agg[]{
      new agg("underwater_ruin/warm_1"),
      new agg("underwater_ruin/warm_2"),
      new agg("underwater_ruin/warm_3"),
      new agg("underwater_ruin/warm_4"),
      new agg("underwater_ruin/warm_5"),
      new agg("underwater_ruin/warm_6"),
      new agg("underwater_ruin/warm_7"),
      new agg("underwater_ruin/warm_8")
   };
   private static final agg[] d = new agg[]{
      new agg("underwater_ruin/brick_1"),
      new agg("underwater_ruin/brick_2"),
      new agg("underwater_ruin/brick_3"),
      new agg("underwater_ruin/brick_4"),
      new agg("underwater_ruin/brick_5"),
      new agg("underwater_ruin/brick_6"),
      new agg("underwater_ruin/brick_7"),
      new agg("underwater_ruin/brick_8")
   };
   private static final agg[] e = new agg[]{
      new agg("underwater_ruin/cracked_1"),
      new agg("underwater_ruin/cracked_2"),
      new agg("underwater_ruin/cracked_3"),
      new agg("underwater_ruin/cracked_4"),
      new agg("underwater_ruin/cracked_5"),
      new agg("underwater_ruin/cracked_6"),
      new agg("underwater_ruin/cracked_7"),
      new agg("underwater_ruin/cracked_8")
   };
   private static final agg[] f = new agg[]{
      new agg("underwater_ruin/mossy_1"),
      new agg("underwater_ruin/mossy_2"),
      new agg("underwater_ruin/mossy_3"),
      new agg("underwater_ruin/mossy_4"),
      new agg("underwater_ruin/mossy_5"),
      new agg("underwater_ruin/mossy_6"),
      new agg("underwater_ruin/mossy_7"),
      new agg("underwater_ruin/mossy_8")
   };
   private static final agg[] g = new agg[]{
      new agg("underwater_ruin/big_brick_1"),
      new agg("underwater_ruin/big_brick_2"),
      new agg("underwater_ruin/big_brick_3"),
      new agg("underwater_ruin/big_brick_8")
   };
   private static final agg[] h = new agg[]{
      new agg("underwater_ruin/big_mossy_1"),
      new agg("underwater_ruin/big_mossy_2"),
      new agg("underwater_ruin/big_mossy_3"),
      new agg("underwater_ruin/big_mossy_8")
   };
   private static final agg[] i = new agg[]{
      new agg("underwater_ruin/big_cracked_1"),
      new agg("underwater_ruin/big_cracked_2"),
      new agg("underwater_ruin/big_cracked_3"),
      new agg("underwater_ruin/big_cracked_8")
   };
   private static final agg[] j = new agg[]{
      new agg("underwater_ruin/big_warm_4"),
      new agg("underwater_ruin/big_warm_5"),
      new agg("underwater_ruin/big_warm_6"),
      new agg("underwater_ruin/big_warm_7")
   };

   private static eas a(cut $$0, cut $$1, agg $$2) {
      return new eab(new eao(List.of(new eak(new dzy($$0), dzt.b, eah.b, $$1.o(), new eaz($$2)))), bhs.a(5));
   }

   private static agg a(ato $$0) {
      return ac.a(c, $$0);
   }

   private static agg b(ato $$0) {
      return ac.a(j, $$0);
   }

   public static void a(eaw $$0, ht $$1, dbf $$2, dxa $$3, ato $$4, dzh $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eaw $$0, ato $$1, dbf $$2, ht $$3, dzh $$4, dxa $$5) {
      ht $$6 = new ht($$3.u(), 90, $$3.w());
      ht $$7 = eav.a(new ht(15, 0, 15), czp.a, $$2, ht.b).a((iw)$$6);
      dwn $$8 = dwn.a($$6, $$7);
      ht $$9 = new ht(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ht> $$10 = a($$1, $$9);
      int $$11 = ati.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ht $$14 = $$10.remove($$13);
            dbf $$15 = dbf.a($$1);
            ht $$16 = eav.a(new ht(5, 0, 6), czp.a, $$15, ht.b).a((iw)$$14);
            dwn $$17 = dwn.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ht> a(ato $$0, ht $$1) {
      List<ht> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ati.a($$0, 1, 8), 0, 16 + ati.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ati.a($$0, 1, 8), 0, ati.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ati.a($$0, 1, 8), 0, -16 + ati.a($$0, 4, 8)));
      $$2.add($$1.b(ati.a($$0, 1, 7), 0, 16 + ati.a($$0, 1, 7)));
      $$2.add($$1.b(ati.a($$0, 1, 7), 0, -16 + ati.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ati.a($$0, 1, 7), 0, 16 + ati.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ati.a($$0, 1, 7), 0, ati.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ati.a($$0, 1, 7), 0, -16 + ati.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eaw $$0, ht $$1, dbf $$2, dxa $$3, ato $$4, dzh $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            agg $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dzg.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            agg[] $$9 = $$6 ? g : d;
            agg[] $$10 = $$6 ? i : e;
            agg[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dzg.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dzg.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dzg.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dxf {
      private final dzh.a h;
      private final float i;
      private final boolean j;

      public a(eaw $$0, agg $$1, ht $$2, dbf $$3, float $$4, dzh.a $$5, boolean $$6) {
         super(dxm.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eaw $$0, rz $$1, dbf $$2, float $$3, dzh.a $$4, boolean $$5) {
         super(dxm.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ear a(dbf $$0, float $$1, dzh.a $$2) {
         eas $$3 = $$2 == dzh.a.b ? dzg.b : dzg.a;
         return new ear().a($$0).a(czp.a).a(new dzz($$1)).a(dzx.d).a($$3);
      }

      public static dzg.a a(eaw $$0, rz $$1) {
         dbf $$2 = dbf.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dzh.a $$4 = dzh.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dzg.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cuv.cv.o().a(cvw.e, Boolean.valueOf($$2.b_($$1).a(arh.a))), 2);
            der $$5 = $$2.c_($$1);
            if ($$5 instanceof dey) {
               ((dey)$$5).a(this.j ? eej.F : eej.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cao $$6 = bkm.y.a((crs)$$2.C());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), blc.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, cuv.a.o(), 2);
               } else {
                  $$2.a($$1, cuv.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         int $$7 = $$0.a(dmf.a.c, this.d.u(), this.d.w());
         this.d = new ht(this.d.u(), $$7, this.d.w());
         ht $$8 = eav.a(new ht(this.b.a().u() - 1, 0, this.b.a().w() - 1), czp.a, this.c.d(), ht.b).a((iw)this.d);
         this.d = new ht(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ht $$0, cqy $$1, ht $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ht $$7 : ht.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ht.a $$11 = new ht.a($$8, $$10, $$9);
            dgw $$12 = $$1.a_($$11);

            for (ecg $$13 = $$1.b_($$11); ($$12.i() || $$13.a(arh.a) || $$12.a(arc.al)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
