import com.google.common.collect.Lists;
import java.util.List;

public class eup {
   static final ewc a = a(dng.L, dng.M, faf.bb);
   static final ewc b = a(dng.O, dng.P, faf.bc);
   private static final alk[] c = new alk[]{
      alk.b("underwater_ruin/warm_1"),
      alk.b("underwater_ruin/warm_2"),
      alk.b("underwater_ruin/warm_3"),
      alk.b("underwater_ruin/warm_4"),
      alk.b("underwater_ruin/warm_5"),
      alk.b("underwater_ruin/warm_6"),
      alk.b("underwater_ruin/warm_7"),
      alk.b("underwater_ruin/warm_8")
   };
   private static final alk[] d = new alk[]{
      alk.b("underwater_ruin/brick_1"),
      alk.b("underwater_ruin/brick_2"),
      alk.b("underwater_ruin/brick_3"),
      alk.b("underwater_ruin/brick_4"),
      alk.b("underwater_ruin/brick_5"),
      alk.b("underwater_ruin/brick_6"),
      alk.b("underwater_ruin/brick_7"),
      alk.b("underwater_ruin/brick_8")
   };
   private static final alk[] e = new alk[]{
      alk.b("underwater_ruin/cracked_1"),
      alk.b("underwater_ruin/cracked_2"),
      alk.b("underwater_ruin/cracked_3"),
      alk.b("underwater_ruin/cracked_4"),
      alk.b("underwater_ruin/cracked_5"),
      alk.b("underwater_ruin/cracked_6"),
      alk.b("underwater_ruin/cracked_7"),
      alk.b("underwater_ruin/cracked_8")
   };
   private static final alk[] f = new alk[]{
      alk.b("underwater_ruin/mossy_1"),
      alk.b("underwater_ruin/mossy_2"),
      alk.b("underwater_ruin/mossy_3"),
      alk.b("underwater_ruin/mossy_4"),
      alk.b("underwater_ruin/mossy_5"),
      alk.b("underwater_ruin/mossy_6"),
      alk.b("underwater_ruin/mossy_7"),
      alk.b("underwater_ruin/mossy_8")
   };
   private static final alk[] g = new alk[]{
      alk.b("underwater_ruin/big_brick_1"), alk.b("underwater_ruin/big_brick_2"), alk.b("underwater_ruin/big_brick_3"), alk.b("underwater_ruin/big_brick_8")
   };
   private static final alk[] h = new alk[]{
      alk.b("underwater_ruin/big_mossy_1"), alk.b("underwater_ruin/big_mossy_2"), alk.b("underwater_ruin/big_mossy_3"), alk.b("underwater_ruin/big_mossy_8")
   };
   private static final alk[] i = new alk[]{
      alk.b("underwater_ruin/big_cracked_1"),
      alk.b("underwater_ruin/big_cracked_2"),
      alk.b("underwater_ruin/big_cracked_3"),
      alk.b("underwater_ruin/big_cracked_8")
   };
   private static final alk[] j = new alk[]{
      alk.b("underwater_ruin/big_warm_4"), alk.b("underwater_ruin/big_warm_5"), alk.b("underwater_ruin/big_warm_6"), alk.b("underwater_ruin/big_warm_7")
   };

   private static ewc a(dne $$0, dne $$1, alj<fao> $$2) {
      return new evk(new evy(List.of(new evu(new evh($$0), evc.b, evr.b, $$1.m(), new ewj($$2)))), btv.a(5));
   }

   private static alk a(azz $$0) {
      return ag.a(c, $$0);
   }

   private static alk b(azz $$0) {
      return ag.a(j, $$0);
   }

   public static void a(ewg $$0, iw $$1, dty $$2, esi $$3, azz $$4, euq $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ewg $$0, azz $$1, dty $$2, iw $$3, euq $$4, esi $$5) {
      iw $$6 = new iw($$3.u(), 90, $$3.w());
      iw $$7 = ewf.a(new iw(15, 0, 15), dsh.a, $$2, iw.c).a((kb)$$6);
      erv $$8 = erv.a($$6, $$7);
      iw $$9 = new iw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iw> $$10 = a($$1, $$9);
      int $$11 = azq.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iw $$14 = $$10.remove($$13);
            dty $$15 = dty.a($$1);
            iw $$16 = ewf.a(new iw(5, 0, 6), dsh.a, $$15, iw.c).a((kb)$$14);
            erv $$17 = erv.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iw> a(azz $$0, iw $$1) {
      List<iw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azq.a($$0, 1, 8), 0, 16 + azq.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azq.a($$0, 1, 8), 0, azq.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azq.a($$0, 1, 8), 0, -16 + azq.a($$0, 4, 8)));
      $$2.add($$1.b(azq.a($$0, 1, 7), 0, 16 + azq.a($$0, 1, 7)));
      $$2.add($$1.b(azq.a($$0, 1, 7), 0, -16 + azq.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azq.a($$0, 1, 7), 0, 16 + azq.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azq.a($$0, 1, 7), 0, azq.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azq.a($$0, 1, 7), 0, -16 + azq.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ewg $$0, iw $$1, dty $$2, esi $$3, azz $$4, euq $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alk $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eup.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alk[] $$9 = $$6 ? g : d;
            alk[] $$10 = $$6 ? i : e;
            alk[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eup.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eup.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eup.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends esn {
      private final euq.a h;
      private final float i;
      private final boolean j;

      public a(ewg $$0, alk $$1, iw $$2, dty $$3, float $$4, euq.a $$5, boolean $$6) {
         super(esu.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ewg $$0, ua $$1, dty $$2, float $$3, euq.a $$4, boolean $$5) {
         super(esu.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ewb a(dty $$0, float $$1, euq.a $$2) {
         ewc $$3 = $$2 == euq.a.b ? eup.b : eup.a;
         return new ewb().a($$0).a(dsh.a).a(new evi($$1)).a(evg.d).a($$3);
      }

      public static eup.a a(ewg $$0, ua $$1) {
         dty $$2 = $$1.<dty>a("Rot", dty.h).orElseThrow();
         float $$3 = $$1.b("Integrity", 0.0F);
         euq.a $$4 = $$1.<euq.a>a("BiomeType", euq.a.d).orElseThrow();
         boolean $$5 = $$1.b("IsLarge", false);
         return new eup.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dty.h, this.c.d());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", euq.a.d, this.h);
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dng.cG.m().b(doi.e, Boolean.valueOf($$2.b_($$1).a(axl.a))), 2);
            dye $$5 = $$2.c_($$1);
            if ($$5 instanceof dym) {
               ((dym)$$5).a(this.j ? faf.E : faf.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cop $$6 = bxe.L.a($$2.a(), bxd.d);
            if ($$6 != null) {
               $$6.gc();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bxd.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dng.a.m(), 2);
               } else {
                  $$2.a($$1, dng.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         int $$7 = $$0.a(ehf.a.c, this.d.u(), this.d.w());
         this.d = new iw(this.d.u(), $$7, this.d.w());
         iw $$8 = ewf.a(new iw(this.b.a().u() - 1, 0, this.b.a().w() - 1), dsh.a, this.c.d(), iw.c).a((kb)this.d);
         this.d = new iw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iw $$0, djd $$1, iw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iw $$7 : iw.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iw.a $$11 = new iw.a($$8, $$10, $$9);
            ebg $$12 = $$1.a_($$11);

            for (exq $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axl.a) || $$12.a(axg.ap)) && $$10 > $$1.K_() + 1; $$13 = $$1.b_($$11)) {
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
