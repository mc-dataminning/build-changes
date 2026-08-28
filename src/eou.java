import com.google.common.collect.Lists;
import java.util.List;

public class eou {
   static final eqh a = a(dis.I, dis.J, euj.bb);
   static final eqh b = a(dis.L, dis.M, euj.bc);
   private static final alj[] c = new alj[]{
      alj.b("underwater_ruin/warm_1"),
      alj.b("underwater_ruin/warm_2"),
      alj.b("underwater_ruin/warm_3"),
      alj.b("underwater_ruin/warm_4"),
      alj.b("underwater_ruin/warm_5"),
      alj.b("underwater_ruin/warm_6"),
      alj.b("underwater_ruin/warm_7"),
      alj.b("underwater_ruin/warm_8")
   };
   private static final alj[] d = new alj[]{
      alj.b("underwater_ruin/brick_1"),
      alj.b("underwater_ruin/brick_2"),
      alj.b("underwater_ruin/brick_3"),
      alj.b("underwater_ruin/brick_4"),
      alj.b("underwater_ruin/brick_5"),
      alj.b("underwater_ruin/brick_6"),
      alj.b("underwater_ruin/brick_7"),
      alj.b("underwater_ruin/brick_8")
   };
   private static final alj[] e = new alj[]{
      alj.b("underwater_ruin/cracked_1"),
      alj.b("underwater_ruin/cracked_2"),
      alj.b("underwater_ruin/cracked_3"),
      alj.b("underwater_ruin/cracked_4"),
      alj.b("underwater_ruin/cracked_5"),
      alj.b("underwater_ruin/cracked_6"),
      alj.b("underwater_ruin/cracked_7"),
      alj.b("underwater_ruin/cracked_8")
   };
   private static final alj[] f = new alj[]{
      alj.b("underwater_ruin/mossy_1"),
      alj.b("underwater_ruin/mossy_2"),
      alj.b("underwater_ruin/mossy_3"),
      alj.b("underwater_ruin/mossy_4"),
      alj.b("underwater_ruin/mossy_5"),
      alj.b("underwater_ruin/mossy_6"),
      alj.b("underwater_ruin/mossy_7"),
      alj.b("underwater_ruin/mossy_8")
   };
   private static final alj[] g = new alj[]{
      alj.b("underwater_ruin/big_brick_1"), alj.b("underwater_ruin/big_brick_2"), alj.b("underwater_ruin/big_brick_3"), alj.b("underwater_ruin/big_brick_8")
   };
   private static final alj[] h = new alj[]{
      alj.b("underwater_ruin/big_mossy_1"), alj.b("underwater_ruin/big_mossy_2"), alj.b("underwater_ruin/big_mossy_3"), alj.b("underwater_ruin/big_mossy_8")
   };
   private static final alj[] i = new alj[]{
      alj.b("underwater_ruin/big_cracked_1"),
      alj.b("underwater_ruin/big_cracked_2"),
      alj.b("underwater_ruin/big_cracked_3"),
      alj.b("underwater_ruin/big_cracked_8")
   };
   private static final alj[] j = new alj[]{
      alj.b("underwater_ruin/big_warm_4"), alj.b("underwater_ruin/big_warm_5"), alj.b("underwater_ruin/big_warm_6"), alj.b("underwater_ruin/big_warm_7")
   };

   private static eqh a(diq $$0, diq $$1, ali<eus> $$2) {
      return new epp(new eqd(List.of(new epz(new epm($$0), eph.b, epw.b, $$1.m(), new eqo($$2)))), brm.a(5));
   }

   private static alj a(azu $$0) {
      return ae.a(c, $$0);
   }

   private static alj b(azu $$0) {
      return ae.a(j, $$0);
   }

   public static void a(eql $$0, jh $$1, dpd $$2, emn $$3, azu $$4, eov $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eql $$0, azu $$1, dpd $$2, jh $$3, eov $$4, emn $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = eqk.a(new jh(15, 0, 15), dnm.a, $$2, jh.c).a((kl)$$6);
      ema $$8 = ema.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = azm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            dpd $$15 = dpd.a($$1);
            jh $$16 = eqk.a(new jh(5, 0, 6), dnm.a, $$15, jh.c).a((kl)$$14);
            ema $$17 = ema.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jh> a(azu $$0, jh $$1) {
      List<jh> $$2 = Lists.newArrayList();
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

   private static void a(eql $$0, jh $$1, dpd $$2, emn $$3, azu $$4, eov $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alj $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eou.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alj[] $$9 = $$6 ? g : d;
            alj[] $$10 = $$6 ? i : e;
            alj[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eou.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eou.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eou.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ems {
      private final eov.a h;
      private final float i;
      private final boolean j;

      public a(eql $$0, alj $$1, jh $$2, dpd $$3, float $$4, eov.a $$5, boolean $$6) {
         super(emz.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eql $$0, ul $$1, dpd $$2, float $$3, eov.a $$4, boolean $$5) {
         super(emz.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eqg a(dpd $$0, float $$1, eov.a $$2) {
         eqh $$3 = $$2 == eov.a.b ? eou.b : eou.a;
         return new eqg().a($$0).a(dnm.a).a(new epn($$1)).a(epl.d).a($$3);
      }

      public static eou.a a(eql $$0, ul $$1) {
         dpd $$2 = dpd.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eov.a $$4 = eov.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eou.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dis.cv.m().b(djt.e, Boolean.valueOf($$2.b_($$1).a(axi.a))), 2);
            dsy $$5 = $$2.c_($$1);
            if ($$5 instanceof dtf) {
               ((dtf)$$5).a(this.j ? euj.E : euj.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            clm $$6 = bus.J.a($$2.a(), bur.d);
            if ($$6 != null) {
               $$6.ai();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bur.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.O()) {
                  $$2.a($$1, dis.a.m(), 2);
               } else {
                  $$2.a($$1, dis.G.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         int $$7 = $$0.a(ebq.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = eqk.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dnm.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, der $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dvv $$12 = $$1.a_($$11);

            for (erv $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axi.a) || $$12.a(axc.ao)) && $$10 > $$1.K_() + 1; $$13 = $$1.b_($$11)) {
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
