import com.google.common.collect.Lists;
import java.util.List;

public class elh {
   static final emt a = a(dfj.I, dfj.J, eqq.bh);
   static final emt b = a(dfj.L, dfj.M, eqq.bi);
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

   private static emt a(dfh $$0, dfh $$1, akj<eqz> $$2) {
      return new emc(new emp(List.of(new eml(new elz($$0), elu.b, emi.b, $$1.o(), new ena($$2)))), bpi.a(5));
   }

   private static akk a(ayo $$0) {
      return ac.a(c, $$0);
   }

   private static akk b(ayo $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emx $$0, ja $$1, dlu $$2, ejb $$3, ayo $$4, eli $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emx $$0, ayo $$1, dlu $$2, ja $$3, eli $$4, ejb $$5) {
      ja $$6 = new ja($$3.u(), 90, $$3.w());
      ja $$7 = emw.a(new ja(15, 0, 15), dke.a, $$2, ja.c).a((ke)$$6);
      eio $$8 = eio.a($$6, $$7);
      ja $$9 = new ja(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ja> $$10 = a($$1, $$9);
      int $$11 = ayg.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ja $$14 = $$10.remove($$13);
            dlu $$15 = dlu.a($$1);
            ja $$16 = emw.a(new ja(5, 0, 6), dke.a, $$15, ja.c).a((ke)$$14);
            eio $$17 = eio.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ja> a(ayo $$0, ja $$1) {
      List<ja> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayg.a($$0, 1, 8), 0, 16 + ayg.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayg.a($$0, 1, 8), 0, ayg.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayg.a($$0, 1, 8), 0, -16 + ayg.a($$0, 4, 8)));
      $$2.add($$1.b(ayg.a($$0, 1, 7), 0, 16 + ayg.a($$0, 1, 7)));
      $$2.add($$1.b(ayg.a($$0, 1, 7), 0, -16 + ayg.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayg.a($$0, 1, 7), 0, 16 + ayg.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayg.a($$0, 1, 7), 0, ayg.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayg.a($$0, 1, 7), 0, -16 + ayg.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(emx $$0, ja $$1, dlu $$2, ejb $$3, ayo $$4, eli $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akk $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new elh.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akk[] $$9 = $$6 ? g : d;
            akk[] $$10 = $$6 ? i : e;
            akk[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new elh.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new elh.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new elh.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ejg {
      private final eli.a h;
      private final float i;
      private final boolean j;

      public a(emx $$0, akk $$1, ja $$2, dlu $$3, float $$4, eli.a $$5, boolean $$6) {
         super(ejn.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emx $$0, tx $$1, dlu $$2, float $$3, eli.a $$4, boolean $$5) {
         super(ejn.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ems a(dlu $$0, float $$1, eli.a $$2) {
         emt $$3 = $$2 == eli.a.b ? elh.b : elh.a;
         return new ems().a($$0).a(dke.a).a(new ema($$1)).a(ely.d).a($$3);
      }

      public static elh.a a(emx $$0, tx $$1) {
         dlu $$2 = dlu.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eli.a $$4 = eli.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new elh.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfj.cv.o().a(dgk.e, Boolean.valueOf($$2.b_($$1).a(awc.a))), 2);
            dpp $$5 = $$2.c_($$1);
            if ($$5 instanceof dpw) {
               ((dpw)$$5).a(this.j ? eqq.F : eqq.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cje $$6 = bsm.B.a((dcf)$$2.E());
            if ($$6 != null) {
               $$6.fR();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btf.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfj.a.o(), 2);
               } else {
                  $$2.a($$1, dfj.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
         int $$7 = $$0.a(dyf.a.c, this.d.u(), this.d.w());
         this.d = new ja(this.d.u(), $$7, this.d.w());
         ja $$8 = emw.a(new ja(this.b.a().u() - 1, 0, this.b.a().w() - 1), dke.a, this.c.d(), ja.c).a((ke)this.d);
         this.d = new ja(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ja $$0, dbl $$1, ja $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ja $$7 : ja.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ja.a $$11 = new ja.a($$8, $$10, $$9);
            dsk $$12 = $$1.a_($$11);

            for (eoh $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awc.a) || $$12.a(avw.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
