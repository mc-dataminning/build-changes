import com.google.common.collect.Lists;
import java.util.List;

public class etz {
   static final evm a = a(dmt.L, dmt.M, ezp.bb);
   static final evm b = a(dmt.O, dmt.P, ezp.bc);
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

   private static evm a(dmr $$0, dmr $$1, alf<ezy> $$2) {
      return new euu(new evi(List.of(new eve(new eur($$0), eum.b, evb.b, $$1.m(), new evt($$2)))), bti.a(5));
   }

   private static alg a(azv $$0) {
      return ag.a(c, $$0);
   }

   private static alg b(azv $$0) {
      return ag.a(j, $$0);
   }

   public static void a(evq $$0, iv $$1, dtl $$2, ers $$3, azv $$4, eua $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(evq $$0, azv $$1, dtl $$2, iv $$3, eua $$4, ers $$5) {
      iv $$6 = new iv($$3.u(), 90, $$3.w());
      iv $$7 = evp.a(new iv(15, 0, 15), dru.a, $$2, iv.c).a((ka)$$6);
      erf $$8 = erf.a($$6, $$7);
      iv $$9 = new iv(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iv> $$10 = a($$1, $$9);
      int $$11 = azm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iv $$14 = $$10.remove($$13);
            dtl $$15 = dtl.a($$1);
            iv $$16 = evp.a(new iv(5, 0, 6), dru.a, $$15, iv.c).a((ka)$$14);
            erf $$17 = erf.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iv> a(azv $$0, iv $$1) {
      List<iv> $$2 = Lists.newArrayList();
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

   private static void a(evq $$0, iv $$1, dtl $$2, ers $$3, azv $$4, eua $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alg $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new etz.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alg[] $$9 = $$6 ? g : d;
            alg[] $$10 = $$6 ? i : e;
            alg[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new etz.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new etz.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new etz.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends erx {
      private final eua.a h;
      private final float i;
      private final boolean j;

      public a(evq $$0, alg $$1, iv $$2, dtl $$3, float $$4, eua.a $$5, boolean $$6) {
         super(ese.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(evq $$0, tz $$1, dtl $$2, float $$3, eua.a $$4, boolean $$5) {
         super(ese.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static evl a(dtl $$0, float $$1, eua.a $$2) {
         evm $$3 = $$2 == eua.a.b ? etz.b : etz.a;
         return new evl().a($$0).a(dru.a).a(new eus($$1)).a(euq.d).a($$3);
      }

      public static etz.a a(evq $$0, tz $$1) {
         dtl $$2 = $$1.<dtl>a("Rot", dtl.h).orElseThrow();
         float $$3 = $$1.h("Integrity");
         eua.a $$4 = $$1.<eua.a>a("BiomeType", eua.a.d).orElseThrow();
         boolean $$5 = $$1.o("IsLarge");
         return new etz.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtl.h, this.c.d());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", eua.a.d, this.h);
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dmt.cG.m().b(dnv.e, Boolean.valueOf($$2.b_($$1).a(axh.a))), 2);
            dxr $$5 = $$2.c_($$1);
            if ($$5 instanceof dxz) {
               ((dxz)$$5).a(this.j ? ezp.E : ezp.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cob $$6 = bwr.K.a($$2.a(), bwq.d);
            if ($$6 != null) {
               $$6.gb();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bwq.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dmt.a.m(), 2);
               } else {
                  $$2.a($$1, dmt.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         int $$7 = $$0.a(egs.a.c, this.d.u(), this.d.w());
         this.d = new iv(this.d.u(), $$7, this.d.w());
         iv $$8 = evp.a(new iv(this.b.a().u() - 1, 0, this.b.a().w() - 1), dru.a, this.c.d(), iv.c).a((ka)this.d);
         this.d = new iv(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iv $$0, diq $$1, iv $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iv $$7 : iv.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iv.a $$11 = new iv.a($$8, $$10, $$9);
            eat $$12 = $$1.a_($$11);

            for (exa $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axh.a) || $$12.a(axc.ap)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
