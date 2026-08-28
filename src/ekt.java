import com.google.common.collect.Lists;
import java.util.List;

public class ekt {
   static final emf a = a(dez.I, dez.J, eqc.bh);
   static final emf b = a(dez.L, dez.M, eqc.bi);
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

   private static emf a(dex $$0, dex $$1, ald<eql> $$2) {
      return new elo(new emb(List.of(new elx(new ell($$0), elg.b, elu.b, $$1.o(), new emm($$2)))), bpu.a(5));
   }

   private static ale a(azf $$0) {
      return ac.a(c, $$0);
   }

   private static ale b(azf $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emj $$0, iz $$1, dlk $$2, ein $$3, azf $$4, eku $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emj $$0, azf $$1, dlk $$2, iz $$3, eku $$4, ein $$5) {
      iz $$6 = new iz($$3.u(), 90, $$3.w());
      iz $$7 = emi.a(new iz(15, 0, 15), dju.a, $$2, iz.c).a((kd)$$6);
      eia $$8 = eia.a($$6, $$7);
      iz $$9 = new iz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iz> $$10 = a($$1, $$9);
      int $$11 = ayx.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iz $$14 = $$10.remove($$13);
            dlk $$15 = dlk.a($$1);
            iz $$16 = emi.a(new iz(5, 0, 6), dju.a, $$15, iz.c).a((kd)$$14);
            eia $$17 = eia.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iz> a(azf $$0, iz $$1) {
      List<iz> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayx.a($$0, 1, 8), 0, 16 + ayx.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayx.a($$0, 1, 8), 0, ayx.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayx.a($$0, 1, 8), 0, -16 + ayx.a($$0, 4, 8)));
      $$2.add($$1.b(ayx.a($$0, 1, 7), 0, 16 + ayx.a($$0, 1, 7)));
      $$2.add($$1.b(ayx.a($$0, 1, 7), 0, -16 + ayx.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayx.a($$0, 1, 7), 0, 16 + ayx.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayx.a($$0, 1, 7), 0, ayx.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayx.a($$0, 1, 7), 0, -16 + ayx.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(emj $$0, iz $$1, dlk $$2, ein $$3, azf $$4, eku $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ale $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ekt.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ale[] $$9 = $$6 ? g : d;
            ale[] $$10 = $$6 ? i : e;
            ale[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ekt.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ekt.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ekt.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eis {
      private final eku.a h;
      private final float i;
      private final boolean j;

      public a(emj $$0, ale $$1, iz $$2, dlk $$3, float $$4, eku.a $$5, boolean $$6) {
         super(eiz.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emj $$0, ur $$1, dlk $$2, float $$3, eku.a $$4, boolean $$5) {
         super(eiz.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eme a(dlk $$0, float $$1, eku.a $$2) {
         emf $$3 = $$2 == eku.a.b ? ekt.b : ekt.a;
         return new eme().a($$0).a(dju.a).a(new elm($$1)).a(elk.d).a($$3);
      }

      public static ekt.a a(emj $$0, ur $$1) {
         dlk $$2 = dlk.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eku.a $$4 = eku.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ekt.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dez.cv.o().a(dga.e, Boolean.valueOf($$2.b_($$1).a(awu.a))), 2);
            dpf $$5 = $$2.c_($$1);
            if ($$5 instanceof dpm) {
               ((dpm)$$5).a(this.j ? eqc.F : eqc.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjp $$6 = bsy.B.a((dbw)$$2.E());
            if ($$6 != null) {
               $$6.fU();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btr.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dez.a.o(), 2);
               } else {
                  $$2.a($$1, dez.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
         int $$7 = $$0.a(dxs.a.c, this.d.u(), this.d.w());
         this.d = new iz(this.d.u(), $$7, this.d.w());
         iz $$8 = emi.a(new iz(this.b.a().u() - 1, 0, this.b.a().w() - 1), dju.a, this.c.d(), iz.c).a((kd)this.d);
         this.d = new iz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iz $$0, dbc $$1, iz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iz $$7 : iz.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iz.a $$11 = new iz.a($$8, $$10, $$9);
            dsa $$12 = $$1.a_($$11);

            for (ent $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awu.a) || $$12.a(awo.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
