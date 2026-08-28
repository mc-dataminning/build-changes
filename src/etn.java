import com.google.common.collect.Lists;
import java.util.List;

public class etn {
   static final eva a = a(dmh.L, dmh.M, ezd.bb);
   static final eva b = a(dmh.O, dmh.P, ezd.bc);
   private static final alg[] c = new alg[]{
      alg.b("underwater_ruin/warm_1"),
      alg.b("underwater_ruin/warm_2"),
      alg.b("underwater_ruin/warm_3"),
      alg.b("underwater_ruin/warm_4"),
      alg.b("underwater_ruin/warm_5"),
      alg.b("underwater_ruin/warm_6"),
      alg.b("underwater_ruin/warm_7"),
      alg.b("underwater_ruin/warm_8")
   };
   private static final alg[] d = new alg[]{
      alg.b("underwater_ruin/brick_1"),
      alg.b("underwater_ruin/brick_2"),
      alg.b("underwater_ruin/brick_3"),
      alg.b("underwater_ruin/brick_4"),
      alg.b("underwater_ruin/brick_5"),
      alg.b("underwater_ruin/brick_6"),
      alg.b("underwater_ruin/brick_7"),
      alg.b("underwater_ruin/brick_8")
   };
   private static final alg[] e = new alg[]{
      alg.b("underwater_ruin/cracked_1"),
      alg.b("underwater_ruin/cracked_2"),
      alg.b("underwater_ruin/cracked_3"),
      alg.b("underwater_ruin/cracked_4"),
      alg.b("underwater_ruin/cracked_5"),
      alg.b("underwater_ruin/cracked_6"),
      alg.b("underwater_ruin/cracked_7"),
      alg.b("underwater_ruin/cracked_8")
   };
   private static final alg[] f = new alg[]{
      alg.b("underwater_ruin/mossy_1"),
      alg.b("underwater_ruin/mossy_2"),
      alg.b("underwater_ruin/mossy_3"),
      alg.b("underwater_ruin/mossy_4"),
      alg.b("underwater_ruin/mossy_5"),
      alg.b("underwater_ruin/mossy_6"),
      alg.b("underwater_ruin/mossy_7"),
      alg.b("underwater_ruin/mossy_8")
   };
   private static final alg[] g = new alg[]{
      alg.b("underwater_ruin/big_brick_1"), alg.b("underwater_ruin/big_brick_2"), alg.b("underwater_ruin/big_brick_3"), alg.b("underwater_ruin/big_brick_8")
   };
   private static final alg[] h = new alg[]{
      alg.b("underwater_ruin/big_mossy_1"), alg.b("underwater_ruin/big_mossy_2"), alg.b("underwater_ruin/big_mossy_3"), alg.b("underwater_ruin/big_mossy_8")
   };
   private static final alg[] i = new alg[]{
      alg.b("underwater_ruin/big_cracked_1"),
      alg.b("underwater_ruin/big_cracked_2"),
      alg.b("underwater_ruin/big_cracked_3"),
      alg.b("underwater_ruin/big_cracked_8")
   };
   private static final alg[] j = new alg[]{
      alg.b("underwater_ruin/big_warm_4"), alg.b("underwater_ruin/big_warm_5"), alg.b("underwater_ruin/big_warm_6"), alg.b("underwater_ruin/big_warm_7")
   };

   private static eva a(dmf $$0, dmf $$1, alf<ezm> $$2) {
      return new eui(new euw(List.of(new eus(new euf($$0), eua.b, eup.b, $$1.m(), new evh($$2)))), btf.a(5));
   }

   private static alg a(azv $$0) {
      return af.a(c, $$0);
   }

   private static alg b(azv $$0) {
      return af.a(j, $$0);
   }

   public static void a(eve $$0, iu $$1, dsz $$2, erg $$3, azv $$4, eto $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eve $$0, azv $$1, dsz $$2, iu $$3, eto $$4, erg $$5) {
      iu $$6 = new iu($$3.u(), 90, $$3.w());
      iu $$7 = evd.a(new iu(15, 0, 15), dri.a, $$2, iu.c).a((jz)$$6);
      eqt $$8 = eqt.a($$6, $$7);
      iu $$9 = new iu(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iu> $$10 = a($$1, $$9);
      int $$11 = azm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iu $$14 = $$10.remove($$13);
            dsz $$15 = dsz.a($$1);
            iu $$16 = evd.a(new iu(5, 0, 6), dri.a, $$15, iu.c).a((jz)$$14);
            eqt $$17 = eqt.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iu> a(azv $$0, iu $$1) {
      List<iu> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azm.a($$0, 1, 8), 0, 16 + azm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azm.a($$0, 1, 8), 0, azm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azm.a($$0, 1, 8), 0, -16 + azm.a($$0, 4, 8)));
      $$2.add($$1.b(azm.a($$0, 1, 7), 0, 16 + azm.a($$0, 1, 7)));
      $$2.add($$1.b(azm.a($$0, 1, 7), 0, -16 + azm.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azm.a($$0, 1, 7), 0, 16 + azm.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azm.a($$0, 1, 7), 0, azm.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azm.a($$0, 1, 7), 0, -16 + azm.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eve $$0, iu $$1, dsz $$2, erg $$3, azv $$4, eto $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alg $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new etn.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alg[] $$9 = $$6 ? g : d;
            alg[] $$10 = $$6 ? i : e;
            alg[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new etn.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new etn.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new etn.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends erl {
      private final eto.a h;
      private final float i;
      private final boolean j;

      public a(eve $$0, alg $$1, iu $$2, dsz $$3, float $$4, eto.a $$5, boolean $$6) {
         super(ers.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eve $$0, tz $$1, dsz $$2, float $$3, eto.a $$4, boolean $$5) {
         super(ers.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static euz a(dsz $$0, float $$1, eto.a $$2) {
         eva $$3 = $$2 == eto.a.b ? etn.b : etn.a;
         return new euz().a($$0).a(dri.a).a(new eug($$1)).a(eue.d).a($$3);
      }

      public static etn.a a(eve $$0, tz $$1) {
         dsz $$2 = dsz.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eto.a $$4 = eto.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new etn.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(err $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iu $$1, djr $$2, azv $$3, eqt $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dmh.cG.m().b(dnj.e, Boolean.valueOf($$2.b_($$1).a(axh.a))), 2);
            dxf $$5 = $$2.c_($$1);
            if ($$5 instanceof dxn) {
               ((dxn)$$5).a(this.j ? ezd.E : ezd.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cnr $$6 = bwo.K.a($$2.a(), bwn.d);
            if ($$6 != null) {
               $$6.fZ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bwn.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dmh.a.m(), 2);
               } else {
                  $$2.a($$1, dmh.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
         int $$7 = $$0.a(egg.a.c, this.d.u(), this.d.w());
         this.d = new iu(this.d.u(), $$7, this.d.w());
         iu $$8 = evd.a(new iu(this.b.a().u() - 1, 0, this.b.a().w() - 1), dri.a, this.c.d(), iu.c).a((jz)this.d);
         this.d = new iu(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iu $$0, dig $$1, iu $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iu $$7 : iu.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iu.a $$11 = new iu.a($$8, $$10, $$9);
            eah $$12 = $$1.a_($$11);

            for (ewo $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axh.a) || $$12.a(axc.ap)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
