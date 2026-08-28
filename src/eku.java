import com.google.common.collect.Lists;
import java.util.List;

public class eku {
   static final emg a = a(dfa.I, dfa.J, eqd.bh);
   static final emg b = a(dfa.L, dfa.M, eqd.bi);
   private static final ale[] c = new ale[]{
      new ale("underwater_ruin/warm_1"),
      new ale("underwater_ruin/warm_2"),
      new ale("underwater_ruin/warm_3"),
      new ale("underwater_ruin/warm_4"),
      new ale("underwater_ruin/warm_5"),
      new ale("underwater_ruin/warm_6"),
      new ale("underwater_ruin/warm_7"),
      new ale("underwater_ruin/warm_8")
   };
   private static final ale[] d = new ale[]{
      new ale("underwater_ruin/brick_1"),
      new ale("underwater_ruin/brick_2"),
      new ale("underwater_ruin/brick_3"),
      new ale("underwater_ruin/brick_4"),
      new ale("underwater_ruin/brick_5"),
      new ale("underwater_ruin/brick_6"),
      new ale("underwater_ruin/brick_7"),
      new ale("underwater_ruin/brick_8")
   };
   private static final ale[] e = new ale[]{
      new ale("underwater_ruin/cracked_1"),
      new ale("underwater_ruin/cracked_2"),
      new ale("underwater_ruin/cracked_3"),
      new ale("underwater_ruin/cracked_4"),
      new ale("underwater_ruin/cracked_5"),
      new ale("underwater_ruin/cracked_6"),
      new ale("underwater_ruin/cracked_7"),
      new ale("underwater_ruin/cracked_8")
   };
   private static final ale[] f = new ale[]{
      new ale("underwater_ruin/mossy_1"),
      new ale("underwater_ruin/mossy_2"),
      new ale("underwater_ruin/mossy_3"),
      new ale("underwater_ruin/mossy_4"),
      new ale("underwater_ruin/mossy_5"),
      new ale("underwater_ruin/mossy_6"),
      new ale("underwater_ruin/mossy_7"),
      new ale("underwater_ruin/mossy_8")
   };
   private static final ale[] g = new ale[]{
      new ale("underwater_ruin/big_brick_1"),
      new ale("underwater_ruin/big_brick_2"),
      new ale("underwater_ruin/big_brick_3"),
      new ale("underwater_ruin/big_brick_8")
   };
   private static final ale[] h = new ale[]{
      new ale("underwater_ruin/big_mossy_1"),
      new ale("underwater_ruin/big_mossy_2"),
      new ale("underwater_ruin/big_mossy_3"),
      new ale("underwater_ruin/big_mossy_8")
   };
   private static final ale[] i = new ale[]{
      new ale("underwater_ruin/big_cracked_1"),
      new ale("underwater_ruin/big_cracked_2"),
      new ale("underwater_ruin/big_cracked_3"),
      new ale("underwater_ruin/big_cracked_8")
   };
   private static final ale[] j = new ale[]{
      new ale("underwater_ruin/big_warm_4"),
      new ale("underwater_ruin/big_warm_5"),
      new ale("underwater_ruin/big_warm_6"),
      new ale("underwater_ruin/big_warm_7")
   };

   private static emg a(dey $$0, dey $$1, ald<eqm> $$2) {
      return new elp(new emc(List.of(new ely(new elm($$0), elh.b, elv.b, $$1.o(), new emn($$2)))), bpv.a(5));
   }

   private static ale a(azg $$0) {
      return ac.a(c, $$0);
   }

   private static ale b(azg $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emk $$0, iz $$1, dll $$2, eio $$3, azg $$4, ekv $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emk $$0, azg $$1, dll $$2, iz $$3, ekv $$4, eio $$5) {
      iz $$6 = new iz($$3.u(), 90, $$3.w());
      iz $$7 = emj.a(new iz(15, 0, 15), djv.a, $$2, iz.c).a((kd)$$6);
      eib $$8 = eib.a($$6, $$7);
      iz $$9 = new iz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iz> $$10 = a($$1, $$9);
      int $$11 = ayy.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iz $$14 = $$10.remove($$13);
            dll $$15 = dll.a($$1);
            iz $$16 = emj.a(new iz(5, 0, 6), djv.a, $$15, iz.c).a((kd)$$14);
            eib $$17 = eib.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iz> a(azg $$0, iz $$1) {
      List<iz> $$2 = Lists.newArrayList();
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

   private static void a(emk $$0, iz $$1, dll $$2, eio $$3, azg $$4, ekv $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ale $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eku.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ale[] $$9 = $$6 ? g : d;
            ale[] $$10 = $$6 ? i : e;
            ale[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eku.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eku.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eku.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eit {
      private final ekv.a h;
      private final float i;
      private final boolean j;

      public a(emk $$0, ale $$1, iz $$2, dll $$3, float $$4, ekv.a $$5, boolean $$6) {
         super(eja.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emk $$0, ur $$1, dll $$2, float $$3, ekv.a $$4, boolean $$5) {
         super(eja.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static emf a(dll $$0, float $$1, ekv.a $$2) {
         emg $$3 = $$2 == ekv.a.b ? eku.b : eku.a;
         return new emf().a($$0).a(djv.a).a(new eln($$1)).a(ell.d).a($$3);
      }

      public static eku.a a(emk $$0, ur $$1) {
         dll $$2 = dll.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ekv.a $$4 = ekv.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eku.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfa.cv.o().a(dgb.e, Boolean.valueOf($$2.b_($$1).a(awu.a))), 2);
            dpg $$5 = $$2.c_($$1);
            if ($$5 instanceof dpn) {
               ((dpn)$$5).a(this.j ? eqd.F : eqd.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjq $$6 = bsz.B.a((dbx)$$2.E());
            if ($$6 != null) {
               $$6.fU();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bts.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfa.a.o(), 2);
               } else {
                  $$2.a($$1, dfa.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
         int $$7 = $$0.a(dxt.a.c, this.d.u(), this.d.w());
         this.d = new iz(this.d.u(), $$7, this.d.w());
         iz $$8 = emj.a(new iz(this.b.a().u() - 1, 0, this.b.a().w() - 1), djv.a, this.c.d(), iz.c).a((kd)this.d);
         this.d = new iz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iz $$0, dbd $$1, iz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iz $$7 : iz.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iz.a $$11 = new iz.a($$8, $$10, $$9);
            dsb $$12 = $$1.a_($$11);

            for (enu $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awu.a) || $$12.a(awo.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
