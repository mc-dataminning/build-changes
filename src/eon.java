import com.google.common.collect.Lists;
import java.util.List;

public class eon {
   static final eqa a = a(dil.I, dil.J, euc.bb);
   static final eqa b = a(dil.L, dil.M, euc.bc);
   private static final all[] c = new all[]{
      all.b("underwater_ruin/warm_1"),
      all.b("underwater_ruin/warm_2"),
      all.b("underwater_ruin/warm_3"),
      all.b("underwater_ruin/warm_4"),
      all.b("underwater_ruin/warm_5"),
      all.b("underwater_ruin/warm_6"),
      all.b("underwater_ruin/warm_7"),
      all.b("underwater_ruin/warm_8")
   };
   private static final all[] d = new all[]{
      all.b("underwater_ruin/brick_1"),
      all.b("underwater_ruin/brick_2"),
      all.b("underwater_ruin/brick_3"),
      all.b("underwater_ruin/brick_4"),
      all.b("underwater_ruin/brick_5"),
      all.b("underwater_ruin/brick_6"),
      all.b("underwater_ruin/brick_7"),
      all.b("underwater_ruin/brick_8")
   };
   private static final all[] e = new all[]{
      all.b("underwater_ruin/cracked_1"),
      all.b("underwater_ruin/cracked_2"),
      all.b("underwater_ruin/cracked_3"),
      all.b("underwater_ruin/cracked_4"),
      all.b("underwater_ruin/cracked_5"),
      all.b("underwater_ruin/cracked_6"),
      all.b("underwater_ruin/cracked_7"),
      all.b("underwater_ruin/cracked_8")
   };
   private static final all[] f = new all[]{
      all.b("underwater_ruin/mossy_1"),
      all.b("underwater_ruin/mossy_2"),
      all.b("underwater_ruin/mossy_3"),
      all.b("underwater_ruin/mossy_4"),
      all.b("underwater_ruin/mossy_5"),
      all.b("underwater_ruin/mossy_6"),
      all.b("underwater_ruin/mossy_7"),
      all.b("underwater_ruin/mossy_8")
   };
   private static final all[] g = new all[]{
      all.b("underwater_ruin/big_brick_1"), all.b("underwater_ruin/big_brick_2"), all.b("underwater_ruin/big_brick_3"), all.b("underwater_ruin/big_brick_8")
   };
   private static final all[] h = new all[]{
      all.b("underwater_ruin/big_mossy_1"), all.b("underwater_ruin/big_mossy_2"), all.b("underwater_ruin/big_mossy_3"), all.b("underwater_ruin/big_mossy_8")
   };
   private static final all[] i = new all[]{
      all.b("underwater_ruin/big_cracked_1"),
      all.b("underwater_ruin/big_cracked_2"),
      all.b("underwater_ruin/big_cracked_3"),
      all.b("underwater_ruin/big_cracked_8")
   };
   private static final all[] j = new all[]{
      all.b("underwater_ruin/big_warm_4"), all.b("underwater_ruin/big_warm_5"), all.b("underwater_ruin/big_warm_6"), all.b("underwater_ruin/big_warm_7")
   };

   private static eqa a(dij $$0, dij $$1, alk<eul> $$2) {
      return new epi(new epw(List.of(new eps(new epf($$0), epa.b, epp.b, $$1.m(), new eqh($$2)))), brj.a(5));
   }

   private static all a(azv $$0) {
      return ae.a(c, $$0);
   }

   private static all b(azv $$0) {
      return ae.a(j, $$0);
   }

   public static void a(eqe $$0, jh $$1, dow $$2, emg $$3, azv $$4, eoo $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eqe $$0, azv $$1, dow $$2, jh $$3, eoo $$4, emg $$5) {
      jh $$6 = new jh($$3.u(), 90, $$3.w());
      jh $$7 = eqd.a(new jh(15, 0, 15), dnf.a, $$2, jh.c).a((kl)$$6);
      elt $$8 = elt.a($$6, $$7);
      jh $$9 = new jh(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jh> $$10 = a($$1, $$9);
      int $$11 = azn.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jh $$14 = $$10.remove($$13);
            dow $$15 = dow.a($$1);
            jh $$16 = eqd.a(new jh(5, 0, 6), dnf.a, $$15, jh.c).a((kl)$$14);
            elt $$17 = elt.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jh> a(azv $$0, jh $$1) {
      List<jh> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azn.a($$0, 1, 8), 0, 16 + azn.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azn.a($$0, 1, 8), 0, azn.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azn.a($$0, 1, 8), 0, -16 + azn.a($$0, 4, 8)));
      $$2.add($$1.b(azn.a($$0, 1, 7), 0, 16 + azn.a($$0, 1, 7)));
      $$2.add($$1.b(azn.a($$0, 1, 7), 0, -16 + azn.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azn.a($$0, 1, 7), 0, 16 + azn.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azn.a($$0, 1, 7), 0, azn.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azn.a($$0, 1, 7), 0, -16 + azn.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eqe $$0, jh $$1, dow $$2, emg $$3, azv $$4, eoo $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            all $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eon.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            all[] $$9 = $$6 ? g : d;
            all[] $$10 = $$6 ? i : e;
            all[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eon.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eon.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eon.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eml {
      private final eoo.a h;
      private final float i;
      private final boolean j;

      public a(eqe $$0, all $$1, jh $$2, dow $$3, float $$4, eoo.a $$5, boolean $$6) {
         super(ems.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eqe $$0, un $$1, dow $$2, float $$3, eoo.a $$4, boolean $$5) {
         super(ems.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static epz a(dow $$0, float $$1, eoo.a $$2) {
         eqa $$3 = $$2 == eoo.a.b ? eon.b : eon.a;
         return new epz().a($$0).a(dnf.a).a(new epg($$1)).a(epe.d).a($$3);
      }

      public static eon.a a(eqe $$0, un $$1) {
         dow $$2 = dow.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eoo.a $$4 = eoo.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eon.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(emr $$0, un $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dil.cv.m().b(djm.e, Boolean.valueOf($$2.b_($$1).a(axj.a))), 2);
            dsr $$5 = $$2.c_($$1);
            if ($$5 instanceof dsy) {
               ((dsy)$$5).a(this.j ? euc.E : euc.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            clj $$6 = bup.B.a($$2.E(), buo.d);
            if ($$6 != null) {
               $$6.gb();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), buo.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dil.a.m(), 2);
               } else {
                  $$2.a($$1, dil.G.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
         int $$7 = $$0.a(ebj.a.c, this.d.u(), this.d.w());
         this.d = new jh(this.d.u(), $$7, this.d.w());
         jh $$8 = eqd.a(new jh(this.b.a().u() - 1, 0, this.b.a().w() - 1), dnf.a, this.c.d(), jh.c).a((kl)this.d);
         this.d = new jh(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jh $$0, dek $$1, jh $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jh $$7 : jh.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jh.a $$11 = new jh.a($$8, $$10, $$9);
            dvo $$12 = $$1.a_($$11);

            for (ero $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axj.a) || $$12.a(axd.ao)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
