import com.google.common.collect.Lists;
import java.util.List;

public class elb {
   static final emn a = a(dfh.I, dfh.J, eqk.bh);
   static final emn b = a(dfh.L, dfh.M, eqk.bi);
   private static final akk[] c = new akk[]{
      new akk("underwater_ruin/warm_1"),
      new akk("underwater_ruin/warm_2"),
      new akk("underwater_ruin/warm_3"),
      new akk("underwater_ruin/warm_4"),
      new akk("underwater_ruin/warm_5"),
      new akk("underwater_ruin/warm_6"),
      new akk("underwater_ruin/warm_7"),
      new akk("underwater_ruin/warm_8")
   };
   private static final akk[] d = new akk[]{
      new akk("underwater_ruin/brick_1"),
      new akk("underwater_ruin/brick_2"),
      new akk("underwater_ruin/brick_3"),
      new akk("underwater_ruin/brick_4"),
      new akk("underwater_ruin/brick_5"),
      new akk("underwater_ruin/brick_6"),
      new akk("underwater_ruin/brick_7"),
      new akk("underwater_ruin/brick_8")
   };
   private static final akk[] e = new akk[]{
      new akk("underwater_ruin/cracked_1"),
      new akk("underwater_ruin/cracked_2"),
      new akk("underwater_ruin/cracked_3"),
      new akk("underwater_ruin/cracked_4"),
      new akk("underwater_ruin/cracked_5"),
      new akk("underwater_ruin/cracked_6"),
      new akk("underwater_ruin/cracked_7"),
      new akk("underwater_ruin/cracked_8")
   };
   private static final akk[] f = new akk[]{
      new akk("underwater_ruin/mossy_1"),
      new akk("underwater_ruin/mossy_2"),
      new akk("underwater_ruin/mossy_3"),
      new akk("underwater_ruin/mossy_4"),
      new akk("underwater_ruin/mossy_5"),
      new akk("underwater_ruin/mossy_6"),
      new akk("underwater_ruin/mossy_7"),
      new akk("underwater_ruin/mossy_8")
   };
   private static final akk[] g = new akk[]{
      new akk("underwater_ruin/big_brick_1"),
      new akk("underwater_ruin/big_brick_2"),
      new akk("underwater_ruin/big_brick_3"),
      new akk("underwater_ruin/big_brick_8")
   };
   private static final akk[] h = new akk[]{
      new akk("underwater_ruin/big_mossy_1"),
      new akk("underwater_ruin/big_mossy_2"),
      new akk("underwater_ruin/big_mossy_3"),
      new akk("underwater_ruin/big_mossy_8")
   };
   private static final akk[] i = new akk[]{
      new akk("underwater_ruin/big_cracked_1"),
      new akk("underwater_ruin/big_cracked_2"),
      new akk("underwater_ruin/big_cracked_3"),
      new akk("underwater_ruin/big_cracked_8")
   };
   private static final akk[] j = new akk[]{
      new akk("underwater_ruin/big_warm_4"),
      new akk("underwater_ruin/big_warm_5"),
      new akk("underwater_ruin/big_warm_6"),
      new akk("underwater_ruin/big_warm_7")
   };

   private static emn a(dff $$0, dff $$1, akj<eqt> $$2) {
      return new elw(new emj(List.of(new emf(new elt($$0), elo.b, emc.b, $$1.o(), new emu($$2)))), bpf.a(5));
   }

   private static akk a(aym $$0) {
      return ac.a(c, $$0);
   }

   private static akk b(aym $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emr $$0, ja $$1, dls $$2, eiv $$3, aym $$4, elc $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emr $$0, aym $$1, dls $$2, ja $$3, elc $$4, eiv $$5) {
      ja $$6 = new ja($$3.u(), 90, $$3.w());
      ja $$7 = emq.a(new ja(15, 0, 15), dkc.a, $$2, ja.c).a((ke)$$6);
      eii $$8 = eii.a($$6, $$7);
      ja $$9 = new ja(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ja> $$10 = a($$1, $$9);
      int $$11 = aye.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ja $$14 = $$10.remove($$13);
            dls $$15 = dls.a($$1);
            ja $$16 = emq.a(new ja(5, 0, 6), dkc.a, $$15, ja.c).a((ke)$$14);
            eii $$17 = eii.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ja> a(aym $$0, ja $$1) {
      List<ja> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aye.a($$0, 1, 8), 0, 16 + aye.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aye.a($$0, 1, 8), 0, aye.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aye.a($$0, 1, 8), 0, -16 + aye.a($$0, 4, 8)));
      $$2.add($$1.b(aye.a($$0, 1, 7), 0, 16 + aye.a($$0, 1, 7)));
      $$2.add($$1.b(aye.a($$0, 1, 7), 0, -16 + aye.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aye.a($$0, 1, 7), 0, 16 + aye.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aye.a($$0, 1, 7), 0, aye.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aye.a($$0, 1, 7), 0, -16 + aye.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(emr $$0, ja $$1, dls $$2, eiv $$3, aym $$4, elc $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akk $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new elb.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akk[] $$9 = $$6 ? g : d;
            akk[] $$10 = $$6 ? i : e;
            akk[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new elb.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new elb.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new elb.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eja {
      private final elc.a h;
      private final float i;
      private final boolean j;

      public a(emr $$0, akk $$1, ja $$2, dls $$3, float $$4, elc.a $$5, boolean $$6) {
         super(ejh.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emr $$0, tx $$1, dls $$2, float $$3, elc.a $$4, boolean $$5) {
         super(ejh.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static emm a(dls $$0, float $$1, elc.a $$2) {
         emn $$3 = $$2 == elc.a.b ? elb.b : elb.a;
         return new emm().a($$0).a(dkc.a).a(new elu($$1)).a(els.d).a($$3);
      }

      public static elb.a a(emr $$0, tx $$1) {
         dls $$2 = dls.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         elc.a $$4 = elc.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new elb.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ejg $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ja $$1, dcs $$2, aym $$3, eii $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfh.cv.o().a(dgi.e, Boolean.valueOf($$2.b_($$1).a(awa.a))), 2);
            dpn $$5 = $$2.c_($$1);
            if ($$5 instanceof dpu) {
               ((dpu)$$5).a(this.j ? eqk.F : eqk.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjb $$6 = bsj.B.a((dcd)$$2.E());
            if ($$6 != null) {
               $$6.fQ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btc.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfh.a.o(), 2);
               } else {
                  $$2.a($$1, dfh.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
         int $$7 = $$0.a(dxz.a.c, this.d.u(), this.d.w());
         this.d = new ja(this.d.u(), $$7, this.d.w());
         ja $$8 = emq.a(new ja(this.b.a().u() - 1, 0, this.b.a().w() - 1), dkc.a, this.c.d(), ja.c).a((ke)this.d);
         this.d = new ja(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ja $$0, dbj $$1, ja $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ja $$7 : ja.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ja.a $$11 = new ja.a($$8, $$10, $$9);
            dsh $$12 = $$1.a_($$11);

            for (eob $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awa.a) || $$12.a(avu.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
