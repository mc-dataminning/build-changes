import com.google.common.collect.Lists;
import java.util.List;

public class esu {
   static final euh a = a(dlw.L, dlw.M, eyj.bb);
   static final euh b = a(dlw.O, dlw.P, eyj.bc);
   private static final ale[] c = new ale[]{
      ale.b("underwater_ruin/warm_1"),
      ale.b("underwater_ruin/warm_2"),
      ale.b("underwater_ruin/warm_3"),
      ale.b("underwater_ruin/warm_4"),
      ale.b("underwater_ruin/warm_5"),
      ale.b("underwater_ruin/warm_6"),
      ale.b("underwater_ruin/warm_7"),
      ale.b("underwater_ruin/warm_8")
   };
   private static final ale[] d = new ale[]{
      ale.b("underwater_ruin/brick_1"),
      ale.b("underwater_ruin/brick_2"),
      ale.b("underwater_ruin/brick_3"),
      ale.b("underwater_ruin/brick_4"),
      ale.b("underwater_ruin/brick_5"),
      ale.b("underwater_ruin/brick_6"),
      ale.b("underwater_ruin/brick_7"),
      ale.b("underwater_ruin/brick_8")
   };
   private static final ale[] e = new ale[]{
      ale.b("underwater_ruin/cracked_1"),
      ale.b("underwater_ruin/cracked_2"),
      ale.b("underwater_ruin/cracked_3"),
      ale.b("underwater_ruin/cracked_4"),
      ale.b("underwater_ruin/cracked_5"),
      ale.b("underwater_ruin/cracked_6"),
      ale.b("underwater_ruin/cracked_7"),
      ale.b("underwater_ruin/cracked_8")
   };
   private static final ale[] f = new ale[]{
      ale.b("underwater_ruin/mossy_1"),
      ale.b("underwater_ruin/mossy_2"),
      ale.b("underwater_ruin/mossy_3"),
      ale.b("underwater_ruin/mossy_4"),
      ale.b("underwater_ruin/mossy_5"),
      ale.b("underwater_ruin/mossy_6"),
      ale.b("underwater_ruin/mossy_7"),
      ale.b("underwater_ruin/mossy_8")
   };
   private static final ale[] g = new ale[]{
      ale.b("underwater_ruin/big_brick_1"), ale.b("underwater_ruin/big_brick_2"), ale.b("underwater_ruin/big_brick_3"), ale.b("underwater_ruin/big_brick_8")
   };
   private static final ale[] h = new ale[]{
      ale.b("underwater_ruin/big_mossy_1"), ale.b("underwater_ruin/big_mossy_2"), ale.b("underwater_ruin/big_mossy_3"), ale.b("underwater_ruin/big_mossy_8")
   };
   private static final ale[] i = new ale[]{
      ale.b("underwater_ruin/big_cracked_1"),
      ale.b("underwater_ruin/big_cracked_2"),
      ale.b("underwater_ruin/big_cracked_3"),
      ale.b("underwater_ruin/big_cracked_8")
   };
   private static final ale[] j = new ale[]{
      ale.b("underwater_ruin/big_warm_4"), ale.b("underwater_ruin/big_warm_5"), ale.b("underwater_ruin/big_warm_6"), ale.b("underwater_ruin/big_warm_7")
   };

   private static euh a(dlu $$0, dlu $$1, ald<eys> $$2) {
      return new etp(new eud(List.of(new etz(new etm($$0), eth.b, etw.b, $$1.m(), new euo($$2)))), bta.a(5));
   }

   private static ale a(azt $$0) {
      return af.a(c, $$0);
   }

   private static ale b(azt $$0) {
      return af.a(j, $$0);
   }

   public static void a(eul $$0, iu $$1, dsm $$2, eqn $$3, azt $$4, esv $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eul $$0, azt $$1, dsm $$2, iu $$3, esv $$4, eqn $$5) {
      iu $$6 = new iu($$3.u(), 90, $$3.w());
      iu $$7 = euk.a(new iu(15, 0, 15), dqv.a, $$2, iu.c).a((jz)$$6);
      eqa $$8 = eqa.a($$6, $$7);
      iu $$9 = new iu(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iu> $$10 = a($$1, $$9);
      int $$11 = azk.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iu $$14 = $$10.remove($$13);
            dsm $$15 = dsm.a($$1);
            iu $$16 = euk.a(new iu(5, 0, 6), dqv.a, $$15, iu.c).a((jz)$$14);
            eqa $$17 = eqa.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iu> a(azt $$0, iu $$1) {
      List<iu> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, 16 + azk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, azk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, -16 + azk.a($$0, 4, 8)));
      $$2.add($$1.b(azk.a($$0, 1, 7), 0, 16 + azk.a($$0, 1, 7)));
      $$2.add($$1.b(azk.a($$0, 1, 7), 0, -16 + azk.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, 16 + azk.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, azk.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, -16 + azk.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eul $$0, iu $$1, dsm $$2, eqn $$3, azt $$4, esv $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ale $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new esu.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ale[] $$9 = $$6 ? g : d;
            ale[] $$10 = $$6 ? i : e;
            ale[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new esu.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new esu.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new esu.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eqs {
      private final esv.a h;
      private final float i;
      private final boolean j;

      public a(eul $$0, ale $$1, iu $$2, dsm $$3, float $$4, esv.a $$5, boolean $$6) {
         super(eqz.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eul $$0, tx $$1, dsm $$2, float $$3, esv.a $$4, boolean $$5) {
         super(eqz.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eug a(dsm $$0, float $$1, esv.a $$2) {
         euh $$3 = $$2 == esv.a.b ? esu.b : esu.a;
         return new eug().a($$0).a(dqv.a).a(new etn($$1)).a(etl.d).a($$3);
      }

      public static esu.a a(eul $$0, tx $$1) {
         dsm $$2 = dsm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         esv.a $$4 = esv.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new esu.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dlw.cD.m().b(dmx.e, Boolean.valueOf($$2.b_($$1).a(axf.a))), 2);
            dwn $$5 = $$2.c_($$1);
            if ($$5 instanceof dwv) {
               ((dwv)$$5).a(this.j ? eyj.E : eyj.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cnh $$6 = bwj.K.a($$2.a(), bwi.d);
            if ($$6 != null) {
               $$6.fY();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bwi.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dlw.a.m(), 2);
               } else {
                  $$2.a($$1, dlw.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
         int $$7 = $$0.a(efn.a.c, this.d.u(), this.d.w());
         this.d = new iu(this.d.u(), $$7, this.d.w());
         iu $$8 = euk.a(new iu(this.b.a().u() - 1, 0, this.b.a().w() - 1), dqv.a, this.c.d(), iu.c).a((jz)this.d);
         this.d = new iu(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iu $$0, dhv $$1, iu $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iu $$7 : iu.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iu.a $$11 = new iu.a($$8, $$10, $$9);
            dzo $$12 = $$1.a_($$11);

            for (evv $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axf.a) || $$12.a(axa.ap)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
