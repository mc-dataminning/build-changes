import com.google.common.collect.Lists;
import java.util.List;

public class ehs {
   static final eje a = a(dca.I, dca.J, emz.aU);
   static final eje b = a(dca.L, dca.M, emz.aV);
   private static final ajt[] c = new ajt[]{
      new ajt("underwater_ruin/warm_1"),
      new ajt("underwater_ruin/warm_2"),
      new ajt("underwater_ruin/warm_3"),
      new ajt("underwater_ruin/warm_4"),
      new ajt("underwater_ruin/warm_5"),
      new ajt("underwater_ruin/warm_6"),
      new ajt("underwater_ruin/warm_7"),
      new ajt("underwater_ruin/warm_8")
   };
   private static final ajt[] d = new ajt[]{
      new ajt("underwater_ruin/brick_1"),
      new ajt("underwater_ruin/brick_2"),
      new ajt("underwater_ruin/brick_3"),
      new ajt("underwater_ruin/brick_4"),
      new ajt("underwater_ruin/brick_5"),
      new ajt("underwater_ruin/brick_6"),
      new ajt("underwater_ruin/brick_7"),
      new ajt("underwater_ruin/brick_8")
   };
   private static final ajt[] e = new ajt[]{
      new ajt("underwater_ruin/cracked_1"),
      new ajt("underwater_ruin/cracked_2"),
      new ajt("underwater_ruin/cracked_3"),
      new ajt("underwater_ruin/cracked_4"),
      new ajt("underwater_ruin/cracked_5"),
      new ajt("underwater_ruin/cracked_6"),
      new ajt("underwater_ruin/cracked_7"),
      new ajt("underwater_ruin/cracked_8")
   };
   private static final ajt[] f = new ajt[]{
      new ajt("underwater_ruin/mossy_1"),
      new ajt("underwater_ruin/mossy_2"),
      new ajt("underwater_ruin/mossy_3"),
      new ajt("underwater_ruin/mossy_4"),
      new ajt("underwater_ruin/mossy_5"),
      new ajt("underwater_ruin/mossy_6"),
      new ajt("underwater_ruin/mossy_7"),
      new ajt("underwater_ruin/mossy_8")
   };
   private static final ajt[] g = new ajt[]{
      new ajt("underwater_ruin/big_brick_1"),
      new ajt("underwater_ruin/big_brick_2"),
      new ajt("underwater_ruin/big_brick_3"),
      new ajt("underwater_ruin/big_brick_8")
   };
   private static final ajt[] h = new ajt[]{
      new ajt("underwater_ruin/big_mossy_1"),
      new ajt("underwater_ruin/big_mossy_2"),
      new ajt("underwater_ruin/big_mossy_3"),
      new ajt("underwater_ruin/big_mossy_8")
   };
   private static final ajt[] i = new ajt[]{
      new ajt("underwater_ruin/big_cracked_1"),
      new ajt("underwater_ruin/big_cracked_2"),
      new ajt("underwater_ruin/big_cracked_3"),
      new ajt("underwater_ruin/big_cracked_8")
   };
   private static final ajt[] j = new ajt[]{
      new ajt("underwater_ruin/big_warm_4"),
      new ajt("underwater_ruin/big_warm_5"),
      new ajt("underwater_ruin/big_warm_6"),
      new ajt("underwater_ruin/big_warm_7")
   };

   private static eje a(dby $$0, dby $$1, ajt $$2) {
      return new ein(new eja(List.of(new eiw(new eik($$0), eif.b, eit.b, $$1.n(), new ejl($$2)))), bnc.a(5));
   }

   private static ajt a(axr $$0) {
      return ac.a(c, $$0);
   }

   private static ajt b(axr $$0) {
      return ac.a(j, $$0);
   }

   public static void a(eji $$0, ib $$1, dik $$2, efm $$3, axr $$4, eht $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eji $$0, axr $$1, dik $$2, ib $$3, eht $$4, efm $$5) {
      ib $$6 = new ib($$3.u(), 90, $$3.w());
      ib $$7 = ejh.a(new ib(15, 0, 15), dgu.a, $$2, ib.c).a((jg)$$6);
      eez $$8 = eez.a($$6, $$7);
      ib $$9 = new ib(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ib> $$10 = a($$1, $$9);
      int $$11 = axk.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ib $$14 = $$10.remove($$13);
            dik $$15 = dik.a($$1);
            ib $$16 = ejh.a(new ib(5, 0, 6), dgu.a, $$15, ib.c).a((jg)$$14);
            eez $$17 = eez.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ib> a(axr $$0, ib $$1) {
      List<ib> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + axk.a($$0, 1, 8), 0, 16 + axk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axk.a($$0, 1, 8), 0, axk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axk.a($$0, 1, 8), 0, -16 + axk.a($$0, 4, 8)));
      $$2.add($$1.b(axk.a($$0, 1, 7), 0, 16 + axk.a($$0, 1, 7)));
      $$2.add($$1.b(axk.a($$0, 1, 7), 0, -16 + axk.a($$0, 4, 6)));
      $$2.add($$1.b(16 + axk.a($$0, 1, 7), 0, 16 + axk.a($$0, 3, 8)));
      $$2.add($$1.b(16 + axk.a($$0, 1, 7), 0, axk.a($$0, 1, 7)));
      $$2.add($$1.b(16 + axk.a($$0, 1, 7), 0, -16 + axk.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eji $$0, ib $$1, dik $$2, efm $$3, axr $$4, eht $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ajt $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ehs.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ajt[] $$9 = $$6 ? g : d;
            ajt[] $$10 = $$6 ? i : e;
            ajt[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ehs.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ehs.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ehs.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends efr {
      private final eht.a h;
      private final float i;
      private final boolean j;

      public a(eji $$0, ajt $$1, ib $$2, dik $$3, float $$4, eht.a $$5, boolean $$6) {
         super(efy.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eji $$0, tm $$1, dik $$2, float $$3, eht.a $$4, boolean $$5) {
         super(efy.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ejd a(dik $$0, float $$1, eht.a $$2) {
         eje $$3 = $$2 == eht.a.b ? ehs.b : ehs.a;
         return new ejd().a($$0).a(dgu.a).a(new eil($$1)).a(eij.d).a($$3);
      }

      public static ehs.a a(eji $$0, tm $$1) {
         dik $$2 = dik.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eht.a $$4 = eht.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ehs.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(efx $$0, tm $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ib $$1, czm $$2, axr $$3, eez $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dca.cv.n().a(ddb.e, Boolean.valueOf($$2.b_($$1).a(avh.a))), 2);
            dmf $$5 = $$2.c_($$1);
            if ($$5 instanceof dmm) {
               ((dmm)$$5).a(this.j ? emz.F : emz.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cgn $$6 = bqb.B.a((cyx)$$2.E());
            if ($$6 != null) {
               $$6.fS();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bqs.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dca.a.n(), 2);
               } else {
                  $$2.a($$1, dca.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
         int $$7 = $$0.a(dur.a.c, this.d.u(), this.d.w());
         this.d = new ib(this.d.u(), $$7, this.d.w());
         ib $$8 = ejh.a(new ib(this.b.a().u() - 1, 0, this.b.a().w() - 1), dgu.a, this.c.d(), ib.c).a((jg)this.d);
         this.d = new ib(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ib $$0, cyd $$1, ib $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ib $$7 : ib.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ib.a $$11 = new ib.a($$8, $$10, $$9);
            doz $$12 = $$1.a_($$11);

            for (eks $$13 = $$1.b_($$11); ($$12.i() || $$13.a(avh.a) || $$12.a(avc.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
