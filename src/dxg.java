import com.google.common.collect.Lists;
import java.util.List;

public class dxg {
   static final dys a = a(cte.I, cte.J, eci.aG);
   static final dys b = a(cte.L, cte.M, eci.aH);
   private static final aez[] c = new aez[]{
      new aez("underwater_ruin/warm_1"),
      new aez("underwater_ruin/warm_2"),
      new aez("underwater_ruin/warm_3"),
      new aez("underwater_ruin/warm_4"),
      new aez("underwater_ruin/warm_5"),
      new aez("underwater_ruin/warm_6"),
      new aez("underwater_ruin/warm_7"),
      new aez("underwater_ruin/warm_8")
   };
   private static final aez[] d = new aez[]{
      new aez("underwater_ruin/brick_1"),
      new aez("underwater_ruin/brick_2"),
      new aez("underwater_ruin/brick_3"),
      new aez("underwater_ruin/brick_4"),
      new aez("underwater_ruin/brick_5"),
      new aez("underwater_ruin/brick_6"),
      new aez("underwater_ruin/brick_7"),
      new aez("underwater_ruin/brick_8")
   };
   private static final aez[] e = new aez[]{
      new aez("underwater_ruin/cracked_1"),
      new aez("underwater_ruin/cracked_2"),
      new aez("underwater_ruin/cracked_3"),
      new aez("underwater_ruin/cracked_4"),
      new aez("underwater_ruin/cracked_5"),
      new aez("underwater_ruin/cracked_6"),
      new aez("underwater_ruin/cracked_7"),
      new aez("underwater_ruin/cracked_8")
   };
   private static final aez[] f = new aez[]{
      new aez("underwater_ruin/mossy_1"),
      new aez("underwater_ruin/mossy_2"),
      new aez("underwater_ruin/mossy_3"),
      new aez("underwater_ruin/mossy_4"),
      new aez("underwater_ruin/mossy_5"),
      new aez("underwater_ruin/mossy_6"),
      new aez("underwater_ruin/mossy_7"),
      new aez("underwater_ruin/mossy_8")
   };
   private static final aez[] g = new aez[]{
      new aez("underwater_ruin/big_brick_1"),
      new aez("underwater_ruin/big_brick_2"),
      new aez("underwater_ruin/big_brick_3"),
      new aez("underwater_ruin/big_brick_8")
   };
   private static final aez[] h = new aez[]{
      new aez("underwater_ruin/big_mossy_1"),
      new aez("underwater_ruin/big_mossy_2"),
      new aez("underwater_ruin/big_mossy_3"),
      new aez("underwater_ruin/big_mossy_8")
   };
   private static final aez[] i = new aez[]{
      new aez("underwater_ruin/big_cracked_1"),
      new aez("underwater_ruin/big_cracked_2"),
      new aez("underwater_ruin/big_cracked_3"),
      new aez("underwater_ruin/big_cracked_8")
   };
   private static final aez[] j = new aez[]{
      new aez("underwater_ruin/big_warm_4"),
      new aez("underwater_ruin/big_warm_5"),
      new aez("underwater_ruin/big_warm_6"),
      new aez("underwater_ruin/big_warm_7")
   };

   private static dys a(ctc $$0, ctc $$1, aez $$2) {
      return new dyb(new dyo(List.of(new dyk(new dxy($$0), dxt.b, dyh.b, $$1.o(), new dyz($$2)))), bgg.a(5));
   }

   private static aez a(ash $$0) {
      return ac.a(c, $$0);
   }

   private static aez b(ash $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dyw $$0, gw $$1, czn $$2, dvh $$3, ash $$4, dxh $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dyw $$0, ash $$1, czn $$2, gw $$3, dxh $$4, dvh $$5) {
      gw $$6 = new gw($$3.u(), 90, $$3.w());
      gw $$7 = dyv.a(new gw(15, 0, 15), cxx.a, $$2, gw.b).a((hy)$$6);
      duu $$8 = duu.a($$6, $$7);
      gw $$9 = new gw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gw> $$10 = a($$1, $$9);
      int $$11 = asb.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gw $$14 = $$10.remove($$13);
            czn $$15 = czn.a($$1);
            gw $$16 = dyv.a(new gw(5, 0, 6), cxx.a, $$15, gw.b).a((hy)$$14);
            duu $$17 = duu.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gw> a(ash $$0, gw $$1) {
      List<gw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + asb.a($$0, 1, 8), 0, 16 + asb.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + asb.a($$0, 1, 8), 0, asb.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + asb.a($$0, 1, 8), 0, -16 + asb.a($$0, 4, 8)));
      $$2.add($$1.b(asb.a($$0, 1, 7), 0, 16 + asb.a($$0, 1, 7)));
      $$2.add($$1.b(asb.a($$0, 1, 7), 0, -16 + asb.a($$0, 4, 6)));
      $$2.add($$1.b(16 + asb.a($$0, 1, 7), 0, 16 + asb.a($$0, 3, 8)));
      $$2.add($$1.b(16 + asb.a($$0, 1, 7), 0, asb.a($$0, 1, 7)));
      $$2.add($$1.b(16 + asb.a($$0, 1, 7), 0, -16 + asb.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dyw $$0, gw $$1, czn $$2, dvh $$3, ash $$4, dxh $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aez $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxg.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aez[] $$9 = $$6 ? g : d;
            aez[] $$10 = $$6 ? i : e;
            aez[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxg.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxg.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxg.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvm {
      private final dxh.a h;
      private final float i;
      private final boolean j;

      public a(dyw $$0, aez $$1, gw $$2, czn $$3, float $$4, dxh.a $$5, boolean $$6) {
         super(dvt.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dyw $$0, qw $$1, czn $$2, float $$3, dxh.a $$4, boolean $$5) {
         super(dvt.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dyr a(czn $$0, float $$1, dxh.a $$2) {
         dys $$3 = $$2 == dxh.a.b ? dxg.b : dxg.a;
         return new dyr().a($$0).a(cxx.a).a(new dxz($$1)).a(dxx.d).a($$3);
      }

      public static dxg.a a(dyw $$0, qw $$1) {
         czn $$2 = czn.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxh.a $$4 = dxh.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxg.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cte.cv.o().a(cuf.e, Boolean.valueOf($$2.b_($$1).a(aqa.a))), 2);
            dcz $$5 = $$2.c_($$1);
            if ($$5 instanceof ddg) {
               ((ddg)$$5).a(this.j ? eci.F : eci.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            bzc $$6 = bja.y.a((cqb)$$2.C());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bjq.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.y_()) {
                  $$2.a($$1, cte.a.o(), 2);
               } else {
                  $$2.a($$1, cte.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         int $$7 = $$0.a(dkm.a.c, this.d.u(), this.d.w());
         this.d = new gw(this.d.u(), $$7, this.d.w());
         gw $$8 = dyv.a(new gw(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxx.a, this.c.d(), gw.b).a((hy)this.d);
         this.d = new gw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gw $$0, cph $$1, gw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gw $$7 : gw.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gw.a $$11 = new gw.a($$8, $$10, $$9);
            dfd $$12 = $$1.a_($$11);

            for (eag $$13 = $$1.b_($$11); ($$12.i() || $$13.a(aqa.a) || $$12.a(apv.al)) && $$10 > $$1.H_() + 1; $$13 = $$1.b_($$11)) {
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
