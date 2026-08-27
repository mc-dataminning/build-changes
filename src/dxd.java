import com.google.common.collect.Lists;
import java.util.List;

public class dxd {
   static final dyp a = a(csn.I, csn.J, ecf.aG);
   static final dyp b = a(csn.L, csn.M, ecf.aH);
   private static final aer[] c = new aer[]{
      new aer("underwater_ruin/warm_1"),
      new aer("underwater_ruin/warm_2"),
      new aer("underwater_ruin/warm_3"),
      new aer("underwater_ruin/warm_4"),
      new aer("underwater_ruin/warm_5"),
      new aer("underwater_ruin/warm_6"),
      new aer("underwater_ruin/warm_7"),
      new aer("underwater_ruin/warm_8")
   };
   private static final aer[] d = new aer[]{
      new aer("underwater_ruin/brick_1"),
      new aer("underwater_ruin/brick_2"),
      new aer("underwater_ruin/brick_3"),
      new aer("underwater_ruin/brick_4"),
      new aer("underwater_ruin/brick_5"),
      new aer("underwater_ruin/brick_6"),
      new aer("underwater_ruin/brick_7"),
      new aer("underwater_ruin/brick_8")
   };
   private static final aer[] e = new aer[]{
      new aer("underwater_ruin/cracked_1"),
      new aer("underwater_ruin/cracked_2"),
      new aer("underwater_ruin/cracked_3"),
      new aer("underwater_ruin/cracked_4"),
      new aer("underwater_ruin/cracked_5"),
      new aer("underwater_ruin/cracked_6"),
      new aer("underwater_ruin/cracked_7"),
      new aer("underwater_ruin/cracked_8")
   };
   private static final aer[] f = new aer[]{
      new aer("underwater_ruin/mossy_1"),
      new aer("underwater_ruin/mossy_2"),
      new aer("underwater_ruin/mossy_3"),
      new aer("underwater_ruin/mossy_4"),
      new aer("underwater_ruin/mossy_5"),
      new aer("underwater_ruin/mossy_6"),
      new aer("underwater_ruin/mossy_7"),
      new aer("underwater_ruin/mossy_8")
   };
   private static final aer[] g = new aer[]{
      new aer("underwater_ruin/big_brick_1"),
      new aer("underwater_ruin/big_brick_2"),
      new aer("underwater_ruin/big_brick_3"),
      new aer("underwater_ruin/big_brick_8")
   };
   private static final aer[] h = new aer[]{
      new aer("underwater_ruin/big_mossy_1"),
      new aer("underwater_ruin/big_mossy_2"),
      new aer("underwater_ruin/big_mossy_3"),
      new aer("underwater_ruin/big_mossy_8")
   };
   private static final aer[] i = new aer[]{
      new aer("underwater_ruin/big_cracked_1"),
      new aer("underwater_ruin/big_cracked_2"),
      new aer("underwater_ruin/big_cracked_3"),
      new aer("underwater_ruin/big_cracked_8")
   };
   private static final aer[] j = new aer[]{
      new aer("underwater_ruin/big_warm_4"),
      new aer("underwater_ruin/big_warm_5"),
      new aer("underwater_ruin/big_warm_6"),
      new aer("underwater_ruin/big_warm_7")
   };

   private static dyp a(csm $$0, csm $$1, aer $$2) {
      return new dxy(new dyl(List.of(new dyh(new dxv($$0), dxq.b, dye.b, $$1.n(), new dyw($$2)))), bfs.a(5));
   }

   private static aer a(aru $$0) {
      return ac.a(c, $$0);
   }

   private static aer b(aru $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dyt $$0, gu $$1, cyy $$2, dve $$3, aru $$4, dxe $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dyt $$0, aru $$1, cyy $$2, gu $$3, dxe $$4, dve $$5) {
      gu $$6 = new gu($$3.u(), 90, $$3.w());
      gu $$7 = dys.a(new gu(15, 0, 15), cxh.a, $$2, gu.b).a((hz)$$6);
      dur $$8 = dur.a($$6, $$7);
      gu $$9 = new gu(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gu> $$10 = a($$1, $$9);
      int $$11 = arp.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gu $$14 = $$10.remove($$13);
            cyy $$15 = cyy.a($$1);
            gu $$16 = dys.a(new gu(5, 0, 6), cxh.a, $$15, gu.b).a((hz)$$14);
            dur $$17 = dur.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gu> a(aru $$0, gu $$1) {
      List<gu> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + arp.a($$0, 1, 8), 0, 16 + arp.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + arp.a($$0, 1, 8), 0, arp.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + arp.a($$0, 1, 8), 0, -16 + arp.a($$0, 4, 8)));
      $$2.add($$1.b(arp.a($$0, 1, 7), 0, 16 + arp.a($$0, 1, 7)));
      $$2.add($$1.b(arp.a($$0, 1, 7), 0, -16 + arp.a($$0, 4, 6)));
      $$2.add($$1.b(16 + arp.a($$0, 1, 7), 0, 16 + arp.a($$0, 3, 8)));
      $$2.add($$1.b(16 + arp.a($$0, 1, 7), 0, arp.a($$0, 1, 7)));
      $$2.add($$1.b(16 + arp.a($$0, 1, 7), 0, -16 + arp.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dyt $$0, gu $$1, cyy $$2, dve $$3, aru $$4, dxe $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aer $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxd.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aer[] $$9 = $$6 ? g : d;
            aer[] $$10 = $$6 ? i : e;
            aer[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxd.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxd.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxd.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvj {
      private final dxe.a h;
      private final float i;
      private final boolean j;

      public a(dyt $$0, aer $$1, gu $$2, cyy $$3, float $$4, dxe.a $$5, boolean $$6) {
         super(dvq.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dyt $$0, qr $$1, cyy $$2, float $$3, dxe.a $$4, boolean $$5) {
         super(dvq.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dyo a(cyy $$0, float $$1, dxe.a $$2) {
         dyp $$3 = $$2 == dxe.a.b ? dxd.b : dxd.a;
         return new dyo().a($$0).a(cxh.a).a(new dxw($$1)).a(dxu.d).a($$3);
      }

      public static dxd.a a(dyt $$0, qr $$1) {
         cyy $$2 = cyy.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxe.a $$4 = dxe.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxd.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gu $$1, cqb $$2, aru $$3, dur $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csn.cv.n().a(cto.d, Boolean.valueOf($$2.b_($$1).a(apq.a))), 2);
            dcm $$5 = $$2.c_($$1);
            if ($$5 instanceof dct) {
               ((dct)$$5).a(this.j ? ecf.F : ecf.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            byp $$6 = bim.y.a((cpm)$$2.C());
            if ($$6 != null) {
               $$6.fF();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bjc.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.t_()) {
                  $$2.a($$1, csn.a.n(), 2);
               } else {
                  $$2.a($$1, csn.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         int $$7 = $$0.a(dkj.a.c, this.d.u(), this.d.w());
         this.d = new gu(this.d.u(), $$7, this.d.w());
         gu $$8 = dys.a(new gu(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxh.a, this.c.d(), gu.b).a((hz)this.d);
         this.d = new gu(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gu $$0, cos $$1, gu $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gu $$7 : gu.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gu.a $$11 = new gu.a($$8, $$10, $$9);
            dfa $$12 = $$1.a_($$11);

            for (ead $$13 = $$1.b_($$11); ($$12.i() || $$13.a(apq.a) || $$12.a(apl.al)) && $$10 > $$1.C_() + 1; $$13 = $$1.b_($$11)) {
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
