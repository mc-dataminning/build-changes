import com.google.common.collect.Lists;
import java.util.List;

public class euz {
   static final ewm a = a(dnq.L, dnq.M, fap.bb);
   static final ewm b = a(dnq.O, dnq.P, fap.bc);
   private static final alr[] c = new alr[]{
      alr.b("underwater_ruin/warm_1"),
      alr.b("underwater_ruin/warm_2"),
      alr.b("underwater_ruin/warm_3"),
      alr.b("underwater_ruin/warm_4"),
      alr.b("underwater_ruin/warm_5"),
      alr.b("underwater_ruin/warm_6"),
      alr.b("underwater_ruin/warm_7"),
      alr.b("underwater_ruin/warm_8")
   };
   private static final alr[] d = new alr[]{
      alr.b("underwater_ruin/brick_1"),
      alr.b("underwater_ruin/brick_2"),
      alr.b("underwater_ruin/brick_3"),
      alr.b("underwater_ruin/brick_4"),
      alr.b("underwater_ruin/brick_5"),
      alr.b("underwater_ruin/brick_6"),
      alr.b("underwater_ruin/brick_7"),
      alr.b("underwater_ruin/brick_8")
   };
   private static final alr[] e = new alr[]{
      alr.b("underwater_ruin/cracked_1"),
      alr.b("underwater_ruin/cracked_2"),
      alr.b("underwater_ruin/cracked_3"),
      alr.b("underwater_ruin/cracked_4"),
      alr.b("underwater_ruin/cracked_5"),
      alr.b("underwater_ruin/cracked_6"),
      alr.b("underwater_ruin/cracked_7"),
      alr.b("underwater_ruin/cracked_8")
   };
   private static final alr[] f = new alr[]{
      alr.b("underwater_ruin/mossy_1"),
      alr.b("underwater_ruin/mossy_2"),
      alr.b("underwater_ruin/mossy_3"),
      alr.b("underwater_ruin/mossy_4"),
      alr.b("underwater_ruin/mossy_5"),
      alr.b("underwater_ruin/mossy_6"),
      alr.b("underwater_ruin/mossy_7"),
      alr.b("underwater_ruin/mossy_8")
   };
   private static final alr[] g = new alr[]{
      alr.b("underwater_ruin/big_brick_1"), alr.b("underwater_ruin/big_brick_2"), alr.b("underwater_ruin/big_brick_3"), alr.b("underwater_ruin/big_brick_8")
   };
   private static final alr[] h = new alr[]{
      alr.b("underwater_ruin/big_mossy_1"), alr.b("underwater_ruin/big_mossy_2"), alr.b("underwater_ruin/big_mossy_3"), alr.b("underwater_ruin/big_mossy_8")
   };
   private static final alr[] i = new alr[]{
      alr.b("underwater_ruin/big_cracked_1"),
      alr.b("underwater_ruin/big_cracked_2"),
      alr.b("underwater_ruin/big_cracked_3"),
      alr.b("underwater_ruin/big_cracked_8")
   };
   private static final alr[] j = new alr[]{
      alr.b("underwater_ruin/big_warm_4"), alr.b("underwater_ruin/big_warm_5"), alr.b("underwater_ruin/big_warm_6"), alr.b("underwater_ruin/big_warm_7")
   };

   private static ewm a(dno $$0, dno $$1, alq<fay> $$2) {
      return new evu(new ewi(List.of(new ewe(new evr($$0), evm.b, ewb.b, $$1.m(), new ewt($$2)))), bue.a(5));
   }

   private static alr a(bai $$0) {
      return ag.a(c, $$0);
   }

   private static alr b(bai $$0) {
      return ag.a(j, $$0);
   }

   public static void a(ewq $$0, iw $$1, dui $$2, ess $$3, bai $$4, eva $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ewq $$0, bai $$1, dui $$2, iw $$3, eva $$4, ess $$5) {
      iw $$6 = new iw($$3.u(), 90, $$3.w());
      iw $$7 = ewp.a(new iw(15, 0, 15), dsr.a, $$2, iw.c).a((kb)$$6);
      esf $$8 = esf.a($$6, $$7);
      iw $$9 = new iw(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iw> $$10 = a($$1, $$9);
      int $$11 = azz.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iw $$14 = $$10.remove($$13);
            dui $$15 = dui.a($$1);
            iw $$16 = ewp.a(new iw(5, 0, 6), dsr.a, $$15, iw.c).a((kb)$$14);
            esf $$17 = esf.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iw> a(bai $$0, iw $$1) {
      List<iw> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azz.a($$0, 1, 8), 0, 16 + azz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azz.a($$0, 1, 8), 0, azz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azz.a($$0, 1, 8), 0, -16 + azz.a($$0, 4, 8)));
      $$2.add($$1.b(azz.a($$0, 1, 7), 0, 16 + azz.a($$0, 1, 7)));
      $$2.add($$1.b(azz.a($$0, 1, 7), 0, -16 + azz.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azz.a($$0, 1, 7), 0, 16 + azz.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azz.a($$0, 1, 7), 0, azz.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azz.a($$0, 1, 7), 0, -16 + azz.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ewq $$0, iw $$1, dui $$2, ess $$3, bai $$4, eva $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alr $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new euz.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alr[] $$9 = $$6 ? g : d;
            alr[] $$10 = $$6 ? i : e;
            alr[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new euz.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new euz.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new euz.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends esx {
      private final eva.a h;
      private final float i;
      private final boolean j;

      public a(ewq $$0, alr $$1, iw $$2, dui $$3, float $$4, eva.a $$5, boolean $$6) {
         super(ete.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ewq $$0, ua $$1, dui $$2, float $$3, eva.a $$4, boolean $$5) {
         super(ete.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ewl a(dui $$0, float $$1, eva.a $$2) {
         ewm $$3 = $$2 == eva.a.b ? euz.b : euz.a;
         return new ewl().a($$0).a(dsr.a).a(new evs($$1)).a(evq.d).a($$3);
      }

      public static euz.a a(ewq $$0, ua $$1) {
         dui $$2 = $$1.<dui>a("Rot", dui.h).orElseThrow();
         float $$3 = $$1.b("Integrity", 0.0F);
         eva.a $$4 = $$1.<eva.a>a("BiomeType", eva.a.d).orElseThrow();
         boolean $$5 = $$1.b("IsLarge", false);
         return new euz.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dui.h, this.c.d());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", eva.a.d, this.h);
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dnq.cG.m().b(dos.e, Boolean.valueOf($$2.b_($$1).a(axs.a))), 2);
            dyo $$5 = $$2.c_($$1);
            if ($$5 instanceof dyw) {
               ((dyw)$$5).a(this.j ? fap.E : fap.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            coy $$6 = bxn.L.a($$2.a(), bxm.d);
            if ($$6 != null) {
               $$6.gc();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bxm.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, dnq.a.m(), 2);
               } else {
                  $$2.a($$1, dnq.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         int $$7 = $$0.a(ehp.a.c, this.d.u(), this.d.w());
         this.d = new iw(this.d.u(), $$7, this.d.w());
         iw $$8 = ewp.a(new iw(this.b.a().u() - 1, 0, this.b.a().w() - 1), dsr.a, this.c.d(), iw.c).a((kb)this.d);
         this.d = new iw(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iw $$0, djn $$1, iw $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iw $$7 : iw.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iw.a $$11 = new iw.a($$8, $$10, $$9);
            ebq $$12 = $$1.a_($$11);

            for (eya $$13 = $$1.b_($$11); ($$12.l() || $$13.a(axs.a) || $$12.a(axn.ap)) && $$10 > $$1.K_() + 1; $$13 = $$1.b_($$11)) {
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
