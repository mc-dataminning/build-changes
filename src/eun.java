import com.google.common.collect.Lists;
import java.util.List;

public class eun {
   static final ewa a = a(dne.L, dne.M, fad.bb);
   static final ewa b = a(dne.O, dne.P, fad.bc);
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

   private static ewa a(dnc $$0, dnc $$1, alh<fam> $$2) {
      return new evi(new evw(List.of(new evs(new evf($$0), eva.b, evp.b, $$1.m(), new ewh($$2)))), btt.a(5));
   }

   private static ali a(azx $$0) {
      return ag.a(c, $$0);
   }

   private static ali b(azx $$0) {
      return ag.a(j, $$0);
   }

   public static void a(ewe $$0, iv $$1, dtw $$2, esg $$3, azx $$4, euo $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ewe $$0, azx $$1, dtw $$2, iv $$3, euo $$4, esg $$5) {
      iv $$6 = new iv($$3.u(), 90, $$3.w());
      iv $$7 = ewd.a(new iv(15, 0, 15), dsf.a, $$2, iv.c).a((ka)$$6);
      ert $$8 = ert.a($$6, $$7);
      iv $$9 = new iv(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iv> $$10 = a($$1, $$9);
      int $$11 = azo.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iv $$14 = $$10.remove($$13);
            dtw $$15 = dtw.a($$1);
            iv $$16 = ewd.a(new iv(5, 0, 6), dsf.a, $$15, iv.c).a((ka)$$14);
            ert $$17 = ert.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iv> a(azx $$0, iv $$1) {
      List<iv> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azo.a($$0, 1, 8), 0, 16 + azo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azo.a($$0, 1, 8), 0, azo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azo.a($$0, 1, 8), 0, -16 + azo.a($$0, 4, 8)));
      $$2.add($$1.b(azo.a($$0, 1, 7), 0, 16 + azo.a($$0, 1, 7)));
      $$2.add($$1.b(azo.a($$0, 1, 7), 0, -16 + azo.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azo.a($$0, 1, 7), 0, 16 + azo.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azo.a($$0, 1, 7), 0, azo.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azo.a($$0, 1, 7), 0, -16 + azo.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ewe $$0, iv $$1, dtw $$2, esg $$3, azx $$4, euo $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ali $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eun.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ali[] $$9 = $$6 ? g : d;
            ali[] $$10 = $$6 ? i : e;
            ali[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eun.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eun.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eun.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends esl {
      private final euo.a h;
      private final float i;
      private final boolean j;

      public a(ewe $$0, ali $$1, iv $$2, dtw $$3, float $$4, euo.a $$5, boolean $$6) {
         super(ess.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ewe $$0, tz $$1, dtw $$2, float $$3, euo.a $$4, boolean $$5) {
         super(ess.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static evz a(dtw $$0, float $$1, euo.a $$2) {
         ewa $$3 = $$2 == euo.a.b ? eun.b : eun.a;
         return new evz().a($$0).a(dsf.a).a(new evg($$1)).a(eve.d).a($$3);
      }

      public static eun.a a(ewe $$0, tz $$1) {
         dtw $$2 = $$1.<dtw>a("Rot", dtw.h).orElseThrow();
         float $$3 = $$1.b("Integrity", 0.0F);
         euo.a $$4 = $$1.<euo.a>a("BiomeType", euo.a.d).orElseThrow();
         boolean $$5 = $$1.b("IsLarge", false);
         return new eun.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtw.h, this.c.d());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", euo.a.d, this.h);
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iv $$1, dko $$2, azx $$3, ert $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dne.cG.m().b(dog.e, Boolean.valueOf($$2.b_($$1).a(axj.a))), 2);
            dyc $$5 = $$2.c_($$1);
            if ($$5 instanceof dyk) {
               ((dyk)$$5).a(this.j ? fad.E : fad.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            com $$6 = bxc.L.a($$2.a(), bxb.d);
            if ($$6 != null) {
               $$6.gc();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bxb.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dne.a.m(), 2);
               } else {
                  $$2.a($$1, dne.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         int $$7 = $$0.a(ehd.a.c, this.d.u(), this.d.w());
         this.d = new iv(this.d.u(), $$7, this.d.w());
         iv $$8 = ewd.a(new iv(this.b.a().u() - 1, 0, this.b.a().w() - 1), dsf.a, this.c.d(), iv.c).a((ka)this.d);
         this.d = new iv(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iv $$0, djb $$1, iv $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iv $$7 : iv.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iv.a $$11 = new iv.a($$8, $$10, $$9);
            ebe $$12 = $$1.a_($$11);

            for (exo $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axj.a) || $$12.a(axe.ap)) && $$10 > $$1.K_() + 1; $$13 = $$1.b_($$11)) {
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
