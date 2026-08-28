import com.google.common.collect.Lists;
import java.util.List;

public class epw {
   static final erj a = a(djm.L, djm.M, evl.bb);
   static final erj b = a(djm.O, djm.P, evl.bc);
   private static final aku[] c = new aku[]{
      aku.b("underwater_ruin/warm_1"),
      aku.b("underwater_ruin/warm_2"),
      aku.b("underwater_ruin/warm_3"),
      aku.b("underwater_ruin/warm_4"),
      aku.b("underwater_ruin/warm_5"),
      aku.b("underwater_ruin/warm_6"),
      aku.b("underwater_ruin/warm_7"),
      aku.b("underwater_ruin/warm_8")
   };
   private static final aku[] d = new aku[]{
      aku.b("underwater_ruin/brick_1"),
      aku.b("underwater_ruin/brick_2"),
      aku.b("underwater_ruin/brick_3"),
      aku.b("underwater_ruin/brick_4"),
      aku.b("underwater_ruin/brick_5"),
      aku.b("underwater_ruin/brick_6"),
      aku.b("underwater_ruin/brick_7"),
      aku.b("underwater_ruin/brick_8")
   };
   private static final aku[] e = new aku[]{
      aku.b("underwater_ruin/cracked_1"),
      aku.b("underwater_ruin/cracked_2"),
      aku.b("underwater_ruin/cracked_3"),
      aku.b("underwater_ruin/cracked_4"),
      aku.b("underwater_ruin/cracked_5"),
      aku.b("underwater_ruin/cracked_6"),
      aku.b("underwater_ruin/cracked_7"),
      aku.b("underwater_ruin/cracked_8")
   };
   private static final aku[] f = new aku[]{
      aku.b("underwater_ruin/mossy_1"),
      aku.b("underwater_ruin/mossy_2"),
      aku.b("underwater_ruin/mossy_3"),
      aku.b("underwater_ruin/mossy_4"),
      aku.b("underwater_ruin/mossy_5"),
      aku.b("underwater_ruin/mossy_6"),
      aku.b("underwater_ruin/mossy_7"),
      aku.b("underwater_ruin/mossy_8")
   };
   private static final aku[] g = new aku[]{
      aku.b("underwater_ruin/big_brick_1"), aku.b("underwater_ruin/big_brick_2"), aku.b("underwater_ruin/big_brick_3"), aku.b("underwater_ruin/big_brick_8")
   };
   private static final aku[] h = new aku[]{
      aku.b("underwater_ruin/big_mossy_1"), aku.b("underwater_ruin/big_mossy_2"), aku.b("underwater_ruin/big_mossy_3"), aku.b("underwater_ruin/big_mossy_8")
   };
   private static final aku[] i = new aku[]{
      aku.b("underwater_ruin/big_cracked_1"),
      aku.b("underwater_ruin/big_cracked_2"),
      aku.b("underwater_ruin/big_cracked_3"),
      aku.b("underwater_ruin/big_cracked_8")
   };
   private static final aku[] j = new aku[]{
      aku.b("underwater_ruin/big_warm_4"), aku.b("underwater_ruin/big_warm_5"), aku.b("underwater_ruin/big_warm_6"), aku.b("underwater_ruin/big_warm_7")
   };

   private static erj a(djk $$0, djk $$1, akt<evu> $$2) {
      return new eqr(new erf(List.of(new erb(new eqo($$0), eqj.b, eqy.b, $$1.m(), new erq($$2)))), brk.a(5));
   }

   private static aku a(azg $$0) {
      return af.a(c, $$0);
   }

   private static aku b(azg $$0) {
      return af.a(j, $$0);
   }

   public static void a(ern $$0, ji $$1, dqc $$2, enp $$3, azg $$4, epx $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ern $$0, azg $$1, dqc $$2, ji $$3, epx $$4, enp $$5) {
      ji $$6 = new ji($$3.u(), 90, $$3.w());
      ji $$7 = erm.a(new ji(15, 0, 15), doj.a, $$2, ji.c).a((km)$$6);
      enc $$8 = enc.a($$6, $$7);
      ji $$9 = new ji(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ji> $$10 = a($$1, $$9);
      int $$11 = ayy.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ji $$14 = $$10.remove($$13);
            dqc $$15 = dqc.a($$1);
            ji $$16 = erm.a(new ji(5, 0, 6), doj.a, $$15, ji.c).a((km)$$14);
            enc $$17 = enc.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ji> a(azg $$0, ji $$1) {
      List<ji> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayy.a($$0, 1, 8), 0, 16 + ayy.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayy.a($$0, 1, 8), 0, ayy.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayy.a($$0, 1, 8), 0, -16 + ayy.a($$0, 4, 8)));
      $$2.add($$1.b(ayy.a($$0, 1, 7), 0, 16 + ayy.a($$0, 1, 7)));
      $$2.add($$1.b(ayy.a($$0, 1, 7), 0, -16 + ayy.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayy.a($$0, 1, 7), 0, 16 + ayy.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayy.a($$0, 1, 7), 0, ayy.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayy.a($$0, 1, 7), 0, -16 + ayy.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ern $$0, ji $$1, dqc $$2, enp $$3, azg $$4, epx $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aku $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new epw.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aku[] $$9 = $$6 ? g : d;
            aku[] $$10 = $$6 ? i : e;
            aku[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new epw.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new epw.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new epw.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends enu {
      private final epx.a h;
      private final float i;
      private final boolean j;

      public a(ern $$0, aku $$1, ji $$2, dqc $$3, float $$4, epx.a $$5, boolean $$6) {
         super(eob.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ern $$0, tq $$1, dqc $$2, float $$3, epx.a $$4, boolean $$5) {
         super(eob.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eri a(dqc $$0, float $$1, epx.a $$2) {
         erj $$3 = $$2 == epx.a.b ? epw.b : epw.a;
         return new eri().a($$0).a(doj.a).a(new eqp($$1)).a(eqn.d).a($$3);
      }

      public static epw.a a(ern $$0, tq $$1) {
         dqc $$2 = dqc.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         epx.a $$4 = epx.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new epw.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djm.cD.m().b(dkn.e, Boolean.valueOf($$2.b_($$1).a(awu.a))), 2);
            dtx $$5 = $$2.c_($$1);
            if ($$5 instanceof due) {
               ((due)$$5).a(this.j ? evl.E : evl.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            clk $$6 = buq.K.a($$2.a(), bup.d);
            if ($$6 != null) {
               $$6.aj();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bup.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, djm.a.m(), 2);
               } else {
                  $$2.a($$1, djm.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
         int $$7 = $$0.a(ecq.a.c, this.d.u(), this.d.w());
         this.d = new ji(this.d.u(), $$7, this.d.w());
         ji $$8 = erm.a(new ji(this.b.a().u() - 1, 0, this.b.a().w() - 1), doj.a, this.c.d(), ji.c).a((km)this.d);
         this.d = new ji(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ji $$0, dfl $$1, ji $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ji $$7 : ji.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ji.a $$11 = new ji.a($$8, $$10, $$9);
            dwv $$12 = $$1.a_($$11);

            for (esx $$13 = $$1.b_($$11); ($$12.l() || $$13.a(awu.a) || $$12.a(awo.ap)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
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
