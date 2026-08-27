import com.google.common.collect.Lists;
import java.util.List;

public class eme {
   static final enq a = a(dfe.an, dfe.ap, ern.bq);
   static final enq b = a(dfe.ar, dfe.as, ern.br);
   private static final akt[] c = new akt[]{
      new akt("underwater_ruin/warm_1"),
      new akt("underwater_ruin/warm_2"),
      new akt("underwater_ruin/warm_3"),
      new akt("underwater_ruin/warm_4"),
      new akt("underwater_ruin/warm_5"),
      new akt("underwater_ruin/warm_6"),
      new akt("underwater_ruin/warm_7"),
      new akt("underwater_ruin/warm_8")
   };
   private static final akt[] d = new akt[]{
      new akt("underwater_ruin/brick_1"),
      new akt("underwater_ruin/brick_2"),
      new akt("underwater_ruin/brick_3"),
      new akt("underwater_ruin/brick_4"),
      new akt("underwater_ruin/brick_5"),
      new akt("underwater_ruin/brick_6"),
      new akt("underwater_ruin/brick_7"),
      new akt("underwater_ruin/brick_8")
   };
   private static final akt[] e = new akt[]{
      new akt("underwater_ruin/cracked_1"),
      new akt("underwater_ruin/cracked_2"),
      new akt("underwater_ruin/cracked_3"),
      new akt("underwater_ruin/cracked_4"),
      new akt("underwater_ruin/cracked_5"),
      new akt("underwater_ruin/cracked_6"),
      new akt("underwater_ruin/cracked_7"),
      new akt("underwater_ruin/cracked_8")
   };
   private static final akt[] f = new akt[]{
      new akt("underwater_ruin/mossy_1"),
      new akt("underwater_ruin/mossy_2"),
      new akt("underwater_ruin/mossy_3"),
      new akt("underwater_ruin/mossy_4"),
      new akt("underwater_ruin/mossy_5"),
      new akt("underwater_ruin/mossy_6"),
      new akt("underwater_ruin/mossy_7"),
      new akt("underwater_ruin/mossy_8")
   };
   private static final akt[] g = new akt[]{
      new akt("underwater_ruin/big_brick_1"),
      new akt("underwater_ruin/big_brick_2"),
      new akt("underwater_ruin/big_brick_3"),
      new akt("underwater_ruin/big_brick_8")
   };
   private static final akt[] h = new akt[]{
      new akt("underwater_ruin/big_mossy_1"),
      new akt("underwater_ruin/big_mossy_2"),
      new akt("underwater_ruin/big_mossy_3"),
      new akt("underwater_ruin/big_mossy_8")
   };
   private static final akt[] i = new akt[]{
      new akt("underwater_ruin/big_cracked_1"),
      new akt("underwater_ruin/big_cracked_2"),
      new akt("underwater_ruin/big_cracked_3"),
      new akt("underwater_ruin/big_cracked_8")
   };
   private static final akt[] j = new akt[]{
      new akt("underwater_ruin/big_warm_4"),
      new akt("underwater_ruin/big_warm_5"),
      new akt("underwater_ruin/big_warm_6"),
      new akt("underwater_ruin/big_warm_7")
   };

   private static enq a(dfc $$0, dfc $$1, aks<eru> $$2) {
      return new emz(new enm(List.of(new eni(new emw($$0), emr.b, enf.b, $$1.n(), new enx($$2)))), bpc.a(5));
   }

   private static akt a(ayt $$0) {
      return ad.a(c, $$0);
   }

   private static akt b(ayt $$0) {
      return ad.a(j, $$0);
   }

   public static void a(enu $$0, ir $$1, dmd $$2, ejy $$3, ayt $$4, emf $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(enu $$0, ayt $$1, dmd $$2, ir $$3, emf $$4, ejy $$5) {
      ir $$6 = new ir($$3.u(), 90, $$3.w());
      ir $$7 = ent.a(new ir(15, 0, 15), dke.a, $$2, ir.c).a((jv)$$6);
      ejl $$8 = ejl.a($$6, $$7);
      ir $$9 = new ir(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ir> $$10 = a($$1, $$9);
      int $$11 = aym.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ir $$14 = $$10.remove($$13);
            dmd $$15 = dmd.a($$1);
            ir $$16 = ent.a(new ir(5, 0, 6), dke.a, $$15, ir.c).a((jv)$$14);
            ejl $$17 = ejl.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ir> a(ayt $$0, ir $$1) {
      List<ir> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aym.a($$0, 1, 8), 0, 16 + aym.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aym.a($$0, 1, 8), 0, aym.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aym.a($$0, 1, 8), 0, -16 + aym.a($$0, 4, 8)));
      $$2.add($$1.b(aym.a($$0, 1, 7), 0, 16 + aym.a($$0, 1, 7)));
      $$2.add($$1.b(aym.a($$0, 1, 7), 0, -16 + aym.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aym.a($$0, 1, 7), 0, 16 + aym.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aym.a($$0, 1, 7), 0, aym.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aym.a($$0, 1, 7), 0, -16 + aym.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(enu $$0, ir $$1, dmd $$2, ejy $$3, ayt $$4, emf $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akt $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eme.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akt[] $$9 = $$6 ? g : d;
            akt[] $$10 = $$6 ? i : e;
            akt[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eme.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eme.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eme.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ekd {
      private final emf.a h;
      private final float i;
      private final boolean j;

      public a(enu $$0, akt $$1, ir $$2, dmd $$3, float $$4, emf.a $$5, boolean $$6) {
         super(ekk.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(enu $$0, uk $$1, dmd $$2, float $$3, emf.a $$4, boolean $$5) {
         super(ekk.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static enp a(dmd $$0, float $$1, emf.a $$2) {
         enq $$3 = $$2 == emf.a.b ? eme.b : eme.a;
         return new enp().a($$0).a(dke.a).a(new emx($$1)).a(emv.d).a($$3);
      }

      public static eme.a a(enu $$0, uk $$1) {
         dmd $$2 = dmd.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         emf.a $$4 = emf.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eme.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfe.dg.n().a(dgf.e, Boolean.valueOf($$2.b_($$1).a(awj.a))), 2);
            dqc $$5 = $$2.c_($$1);
            if ($$5 instanceof dqj) {
               ((dqj)$$5).a(this.j ? ern.H : ern.G, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ciq $$6 = bsb.D.a((dca)$$2.E());
            if ($$6 != null) {
               $$6.gc();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bss.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, dfe.a.n(), 2);
               } else {
                  $$2.a($$1, dfe.al.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         int $$7 = $$0.a(dyu.a.c, this.d.u(), this.d.w());
         this.d = new ir(this.d.u(), $$7, this.d.w());
         ir $$8 = ent.a(new ir(this.b.a().u() - 1, 0, this.b.a().w() - 1), dke.a, this.c.d(), ir.c).a((jv)this.d);
         this.d = new ir(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ir $$0, dbg $$1, ir $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ir $$7 : ir.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ir.a $$11 = new ir.a($$8, $$10, $$9);
            dtc $$12 = $$1.a_($$11);

            for (epe $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awj.a) || $$12.a(awe.an)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
