import com.google.common.collect.Lists;
import java.util.List;

public class eqw {
   static final esj a = a(dko.L, dko.M, ewl.bb);
   static final esj b = a(dko.O, dko.P, ewl.bc);
   private static final alz[] c = new alz[]{
      alz.b("underwater_ruin/warm_1"),
      alz.b("underwater_ruin/warm_2"),
      alz.b("underwater_ruin/warm_3"),
      alz.b("underwater_ruin/warm_4"),
      alz.b("underwater_ruin/warm_5"),
      alz.b("underwater_ruin/warm_6"),
      alz.b("underwater_ruin/warm_7"),
      alz.b("underwater_ruin/warm_8")
   };
   private static final alz[] d = new alz[]{
      alz.b("underwater_ruin/brick_1"),
      alz.b("underwater_ruin/brick_2"),
      alz.b("underwater_ruin/brick_3"),
      alz.b("underwater_ruin/brick_4"),
      alz.b("underwater_ruin/brick_5"),
      alz.b("underwater_ruin/brick_6"),
      alz.b("underwater_ruin/brick_7"),
      alz.b("underwater_ruin/brick_8")
   };
   private static final alz[] e = new alz[]{
      alz.b("underwater_ruin/cracked_1"),
      alz.b("underwater_ruin/cracked_2"),
      alz.b("underwater_ruin/cracked_3"),
      alz.b("underwater_ruin/cracked_4"),
      alz.b("underwater_ruin/cracked_5"),
      alz.b("underwater_ruin/cracked_6"),
      alz.b("underwater_ruin/cracked_7"),
      alz.b("underwater_ruin/cracked_8")
   };
   private static final alz[] f = new alz[]{
      alz.b("underwater_ruin/mossy_1"),
      alz.b("underwater_ruin/mossy_2"),
      alz.b("underwater_ruin/mossy_3"),
      alz.b("underwater_ruin/mossy_4"),
      alz.b("underwater_ruin/mossy_5"),
      alz.b("underwater_ruin/mossy_6"),
      alz.b("underwater_ruin/mossy_7"),
      alz.b("underwater_ruin/mossy_8")
   };
   private static final alz[] g = new alz[]{
      alz.b("underwater_ruin/big_brick_1"), alz.b("underwater_ruin/big_brick_2"), alz.b("underwater_ruin/big_brick_3"), alz.b("underwater_ruin/big_brick_8")
   };
   private static final alz[] h = new alz[]{
      alz.b("underwater_ruin/big_mossy_1"), alz.b("underwater_ruin/big_mossy_2"), alz.b("underwater_ruin/big_mossy_3"), alz.b("underwater_ruin/big_mossy_8")
   };
   private static final alz[] i = new alz[]{
      alz.b("underwater_ruin/big_cracked_1"),
      alz.b("underwater_ruin/big_cracked_2"),
      alz.b("underwater_ruin/big_cracked_3"),
      alz.b("underwater_ruin/big_cracked_8")
   };
   private static final alz[] j = new alz[]{
      alz.b("underwater_ruin/big_warm_4"), alz.b("underwater_ruin/big_warm_5"), alz.b("underwater_ruin/big_warm_6"), alz.b("underwater_ruin/big_warm_7")
   };

   private static esj a(dkm $$0, dkm $$1, aly<ewu> $$2) {
      return new err(new esf(List.of(new esb(new ero($$0), erj.b, ery.b, $$1.m(), new esq($$2)))), bsl.a(5));
   }

   private static alz a(bam $$0) {
      return ae.a(c, $$0);
   }

   private static alz b(bam $$0) {
      return ae.a(j, $$0);
   }

   public static void a(esn $$0, jh $$1, drc $$2, eop $$3, bam $$4, eqx $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(esn $$0, bam $$1, drc $$2, jh $$3, eqx $$4, eop $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = esm.a(new jh(15, 0, 15), dpl.a, $$2, jh.c).a((kl)$$6);
      eoc $$8 = eoc.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = bae.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            drc $$15 = drc.a($$1);
            jh $$16 = esm.a(new jh(5, 0, 6), dpl.a, $$15, jh.c).a((kl)$$14);
            eoc $$17 = eoc.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jh> a(bam $$0, jh $$1) {
      List<jh> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + bae.a($$0, 1, 8), 0, 16 + bae.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + bae.a($$0, 1, 8), 0, bae.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + bae.a($$0, 1, 8), 0, -16 + bae.a($$0, 4, 8)));
      $$2.add($$1.b(bae.a($$0, 1, 7), 0, 16 + bae.a($$0, 1, 7)));
      $$2.add($$1.b(bae.a($$0, 1, 7), 0, -16 + bae.a($$0, 4, 6)));
      $$2.add($$1.b(16 + bae.a($$0, 1, 7), 0, 16 + bae.a($$0, 3, 8)));
      $$2.add($$1.b(16 + bae.a($$0, 1, 7), 0, bae.a($$0, 1, 7)));
      $$2.add($$1.b(16 + bae.a($$0, 1, 7), 0, -16 + bae.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(esn $$0, jh $$1, drc $$2, eop $$3, bam $$4, eqx $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alz $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eqw.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alz[] $$9 = $$6 ? g : d;
            alz[] $$10 = $$6 ? i : e;
            alz[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eqw.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eqw.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eqw.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eou {
      private final eqx.a h;
      private final float i;
      private final boolean j;

      public a(esn $$0, alz $$1, jh $$2, drc $$3, float $$4, eqx.a $$5, boolean $$6) {
         super(epb.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(esn $$0, ux $$1, drc $$2, float $$3, eqx.a $$4, boolean $$5) {
         super(epb.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static esi a(drc $$0, float $$1, eqx.a $$2) {
         esj $$3 = $$2 == eqx.a.b ? eqw.b : eqw.a;
         return new esi().a($$0).a(dpl.a).a(new erp($$1)).a(ern.d).a($$3);
      }

      public static eqw.a a(esn $$0, ux $$1) {
         drc $$2 = drc.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eqx.a $$4 = eqx.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eqw.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dhz $$2, bam $$3, eoc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dko.cD.m().b(dlq.e, Boolean.valueOf($$2.b_($$1).a(aya.a))), 2);
            dux $$5 = $$2.c_($$1);
            if ($$5 instanceof dve) {
               ((dve)$$5).a(this.j ? ewl.E : ewl.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cml $$6 = bvr.L.a($$2.a(), bvq.d);
            if ($$6 != null) {
               $$6.ai();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bvq.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.O()) {
                  $$2.a($$1, dko.a.m(), 2);
               } else {
                  $$2.a($$1, dko.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         int $$7 = $$0.a(edq.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = esm.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dpl.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, dgn $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dxv $$12 = $$1.a_($$11);

            for (etx $$13 = $$1.b_($$11); ($$12.l() || $$13.a(aya.a) || $$12.a(axu.ap)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
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
