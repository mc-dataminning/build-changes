import com.google.common.collect.Lists;
import java.util.List;

public class edw {
   static final efi a = a(cyu.I, cyu.J, eja.aS);
   static final efi b = a(cyu.L, cyu.M, eja.aT);
   private static final aiy[] c = new aiy[]{
      new aiy("underwater_ruin/warm_1"),
      new aiy("underwater_ruin/warm_2"),
      new aiy("underwater_ruin/warm_3"),
      new aiy("underwater_ruin/warm_4"),
      new aiy("underwater_ruin/warm_5"),
      new aiy("underwater_ruin/warm_6"),
      new aiy("underwater_ruin/warm_7"),
      new aiy("underwater_ruin/warm_8")
   };
   private static final aiy[] d = new aiy[]{
      new aiy("underwater_ruin/brick_1"),
      new aiy("underwater_ruin/brick_2"),
      new aiy("underwater_ruin/brick_3"),
      new aiy("underwater_ruin/brick_4"),
      new aiy("underwater_ruin/brick_5"),
      new aiy("underwater_ruin/brick_6"),
      new aiy("underwater_ruin/brick_7"),
      new aiy("underwater_ruin/brick_8")
   };
   private static final aiy[] e = new aiy[]{
      new aiy("underwater_ruin/cracked_1"),
      new aiy("underwater_ruin/cracked_2"),
      new aiy("underwater_ruin/cracked_3"),
      new aiy("underwater_ruin/cracked_4"),
      new aiy("underwater_ruin/cracked_5"),
      new aiy("underwater_ruin/cracked_6"),
      new aiy("underwater_ruin/cracked_7"),
      new aiy("underwater_ruin/cracked_8")
   };
   private static final aiy[] f = new aiy[]{
      new aiy("underwater_ruin/mossy_1"),
      new aiy("underwater_ruin/mossy_2"),
      new aiy("underwater_ruin/mossy_3"),
      new aiy("underwater_ruin/mossy_4"),
      new aiy("underwater_ruin/mossy_5"),
      new aiy("underwater_ruin/mossy_6"),
      new aiy("underwater_ruin/mossy_7"),
      new aiy("underwater_ruin/mossy_8")
   };
   private static final aiy[] g = new aiy[]{
      new aiy("underwater_ruin/big_brick_1"),
      new aiy("underwater_ruin/big_brick_2"),
      new aiy("underwater_ruin/big_brick_3"),
      new aiy("underwater_ruin/big_brick_8")
   };
   private static final aiy[] h = new aiy[]{
      new aiy("underwater_ruin/big_mossy_1"),
      new aiy("underwater_ruin/big_mossy_2"),
      new aiy("underwater_ruin/big_mossy_3"),
      new aiy("underwater_ruin/big_mossy_8")
   };
   private static final aiy[] i = new aiy[]{
      new aiy("underwater_ruin/big_cracked_1"),
      new aiy("underwater_ruin/big_cracked_2"),
      new aiy("underwater_ruin/big_cracked_3"),
      new aiy("underwater_ruin/big_cracked_8")
   };
   private static final aiy[] j = new aiy[]{
      new aiy("underwater_ruin/big_warm_4"),
      new aiy("underwater_ruin/big_warm_5"),
      new aiy("underwater_ruin/big_warm_6"),
      new aiy("underwater_ruin/big_warm_7")
   };

   private static efi a(cys $$0, cys $$1, aiy $$2) {
      return new eer(new efe(List.of(new efa(new eeo($$0), eej.b, eex.b, $$1.o(), new efp($$2)))), bky.a(5));
   }

   private static aiy a(awp $$0) {
      return ac.a(c, $$0);
   }

   private static aiy b(awp $$0) {
      return ac.a(j, $$0);
   }

   public static void a(efm $$0, hz $$1, dfe $$2, ebq $$3, awp $$4, edx $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(efm $$0, awp $$1, dfe $$2, hz $$3, edx $$4, ebq $$5) {
      hz $$6 = new hz($$3.u(), 90, $$3.w());
      hz $$7 = efl.a(new hz(15, 0, 15), ddo.a, $$2, hz.c).a((jd)$$6);
      ebd $$8 = ebd.a($$6, $$7);
      hz $$9 = new hz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hz> $$10 = a($$1, $$9);
      int $$11 = awi.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hz $$14 = $$10.remove($$13);
            dfe $$15 = dfe.a($$1);
            hz $$16 = efl.a(new hz(5, 0, 6), ddo.a, $$15, hz.c).a((jd)$$14);
            ebd $$17 = ebd.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hz> a(awp $$0, hz $$1) {
      List<hz> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + awi.a($$0, 1, 8), 0, 16 + awi.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awi.a($$0, 1, 8), 0, awi.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awi.a($$0, 1, 8), 0, -16 + awi.a($$0, 4, 8)));
      $$2.add($$1.b(awi.a($$0, 1, 7), 0, 16 + awi.a($$0, 1, 7)));
      $$2.add($$1.b(awi.a($$0, 1, 7), 0, -16 + awi.a($$0, 4, 6)));
      $$2.add($$1.b(16 + awi.a($$0, 1, 7), 0, 16 + awi.a($$0, 3, 8)));
      $$2.add($$1.b(16 + awi.a($$0, 1, 7), 0, awi.a($$0, 1, 7)));
      $$2.add($$1.b(16 + awi.a($$0, 1, 7), 0, -16 + awi.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(efm $$0, hz $$1, dfe $$2, ebq $$3, awp $$4, edx $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aiy $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new edw.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aiy[] $$9 = $$6 ? g : d;
            aiy[] $$10 = $$6 ? i : e;
            aiy[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new edw.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new edw.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new edw.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ebv {
      private final edx.a h;
      private final float i;
      private final boolean j;

      public a(efm $$0, aiy $$1, hz $$2, dfe $$3, float $$4, edx.a $$5, boolean $$6) {
         super(ecc.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(efm $$0, sw $$1, dfe $$2, float $$3, edx.a $$4, boolean $$5) {
         super(ecc.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static efh a(dfe $$0, float $$1, edx.a $$2) {
         efi $$3 = $$2 == edx.a.b ? edw.b : edw.a;
         return new efh().a($$0).a(ddo.a).a(new eep($$1)).a(een.d).a($$3);
      }

      public static edw.a a(efm $$0, sw $$1) {
         dfe $$2 = dfe.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         edx.a $$4 = edx.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new edw.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hz $$1, cwg $$2, awp $$3, ebd $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cyu.cv.o().a(czv.e, Boolean.valueOf($$2.b_($$1).a(auf.a))), 2);
            dix $$5 = $$2.c_($$1);
            if ($$5 instanceof dje) {
               ((dje)$$5).a(this.j ? eja.F : eja.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cef $$6 = bnw.A.a((cvr)$$2.E());
            if ($$6 != null) {
               $$6.fL();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bom.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cyu.a.o(), 2);
               } else {
                  $$2.a($$1, cyu.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         int $$7 = $$0.a(dqv.a.c, this.d.u(), this.d.w());
         this.d = new hz(this.d.u(), $$7, this.d.w());
         hz $$8 = efl.a(new hz(this.b.a().u() - 1, 0, this.b.a().w() - 1), ddo.a, this.c.d(), hz.c).a((jd)this.d);
         this.d = new hz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hz $$0, cux $$1, hz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hz $$7 : hz.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hz.a $$11 = new hz.a($$8, $$10, $$9);
            dlj $$12 = $$1.a_($$11);

            for (egw $$13 = $$1.b_($$11); ($$12.i() || $$13.a(auf.a) || $$12.a(aua.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
