import com.google.common.collect.Lists;
import java.util.List;

public class ens {
   static final epf a = a(dho.I, dho.J, eth.aX);
   static final epf b = a(dho.L, dho.M, eth.aY);
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

   private static epf a(dhm $$0, dhm $$1, ald<etq> $$2) {
      return new eon(new epb(List.of(new eox(new eok($$0), eof.b, eou.b, $$1.n(), new epm($$2)))), bqu.a(5));
   }

   private static ale a(azn $$0) {
      return ad.a(c, $$0);
   }

   private static ale b(azn $$0) {
      return ad.a(j, $$0);
   }

   public static void a(epj $$0, jf $$1, doa $$2, ell $$3, azn $$4, ent $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(epj $$0, azn $$1, doa $$2, jf $$3, ent $$4, ell $$5) {
      jf $$6 = new jf($$3.u(), 90, $$3.w());
      jf $$7 = epi.a(new jf(15, 0, 15), dmj.a, $$2, jf.c).a((kj)$$6);
      eky $$8 = eky.a($$6, $$7);
      jf $$9 = new jf(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jf> $$10 = a($$1, $$9);
      int $$11 = azf.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jf $$14 = $$10.remove($$13);
            doa $$15 = doa.a($$1);
            jf $$16 = epi.a(new jf(5, 0, 6), dmj.a, $$15, jf.c).a((kj)$$14);
            eky $$17 = eky.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jf> a(azn $$0, jf $$1) {
      List<jf> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azf.a($$0, 1, 8), 0, 16 + azf.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azf.a($$0, 1, 8), 0, azf.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azf.a($$0, 1, 8), 0, -16 + azf.a($$0, 4, 8)));
      $$2.add($$1.b(azf.a($$0, 1, 7), 0, 16 + azf.a($$0, 1, 7)));
      $$2.add($$1.b(azf.a($$0, 1, 7), 0, -16 + azf.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azf.a($$0, 1, 7), 0, 16 + azf.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azf.a($$0, 1, 7), 0, azf.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azf.a($$0, 1, 7), 0, -16 + azf.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(epj $$0, jf $$1, doa $$2, ell $$3, azn $$4, ent $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ale $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ens.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ale[] $$9 = $$6 ? g : d;
            ale[] $$10 = $$6 ? i : e;
            ale[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ens.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ens.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ens.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends elq {
      private final ent.a h;
      private final float i;
      private final boolean j;

      public a(epj $$0, ale $$1, jf $$2, doa $$3, float $$4, ent.a $$5, boolean $$6) {
         super(elx.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(epj $$0, ug $$1, doa $$2, float $$3, ent.a $$4, boolean $$5) {
         super(elx.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static epe a(doa $$0, float $$1, ent.a $$2) {
         epf $$3 = $$2 == ent.a.b ? ens.b : ens.a;
         return new epe().a($$0).a(dmj.a).a(new eol($$1)).a(eoj.d).a($$3);
      }

      public static ens.a a(epj $$0, ug $$1) {
         doa $$2 = doa.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ent.a $$4 = ent.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ens.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dho.cv.n().b(dip.e, Boolean.valueOf($$2.b_($$1).a(axb.a))), 2);
            drv $$5 = $$2.c_($$1);
            if ($$5 instanceof dsc) {
               ((dsc)$$5).a(this.j ? eth.E : eth.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ckr $$6 = bty.B.a($$2.E(), btx.d);
            if ($$6 != null) {
               $$6.fW();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btx.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dho.a.n(), 2);
               } else {
                  $$2.a($$1, dho.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         int $$7 = $$0.a(eao.a.c, this.d.u(), this.d.w());
         this.d = new jf(this.d.u(), $$7, this.d.w());
         jf $$8 = epi.a(new jf(this.b.a().u() - 1, 0, this.b.a().w() - 1), dmj.a, this.c.d(), jf.c).a((kj)this.d);
         this.d = new jf(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jf $$0, ddo $$1, jf $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jf $$7 : jf.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jf.a $$11 = new jf.a($$8, $$10, $$9);
            dus $$12 = $$1.a_($$11);

            for (eqt $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axb.a) || $$12.a(awv.an)) && $$10 > $$1.H_() + 1; $$13 = $$1.b_($$11)) {
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
