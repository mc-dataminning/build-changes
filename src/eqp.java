import com.google.common.collect.Lists;
import java.util.List;

public class eqp {
   static final esc a = a(dkf.L, dkf.M, ewe.bb);
   static final esc b = a(dkf.O, dkf.P, ewe.bc);
   private static final alp[] c = new alp[]{
      alp.b("underwater_ruin/warm_1"),
      alp.b("underwater_ruin/warm_2"),
      alp.b("underwater_ruin/warm_3"),
      alp.b("underwater_ruin/warm_4"),
      alp.b("underwater_ruin/warm_5"),
      alp.b("underwater_ruin/warm_6"),
      alp.b("underwater_ruin/warm_7"),
      alp.b("underwater_ruin/warm_8")
   };
   private static final alp[] d = new alp[]{
      alp.b("underwater_ruin/brick_1"),
      alp.b("underwater_ruin/brick_2"),
      alp.b("underwater_ruin/brick_3"),
      alp.b("underwater_ruin/brick_4"),
      alp.b("underwater_ruin/brick_5"),
      alp.b("underwater_ruin/brick_6"),
      alp.b("underwater_ruin/brick_7"),
      alp.b("underwater_ruin/brick_8")
   };
   private static final alp[] e = new alp[]{
      alp.b("underwater_ruin/cracked_1"),
      alp.b("underwater_ruin/cracked_2"),
      alp.b("underwater_ruin/cracked_3"),
      alp.b("underwater_ruin/cracked_4"),
      alp.b("underwater_ruin/cracked_5"),
      alp.b("underwater_ruin/cracked_6"),
      alp.b("underwater_ruin/cracked_7"),
      alp.b("underwater_ruin/cracked_8")
   };
   private static final alp[] f = new alp[]{
      alp.b("underwater_ruin/mossy_1"),
      alp.b("underwater_ruin/mossy_2"),
      alp.b("underwater_ruin/mossy_3"),
      alp.b("underwater_ruin/mossy_4"),
      alp.b("underwater_ruin/mossy_5"),
      alp.b("underwater_ruin/mossy_6"),
      alp.b("underwater_ruin/mossy_7"),
      alp.b("underwater_ruin/mossy_8")
   };
   private static final alp[] g = new alp[]{
      alp.b("underwater_ruin/big_brick_1"), alp.b("underwater_ruin/big_brick_2"), alp.b("underwater_ruin/big_brick_3"), alp.b("underwater_ruin/big_brick_8")
   };
   private static final alp[] h = new alp[]{
      alp.b("underwater_ruin/big_mossy_1"), alp.b("underwater_ruin/big_mossy_2"), alp.b("underwater_ruin/big_mossy_3"), alp.b("underwater_ruin/big_mossy_8")
   };
   private static final alp[] i = new alp[]{
      alp.b("underwater_ruin/big_cracked_1"),
      alp.b("underwater_ruin/big_cracked_2"),
      alp.b("underwater_ruin/big_cracked_3"),
      alp.b("underwater_ruin/big_cracked_8")
   };
   private static final alp[] j = new alp[]{
      alp.b("underwater_ruin/big_warm_4"), alp.b("underwater_ruin/big_warm_5"), alp.b("underwater_ruin/big_warm_6"), alp.b("underwater_ruin/big_warm_7")
   };

   private static esc a(dkd $$0, dkd $$1, alo<ewn> $$2) {
      return new erk(new ery(List.of(new eru(new erh($$0), erc.b, err.b, $$1.m(), new esj($$2)))), bsc.a(5));
   }

   private static alp a(bac $$0) {
      return ae.a(c, $$0);
   }

   private static alp b(bac $$0) {
      return ae.a(j, $$0);
   }

   public static void a(esg $$0, jh $$1, dqv $$2, eoi $$3, bac $$4, eqq $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(esg $$0, bac $$1, dqv $$2, jh $$3, eqq $$4, eoi $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = esf.a(new jh(15, 0, 15), dpc.a, $$2, jh.c).a((kl)$$6);
      env $$8 = env.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = azu.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            dqv $$15 = dqv.a($$1);
            jh $$16 = esf.a(new jh(5, 0, 6), dpc.a, $$15, jh.c).a((kl)$$14);
            env $$17 = env.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jh> a(bac $$0, jh $$1) {
      List<jh> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azu.a($$0, 1, 8), 0, 16 + azu.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azu.a($$0, 1, 8), 0, azu.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azu.a($$0, 1, 8), 0, -16 + azu.a($$0, 4, 8)));
      $$2.add($$1.b(azu.a($$0, 1, 7), 0, 16 + azu.a($$0, 1, 7)));
      $$2.add($$1.b(azu.a($$0, 1, 7), 0, -16 + azu.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azu.a($$0, 1, 7), 0, 16 + azu.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azu.a($$0, 1, 7), 0, azu.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azu.a($$0, 1, 7), 0, -16 + azu.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(esg $$0, jh $$1, dqv $$2, eoi $$3, bac $$4, eqq $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alp $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eqp.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alp[] $$9 = $$6 ? g : d;
            alp[] $$10 = $$6 ? i : e;
            alp[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eqp.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eqp.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eqp.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eon {
      private final eqq.a h;
      private final float i;
      private final boolean j;

      public a(esg $$0, alp $$1, jh $$2, dqv $$3, float $$4, eqq.a $$5, boolean $$6) {
         super(eou.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(esg $$0, um $$1, dqv $$2, float $$3, eqq.a $$4, boolean $$5) {
         super(eou.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static esb a(dqv $$0, float $$1, eqq.a $$2) {
         esc $$3 = $$2 == eqq.a.b ? eqp.b : eqp.a;
         return new esb().a($$0).a(dpc.a).a(new eri($$1)).a(erg.d).a($$3);
      }

      public static eqp.a a(esg $$0, um $$1) {
         dqv $$2 = dqv.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eqq.a $$4 = eqq.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eqp.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dhq $$2, bac $$3, env $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkf.cD.m().b(dlg.e, Boolean.valueOf($$2.b_($$1).a(axq.a))), 2);
            duq $$5 = $$2.c_($$1);
            if ($$5 instanceof dux) {
               ((dux)$$5).a(this.j ? ewe.E : ewe.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cmc $$6 = bvi.L.a($$2.a(), bvh.d);
            if ($$6 != null) {
               $$6.ai();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bvh.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dkf.a.m(), 2);
               } else {
                  $$2.a($$1, dkf.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         int $$7 = $$0.a(edj.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = esf.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dpc.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, dge $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dxo $$12 = $$1.a_($$11);

            for (etq $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axq.a) || $$12.a(axk.ap)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
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
