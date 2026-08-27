import com.google.common.collect.Lists;
import java.util.List;

public class ebz {
   static final edl a = a(cxa.I, cxa.J, ehd.aS);
   static final edl b = a(cxa.L, cxa.M, ehd.aT);
   private static final ahh[] c = new ahh[]{
      new ahh("underwater_ruin/warm_1"),
      new ahh("underwater_ruin/warm_2"),
      new ahh("underwater_ruin/warm_3"),
      new ahh("underwater_ruin/warm_4"),
      new ahh("underwater_ruin/warm_5"),
      new ahh("underwater_ruin/warm_6"),
      new ahh("underwater_ruin/warm_7"),
      new ahh("underwater_ruin/warm_8")
   };
   private static final ahh[] d = new ahh[]{
      new ahh("underwater_ruin/brick_1"),
      new ahh("underwater_ruin/brick_2"),
      new ahh("underwater_ruin/brick_3"),
      new ahh("underwater_ruin/brick_4"),
      new ahh("underwater_ruin/brick_5"),
      new ahh("underwater_ruin/brick_6"),
      new ahh("underwater_ruin/brick_7"),
      new ahh("underwater_ruin/brick_8")
   };
   private static final ahh[] e = new ahh[]{
      new ahh("underwater_ruin/cracked_1"),
      new ahh("underwater_ruin/cracked_2"),
      new ahh("underwater_ruin/cracked_3"),
      new ahh("underwater_ruin/cracked_4"),
      new ahh("underwater_ruin/cracked_5"),
      new ahh("underwater_ruin/cracked_6"),
      new ahh("underwater_ruin/cracked_7"),
      new ahh("underwater_ruin/cracked_8")
   };
   private static final ahh[] f = new ahh[]{
      new ahh("underwater_ruin/mossy_1"),
      new ahh("underwater_ruin/mossy_2"),
      new ahh("underwater_ruin/mossy_3"),
      new ahh("underwater_ruin/mossy_4"),
      new ahh("underwater_ruin/mossy_5"),
      new ahh("underwater_ruin/mossy_6"),
      new ahh("underwater_ruin/mossy_7"),
      new ahh("underwater_ruin/mossy_8")
   };
   private static final ahh[] g = new ahh[]{
      new ahh("underwater_ruin/big_brick_1"),
      new ahh("underwater_ruin/big_brick_2"),
      new ahh("underwater_ruin/big_brick_3"),
      new ahh("underwater_ruin/big_brick_8")
   };
   private static final ahh[] h = new ahh[]{
      new ahh("underwater_ruin/big_mossy_1"),
      new ahh("underwater_ruin/big_mossy_2"),
      new ahh("underwater_ruin/big_mossy_3"),
      new ahh("underwater_ruin/big_mossy_8")
   };
   private static final ahh[] i = new ahh[]{
      new ahh("underwater_ruin/big_cracked_1"),
      new ahh("underwater_ruin/big_cracked_2"),
      new ahh("underwater_ruin/big_cracked_3"),
      new ahh("underwater_ruin/big_cracked_8")
   };
   private static final ahh[] j = new ahh[]{
      new ahh("underwater_ruin/big_warm_4"),
      new ahh("underwater_ruin/big_warm_5"),
      new ahh("underwater_ruin/big_warm_6"),
      new ahh("underwater_ruin/big_warm_7")
   };

   private static edl a(cwy $$0, cwy $$1, ahh $$2) {
      return new ecu(new edh(List.of(new edd(new ecr($$0), ecm.b, eda.b, $$1.o(), new eds($$2)))), bje.a(5));
   }

   private static ahh a(auw $$0) {
      return ac.a(c, $$0);
   }

   private static ahh b(auw $$0) {
      return ac.a(j, $$0);
   }

   public static void a(edp $$0, hx $$1, ddk $$2, dzt $$3, auw $$4, eca $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(edp $$0, auw $$1, ddk $$2, hx $$3, eca $$4, dzt $$5) {
      hx $$6 = new hx($$3.u(), 90, $$3.w());
      hx $$7 = edo.a(new hx(15, 0, 15), dbu.a, $$2, hx.b).a((jb)$$6);
      dzg $$8 = dzg.a($$6, $$7);
      hx $$9 = new hx(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hx> $$10 = a($$1, $$9);
      int $$11 = aup.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hx $$14 = $$10.remove($$13);
            ddk $$15 = ddk.a($$1);
            hx $$16 = edo.a(new hx(5, 0, 6), dbu.a, $$15, hx.b).a((jb)$$14);
            dzg $$17 = dzg.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hx> a(auw $$0, hx $$1) {
      List<hx> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aup.a($$0, 1, 8), 0, 16 + aup.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aup.a($$0, 1, 8), 0, aup.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aup.a($$0, 1, 8), 0, -16 + aup.a($$0, 4, 8)));
      $$2.add($$1.b(aup.a($$0, 1, 7), 0, 16 + aup.a($$0, 1, 7)));
      $$2.add($$1.b(aup.a($$0, 1, 7), 0, -16 + aup.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aup.a($$0, 1, 7), 0, 16 + aup.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aup.a($$0, 1, 7), 0, aup.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aup.a($$0, 1, 7), 0, -16 + aup.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(edp $$0, hx $$1, ddk $$2, dzt $$3, auw $$4, eca $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ahh $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ebz.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ahh[] $$9 = $$6 ? g : d;
            ahh[] $$10 = $$6 ? i : e;
            ahh[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ebz.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ebz.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ebz.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dzy {
      private final eca.a h;
      private final float i;
      private final boolean j;

      public a(edp $$0, ahh $$1, hx $$2, ddk $$3, float $$4, eca.a $$5, boolean $$6) {
         super(eaf.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(edp $$0, so $$1, ddk $$2, float $$3, eca.a $$4, boolean $$5) {
         super(eaf.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static edk a(ddk $$0, float $$1, eca.a $$2) {
         edl $$3 = $$2 == eca.a.b ? ebz.b : ebz.a;
         return new edk().a($$0).a(dbu.a).a(new ecs($$1)).a(ecq.d).a($$3);
      }

      public static ebz.a a(edp $$0, so $$1) {
         ddk $$2 = ddk.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eca.a $$4 = eca.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ebz.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hx $$1, cum $$2, auw $$3, dzg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cxa.cv.o().a(cyb.e, Boolean.valueOf($$2.b_($$1).a(asn.a))), 2);
            dhd $$5 = $$2.c_($$1);
            if ($$5 instanceof dhk) {
               ((dhk)$$5).a(this.j ? ehd.F : ehd.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cck $$6 = bmc.A.a((ctx)$$2.E());
            if ($$6 != null) {
               $$6.fK();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bms.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cxa.a.o(), 2);
               } else {
                  $$2.a($$1, cxa.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         int $$7 = $$0.a(doy.a.c, this.d.u(), this.d.w());
         this.d = new hx(this.d.u(), $$7, this.d.w());
         hx $$8 = edo.a(new hx(this.b.a().u() - 1, 0, this.b.a().w() - 1), dbu.a, this.c.d(), hx.b).a((jb)this.d);
         this.d = new hx(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hx $$0, ctd $$1, hx $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hx $$7 : hx.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hx.a $$11 = new hx.a($$8, $$10, $$9);
            djp $$12 = $$1.a_($$11);

            for (eez $$13 = $$1.b_($$11); ($$12.i() || $$13.a(asn.a) || $$12.a(asi.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
