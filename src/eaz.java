import com.google.common.collect.Lists;
import java.util.List;

public class eaz {
   static final ecl a = a(cwb.I, cwb.J, egc.aS);
   static final ecl b = a(cwb.L, cwb.M, egc.aT);
   private static final agt[] c = new agt[]{
      new agt("underwater_ruin/warm_1"),
      new agt("underwater_ruin/warm_2"),
      new agt("underwater_ruin/warm_3"),
      new agt("underwater_ruin/warm_4"),
      new agt("underwater_ruin/warm_5"),
      new agt("underwater_ruin/warm_6"),
      new agt("underwater_ruin/warm_7"),
      new agt("underwater_ruin/warm_8")
   };
   private static final agt[] d = new agt[]{
      new agt("underwater_ruin/brick_1"),
      new agt("underwater_ruin/brick_2"),
      new agt("underwater_ruin/brick_3"),
      new agt("underwater_ruin/brick_4"),
      new agt("underwater_ruin/brick_5"),
      new agt("underwater_ruin/brick_6"),
      new agt("underwater_ruin/brick_7"),
      new agt("underwater_ruin/brick_8")
   };
   private static final agt[] e = new agt[]{
      new agt("underwater_ruin/cracked_1"),
      new agt("underwater_ruin/cracked_2"),
      new agt("underwater_ruin/cracked_3"),
      new agt("underwater_ruin/cracked_4"),
      new agt("underwater_ruin/cracked_5"),
      new agt("underwater_ruin/cracked_6"),
      new agt("underwater_ruin/cracked_7"),
      new agt("underwater_ruin/cracked_8")
   };
   private static final agt[] f = new agt[]{
      new agt("underwater_ruin/mossy_1"),
      new agt("underwater_ruin/mossy_2"),
      new agt("underwater_ruin/mossy_3"),
      new agt("underwater_ruin/mossy_4"),
      new agt("underwater_ruin/mossy_5"),
      new agt("underwater_ruin/mossy_6"),
      new agt("underwater_ruin/mossy_7"),
      new agt("underwater_ruin/mossy_8")
   };
   private static final agt[] g = new agt[]{
      new agt("underwater_ruin/big_brick_1"),
      new agt("underwater_ruin/big_brick_2"),
      new agt("underwater_ruin/big_brick_3"),
      new agt("underwater_ruin/big_brick_8")
   };
   private static final agt[] h = new agt[]{
      new agt("underwater_ruin/big_mossy_1"),
      new agt("underwater_ruin/big_mossy_2"),
      new agt("underwater_ruin/big_mossy_3"),
      new agt("underwater_ruin/big_mossy_8")
   };
   private static final agt[] i = new agt[]{
      new agt("underwater_ruin/big_cracked_1"),
      new agt("underwater_ruin/big_cracked_2"),
      new agt("underwater_ruin/big_cracked_3"),
      new agt("underwater_ruin/big_cracked_8")
   };
   private static final agt[] j = new agt[]{
      new agt("underwater_ruin/big_warm_4"),
      new agt("underwater_ruin/big_warm_5"),
      new agt("underwater_ruin/big_warm_6"),
      new agt("underwater_ruin/big_warm_7")
   };

   private static ecl a(cvz $$0, cvz $$1, agt $$2) {
      return new ebu(new ech(List.of(new ecd(new ebr($$0), ebm.b, eca.b, $$1.o(), new ecs($$2)))), bin.a(5));
   }

   private static agt a(auf $$0) {
      return ac.a(c, $$0);
   }

   private static agt b(auf $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ecp $$0, hv $$1, dcl $$2, dyt $$3, auf $$4, eba $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ecp $$0, auf $$1, dcl $$2, hv $$3, eba $$4, dyt $$5) {
      hv $$6 = new hv($$3.u(), 90, $$3.w());
      hv $$7 = eco.a(new hv(15, 0, 15), dav.a, $$2, hv.b).a((iz)$$6);
      dyg $$8 = dyg.a($$6, $$7);
      hv $$9 = new hv(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hv> $$10 = a($$1, $$9);
      int $$11 = aty.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hv $$14 = $$10.remove($$13);
            dcl $$15 = dcl.a($$1);
            hv $$16 = eco.a(new hv(5, 0, 6), dav.a, $$15, hv.b).a((iz)$$14);
            dyg $$17 = dyg.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hv> a(auf $$0, hv $$1) {
      List<hv> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aty.a($$0, 1, 8), 0, 16 + aty.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aty.a($$0, 1, 8), 0, aty.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aty.a($$0, 1, 8), 0, -16 + aty.a($$0, 4, 8)));
      $$2.add($$1.b(aty.a($$0, 1, 7), 0, 16 + aty.a($$0, 1, 7)));
      $$2.add($$1.b(aty.a($$0, 1, 7), 0, -16 + aty.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aty.a($$0, 1, 7), 0, 16 + aty.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aty.a($$0, 1, 7), 0, aty.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aty.a($$0, 1, 7), 0, -16 + aty.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ecp $$0, hv $$1, dcl $$2, dyt $$3, auf $$4, eba $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            agt $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eaz.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            agt[] $$9 = $$6 ? g : d;
            agt[] $$10 = $$6 ? i : e;
            agt[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eaz.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eaz.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eaz.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dyy {
      private final eba.a h;
      private final float i;
      private final boolean j;

      public a(ecp $$0, agt $$1, hv $$2, dcl $$3, float $$4, eba.a $$5, boolean $$6) {
         super(dzf.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ecp $$0, sj $$1, dcl $$2, float $$3, eba.a $$4, boolean $$5) {
         super(dzf.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eck a(dcl $$0, float $$1, eba.a $$2) {
         ecl $$3 = $$2 == eba.a.b ? eaz.b : eaz.a;
         return new eck().a($$0).a(dav.a).a(new ebs($$1)).a(ebq.d).a($$3);
      }

      public static eaz.a a(ecp $$0, sj $$1) {
         dcl $$2 = dcl.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eba.a $$4 = eba.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eaz.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cwb.cv.o().a(cxc.e, Boolean.valueOf($$2.b_($$1).a(arw.a))), 2);
            dgd $$5 = $$2.c_($$1);
            if ($$5 instanceof dgk) {
               ((dgk)$$5).a(this.j ? egc.F : egc.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cbn $$6 = blj.z.a((csy)$$2.D());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), blz.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cwb.a.o(), 2);
               } else {
                  $$2.a($$1, cwb.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         int $$7 = $$0.a(dny.a.c, this.d.u(), this.d.w());
         this.d = new hv(this.d.u(), $$7, this.d.w());
         hv $$8 = eco.a(new hv(this.b.a().u() - 1, 0, this.b.a().w() - 1), dav.a, this.c.d(), hv.b).a((iz)this.d);
         this.d = new hv(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hv $$0, cse $$1, hv $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hv $$7 : hv.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hv.a $$11 = new hv.a($$8, $$10, $$9);
            dip $$12 = $$1.a_($$11);

            for (edz $$13 = $$1.b_($$11); ($$12.i() || $$13.a(arw.a) || $$12.a(arr.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
