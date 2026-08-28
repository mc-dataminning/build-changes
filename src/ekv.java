import com.google.common.collect.Lists;
import java.util.List;

public class ekv {
   static final emh a = a(dfb.I, dfb.J, eqe.bh);
   static final emh b = a(dfb.L, dfb.M, eqe.bi);
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

   private static emh a(dez $$0, dez $$1, ale<eqn> $$2) {
      return new elq(new emd(List.of(new elz(new eln($$0), eli.b, elw.b, $$1.o(), new emo($$2)))), bpw.a(5));
   }

   private static alf a(azh $$0) {
      return ac.a(c, $$0);
   }

   private static alf b(azh $$0) {
      return ac.a(j, $$0);
   }

   public static void a(eml $$0, iz $$1, dlm $$2, eip $$3, azh $$4, ekw $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eml $$0, azh $$1, dlm $$2, iz $$3, ekw $$4, eip $$5) {
      iz $$6 = new iz($$3.u(), 90, $$3.w());
      iz $$7 = emk.a(new iz(15, 0, 15), djw.a, $$2, iz.c).a((kd)$$6);
      eic $$8 = eic.a($$6, $$7);
      iz $$9 = new iz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iz> $$10 = a($$1, $$9);
      int $$11 = ayz.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iz $$14 = $$10.remove($$13);
            dlm $$15 = dlm.a($$1);
            iz $$16 = emk.a(new iz(5, 0, 6), djw.a, $$15, iz.c).a((kd)$$14);
            eic $$17 = eic.a($$14, $$16);
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

   private static void a(eml $$0, iz $$1, dlm $$2, eip $$3, azh $$4, ekw $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alf $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ekv.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alf[] $$9 = $$6 ? g : d;
            alf[] $$10 = $$6 ? i : e;
            alf[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ekv.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ekv.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ekv.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eiu {
      private final ekw.a h;
      private final float i;
      private final boolean j;

      public a(eml $$0, alf $$1, iz $$2, dlm $$3, float $$4, ekw.a $$5, boolean $$6) {
         super(ejb.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eml $$0, us $$1, dlm $$2, float $$3, ekw.a $$4, boolean $$5) {
         super(ejb.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static emg a(dlm $$0, float $$1, ekw.a $$2) {
         emh $$3 = $$2 == ekw.a.b ? ekv.b : ekv.a;
         return new emg().a($$0).a(djw.a).a(new elo($$1)).a(elm.d).a($$3);
      }

      public static ekv.a a(eml $$0, us $$1) {
         dlm $$2 = dlm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ekw.a $$4 = ekw.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ekv.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iz $$1, dcn $$2, azh $$3, eic $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfb.cv.o().a(dgc.e, Boolean.valueOf($$2.b_($$1).a(awv.a))), 2);
            dph $$5 = $$2.c_($$1);
            if ($$5 instanceof dpo) {
               ((dpo)$$5).a(this.j ? eqe.F : eqe.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjr $$6 = bta.B.a((dby)$$2.E());
            if ($$6 != null) {
               $$6.fU();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btt.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dfb.a.o(), 2);
               } else {
                  $$2.a($$1, dfb.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         int $$7 = $$0.a(dxu.a.c, this.d.u(), this.d.w());
         this.d = new iz(this.d.u(), $$7, this.d.w());
         iz $$8 = emk.a(new iz(this.b.a().u() - 1, 0, this.b.a().w() - 1), djw.a, this.c.d(), iz.c).a((kd)this.d);
         this.d = new iz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iz $$0, dbe $$1, iz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iz $$7 : iz.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iz.a $$11 = new iz.a($$8, $$10, $$9);
            dsc $$12 = $$1.a_($$11);

            for (env $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awv.a) || $$12.a(awp.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
