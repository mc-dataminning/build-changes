import com.google.common.collect.Lists;
import java.util.List;

public class eod {
   static final epq a = a(dia.I, dia.J, ets.aX);
   static final epq b = a(dia.L, dia.M, ets.aY);
   private static final alh[] c = new alh[]{
      alh.b("underwater_ruin/warm_1"),
      alh.b("underwater_ruin/warm_2"),
      alh.b("underwater_ruin/warm_3"),
      alh.b("underwater_ruin/warm_4"),
      alh.b("underwater_ruin/warm_5"),
      alh.b("underwater_ruin/warm_6"),
      alh.b("underwater_ruin/warm_7"),
      alh.b("underwater_ruin/warm_8")
   };
   private static final alh[] d = new alh[]{
      alh.b("underwater_ruin/brick_1"),
      alh.b("underwater_ruin/brick_2"),
      alh.b("underwater_ruin/brick_3"),
      alh.b("underwater_ruin/brick_4"),
      alh.b("underwater_ruin/brick_5"),
      alh.b("underwater_ruin/brick_6"),
      alh.b("underwater_ruin/brick_7"),
      alh.b("underwater_ruin/brick_8")
   };
   private static final alh[] e = new alh[]{
      alh.b("underwater_ruin/cracked_1"),
      alh.b("underwater_ruin/cracked_2"),
      alh.b("underwater_ruin/cracked_3"),
      alh.b("underwater_ruin/cracked_4"),
      alh.b("underwater_ruin/cracked_5"),
      alh.b("underwater_ruin/cracked_6"),
      alh.b("underwater_ruin/cracked_7"),
      alh.b("underwater_ruin/cracked_8")
   };
   private static final alh[] f = new alh[]{
      alh.b("underwater_ruin/mossy_1"),
      alh.b("underwater_ruin/mossy_2"),
      alh.b("underwater_ruin/mossy_3"),
      alh.b("underwater_ruin/mossy_4"),
      alh.b("underwater_ruin/mossy_5"),
      alh.b("underwater_ruin/mossy_6"),
      alh.b("underwater_ruin/mossy_7"),
      alh.b("underwater_ruin/mossy_8")
   };
   private static final alh[] g = new alh[]{
      alh.b("underwater_ruin/big_brick_1"), alh.b("underwater_ruin/big_brick_2"), alh.b("underwater_ruin/big_brick_3"), alh.b("underwater_ruin/big_brick_8")
   };
   private static final alh[] h = new alh[]{
      alh.b("underwater_ruin/big_mossy_1"), alh.b("underwater_ruin/big_mossy_2"), alh.b("underwater_ruin/big_mossy_3"), alh.b("underwater_ruin/big_mossy_8")
   };
   private static final alh[] i = new alh[]{
      alh.b("underwater_ruin/big_cracked_1"),
      alh.b("underwater_ruin/big_cracked_2"),
      alh.b("underwater_ruin/big_cracked_3"),
      alh.b("underwater_ruin/big_cracked_8")
   };
   private static final alh[] j = new alh[]{
      alh.b("underwater_ruin/big_warm_4"), alh.b("underwater_ruin/big_warm_5"), alh.b("underwater_ruin/big_warm_6"), alh.b("underwater_ruin/big_warm_7")
   };

   private static epq a(dhy $$0, dhy $$1, alg<eub> $$2) {
      return new eoy(new epm(List.of(new epi(new eov($$0), eoq.b, epf.b, $$1.m(), new epx($$2)))), bra.a(5));
   }

   private static alh a(azr $$0) {
      return ad.a(c, $$0);
   }

   private static alh b(azr $$0) {
      return ad.a(j, $$0);
   }

   public static void a(epu $$0, jg $$1, dol $$2, elw $$3, azr $$4, eoe $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(epu $$0, azr $$1, dol $$2, jg $$3, eoe $$4, elw $$5) {
      jg $$6 = new jg($$3.u(), 90, $$3.w());
      jg $$7 = ept.a(new jg(15, 0, 15), dmu.a, $$2, jg.c).a((kk)$$6);
      elj $$8 = elj.a($$6, $$7);
      jg $$9 = new jg(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jg> $$10 = a($$1, $$9);
      int $$11 = azj.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jg $$14 = $$10.remove($$13);
            dol $$15 = dol.a($$1);
            jg $$16 = ept.a(new jg(5, 0, 6), dmu.a, $$15, jg.c).a((kk)$$14);
            elj $$17 = elj.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jg> a(azr $$0, jg $$1) {
      List<jg> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azj.a($$0, 1, 8), 0, 16 + azj.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azj.a($$0, 1, 8), 0, azj.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azj.a($$0, 1, 8), 0, -16 + azj.a($$0, 4, 8)));
      $$2.add($$1.b(azj.a($$0, 1, 7), 0, 16 + azj.a($$0, 1, 7)));
      $$2.add($$1.b(azj.a($$0, 1, 7), 0, -16 + azj.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azj.a($$0, 1, 7), 0, 16 + azj.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azj.a($$0, 1, 7), 0, azj.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azj.a($$0, 1, 7), 0, -16 + azj.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(epu $$0, jg $$1, dol $$2, elw $$3, azr $$4, eoe $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alh $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eod.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alh[] $$9 = $$6 ? g : d;
            alh[] $$10 = $$6 ? i : e;
            alh[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eod.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eod.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eod.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends emb {
      private final eoe.a h;
      private final float i;
      private final boolean j;

      public a(epu $$0, alh $$1, jg $$2, dol $$3, float $$4, eoe.a $$5, boolean $$6) {
         super(emi.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(epu $$0, uj $$1, dol $$2, float $$3, eoe.a $$4, boolean $$5) {
         super(emi.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static epp a(dol $$0, float $$1, eoe.a $$2) {
         epq $$3 = $$2 == eoe.a.b ? eod.b : eod.a;
         return new epp().a($$0).a(dmu.a).a(new eow($$1)).a(eou.d).a($$3);
      }

      public static eod.a a(epu $$0, uj $$1) {
         dol $$2 = dol.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eoe.a $$4 = eoe.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eod.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dia.cv.m().b(djb.e, Boolean.valueOf($$2.b_($$1).a(axf.a))), 2);
            dsg $$5 = $$2.c_($$1);
            if ($$5 instanceof dsn) {
               ((dsn)$$5).a(this.j ? ets.E : ets.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cla $$6 = bug.B.a($$2.E(), buf.d);
            if ($$6 != null) {
               $$6.gb();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), buf.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dia.a.m(), 2);
               } else {
                  $$2.a($$1, dia.G.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         int $$7 = $$0.a(eaz.a.c, this.d.u(), this.d.w());
         this.d = new jg(this.d.u(), $$7, this.d.w());
         jg $$8 = ept.a(new jg(this.b.a().u() - 1, 0, this.b.a().w() - 1), dmu.a, this.c.d(), jg.c).a((kk)this.d);
         this.d = new jg(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jg $$0, dea $$1, jg $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jg $$7 : jg.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jg.a $$11 = new jg.a($$8, $$10, $$9);
            dvd $$12 = $$1.a_($$11);

            for (ere $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axf.a) || $$12.a(awz.an)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
