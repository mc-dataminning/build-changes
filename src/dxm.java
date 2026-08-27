import com.google.common.collect.Lists;
import java.util.List;

public class dxm {
   static final dyy a = a(csw.I, csw.J, eco.aG);
   static final dyy b = a(csw.L, csw.M, eco.aH);
   private static final aex[] c = new aex[]{
      new aex("underwater_ruin/warm_1"),
      new aex("underwater_ruin/warm_2"),
      new aex("underwater_ruin/warm_3"),
      new aex("underwater_ruin/warm_4"),
      new aex("underwater_ruin/warm_5"),
      new aex("underwater_ruin/warm_6"),
      new aex("underwater_ruin/warm_7"),
      new aex("underwater_ruin/warm_8")
   };
   private static final aex[] d = new aex[]{
      new aex("underwater_ruin/brick_1"),
      new aex("underwater_ruin/brick_2"),
      new aex("underwater_ruin/brick_3"),
      new aex("underwater_ruin/brick_4"),
      new aex("underwater_ruin/brick_5"),
      new aex("underwater_ruin/brick_6"),
      new aex("underwater_ruin/brick_7"),
      new aex("underwater_ruin/brick_8")
   };
   private static final aex[] e = new aex[]{
      new aex("underwater_ruin/cracked_1"),
      new aex("underwater_ruin/cracked_2"),
      new aex("underwater_ruin/cracked_3"),
      new aex("underwater_ruin/cracked_4"),
      new aex("underwater_ruin/cracked_5"),
      new aex("underwater_ruin/cracked_6"),
      new aex("underwater_ruin/cracked_7"),
      new aex("underwater_ruin/cracked_8")
   };
   private static final aex[] f = new aex[]{
      new aex("underwater_ruin/mossy_1"),
      new aex("underwater_ruin/mossy_2"),
      new aex("underwater_ruin/mossy_3"),
      new aex("underwater_ruin/mossy_4"),
      new aex("underwater_ruin/mossy_5"),
      new aex("underwater_ruin/mossy_6"),
      new aex("underwater_ruin/mossy_7"),
      new aex("underwater_ruin/mossy_8")
   };
   private static final aex[] g = new aex[]{
      new aex("underwater_ruin/big_brick_1"),
      new aex("underwater_ruin/big_brick_2"),
      new aex("underwater_ruin/big_brick_3"),
      new aex("underwater_ruin/big_brick_8")
   };
   private static final aex[] h = new aex[]{
      new aex("underwater_ruin/big_mossy_1"),
      new aex("underwater_ruin/big_mossy_2"),
      new aex("underwater_ruin/big_mossy_3"),
      new aex("underwater_ruin/big_mossy_8")
   };
   private static final aex[] i = new aex[]{
      new aex("underwater_ruin/big_cracked_1"),
      new aex("underwater_ruin/big_cracked_2"),
      new aex("underwater_ruin/big_cracked_3"),
      new aex("underwater_ruin/big_cracked_8")
   };
   private static final aex[] j = new aex[]{
      new aex("underwater_ruin/big_warm_4"),
      new aex("underwater_ruin/big_warm_5"),
      new aex("underwater_ruin/big_warm_6"),
      new aex("underwater_ruin/big_warm_7")
   };

   private static dyy a(csv $$0, csv $$1, aex $$2) {
      return new dyh(new dyu(List.of(new dyq(new dye($$0), dxz.b, dyn.b, $$1.n(), new dzf($$2)))), bga.a(5));
   }

   private static aex a(asc $$0) {
      return ac.a(c, $$0);
   }

   private static aex b(asc $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dzc $$0, gw $$1, czh $$2, dvn $$3, asc $$4, dxn $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dzc $$0, asc $$1, czh $$2, gw $$3, dxn $$4, dvn $$5) {
      gw $$6 = new gw($$3.u(), 90, $$3.w());
      gw $$7 = dzb.a(new gw(15, 0, 15), cxq.a, $$2, gw.b).a((ib)$$6);
      dva $$8 = dva.a($$6, $$7);
      gw $$9 = new gw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gw> $$10 = a($$1, $$9);
      int $$11 = arx.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gw $$14 = $$10.remove($$13);
            czh $$15 = czh.a($$1);
            gw $$16 = dzb.a(new gw(5, 0, 6), cxq.a, $$15, gw.b).a((ib)$$14);
            dva $$17 = dva.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gw> a(asc $$0, gw $$1) {
      List<gw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + arx.a($$0, 1, 8), 0, 16 + arx.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + arx.a($$0, 1, 8), 0, arx.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + arx.a($$0, 1, 8), 0, -16 + arx.a($$0, 4, 8)));
      $$2.add($$1.b(arx.a($$0, 1, 7), 0, 16 + arx.a($$0, 1, 7)));
      $$2.add($$1.b(arx.a($$0, 1, 7), 0, -16 + arx.a($$0, 4, 6)));
      $$2.add($$1.b(16 + arx.a($$0, 1, 7), 0, 16 + arx.a($$0, 3, 8)));
      $$2.add($$1.b(16 + arx.a($$0, 1, 7), 0, arx.a($$0, 1, 7)));
      $$2.add($$1.b(16 + arx.a($$0, 1, 7), 0, -16 + arx.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dzc $$0, gw $$1, czh $$2, dvn $$3, asc $$4, dxn $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aex $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxm.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aex[] $$9 = $$6 ? g : d;
            aex[] $$10 = $$6 ? i : e;
            aex[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxm.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxm.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxm.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvs {
      private final dxn.a h;
      private final float i;
      private final boolean j;

      public a(dzc $$0, aex $$1, gw $$2, czh $$3, float $$4, dxn.a $$5, boolean $$6) {
         super(dvz.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dzc $$0, qy $$1, czh $$2, float $$3, dxn.a $$4, boolean $$5) {
         super(dvz.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dyx a(czh $$0, float $$1, dxn.a $$2) {
         dyy $$3 = $$2 == dxn.a.b ? dxm.b : dxm.a;
         return new dyx().a($$0).a(cxq.a).a(new dyf($$1)).a(dyd.d).a($$3);
      }

      public static dxm.a a(dzc $$0, qy $$1) {
         czh $$2 = czh.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxn.a $$4 = dxn.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxm.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dvy $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csw.cv.n().a(ctx.d, Boolean.valueOf($$2.b_($$1).a(apy.a))), 2);
            dcv $$5 = $$2.c_($$1);
            if ($$5 instanceof ddc) {
               ((ddc)$$5).a(this.j ? eco.F : eco.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            byw $$6 = biu.y.a((cpv)$$2.C());
            if ($$6 != null) {
               $$6.fI();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bjk.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.y_()) {
                  $$2.a($$1, csw.a.n(), 2);
               } else {
                  $$2.a($$1, csw.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
         int $$7 = $$0.a(dks.a.c, this.d.u(), this.d.w());
         this.d = new gw(this.d.u(), $$7, this.d.w());
         gw $$8 = dzb.a(new gw(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxq.a, this.c.d(), gw.b).a((ib)this.d);
         this.d = new gw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gw $$0, cpb $$1, gw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gw $$7 : gw.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gw.a $$11 = new gw.a($$8, $$10, $$9);
            dfj $$12 = $$1.a_($$11);

            for (eam $$13 = $$1.b_($$11); ($$12.i() || $$13.a(apy.a) || $$12.a(apt.al)) && $$10 > $$1.H_() + 1; $$13 = $$1.b_($$11)) {
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
