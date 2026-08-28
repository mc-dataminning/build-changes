import com.google.common.collect.Lists;
import java.util.List;

public class ely {
   static final enk a = a(dfy.I, dfy.J, erh.bh);
   static final enk b = a(dfy.L, dfy.M, erh.bi);
   private static final akq[] c = new akq[]{
      akq.b("underwater_ruin/warm_1"),
      akq.b("underwater_ruin/warm_2"),
      akq.b("underwater_ruin/warm_3"),
      akq.b("underwater_ruin/warm_4"),
      akq.b("underwater_ruin/warm_5"),
      akq.b("underwater_ruin/warm_6"),
      akq.b("underwater_ruin/warm_7"),
      akq.b("underwater_ruin/warm_8")
   };
   private static final akq[] d = new akq[]{
      akq.b("underwater_ruin/brick_1"),
      akq.b("underwater_ruin/brick_2"),
      akq.b("underwater_ruin/brick_3"),
      akq.b("underwater_ruin/brick_4"),
      akq.b("underwater_ruin/brick_5"),
      akq.b("underwater_ruin/brick_6"),
      akq.b("underwater_ruin/brick_7"),
      akq.b("underwater_ruin/brick_8")
   };
   private static final akq[] e = new akq[]{
      akq.b("underwater_ruin/cracked_1"),
      akq.b("underwater_ruin/cracked_2"),
      akq.b("underwater_ruin/cracked_3"),
      akq.b("underwater_ruin/cracked_4"),
      akq.b("underwater_ruin/cracked_5"),
      akq.b("underwater_ruin/cracked_6"),
      akq.b("underwater_ruin/cracked_7"),
      akq.b("underwater_ruin/cracked_8")
   };
   private static final akq[] f = new akq[]{
      akq.b("underwater_ruin/mossy_1"),
      akq.b("underwater_ruin/mossy_2"),
      akq.b("underwater_ruin/mossy_3"),
      akq.b("underwater_ruin/mossy_4"),
      akq.b("underwater_ruin/mossy_5"),
      akq.b("underwater_ruin/mossy_6"),
      akq.b("underwater_ruin/mossy_7"),
      akq.b("underwater_ruin/mossy_8")
   };
   private static final akq[] g = new akq[]{
      akq.b("underwater_ruin/big_brick_1"), akq.b("underwater_ruin/big_brick_2"), akq.b("underwater_ruin/big_brick_3"), akq.b("underwater_ruin/big_brick_8")
   };
   private static final akq[] h = new akq[]{
      akq.b("underwater_ruin/big_mossy_1"), akq.b("underwater_ruin/big_mossy_2"), akq.b("underwater_ruin/big_mossy_3"), akq.b("underwater_ruin/big_mossy_8")
   };
   private static final akq[] i = new akq[]{
      akq.b("underwater_ruin/big_cracked_1"),
      akq.b("underwater_ruin/big_cracked_2"),
      akq.b("underwater_ruin/big_cracked_3"),
      akq.b("underwater_ruin/big_cracked_8")
   };
   private static final akq[] j = new akq[]{
      akq.b("underwater_ruin/big_warm_4"), akq.b("underwater_ruin/big_warm_5"), akq.b("underwater_ruin/big_warm_6"), akq.b("underwater_ruin/big_warm_7")
   };

   private static enk a(dfw $$0, dfw $$1, akp<erq> $$2) {
      return new emt(new eng(List.of(new enc(new emq($$0), eml.b, emz.b, $$1.o(), new enr($$2)))), bps.a(5));
   }

   private static akq a(ayv $$0) {
      return ad.a(c, $$0);
   }

   private static akq b(ayv $$0) {
      return ad.a(j, $$0);
   }

   public static void a(eno $$0, jd $$1, dmk $$2, ejr $$3, ayv $$4, elz $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eno $$0, ayv $$1, dmk $$2, jd $$3, elz $$4, ejr $$5) {
      jd $$6 = new jd($$3.u(), 90, $$3.w());
      jd $$7 = enn.a(new jd(15, 0, 15), dkt.a, $$2, jd.c).a((kh)$$6);
      eje $$8 = eje.a($$6, $$7);
      jd $$9 = new jd(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jd> $$10 = a($$1, $$9);
      int $$11 = ayn.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jd $$14 = $$10.remove($$13);
            dmk $$15 = dmk.a($$1);
            jd $$16 = enn.a(new jd(5, 0, 6), dkt.a, $$15, jd.c).a((kh)$$14);
            eje $$17 = eje.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jd> a(ayv $$0, jd $$1) {
      List<jd> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayn.a($$0, 1, 8), 0, 16 + ayn.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayn.a($$0, 1, 8), 0, ayn.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayn.a($$0, 1, 8), 0, -16 + ayn.a($$0, 4, 8)));
      $$2.add($$1.b(ayn.a($$0, 1, 7), 0, 16 + ayn.a($$0, 1, 7)));
      $$2.add($$1.b(ayn.a($$0, 1, 7), 0, -16 + ayn.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayn.a($$0, 1, 7), 0, 16 + ayn.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayn.a($$0, 1, 7), 0, ayn.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayn.a($$0, 1, 7), 0, -16 + ayn.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eno $$0, jd $$1, dmk $$2, ejr $$3, ayv $$4, elz $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akq $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ely.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akq[] $$9 = $$6 ? g : d;
            akq[] $$10 = $$6 ? i : e;
            akq[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ely.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ely.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ely.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ejw {
      private final elz.a h;
      private final float i;
      private final boolean j;

      public a(eno $$0, akq $$1, jd $$2, dmk $$3, float $$4, elz.a $$5, boolean $$6) {
         super(ekd.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eno $$0, ua $$1, dmk $$2, float $$3, elz.a $$4, boolean $$5) {
         super(ekd.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static enj a(dmk $$0, float $$1, elz.a $$2) {
         enk $$3 = $$2 == elz.a.b ? ely.b : ely.a;
         return new enj().a($$0).a(dkt.a).a(new emr($$1)).a(emp.d).a($$3);
      }

      public static ely.a a(eno $$0, ua $$1) {
         dmk $$2 = dmk.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         elz.a $$4 = elz.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ely.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfy.cv.o().a(dgz.e, Boolean.valueOf($$2.b_($$1).a(awj.a))), 2);
            dqf $$5 = $$2.c_($$1);
            if ($$5 instanceof dqm) {
               ((dqm)$$5).a(this.j ? erh.F : erh.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjp $$6 = bsw.B.a((dcu)$$2.E());
            if ($$6 != null) {
               $$6.fP();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btp.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfy.a.o(), 2);
               } else {
                  $$2.a($$1, dfy.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         int $$7 = $$0.a(dyv.a.c, this.d.u(), this.d.w());
         this.d = new jd(this.d.u(), $$7, this.d.w());
         jd $$8 = enn.a(new jd(this.b.a().u() - 1, 0, this.b.a().w() - 1), dkt.a, this.c.d(), jd.c).a((kh)this.d);
         this.d = new jd(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jd $$0, dca $$1, jd $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jd $$7 : jd.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jd.a $$11 = new jd.a($$8, $$10, $$9);
            dta $$12 = $$1.a_($$11);

            for (eoy $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awj.a) || $$12.a(awd.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
