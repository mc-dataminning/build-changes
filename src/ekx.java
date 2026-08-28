import com.google.common.collect.Lists;
import java.util.List;

public class ekx {
   static final emj a = a(dfd.I, dfd.J, eqg.bh);
   static final emj b = a(dfd.L, dfd.M, eqg.bi);
   private static final alf[] c = new alf[]{
      new alf("underwater_ruin/warm_1"),
      new alf("underwater_ruin/warm_2"),
      new alf("underwater_ruin/warm_3"),
      new alf("underwater_ruin/warm_4"),
      new alf("underwater_ruin/warm_5"),
      new alf("underwater_ruin/warm_6"),
      new alf("underwater_ruin/warm_7"),
      new alf("underwater_ruin/warm_8")
   };
   private static final alf[] d = new alf[]{
      new alf("underwater_ruin/brick_1"),
      new alf("underwater_ruin/brick_2"),
      new alf("underwater_ruin/brick_3"),
      new alf("underwater_ruin/brick_4"),
      new alf("underwater_ruin/brick_5"),
      new alf("underwater_ruin/brick_6"),
      new alf("underwater_ruin/brick_7"),
      new alf("underwater_ruin/brick_8")
   };
   private static final alf[] e = new alf[]{
      new alf("underwater_ruin/cracked_1"),
      new alf("underwater_ruin/cracked_2"),
      new alf("underwater_ruin/cracked_3"),
      new alf("underwater_ruin/cracked_4"),
      new alf("underwater_ruin/cracked_5"),
      new alf("underwater_ruin/cracked_6"),
      new alf("underwater_ruin/cracked_7"),
      new alf("underwater_ruin/cracked_8")
   };
   private static final alf[] f = new alf[]{
      new alf("underwater_ruin/mossy_1"),
      new alf("underwater_ruin/mossy_2"),
      new alf("underwater_ruin/mossy_3"),
      new alf("underwater_ruin/mossy_4"),
      new alf("underwater_ruin/mossy_5"),
      new alf("underwater_ruin/mossy_6"),
      new alf("underwater_ruin/mossy_7"),
      new alf("underwater_ruin/mossy_8")
   };
   private static final alf[] g = new alf[]{
      new alf("underwater_ruin/big_brick_1"),
      new alf("underwater_ruin/big_brick_2"),
      new alf("underwater_ruin/big_brick_3"),
      new alf("underwater_ruin/big_brick_8")
   };
   private static final alf[] h = new alf[]{
      new alf("underwater_ruin/big_mossy_1"),
      new alf("underwater_ruin/big_mossy_2"),
      new alf("underwater_ruin/big_mossy_3"),
      new alf("underwater_ruin/big_mossy_8")
   };
   private static final alf[] i = new alf[]{
      new alf("underwater_ruin/big_cracked_1"),
      new alf("underwater_ruin/big_cracked_2"),
      new alf("underwater_ruin/big_cracked_3"),
      new alf("underwater_ruin/big_cracked_8")
   };
   private static final alf[] j = new alf[]{
      new alf("underwater_ruin/big_warm_4"),
      new alf("underwater_ruin/big_warm_5"),
      new alf("underwater_ruin/big_warm_6"),
      new alf("underwater_ruin/big_warm_7")
   };

   private static emj a(dfb $$0, dfb $$1, ale<eqp> $$2) {
      return new els(new emf(List.of(new emb(new elp($$0), elk.b, ely.b, $$1.o(), new emq($$2)))), bpy.a(5));
   }

   private static alf a(azh $$0) {
      return ac.a(c, $$0);
   }

   private static alf b(azh $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emn $$0, iz $$1, dlo $$2, eir $$3, azh $$4, eky $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emn $$0, azh $$1, dlo $$2, iz $$3, eky $$4, eir $$5) {
      iz $$6 = new iz($$3.u(), 90, $$3.w());
      iz $$7 = emm.a(new iz(15, 0, 15), djy.a, $$2, iz.c).a((kd)$$6);
      eie $$8 = eie.a($$6, $$7);
      iz $$9 = new iz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iz> $$10 = a($$1, $$9);
      int $$11 = ayz.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iz $$14 = $$10.remove($$13);
            dlo $$15 = dlo.a($$1);
            iz $$16 = emm.a(new iz(5, 0, 6), djy.a, $$15, iz.c).a((kd)$$14);
            eie $$17 = eie.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iz> a(azh $$0, iz $$1) {
      List<iz> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, 16 + ayz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, ayz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, -16 + ayz.a($$0, 4, 8)));
      $$2.add($$1.b(ayz.a($$0, 1, 7), 0, 16 + ayz.a($$0, 1, 7)));
      $$2.add($$1.b(ayz.a($$0, 1, 7), 0, -16 + ayz.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, 16 + ayz.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, ayz.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, -16 + ayz.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(emn $$0, iz $$1, dlo $$2, eir $$3, azh $$4, eky $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alf $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ekx.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alf[] $$9 = $$6 ? g : d;
            alf[] $$10 = $$6 ? i : e;
            alf[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ekx.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ekx.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ekx.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eiw {
      private final eky.a h;
      private final float i;
      private final boolean j;

      public a(emn $$0, alf $$1, iz $$2, dlo $$3, float $$4, eky.a $$5, boolean $$6) {
         super(ejd.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emn $$0, us $$1, dlo $$2, float $$3, eky.a $$4, boolean $$5) {
         super(ejd.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static emi a(dlo $$0, float $$1, eky.a $$2) {
         emj $$3 = $$2 == eky.a.b ? ekx.b : ekx.a;
         return new emi().a($$0).a(djy.a).a(new elq($$1)).a(elo.d).a($$3);
      }

      public static ekx.a a(emn $$0, us $$1) {
         dlo $$2 = dlo.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eky.a $$4 = eky.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ekx.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iz $$1, dcp $$2, azh $$3, eie $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfd.cv.o().a(dge.e, Boolean.valueOf($$2.b_($$1).a(awv.a))), 2);
            dpj $$5 = $$2.c_($$1);
            if ($$5 instanceof dpq) {
               ((dpq)$$5).a(this.j ? eqg.F : eqg.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjt $$6 = btc.B.a((dca)$$2.E());
            if ($$6 != null) {
               $$6.fU();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btv.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfd.a.o(), 2);
               } else {
                  $$2.a($$1, dfd.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         int $$7 = $$0.a(dxw.a.c, this.d.u(), this.d.w());
         this.d = new iz(this.d.u(), $$7, this.d.w());
         iz $$8 = emm.a(new iz(this.b.a().u() - 1, 0, this.b.a().w() - 1), djy.a, this.c.d(), iz.c).a((kd)this.d);
         this.d = new iz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iz $$0, dbg $$1, iz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iz $$7 : iz.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iz.a $$11 = new iz.a($$8, $$10, $$9);
            dse $$12 = $$1.a_($$11);

            for (enx $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awv.a) || $$12.a(awp.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
