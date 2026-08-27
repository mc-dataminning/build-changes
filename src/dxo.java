import com.google.common.collect.Lists;
import java.util.List;

public class dxo {
   static final dza a = a(csy.I, csy.J, ecq.aG);
   static final dza b = a(csy.L, csy.M, ecq.aH);
   private static final aey[] c = new aey[]{
      new aey("underwater_ruin/warm_1"),
      new aey("underwater_ruin/warm_2"),
      new aey("underwater_ruin/warm_3"),
      new aey("underwater_ruin/warm_4"),
      new aey("underwater_ruin/warm_5"),
      new aey("underwater_ruin/warm_6"),
      new aey("underwater_ruin/warm_7"),
      new aey("underwater_ruin/warm_8")
   };
   private static final aey[] d = new aey[]{
      new aey("underwater_ruin/brick_1"),
      new aey("underwater_ruin/brick_2"),
      new aey("underwater_ruin/brick_3"),
      new aey("underwater_ruin/brick_4"),
      new aey("underwater_ruin/brick_5"),
      new aey("underwater_ruin/brick_6"),
      new aey("underwater_ruin/brick_7"),
      new aey("underwater_ruin/brick_8")
   };
   private static final aey[] e = new aey[]{
      new aey("underwater_ruin/cracked_1"),
      new aey("underwater_ruin/cracked_2"),
      new aey("underwater_ruin/cracked_3"),
      new aey("underwater_ruin/cracked_4"),
      new aey("underwater_ruin/cracked_5"),
      new aey("underwater_ruin/cracked_6"),
      new aey("underwater_ruin/cracked_7"),
      new aey("underwater_ruin/cracked_8")
   };
   private static final aey[] f = new aey[]{
      new aey("underwater_ruin/mossy_1"),
      new aey("underwater_ruin/mossy_2"),
      new aey("underwater_ruin/mossy_3"),
      new aey("underwater_ruin/mossy_4"),
      new aey("underwater_ruin/mossy_5"),
      new aey("underwater_ruin/mossy_6"),
      new aey("underwater_ruin/mossy_7"),
      new aey("underwater_ruin/mossy_8")
   };
   private static final aey[] g = new aey[]{
      new aey("underwater_ruin/big_brick_1"),
      new aey("underwater_ruin/big_brick_2"),
      new aey("underwater_ruin/big_brick_3"),
      new aey("underwater_ruin/big_brick_8")
   };
   private static final aey[] h = new aey[]{
      new aey("underwater_ruin/big_mossy_1"),
      new aey("underwater_ruin/big_mossy_2"),
      new aey("underwater_ruin/big_mossy_3"),
      new aey("underwater_ruin/big_mossy_8")
   };
   private static final aey[] i = new aey[]{
      new aey("underwater_ruin/big_cracked_1"),
      new aey("underwater_ruin/big_cracked_2"),
      new aey("underwater_ruin/big_cracked_3"),
      new aey("underwater_ruin/big_cracked_8")
   };
   private static final aey[] j = new aey[]{
      new aey("underwater_ruin/big_warm_4"),
      new aey("underwater_ruin/big_warm_5"),
      new aey("underwater_ruin/big_warm_6"),
      new aey("underwater_ruin/big_warm_7")
   };

   private static dza a(csx $$0, csx $$1, aey $$2) {
      return new dyj(new dyw(List.of(new dys(new dyg($$0), dyb.b, dyp.b, $$1.n(), new dzh($$2)))), bgc.a(5));
   }

   private static aey a(ase $$0) {
      return ac.a(c, $$0);
   }

   private static aey b(ase $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dze $$0, gw $$1, czj $$2, dvp $$3, ase $$4, dxp $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dze $$0, ase $$1, czj $$2, gw $$3, dxp $$4, dvp $$5) {
      gw $$6 = new gw($$3.u(), 90, $$3.w());
      gw $$7 = dzd.a(new gw(15, 0, 15), cxs.a, $$2, gw.b).a((ib)$$6);
      dvc $$8 = dvc.a($$6, $$7);
      gw $$9 = new gw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gw> $$10 = a($$1, $$9);
      int $$11 = ary.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gw $$14 = $$10.remove($$13);
            czj $$15 = czj.a($$1);
            gw $$16 = dzd.a(new gw(5, 0, 6), cxs.a, $$15, gw.b).a((ib)$$14);
            dvc $$17 = dvc.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gw> a(ase $$0, gw $$1) {
      List<gw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ary.a($$0, 1, 8), 0, 16 + ary.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ary.a($$0, 1, 8), 0, ary.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ary.a($$0, 1, 8), 0, -16 + ary.a($$0, 4, 8)));
      $$2.add($$1.b(ary.a($$0, 1, 7), 0, 16 + ary.a($$0, 1, 7)));
      $$2.add($$1.b(ary.a($$0, 1, 7), 0, -16 + ary.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ary.a($$0, 1, 7), 0, 16 + ary.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ary.a($$0, 1, 7), 0, ary.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ary.a($$0, 1, 7), 0, -16 + ary.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dze $$0, gw $$1, czj $$2, dvp $$3, ase $$4, dxp $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aey $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxo.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aey[] $$9 = $$6 ? g : d;
            aey[] $$10 = $$6 ? i : e;
            aey[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxo.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxo.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxo.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvu {
      private final dxp.a h;
      private final float i;
      private final boolean j;

      public a(dze $$0, aey $$1, gw $$2, czj $$3, float $$4, dxp.a $$5, boolean $$6) {
         super(dwb.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dze $$0, qy $$1, czj $$2, float $$3, dxp.a $$4, boolean $$5) {
         super(dwb.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dyz a(czj $$0, float $$1, dxp.a $$2) {
         dza $$3 = $$2 == dxp.a.b ? dxo.b : dxo.a;
         return new dyz().a($$0).a(cxs.a).a(new dyh($$1)).a(dyf.d).a($$3);
      }

      public static dxo.a a(dze $$0, qy $$1) {
         czj $$2 = czj.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxp.a $$4 = dxp.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxo.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csy.cv.n().a(ctz.d, Boolean.valueOf($$2.b_($$1).a(apz.a))), 2);
            dcx $$5 = $$2.c_($$1);
            if ($$5 instanceof dde) {
               ((dde)$$5).a(this.j ? ecq.F : ecq.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            byy $$6 = biw.y.a((cpx)$$2.C());
            if ($$6 != null) {
               $$6.fI();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bjm.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.y_()) {
                  $$2.a($$1, csy.a.n(), 2);
               } else {
                  $$2.a($$1, csy.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         int $$7 = $$0.a(dku.a.c, this.d.u(), this.d.w());
         this.d = new gw(this.d.u(), $$7, this.d.w());
         gw $$8 = dzd.a(new gw(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxs.a, this.c.d(), gw.b).a((ib)this.d);
         this.d = new gw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gw $$0, cpd $$1, gw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gw $$7 : gw.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gw.a $$11 = new gw.a($$8, $$10, $$9);
            dfl $$12 = $$1.a_($$11);

            for (eao $$13 = $$1.b_($$11); ($$12.i() || $$13.a(apz.a) || $$12.a(apu.al)) && $$10 > $$1.H_() + 1; $$13 = $$1.b_($$11)) {
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
