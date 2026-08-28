import com.google.common.collect.Lists;
import java.util.List;

public class eoj {
   static final epw a = a(dig.I, dig.J, ety.bb);
   static final epw b = a(dig.L, dig.M, ety.bc);
   private static final ali[] c = new ali[]{
      ali.b("underwater_ruin/warm_1"),
      ali.b("underwater_ruin/warm_2"),
      ali.b("underwater_ruin/warm_3"),
      ali.b("underwater_ruin/warm_4"),
      ali.b("underwater_ruin/warm_5"),
      ali.b("underwater_ruin/warm_6"),
      ali.b("underwater_ruin/warm_7"),
      ali.b("underwater_ruin/warm_8")
   };
   private static final ali[] d = new ali[]{
      ali.b("underwater_ruin/brick_1"),
      ali.b("underwater_ruin/brick_2"),
      ali.b("underwater_ruin/brick_3"),
      ali.b("underwater_ruin/brick_4"),
      ali.b("underwater_ruin/brick_5"),
      ali.b("underwater_ruin/brick_6"),
      ali.b("underwater_ruin/brick_7"),
      ali.b("underwater_ruin/brick_8")
   };
   private static final ali[] e = new ali[]{
      ali.b("underwater_ruin/cracked_1"),
      ali.b("underwater_ruin/cracked_2"),
      ali.b("underwater_ruin/cracked_3"),
      ali.b("underwater_ruin/cracked_4"),
      ali.b("underwater_ruin/cracked_5"),
      ali.b("underwater_ruin/cracked_6"),
      ali.b("underwater_ruin/cracked_7"),
      ali.b("underwater_ruin/cracked_8")
   };
   private static final ali[] f = new ali[]{
      ali.b("underwater_ruin/mossy_1"),
      ali.b("underwater_ruin/mossy_2"),
      ali.b("underwater_ruin/mossy_3"),
      ali.b("underwater_ruin/mossy_4"),
      ali.b("underwater_ruin/mossy_5"),
      ali.b("underwater_ruin/mossy_6"),
      ali.b("underwater_ruin/mossy_7"),
      ali.b("underwater_ruin/mossy_8")
   };
   private static final ali[] g = new ali[]{
      ali.b("underwater_ruin/big_brick_1"), ali.b("underwater_ruin/big_brick_2"), ali.b("underwater_ruin/big_brick_3"), ali.b("underwater_ruin/big_brick_8")
   };
   private static final ali[] h = new ali[]{
      ali.b("underwater_ruin/big_mossy_1"), ali.b("underwater_ruin/big_mossy_2"), ali.b("underwater_ruin/big_mossy_3"), ali.b("underwater_ruin/big_mossy_8")
   };
   private static final ali[] i = new ali[]{
      ali.b("underwater_ruin/big_cracked_1"),
      ali.b("underwater_ruin/big_cracked_2"),
      ali.b("underwater_ruin/big_cracked_3"),
      ali.b("underwater_ruin/big_cracked_8")
   };
   private static final ali[] j = new ali[]{
      ali.b("underwater_ruin/big_warm_4"), ali.b("underwater_ruin/big_warm_5"), ali.b("underwater_ruin/big_warm_6"), ali.b("underwater_ruin/big_warm_7")
   };

   private static epw a(die $$0, die $$1, alh<euh> $$2) {
      return new epe(new eps(List.of(new epo(new epb($$0), eow.b, epl.b, $$1.m(), new eqd($$2)))), brf.a(5));
   }

   private static ali a(azs $$0) {
      return ae.a(c, $$0);
   }

   private static ali b(azs $$0) {
      return ae.a(j, $$0);
   }

   public static void a(eqa $$0, jh $$1, dor $$2, emc $$3, azs $$4, eok $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eqa $$0, azs $$1, dor $$2, jh $$3, eok $$4, emc $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = epz.a(new jh(15, 0, 15), dna.a, $$2, jh.c).a((kl)$$6);
      elp $$8 = elp.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = azk.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            dor $$15 = dor.a($$1);
            jh $$16 = epz.a(new jh(5, 0, 6), dna.a, $$15, jh.c).a((kl)$$14);
            elp $$17 = elp.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jh> a(azs $$0, jh $$1) {
      List<jh> $$2 = Lists.newArrayList();
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

   private static void a(eqa $$0, jh $$1, dor $$2, emc $$3, azs $$4, eok $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ali $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eoj.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ali[] $$9 = $$6 ? g : d;
            ali[] $$10 = $$6 ? i : e;
            ali[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eoj.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eoj.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eoj.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends emh {
      private final eok.a h;
      private final float i;
      private final boolean j;

      public a(eqa $$0, ali $$1, jh $$2, dor $$3, float $$4, eok.a $$5, boolean $$6) {
         super(emo.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eqa $$0, uk $$1, dor $$2, float $$3, eok.a $$4, boolean $$5) {
         super(emo.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static epv a(dor $$0, float $$1, eok.a $$2) {
         epw $$3 = $$2 == eok.a.b ? eoj.b : eoj.a;
         return new epv().a($$0).a(dna.a).a(new epc($$1)).a(epa.d).a($$3);
      }

      public static eoj.a a(eqa $$0, uk $$1) {
         dor $$2 = dor.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eok.a $$4 = eok.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eoj.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dig.cv.m().b(djh.e, Boolean.valueOf($$2.b_($$1).a(axg.a))), 2);
            dsm $$5 = $$2.c_($$1);
            if ($$5 instanceof dst) {
               ((dst)$$5).a(this.j ? ety.E : ety.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            clf $$6 = bul.B.a($$2.E(), buk.d);
            if ($$6 != null) {
               $$6.ga();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), buk.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dig.a.m(), 2);
               } else {
                  $$2.a($$1, dig.G.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         int $$7 = $$0.a(ebf.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = epz.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dna.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, deg $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dvj $$12 = $$1.a_($$11);

            for (erk $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axg.a) || $$12.a(axa.an)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
