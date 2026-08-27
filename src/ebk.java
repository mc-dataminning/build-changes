import com.google.common.collect.Lists;
import java.util.List;

public class ebk {
   static final ecw a = a(cwl.I, cwl.J, egn.aS);
   static final ecw b = a(cwl.L, cwl.M, egn.aT);
   private static final ahd[] c = new ahd[]{
      new ahd("underwater_ruin/warm_1"),
      new ahd("underwater_ruin/warm_2"),
      new ahd("underwater_ruin/warm_3"),
      new ahd("underwater_ruin/warm_4"),
      new ahd("underwater_ruin/warm_5"),
      new ahd("underwater_ruin/warm_6"),
      new ahd("underwater_ruin/warm_7"),
      new ahd("underwater_ruin/warm_8")
   };
   private static final ahd[] d = new ahd[]{
      new ahd("underwater_ruin/brick_1"),
      new ahd("underwater_ruin/brick_2"),
      new ahd("underwater_ruin/brick_3"),
      new ahd("underwater_ruin/brick_4"),
      new ahd("underwater_ruin/brick_5"),
      new ahd("underwater_ruin/brick_6"),
      new ahd("underwater_ruin/brick_7"),
      new ahd("underwater_ruin/brick_8")
   };
   private static final ahd[] e = new ahd[]{
      new ahd("underwater_ruin/cracked_1"),
      new ahd("underwater_ruin/cracked_2"),
      new ahd("underwater_ruin/cracked_3"),
      new ahd("underwater_ruin/cracked_4"),
      new ahd("underwater_ruin/cracked_5"),
      new ahd("underwater_ruin/cracked_6"),
      new ahd("underwater_ruin/cracked_7"),
      new ahd("underwater_ruin/cracked_8")
   };
   private static final ahd[] f = new ahd[]{
      new ahd("underwater_ruin/mossy_1"),
      new ahd("underwater_ruin/mossy_2"),
      new ahd("underwater_ruin/mossy_3"),
      new ahd("underwater_ruin/mossy_4"),
      new ahd("underwater_ruin/mossy_5"),
      new ahd("underwater_ruin/mossy_6"),
      new ahd("underwater_ruin/mossy_7"),
      new ahd("underwater_ruin/mossy_8")
   };
   private static final ahd[] g = new ahd[]{
      new ahd("underwater_ruin/big_brick_1"),
      new ahd("underwater_ruin/big_brick_2"),
      new ahd("underwater_ruin/big_brick_3"),
      new ahd("underwater_ruin/big_brick_8")
   };
   private static final ahd[] h = new ahd[]{
      new ahd("underwater_ruin/big_mossy_1"),
      new ahd("underwater_ruin/big_mossy_2"),
      new ahd("underwater_ruin/big_mossy_3"),
      new ahd("underwater_ruin/big_mossy_8")
   };
   private static final ahd[] i = new ahd[]{
      new ahd("underwater_ruin/big_cracked_1"),
      new ahd("underwater_ruin/big_cracked_2"),
      new ahd("underwater_ruin/big_cracked_3"),
      new ahd("underwater_ruin/big_cracked_8")
   };
   private static final ahd[] j = new ahd[]{
      new ahd("underwater_ruin/big_warm_4"),
      new ahd("underwater_ruin/big_warm_5"),
      new ahd("underwater_ruin/big_warm_6"),
      new ahd("underwater_ruin/big_warm_7")
   };

   private static ecw a(cwj $$0, cwj $$1, ahd $$2) {
      return new ecf(new ecs(List.of(new eco(new ecc($$0), ebx.b, ecl.b, $$1.o(), new edd($$2)))), bix.a(5));
   }

   private static ahd a(aup $$0) {
      return ac.a(c, $$0);
   }

   private static ahd b(aup $$0) {
      return ac.a(j, $$0);
   }

   public static void a(eda $$0, hx $$1, dcv $$2, dze $$3, aup $$4, ebl $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eda $$0, aup $$1, dcv $$2, hx $$3, ebl $$4, dze $$5) {
      hx $$6 = new hx($$3.u(), 90, $$3.w());
      hx $$7 = ecz.a(new hx(15, 0, 15), dbf.a, $$2, hx.b).a((jb)$$6);
      dyr $$8 = dyr.a($$6, $$7);
      hx $$9 = new hx(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hx> $$10 = a($$1, $$9);
      int $$11 = aui.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hx $$14 = $$10.remove($$13);
            dcv $$15 = dcv.a($$1);
            hx $$16 = ecz.a(new hx(5, 0, 6), dbf.a, $$15, hx.b).a((jb)$$14);
            dyr $$17 = dyr.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hx> a(aup $$0, hx $$1) {
      List<hx> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aui.a($$0, 1, 8), 0, 16 + aui.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aui.a($$0, 1, 8), 0, aui.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aui.a($$0, 1, 8), 0, -16 + aui.a($$0, 4, 8)));
      $$2.add($$1.b(aui.a($$0, 1, 7), 0, 16 + aui.a($$0, 1, 7)));
      $$2.add($$1.b(aui.a($$0, 1, 7), 0, -16 + aui.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aui.a($$0, 1, 7), 0, 16 + aui.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aui.a($$0, 1, 7), 0, aui.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aui.a($$0, 1, 7), 0, -16 + aui.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eda $$0, hx $$1, dcv $$2, dze $$3, aup $$4, ebl $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ahd $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ebk.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ahd[] $$9 = $$6 ? g : d;
            ahd[] $$10 = $$6 ? i : e;
            ahd[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ebk.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ebk.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ebk.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dzj {
      private final ebl.a h;
      private final float i;
      private final boolean j;

      public a(eda $$0, ahd $$1, hx $$2, dcv $$3, float $$4, ebl.a $$5, boolean $$6) {
         super(dzq.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eda $$0, sl $$1, dcv $$2, float $$3, ebl.a $$4, boolean $$5) {
         super(dzq.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ecv a(dcv $$0, float $$1, ebl.a $$2) {
         ecw $$3 = $$2 == ebl.a.b ? ebk.b : ebk.a;
         return new ecv().a($$0).a(dbf.a).a(new ecd($$1)).a(ecb.d).a($$3);
      }

      public static ebk.a a(eda $$0, sl $$1) {
         dcv $$2 = dcv.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ebl.a $$4 = ebl.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ebk.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cwl.cv.o().a(cxm.e, Boolean.valueOf($$2.b_($$1).a(asg.a))), 2);
            dgo $$5 = $$2.c_($$1);
            if ($$5 instanceof dgv) {
               ((dgv)$$5).a(this.j ? egn.F : egn.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cbx $$6 = blt.z.a((cti)$$2.E());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bmj.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cwl.a.o(), 2);
               } else {
                  $$2.a($$1, cwl.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
         int $$7 = $$0.a(doj.a.c, this.d.u(), this.d.w());
         this.d = new hx(this.d.u(), $$7, this.d.w());
         hx $$8 = ecz.a(new hx(this.b.a().u() - 1, 0, this.b.a().w() - 1), dbf.a, this.c.d(), hx.b).a((jb)this.d);
         this.d = new hx(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hx $$0, cso $$1, hx $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hx $$7 : hx.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hx.a $$11 = new hx.a($$8, $$10, $$9);
            dja $$12 = $$1.a_($$11);

            for (eek $$13 = $$1.b_($$11); ($$12.i() || $$13.a(asg.a) || $$12.a(asb.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
