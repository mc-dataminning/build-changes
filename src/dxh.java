import com.google.common.collect.Lists;
import java.util.List;

public class dxh {
   static final dyt a = a(csr.I, csr.J, ecj.aG);
   static final dyt b = a(csr.L, csr.M, ecj.aH);
   private static final aeu[] c = new aeu[]{
      new aeu("underwater_ruin/warm_1"),
      new aeu("underwater_ruin/warm_2"),
      new aeu("underwater_ruin/warm_3"),
      new aeu("underwater_ruin/warm_4"),
      new aeu("underwater_ruin/warm_5"),
      new aeu("underwater_ruin/warm_6"),
      new aeu("underwater_ruin/warm_7"),
      new aeu("underwater_ruin/warm_8")
   };
   private static final aeu[] d = new aeu[]{
      new aeu("underwater_ruin/brick_1"),
      new aeu("underwater_ruin/brick_2"),
      new aeu("underwater_ruin/brick_3"),
      new aeu("underwater_ruin/brick_4"),
      new aeu("underwater_ruin/brick_5"),
      new aeu("underwater_ruin/brick_6"),
      new aeu("underwater_ruin/brick_7"),
      new aeu("underwater_ruin/brick_8")
   };
   private static final aeu[] e = new aeu[]{
      new aeu("underwater_ruin/cracked_1"),
      new aeu("underwater_ruin/cracked_2"),
      new aeu("underwater_ruin/cracked_3"),
      new aeu("underwater_ruin/cracked_4"),
      new aeu("underwater_ruin/cracked_5"),
      new aeu("underwater_ruin/cracked_6"),
      new aeu("underwater_ruin/cracked_7"),
      new aeu("underwater_ruin/cracked_8")
   };
   private static final aeu[] f = new aeu[]{
      new aeu("underwater_ruin/mossy_1"),
      new aeu("underwater_ruin/mossy_2"),
      new aeu("underwater_ruin/mossy_3"),
      new aeu("underwater_ruin/mossy_4"),
      new aeu("underwater_ruin/mossy_5"),
      new aeu("underwater_ruin/mossy_6"),
      new aeu("underwater_ruin/mossy_7"),
      new aeu("underwater_ruin/mossy_8")
   };
   private static final aeu[] g = new aeu[]{
      new aeu("underwater_ruin/big_brick_1"),
      new aeu("underwater_ruin/big_brick_2"),
      new aeu("underwater_ruin/big_brick_3"),
      new aeu("underwater_ruin/big_brick_8")
   };
   private static final aeu[] h = new aeu[]{
      new aeu("underwater_ruin/big_mossy_1"),
      new aeu("underwater_ruin/big_mossy_2"),
      new aeu("underwater_ruin/big_mossy_3"),
      new aeu("underwater_ruin/big_mossy_8")
   };
   private static final aeu[] i = new aeu[]{
      new aeu("underwater_ruin/big_cracked_1"),
      new aeu("underwater_ruin/big_cracked_2"),
      new aeu("underwater_ruin/big_cracked_3"),
      new aeu("underwater_ruin/big_cracked_8")
   };
   private static final aeu[] j = new aeu[]{
      new aeu("underwater_ruin/big_warm_4"),
      new aeu("underwater_ruin/big_warm_5"),
      new aeu("underwater_ruin/big_warm_6"),
      new aeu("underwater_ruin/big_warm_7")
   };

   private static dyt a(csq $$0, csq $$1, aeu $$2) {
      return new dyc(new dyp(List.of(new dyl(new dxz($$0), dxu.b, dyi.b, $$1.n(), new dza($$2)))), bfv.a(5));
   }

   private static aeu a(arx $$0) {
      return ac.a(c, $$0);
   }

   private static aeu b(arx $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dyx $$0, gw $$1, czc $$2, dvi $$3, arx $$4, dxi $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dyx $$0, arx $$1, czc $$2, gw $$3, dxi $$4, dvi $$5) {
      gw $$6 = new gw($$3.u(), 90, $$3.w());
      gw $$7 = dyw.a(new gw(15, 0, 15), cxl.a, $$2, gw.b).a((ib)$$6);
      duv $$8 = duv.a($$6, $$7);
      gw $$9 = new gw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gw> $$10 = a($$1, $$9);
      int $$11 = ars.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gw $$14 = $$10.remove($$13);
            czc $$15 = czc.a($$1);
            gw $$16 = dyw.a(new gw(5, 0, 6), cxl.a, $$15, gw.b).a((ib)$$14);
            duv $$17 = duv.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gw> a(arx $$0, gw $$1) {
      List<gw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ars.a($$0, 1, 8), 0, 16 + ars.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ars.a($$0, 1, 8), 0, ars.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ars.a($$0, 1, 8), 0, -16 + ars.a($$0, 4, 8)));
      $$2.add($$1.b(ars.a($$0, 1, 7), 0, 16 + ars.a($$0, 1, 7)));
      $$2.add($$1.b(ars.a($$0, 1, 7), 0, -16 + ars.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ars.a($$0, 1, 7), 0, 16 + ars.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ars.a($$0, 1, 7), 0, ars.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ars.a($$0, 1, 7), 0, -16 + ars.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dyx $$0, gw $$1, czc $$2, dvi $$3, arx $$4, dxi $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aeu $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxh.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aeu[] $$9 = $$6 ? g : d;
            aeu[] $$10 = $$6 ? i : e;
            aeu[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxh.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxh.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxh.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvn {
      private final dxi.a h;
      private final float i;
      private final boolean j;

      public a(dyx $$0, aeu $$1, gw $$2, czc $$3, float $$4, dxi.a $$5, boolean $$6) {
         super(dvu.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dyx $$0, qu $$1, czc $$2, float $$3, dxi.a $$4, boolean $$5) {
         super(dvu.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dys a(czc $$0, float $$1, dxi.a $$2) {
         dyt $$3 = $$2 == dxi.a.b ? dxh.b : dxh.a;
         return new dys().a($$0).a(cxl.a).a(new dya($$1)).a(dxy.d).a($$3);
      }

      public static dxh.a a(dyx $$0, qu $$1) {
         czc $$2 = czc.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxi.a $$4 = dxi.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxh.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csr.cv.n().a(cts.d, Boolean.valueOf($$2.b_($$1).a(apt.a))), 2);
            dcq $$5 = $$2.c_($$1);
            if ($$5 instanceof dcx) {
               ((dcx)$$5).a(this.j ? ecj.F : ecj.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            byr $$6 = bip.y.a((cpq)$$2.C());
            if ($$6 != null) {
               $$6.fF();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bjf.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.t_()) {
                  $$2.a($$1, csr.a.n(), 2);
               } else {
                  $$2.a($$1, csr.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         int $$7 = $$0.a(dkn.a.c, this.d.u(), this.d.w());
         this.d = new gw(this.d.u(), $$7, this.d.w());
         gw $$8 = dyw.a(new gw(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxl.a, this.c.d(), gw.b).a((ib)this.d);
         this.d = new gw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gw $$0, cow $$1, gw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gw $$7 : gw.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gw.a $$11 = new gw.a($$8, $$10, $$9);
            dfe $$12 = $$1.a_($$11);

            for (eah $$13 = $$1.b_($$11); ($$12.i() || $$13.a(apt.a) || $$12.a(apo.al)) && $$10 > $$1.C_() + 1; $$13 = $$1.b_($$11)) {
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
