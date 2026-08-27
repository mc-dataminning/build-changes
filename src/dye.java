import com.google.common.collect.Lists;
import java.util.List;

public class dye {
   static final dzq a = a(cuc.I, cuc.J, edg.aG);
   static final dzq b = a(cuc.L, cuc.M, edg.aH);
   private static final afw[] c = new afw[]{
      new afw("underwater_ruin/warm_1"),
      new afw("underwater_ruin/warm_2"),
      new afw("underwater_ruin/warm_3"),
      new afw("underwater_ruin/warm_4"),
      new afw("underwater_ruin/warm_5"),
      new afw("underwater_ruin/warm_6"),
      new afw("underwater_ruin/warm_7"),
      new afw("underwater_ruin/warm_8")
   };
   private static final afw[] d = new afw[]{
      new afw("underwater_ruin/brick_1"),
      new afw("underwater_ruin/brick_2"),
      new afw("underwater_ruin/brick_3"),
      new afw("underwater_ruin/brick_4"),
      new afw("underwater_ruin/brick_5"),
      new afw("underwater_ruin/brick_6"),
      new afw("underwater_ruin/brick_7"),
      new afw("underwater_ruin/brick_8")
   };
   private static final afw[] e = new afw[]{
      new afw("underwater_ruin/cracked_1"),
      new afw("underwater_ruin/cracked_2"),
      new afw("underwater_ruin/cracked_3"),
      new afw("underwater_ruin/cracked_4"),
      new afw("underwater_ruin/cracked_5"),
      new afw("underwater_ruin/cracked_6"),
      new afw("underwater_ruin/cracked_7"),
      new afw("underwater_ruin/cracked_8")
   };
   private static final afw[] f = new afw[]{
      new afw("underwater_ruin/mossy_1"),
      new afw("underwater_ruin/mossy_2"),
      new afw("underwater_ruin/mossy_3"),
      new afw("underwater_ruin/mossy_4"),
      new afw("underwater_ruin/mossy_5"),
      new afw("underwater_ruin/mossy_6"),
      new afw("underwater_ruin/mossy_7"),
      new afw("underwater_ruin/mossy_8")
   };
   private static final afw[] g = new afw[]{
      new afw("underwater_ruin/big_brick_1"),
      new afw("underwater_ruin/big_brick_2"),
      new afw("underwater_ruin/big_brick_3"),
      new afw("underwater_ruin/big_brick_8")
   };
   private static final afw[] h = new afw[]{
      new afw("underwater_ruin/big_mossy_1"),
      new afw("underwater_ruin/big_mossy_2"),
      new afw("underwater_ruin/big_mossy_3"),
      new afw("underwater_ruin/big_mossy_8")
   };
   private static final afw[] i = new afw[]{
      new afw("underwater_ruin/big_cracked_1"),
      new afw("underwater_ruin/big_cracked_2"),
      new afw("underwater_ruin/big_cracked_3"),
      new afw("underwater_ruin/big_cracked_8")
   };
   private static final afw[] j = new afw[]{
      new afw("underwater_ruin/big_warm_4"),
      new afw("underwater_ruin/big_warm_5"),
      new afw("underwater_ruin/big_warm_6"),
      new afw("underwater_ruin/big_warm_7")
   };

   private static dzq a(cua $$0, cua $$1, afw $$2) {
      return new dyz(new dzm(List.of(new dzi(new dyw($$0), dyr.b, dzf.b, $$1.o(), new dzx($$2)))), bhd.a(5));
   }

   private static afw a(ate $$0) {
      return ac.a(c, $$0);
   }

   private static afw b(ate $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dzu $$0, ht $$1, dal $$2, dwf $$3, ate $$4, dyf $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dzu $$0, ate $$1, dal $$2, ht $$3, dyf $$4, dwf $$5) {
      ht $$6 = new ht($$3.u(), 90, $$3.w());
      ht $$7 = dzt.a(new ht(15, 0, 15), cyv.a, $$2, ht.b).a((iw)$$6);
      dvs $$8 = dvs.a($$6, $$7);
      ht $$9 = new ht(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ht> $$10 = a($$1, $$9);
      int $$11 = asy.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ht $$14 = $$10.remove($$13);
            dal $$15 = dal.a($$1);
            ht $$16 = dzt.a(new ht(5, 0, 6), cyv.a, $$15, ht.b).a((iw)$$14);
            dvs $$17 = dvs.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ht> a(ate $$0, ht $$1) {
      List<ht> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + asy.a($$0, 1, 8), 0, 16 + asy.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + asy.a($$0, 1, 8), 0, asy.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + asy.a($$0, 1, 8), 0, -16 + asy.a($$0, 4, 8)));
      $$2.add($$1.b(asy.a($$0, 1, 7), 0, 16 + asy.a($$0, 1, 7)));
      $$2.add($$1.b(asy.a($$0, 1, 7), 0, -16 + asy.a($$0, 4, 6)));
      $$2.add($$1.b(16 + asy.a($$0, 1, 7), 0, 16 + asy.a($$0, 3, 8)));
      $$2.add($$1.b(16 + asy.a($$0, 1, 7), 0, asy.a($$0, 1, 7)));
      $$2.add($$1.b(16 + asy.a($$0, 1, 7), 0, -16 + asy.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dzu $$0, ht $$1, dal $$2, dwf $$3, ate $$4, dyf $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            afw $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dye.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            afw[] $$9 = $$6 ? g : d;
            afw[] $$10 = $$6 ? i : e;
            afw[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dye.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dye.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dye.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dwk {
      private final dyf.a h;
      private final float i;
      private final boolean j;

      public a(dzu $$0, afw $$1, ht $$2, dal $$3, float $$4, dyf.a $$5, boolean $$6) {
         super(dwr.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dzu $$0, rt $$1, dal $$2, float $$3, dyf.a $$4, boolean $$5) {
         super(dwr.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dzp a(dal $$0, float $$1, dyf.a $$2) {
         dzq $$3 = $$2 == dyf.a.b ? dye.b : dye.a;
         return new dzp().a($$0).a(cyv.a).a(new dyx($$1)).a(dyv.d).a($$3);
      }

      public static dye.a a(dzu $$0, rt $$1) {
         dal $$2 = dal.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dyf.a $$4 = dyf.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dye.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cuc.cv.o().a(cvd.e, Boolean.valueOf($$2.b_($$1).a(aqx.a))), 2);
            ddx $$5 = $$2.c_($$1);
            if ($$5 instanceof dee) {
               ((dee)$$5).a(this.j ? edg.F : edg.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            bzz $$6 = bjx.y.a((cqz)$$2.C());
            if ($$6 != null) {
               $$6.fJ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bkn.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, cuc.a.o(), 2);
               } else {
                  $$2.a($$1, cuc.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         int $$7 = $$0.a(dlk.a.c, this.d.u(), this.d.w());
         this.d = new ht(this.d.u(), $$7, this.d.w());
         ht $$8 = dzt.a(new ht(this.b.a().u() - 1, 0, this.b.a().w() - 1), cyv.a, this.c.d(), ht.b).a((iw)this.d);
         this.d = new ht(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ht $$0, cqf $$1, ht $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ht $$7 : ht.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ht.a $$11 = new ht.a($$8, $$10, $$9);
            dgb $$12 = $$1.a_($$11);

            for (ebe $$13 = $$1.b_($$11); ($$12.i() || $$13.a(aqx.a) || $$12.a(aqs.al)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
