import com.google.common.collect.Lists;
import java.util.List;

public class dxb {
   static final dyn a = a(csl.I, csl.J, ecd.aG);
   static final dyn b = a(csl.L, csl.M, ecd.aH);
   private static final aep[] c = new aep[]{
      new aep("underwater_ruin/warm_1"),
      new aep("underwater_ruin/warm_2"),
      new aep("underwater_ruin/warm_3"),
      new aep("underwater_ruin/warm_4"),
      new aep("underwater_ruin/warm_5"),
      new aep("underwater_ruin/warm_6"),
      new aep("underwater_ruin/warm_7"),
      new aep("underwater_ruin/warm_8")
   };
   private static final aep[] d = new aep[]{
      new aep("underwater_ruin/brick_1"),
      new aep("underwater_ruin/brick_2"),
      new aep("underwater_ruin/brick_3"),
      new aep("underwater_ruin/brick_4"),
      new aep("underwater_ruin/brick_5"),
      new aep("underwater_ruin/brick_6"),
      new aep("underwater_ruin/brick_7"),
      new aep("underwater_ruin/brick_8")
   };
   private static final aep[] e = new aep[]{
      new aep("underwater_ruin/cracked_1"),
      new aep("underwater_ruin/cracked_2"),
      new aep("underwater_ruin/cracked_3"),
      new aep("underwater_ruin/cracked_4"),
      new aep("underwater_ruin/cracked_5"),
      new aep("underwater_ruin/cracked_6"),
      new aep("underwater_ruin/cracked_7"),
      new aep("underwater_ruin/cracked_8")
   };
   private static final aep[] f = new aep[]{
      new aep("underwater_ruin/mossy_1"),
      new aep("underwater_ruin/mossy_2"),
      new aep("underwater_ruin/mossy_3"),
      new aep("underwater_ruin/mossy_4"),
      new aep("underwater_ruin/mossy_5"),
      new aep("underwater_ruin/mossy_6"),
      new aep("underwater_ruin/mossy_7"),
      new aep("underwater_ruin/mossy_8")
   };
   private static final aep[] g = new aep[]{
      new aep("underwater_ruin/big_brick_1"),
      new aep("underwater_ruin/big_brick_2"),
      new aep("underwater_ruin/big_brick_3"),
      new aep("underwater_ruin/big_brick_8")
   };
   private static final aep[] h = new aep[]{
      new aep("underwater_ruin/big_mossy_1"),
      new aep("underwater_ruin/big_mossy_2"),
      new aep("underwater_ruin/big_mossy_3"),
      new aep("underwater_ruin/big_mossy_8")
   };
   private static final aep[] i = new aep[]{
      new aep("underwater_ruin/big_cracked_1"),
      new aep("underwater_ruin/big_cracked_2"),
      new aep("underwater_ruin/big_cracked_3"),
      new aep("underwater_ruin/big_cracked_8")
   };
   private static final aep[] j = new aep[]{
      new aep("underwater_ruin/big_warm_4"),
      new aep("underwater_ruin/big_warm_5"),
      new aep("underwater_ruin/big_warm_6"),
      new aep("underwater_ruin/big_warm_7")
   };

   private static dyn a(csk $$0, csk $$1, aep $$2) {
      return new dxw(new dyj(List.of(new dyf(new dxt($$0), dxo.b, dyc.b, $$1.n(), new dyu($$2)))), bfq.a(5));
   }

   private static aep a(art $$0) {
      return ac.a(c, $$0);
   }

   private static aep b(art $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dyr $$0, gv $$1, cyw $$2, dvc $$3, art $$4, dxc $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dyr $$0, art $$1, cyw $$2, gv $$3, dxc $$4, dvc $$5) {
      gv $$6 = new gv($$3.u(), 90, $$3.w());
      gv $$7 = dyq.a(new gv(15, 0, 15), cxf.a, $$2, gv.b).a((ia)$$6);
      dup $$8 = dup.a($$6, $$7);
      gv $$9 = new gv(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gv> $$10 = a($$1, $$9);
      int $$11 = aro.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gv $$14 = $$10.remove($$13);
            cyw $$15 = cyw.a($$1);
            gv $$16 = dyq.a(new gv(5, 0, 6), cxf.a, $$15, gv.b).a((ia)$$14);
            dup $$17 = dup.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gv> a(art $$0, gv $$1) {
      List<gv> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aro.a($$0, 1, 8), 0, 16 + aro.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aro.a($$0, 1, 8), 0, aro.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aro.a($$0, 1, 8), 0, -16 + aro.a($$0, 4, 8)));
      $$2.add($$1.b(aro.a($$0, 1, 7), 0, 16 + aro.a($$0, 1, 7)));
      $$2.add($$1.b(aro.a($$0, 1, 7), 0, -16 + aro.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aro.a($$0, 1, 7), 0, 16 + aro.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aro.a($$0, 1, 7), 0, aro.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aro.a($$0, 1, 7), 0, -16 + aro.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dyr $$0, gv $$1, cyw $$2, dvc $$3, art $$4, dxc $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aep $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dxb.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aep[] $$9 = $$6 ? g : d;
            aep[] $$10 = $$6 ? i : e;
            aep[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dxb.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dxb.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dxb.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dvh {
      private final dxc.a h;
      private final float i;
      private final boolean j;

      public a(dyr $$0, aep $$1, gv $$2, cyw $$3, float $$4, dxc.a $$5, boolean $$6) {
         super(dvo.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dyr $$0, qs $$1, cyw $$2, float $$3, dxc.a $$4, boolean $$5) {
         super(dvo.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dym a(cyw $$0, float $$1, dxc.a $$2) {
         dyn $$3 = $$2 == dxc.a.b ? dxb.b : dxb.a;
         return new dym().a($$0).a(cxf.a).a(new dxu($$1)).a(dxs.d).a($$3);
      }

      public static dxb.a a(dyr $$0, qs $$1) {
         cyw $$2 = cyw.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dxc.a $$4 = dxc.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dxb.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csl.cv.n().a(ctm.d, Boolean.valueOf($$2.b_($$1).a(apo.a))), 2);
            dck $$5 = $$2.c_($$1);
            if ($$5 instanceof dcr) {
               ((dcr)$$5).a(this.j ? ecd.F : ecd.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            byn $$6 = bik.y.a((cpk)$$2.C());
            if ($$6 != null) {
               $$6.fF();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bja.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.t_()) {
                  $$2.a($$1, csl.a.n(), 2);
               } else {
                  $$2.a($$1, csl.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
         int $$7 = $$0.a(dkh.a.c, this.d.u(), this.d.w());
         this.d = new gv(this.d.u(), $$7, this.d.w());
         gv $$8 = dyq.a(new gv(this.b.a().u() - 1, 0, this.b.a().w() - 1), cxf.a, this.c.d(), gv.b).a((ia)this.d);
         this.d = new gv(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gv $$0, coq $$1, gv $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gv $$7 : gv.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gv.a $$11 = new gv.a($$8, $$10, $$9);
            dey $$12 = $$1.a_($$11);

            for (eab $$13 = $$1.b_($$11); ($$12.i() || $$13.a(apo.a) || $$12.a(apj.al)) && $$10 > $$1.C_() + 1; $$13 = $$1.b_($$11)) {
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
