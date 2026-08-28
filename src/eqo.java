import com.google.common.collect.Lists;
import java.util.List;

public class eqo {
   static final esb a = a(dkg.L, dkg.M, ewd.bb);
   static final esb b = a(dkg.O, dkg.P, ewd.bc);
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

   private static esb a(dke $$0, dke $$1, aly<ewm> $$2) {
      return new erj(new erx(List.of(new ert(new erg($$0), erb.b, erq.b, $$1.m(), new esi($$2)))), bsg.a(5));
   }

   private static alz a(bam $$0) {
      return ae.a(c, $$0);
   }

   private static alz b(bam $$0) {
      return ae.a(j, $$0);
   }

   public static void a(esf $$0, jh $$1, dqu $$2, eoh $$3, bam $$4, eqp $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(esf $$0, bam $$1, dqu $$2, jh $$3, eqp $$4, eoh $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = ese.a(new jh(15, 0, 15), dpd.a, $$2, jh.c).a((kl)$$6);
      enu $$8 = enu.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = bae.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            dqu $$15 = dqu.a($$1);
            jh $$16 = ese.a(new jh(5, 0, 6), dpd.a, $$15, jh.c).a((kl)$$14);
            enu $$17 = enu.a($$14, $$16);
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

   private static void a(esf $$0, jh $$1, dqu $$2, eoh $$3, bam $$4, eqp $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alz $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eqo.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alz[] $$9 = $$6 ? g : d;
            alz[] $$10 = $$6 ? i : e;
            alz[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eqo.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eqo.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eqo.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eom {
      private final eqp.a h;
      private final float i;
      private final boolean j;

      public a(esf $$0, alz $$1, jh $$2, dqu $$3, float $$4, eqp.a $$5, boolean $$6) {
         super(eot.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(esf $$0, ux $$1, dqu $$2, float $$3, eqp.a $$4, boolean $$5) {
         super(eot.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static esa a(dqu $$0, float $$1, eqp.a $$2) {
         esb $$3 = $$2 == eqp.a.b ? eqo.b : eqo.a;
         return new esa().a($$0).a(dpd.a).a(new erh($$1)).a(erf.d).a($$3);
      }

      public static eqo.a a(esf $$0, ux $$1) {
         dqu $$2 = dqu.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eqp.a $$4 = eqp.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eqo.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eos $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dhr $$2, bam $$3, enu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkg.cD.m().b(dli.e, Boolean.valueOf($$2.b_($$1).a(aya.a))), 2);
            dup $$5 = $$2.c_($$1);
            if ($$5 instanceof duw) {
               ((duw)$$5).a(this.j ? ewd.E : ewd.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cmg $$6 = bvm.L.a($$2.a(), bvl.d);
            if ($$6 != null) {
               $$6.ai();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bvl.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.O()) {
                  $$2.a($$1, dkg.a.m(), 2);
               } else {
                  $$2.a($$1, dkg.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, jh $$6) {
         int $$7 = $$0.a(edi.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = ese.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dpd.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, dgf $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dxn $$12 = $$1.a_($$11);

            for (etp $$13 = $$1.b_($$11); ($$12.l() || $$13.a(aya.a) || $$12.a(axu.ap)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
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
