import com.google.common.collect.Lists;
import java.util.List;

public class ebr {
   static final edd a = a(cws.I, cws.J, egu.aS);
   static final edd b = a(cws.L, cws.M, egu.aT);
   private static final ahg[] c = new ahg[]{
      new ahg("underwater_ruin/warm_1"),
      new ahg("underwater_ruin/warm_2"),
      new ahg("underwater_ruin/warm_3"),
      new ahg("underwater_ruin/warm_4"),
      new ahg("underwater_ruin/warm_5"),
      new ahg("underwater_ruin/warm_6"),
      new ahg("underwater_ruin/warm_7"),
      new ahg("underwater_ruin/warm_8")
   };
   private static final ahg[] d = new ahg[]{
      new ahg("underwater_ruin/brick_1"),
      new ahg("underwater_ruin/brick_2"),
      new ahg("underwater_ruin/brick_3"),
      new ahg("underwater_ruin/brick_4"),
      new ahg("underwater_ruin/brick_5"),
      new ahg("underwater_ruin/brick_6"),
      new ahg("underwater_ruin/brick_7"),
      new ahg("underwater_ruin/brick_8")
   };
   private static final ahg[] e = new ahg[]{
      new ahg("underwater_ruin/cracked_1"),
      new ahg("underwater_ruin/cracked_2"),
      new ahg("underwater_ruin/cracked_3"),
      new ahg("underwater_ruin/cracked_4"),
      new ahg("underwater_ruin/cracked_5"),
      new ahg("underwater_ruin/cracked_6"),
      new ahg("underwater_ruin/cracked_7"),
      new ahg("underwater_ruin/cracked_8")
   };
   private static final ahg[] f = new ahg[]{
      new ahg("underwater_ruin/mossy_1"),
      new ahg("underwater_ruin/mossy_2"),
      new ahg("underwater_ruin/mossy_3"),
      new ahg("underwater_ruin/mossy_4"),
      new ahg("underwater_ruin/mossy_5"),
      new ahg("underwater_ruin/mossy_6"),
      new ahg("underwater_ruin/mossy_7"),
      new ahg("underwater_ruin/mossy_8")
   };
   private static final ahg[] g = new ahg[]{
      new ahg("underwater_ruin/big_brick_1"),
      new ahg("underwater_ruin/big_brick_2"),
      new ahg("underwater_ruin/big_brick_3"),
      new ahg("underwater_ruin/big_brick_8")
   };
   private static final ahg[] h = new ahg[]{
      new ahg("underwater_ruin/big_mossy_1"),
      new ahg("underwater_ruin/big_mossy_2"),
      new ahg("underwater_ruin/big_mossy_3"),
      new ahg("underwater_ruin/big_mossy_8")
   };
   private static final ahg[] i = new ahg[]{
      new ahg("underwater_ruin/big_cracked_1"),
      new ahg("underwater_ruin/big_cracked_2"),
      new ahg("underwater_ruin/big_cracked_3"),
      new ahg("underwater_ruin/big_cracked_8")
   };
   private static final ahg[] j = new ahg[]{
      new ahg("underwater_ruin/big_warm_4"),
      new ahg("underwater_ruin/big_warm_5"),
      new ahg("underwater_ruin/big_warm_6"),
      new ahg("underwater_ruin/big_warm_7")
   };

   private static edd a(cwq $$0, cwq $$1, ahg $$2) {
      return new ecm(new ecz(List.of(new ecv(new ecj($$0), ece.b, ecs.b, $$1.o(), new edk($$2)))), bjd.a(5));
   }

   private static ahg a(auv $$0) {
      return ac.a(c, $$0);
   }

   private static ahg b(auv $$0) {
      return ac.a(j, $$0);
   }

   public static void a(edh $$0, hx $$1, ddc $$2, dzl $$3, auv $$4, ebs $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(edh $$0, auv $$1, ddc $$2, hx $$3, ebs $$4, dzl $$5) {
      hx $$6 = new hx($$3.u(), 90, $$3.w());
      hx $$7 = edg.a(new hx(15, 0, 15), dbm.a, $$2, hx.b).a((jb)$$6);
      dyy $$8 = dyy.a($$6, $$7);
      hx $$9 = new hx(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hx> $$10 = a($$1, $$9);
      int $$11 = auo.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hx $$14 = $$10.remove($$13);
            ddc $$15 = ddc.a($$1);
            hx $$16 = edg.a(new hx(5, 0, 6), dbm.a, $$15, hx.b).a((jb)$$14);
            dyy $$17 = dyy.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hx> a(auv $$0, hx $$1) {
      List<hx> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + auo.a($$0, 1, 8), 0, 16 + auo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + auo.a($$0, 1, 8), 0, auo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + auo.a($$0, 1, 8), 0, -16 + auo.a($$0, 4, 8)));
      $$2.add($$1.b(auo.a($$0, 1, 7), 0, 16 + auo.a($$0, 1, 7)));
      $$2.add($$1.b(auo.a($$0, 1, 7), 0, -16 + auo.a($$0, 4, 6)));
      $$2.add($$1.b(16 + auo.a($$0, 1, 7), 0, 16 + auo.a($$0, 3, 8)));
      $$2.add($$1.b(16 + auo.a($$0, 1, 7), 0, auo.a($$0, 1, 7)));
      $$2.add($$1.b(16 + auo.a($$0, 1, 7), 0, -16 + auo.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(edh $$0, hx $$1, ddc $$2, dzl $$3, auv $$4, ebs $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ahg $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ebr.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ahg[] $$9 = $$6 ? g : d;
            ahg[] $$10 = $$6 ? i : e;
            ahg[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ebr.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ebr.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ebr.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dzq {
      private final ebs.a h;
      private final float i;
      private final boolean j;

      public a(edh $$0, ahg $$1, hx $$2, ddc $$3, float $$4, ebs.a $$5, boolean $$6) {
         super(dzx.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(edh $$0, sn $$1, ddc $$2, float $$3, ebs.a $$4, boolean $$5) {
         super(dzx.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static edc a(ddc $$0, float $$1, ebs.a $$2) {
         edd $$3 = $$2 == ebs.a.b ? ebr.b : ebr.a;
         return new edc().a($$0).a(dbm.a).a(new eck($$1)).a(eci.d).a($$3);
      }

      public static ebr.a a(edh $$0, sn $$1) {
         ddc $$2 = ddc.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ebs.a $$4 = ebs.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ebr.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dzw $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hx $$1, cue $$2, auv $$3, dyy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cws.cv.o().a(cxt.e, Boolean.valueOf($$2.b_($$1).a(asm.a))), 2);
            dgv $$5 = $$2.c_($$1);
            if ($$5 instanceof dhc) {
               ((dhc)$$5).a(this.j ? egu.F : egu.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ccd $$6 = blz.z.a((ctp)$$2.E());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bmp.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cws.a.o(), 2);
               } else {
                  $$2.a($$1, cws.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
         int $$7 = $$0.a(doq.a.c, this.d.u(), this.d.w());
         this.d = new hx(this.d.u(), $$7, this.d.w());
         hx $$8 = edg.a(new hx(this.b.a().u() - 1, 0, this.b.a().w() - 1), dbm.a, this.c.d(), hx.b).a((jb)this.d);
         this.d = new hx(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hx $$0, csv $$1, hx $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hx $$7 : hx.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hx.a $$11 = new hx.a($$8, $$10, $$9);
            djh $$12 = $$1.a_($$11);

            for (eer $$13 = $$1.b_($$11); ($$12.i() || $$13.a(asm.a) || $$12.a(ash.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
