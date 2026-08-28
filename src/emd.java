import com.google.common.collect.Lists;
import java.util.List;

public class emd {
   static final enq a = a(dga.I, dga.J, ern.bh);
   static final enq b = a(dga.L, dga.M, ern.bi);
   private static final akr[] c = new akr[]{
      akr.b("underwater_ruin/warm_1"),
      akr.b("underwater_ruin/warm_2"),
      akr.b("underwater_ruin/warm_3"),
      akr.b("underwater_ruin/warm_4"),
      akr.b("underwater_ruin/warm_5"),
      akr.b("underwater_ruin/warm_6"),
      akr.b("underwater_ruin/warm_7"),
      akr.b("underwater_ruin/warm_8")
   };
   private static final akr[] d = new akr[]{
      akr.b("underwater_ruin/brick_1"),
      akr.b("underwater_ruin/brick_2"),
      akr.b("underwater_ruin/brick_3"),
      akr.b("underwater_ruin/brick_4"),
      akr.b("underwater_ruin/brick_5"),
      akr.b("underwater_ruin/brick_6"),
      akr.b("underwater_ruin/brick_7"),
      akr.b("underwater_ruin/brick_8")
   };
   private static final akr[] e = new akr[]{
      akr.b("underwater_ruin/cracked_1"),
      akr.b("underwater_ruin/cracked_2"),
      akr.b("underwater_ruin/cracked_3"),
      akr.b("underwater_ruin/cracked_4"),
      akr.b("underwater_ruin/cracked_5"),
      akr.b("underwater_ruin/cracked_6"),
      akr.b("underwater_ruin/cracked_7"),
      akr.b("underwater_ruin/cracked_8")
   };
   private static final akr[] f = new akr[]{
      akr.b("underwater_ruin/mossy_1"),
      akr.b("underwater_ruin/mossy_2"),
      akr.b("underwater_ruin/mossy_3"),
      akr.b("underwater_ruin/mossy_4"),
      akr.b("underwater_ruin/mossy_5"),
      akr.b("underwater_ruin/mossy_6"),
      akr.b("underwater_ruin/mossy_7"),
      akr.b("underwater_ruin/mossy_8")
   };
   private static final akr[] g = new akr[]{
      akr.b("underwater_ruin/big_brick_1"), akr.b("underwater_ruin/big_brick_2"), akr.b("underwater_ruin/big_brick_3"), akr.b("underwater_ruin/big_brick_8")
   };
   private static final akr[] h = new akr[]{
      akr.b("underwater_ruin/big_mossy_1"), akr.b("underwater_ruin/big_mossy_2"), akr.b("underwater_ruin/big_mossy_3"), akr.b("underwater_ruin/big_mossy_8")
   };
   private static final akr[] i = new akr[]{
      akr.b("underwater_ruin/big_cracked_1"),
      akr.b("underwater_ruin/big_cracked_2"),
      akr.b("underwater_ruin/big_cracked_3"),
      akr.b("underwater_ruin/big_cracked_8")
   };
   private static final akr[] j = new akr[]{
      akr.b("underwater_ruin/big_warm_4"), akr.b("underwater_ruin/big_warm_5"), akr.b("underwater_ruin/big_warm_6"), akr.b("underwater_ruin/big_warm_7")
   };

   private static enq a(dfy $$0, dfy $$1, akq<erw> $$2) {
      return new emy(new enm(List.of(new eni(new emv($$0), emq.b, enf.b, $$1.o(), new enx($$2)))), bpt.a(5));
   }

   private static akr a(ayw $$0) {
      return ad.a(c, $$0);
   }

   private static akr b(ayw $$0) {
      return ad.a(j, $$0);
   }

   public static void a(enu $$0, jd $$1, dmm $$2, ejw $$3, ayw $$4, eme $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(enu $$0, ayw $$1, dmm $$2, jd $$3, eme $$4, ejw $$5) {
      jd $$6 = new jd($$3.u(), 90, $$3.w());
      jd $$7 = ent.a(new jd(15, 0, 15), dkv.a, $$2, jd.c).a((kh)$$6);
      ejj $$8 = ejj.a($$6, $$7);
      jd $$9 = new jd(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jd> $$10 = a($$1, $$9);
      int $$11 = ayo.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jd $$14 = $$10.remove($$13);
            dmm $$15 = dmm.a($$1);
            jd $$16 = ent.a(new jd(5, 0, 6), dkv.a, $$15, jd.c).a((kh)$$14);
            ejj $$17 = ejj.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jd> a(ayw $$0, jd $$1) {
      List<jd> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayo.a($$0, 1, 8), 0, 16 + ayo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayo.a($$0, 1, 8), 0, ayo.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayo.a($$0, 1, 8), 0, -16 + ayo.a($$0, 4, 8)));
      $$2.add($$1.b(ayo.a($$0, 1, 7), 0, 16 + ayo.a($$0, 1, 7)));
      $$2.add($$1.b(ayo.a($$0, 1, 7), 0, -16 + ayo.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayo.a($$0, 1, 7), 0, 16 + ayo.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayo.a($$0, 1, 7), 0, ayo.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayo.a($$0, 1, 7), 0, -16 + ayo.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(enu $$0, jd $$1, dmm $$2, ejw $$3, ayw $$4, eme $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akr $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new emd.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akr[] $$9 = $$6 ? g : d;
            akr[] $$10 = $$6 ? i : e;
            akr[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new emd.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new emd.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new emd.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ekb {
      private final eme.a h;
      private final float i;
      private final boolean j;

      public a(enu $$0, akr $$1, jd $$2, dmm $$3, float $$4, eme.a $$5, boolean $$6) {
         super(eki.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(enu $$0, ub $$1, dmm $$2, float $$3, eme.a $$4, boolean $$5) {
         super(eki.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static enp a(dmm $$0, float $$1, eme.a $$2) {
         enq $$3 = $$2 == eme.a.b ? emd.b : emd.a;
         return new enp().a($$0).a(dkv.a).a(new emw($$1)).a(emu.d).a($$3);
      }

      public static emd.a a(enu $$0, ub $$1) {
         dmm $$2 = dmm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eme.a $$4 = eme.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new emd.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dga.cv.o().a(dhb.e, Boolean.valueOf($$2.b_($$1).a(awk.a))), 2);
            dqh $$5 = $$2.c_($$1);
            if ($$5 instanceof dqo) {
               ((dqo)$$5).a(this.j ? ern.F : ern.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjr $$6 = bsx.B.a((dcw)$$2.E());
            if ($$6 != null) {
               $$6.fR();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btr.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dga.a.o(), 2);
               } else {
                  $$2.a($$1, dga.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         int $$7 = $$0.a(dyy.a.c, this.d.u(), this.d.w());
         this.d = new jd(this.d.u(), $$7, this.d.w());
         jd $$8 = ent.a(new jd(this.b.a().u() - 1, 0, this.b.a().w() - 1), dkv.a, this.c.d(), jd.c).a((kh)this.d);
         this.d = new jd(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jd $$0, dcc $$1, jd $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jd $$7 : jd.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jd.a $$11 = new jd.a($$8, $$10, $$9);
            dtc $$12 = $$1.a_($$11);

            for (epe $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awk.a) || $$12.a(awe.an)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
