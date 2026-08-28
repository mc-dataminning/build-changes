import com.google.common.collect.Lists;
import java.util.List;

public class ers {
   static final etf a = a(dkw.L, dkw.M, exh.bb);
   static final etf b = a(dkw.O, dkw.P, exh.bc);
   private static final ald[] c = new ald[]{
      ald.b("underwater_ruin/warm_1"),
      ald.b("underwater_ruin/warm_2"),
      ald.b("underwater_ruin/warm_3"),
      ald.b("underwater_ruin/warm_4"),
      ald.b("underwater_ruin/warm_5"),
      ald.b("underwater_ruin/warm_6"),
      ald.b("underwater_ruin/warm_7"),
      ald.b("underwater_ruin/warm_8")
   };
   private static final ald[] d = new ald[]{
      ald.b("underwater_ruin/brick_1"),
      ald.b("underwater_ruin/brick_2"),
      ald.b("underwater_ruin/brick_3"),
      ald.b("underwater_ruin/brick_4"),
      ald.b("underwater_ruin/brick_5"),
      ald.b("underwater_ruin/brick_6"),
      ald.b("underwater_ruin/brick_7"),
      ald.b("underwater_ruin/brick_8")
   };
   private static final ald[] e = new ald[]{
      ald.b("underwater_ruin/cracked_1"),
      ald.b("underwater_ruin/cracked_2"),
      ald.b("underwater_ruin/cracked_3"),
      ald.b("underwater_ruin/cracked_4"),
      ald.b("underwater_ruin/cracked_5"),
      ald.b("underwater_ruin/cracked_6"),
      ald.b("underwater_ruin/cracked_7"),
      ald.b("underwater_ruin/cracked_8")
   };
   private static final ald[] f = new ald[]{
      ald.b("underwater_ruin/mossy_1"),
      ald.b("underwater_ruin/mossy_2"),
      ald.b("underwater_ruin/mossy_3"),
      ald.b("underwater_ruin/mossy_4"),
      ald.b("underwater_ruin/mossy_5"),
      ald.b("underwater_ruin/mossy_6"),
      ald.b("underwater_ruin/mossy_7"),
      ald.b("underwater_ruin/mossy_8")
   };
   private static final ald[] g = new ald[]{
      ald.b("underwater_ruin/big_brick_1"), ald.b("underwater_ruin/big_brick_2"), ald.b("underwater_ruin/big_brick_3"), ald.b("underwater_ruin/big_brick_8")
   };
   private static final ald[] h = new ald[]{
      ald.b("underwater_ruin/big_mossy_1"), ald.b("underwater_ruin/big_mossy_2"), ald.b("underwater_ruin/big_mossy_3"), ald.b("underwater_ruin/big_mossy_8")
   };
   private static final ald[] i = new ald[]{
      ald.b("underwater_ruin/big_cracked_1"),
      ald.b("underwater_ruin/big_cracked_2"),
      ald.b("underwater_ruin/big_cracked_3"),
      ald.b("underwater_ruin/big_cracked_8")
   };
   private static final ald[] j = new ald[]{
      ald.b("underwater_ruin/big_warm_4"), ald.b("underwater_ruin/big_warm_5"), ald.b("underwater_ruin/big_warm_6"), ald.b("underwater_ruin/big_warm_7")
   };

   private static etf a(dku $$0, dku $$1, alc<exq> $$2) {
      return new esn(new etb(List.of(new esx(new esk($$0), esf.b, esu.b, $$1.m(), new etm($$2)))), bss.a(5));
   }

   private static ald a(azs $$0) {
      return af.a(c, $$0);
   }

   private static ald b(azs $$0) {
      return af.a(j, $$0);
   }

   public static void a(etj $$0, jj $$1, drm $$2, epl $$3, azs $$4, ert $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(etj $$0, azs $$1, drm $$2, jj $$3, ert $$4, epl $$5) {
      jj $$6 = new jj($$3.u(), 90, $$3.w());
      jj $$7 = eti.a(new jj(15, 0, 15), dpv.a, $$2, jj.c).a((kn)$$6);
      eoy $$8 = eoy.a($$6, $$7);
      jj $$9 = new jj(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jj> $$10 = a($$1, $$9);
      int $$11 = azk.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jj $$14 = $$10.remove($$13);
            drm $$15 = drm.a($$1);
            jj $$16 = eti.a(new jj(5, 0, 6), dpv.a, $$15, jj.c).a((kn)$$14);
            eoy $$17 = eoy.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jj> a(azs $$0, jj $$1) {
      List<jj> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, 16 + azk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, azk.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azk.a($$0, 1, 8), 0, -16 + azk.a($$0, 4, 8)));
      $$2.add($$1.b(azk.a($$0, 1, 7), 0, 16 + azk.a($$0, 1, 7)));
      $$2.add($$1.b(azk.a($$0, 1, 7), 0, -16 + azk.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, 16 + azk.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, azk.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azk.a($$0, 1, 7), 0, -16 + azk.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(etj $$0, jj $$1, drm $$2, epl $$3, azs $$4, ert $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ald $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ers.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ald[] $$9 = $$6 ? g : d;
            ald[] $$10 = $$6 ? i : e;
            ald[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ers.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ers.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ers.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends epq {
      private final ert.a h;
      private final float i;
      private final boolean j;

      public a(etj $$0, ald $$1, jj $$2, drm $$3, float $$4, ert.a $$5, boolean $$6) {
         super(epx.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(etj $$0, tw $$1, drm $$2, float $$3, ert.a $$4, boolean $$5) {
         super(epx.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ete a(drm $$0, float $$1, ert.a $$2) {
         etf $$3 = $$2 == ert.a.b ? ers.b : ers.a;
         return new ete().a($$0).a(dpv.a).a(new esl($$1)).a(esj.d).a($$3);
      }

      public static ers.a a(etj $$0, tw $$1) {
         drm $$2 = drm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ert.a $$4 = ert.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ers.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkw.cD.m().b(dlx.e, Boolean.valueOf($$2.b_($$1).a(axf.a))), 2);
            dvl $$5 = $$2.c_($$1);
            if ($$5 instanceof dvt) {
               ((dvt)$$5).a(this.j ? exh.E : exh.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cmx $$6 = bwb.K.a($$2.a(), bwa.d);
            if ($$6 != null) {
               $$6.fY();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bwa.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dkw.a.m(), 2);
               } else {
                  $$2.a($$1, dkw.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         int $$7 = $$0.a(eel.a.c, this.d.u(), this.d.w());
         this.d = new jj(this.d.u(), $$7, this.d.w());
         jj $$8 = eti.a(new jj(this.b.a().u() - 1, 0, this.b.a().w() - 1), dpv.a, this.c.d(), jj.c).a((kn)this.d);
         this.d = new jj(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jj $$0, dgv $$1, jj $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jj $$7 : jj.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jj.a $$11 = new jj.a($$8, $$10, $$9);
            dym $$12 = $$1.a_($$11);

            for (eut $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axf.a) || $$12.a(awz.ap)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
