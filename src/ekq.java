import com.google.common.collect.Lists;
import java.util.List;

public class ekq {
   static final emc a = a(dew.I, dew.J, epz.bh);
   static final emc b = a(dew.L, dew.M, epz.bi);
   private static final alb[] c = new alb[]{
      new alb("underwater_ruin/warm_1"),
      new alb("underwater_ruin/warm_2"),
      new alb("underwater_ruin/warm_3"),
      new alb("underwater_ruin/warm_4"),
      new alb("underwater_ruin/warm_5"),
      new alb("underwater_ruin/warm_6"),
      new alb("underwater_ruin/warm_7"),
      new alb("underwater_ruin/warm_8")
   };
   private static final alb[] d = new alb[]{
      new alb("underwater_ruin/brick_1"),
      new alb("underwater_ruin/brick_2"),
      new alb("underwater_ruin/brick_3"),
      new alb("underwater_ruin/brick_4"),
      new alb("underwater_ruin/brick_5"),
      new alb("underwater_ruin/brick_6"),
      new alb("underwater_ruin/brick_7"),
      new alb("underwater_ruin/brick_8")
   };
   private static final alb[] e = new alb[]{
      new alb("underwater_ruin/cracked_1"),
      new alb("underwater_ruin/cracked_2"),
      new alb("underwater_ruin/cracked_3"),
      new alb("underwater_ruin/cracked_4"),
      new alb("underwater_ruin/cracked_5"),
      new alb("underwater_ruin/cracked_6"),
      new alb("underwater_ruin/cracked_7"),
      new alb("underwater_ruin/cracked_8")
   };
   private static final alb[] f = new alb[]{
      new alb("underwater_ruin/mossy_1"),
      new alb("underwater_ruin/mossy_2"),
      new alb("underwater_ruin/mossy_3"),
      new alb("underwater_ruin/mossy_4"),
      new alb("underwater_ruin/mossy_5"),
      new alb("underwater_ruin/mossy_6"),
      new alb("underwater_ruin/mossy_7"),
      new alb("underwater_ruin/mossy_8")
   };
   private static final alb[] g = new alb[]{
      new alb("underwater_ruin/big_brick_1"),
      new alb("underwater_ruin/big_brick_2"),
      new alb("underwater_ruin/big_brick_3"),
      new alb("underwater_ruin/big_brick_8")
   };
   private static final alb[] h = new alb[]{
      new alb("underwater_ruin/big_mossy_1"),
      new alb("underwater_ruin/big_mossy_2"),
      new alb("underwater_ruin/big_mossy_3"),
      new alb("underwater_ruin/big_mossy_8")
   };
   private static final alb[] i = new alb[]{
      new alb("underwater_ruin/big_cracked_1"),
      new alb("underwater_ruin/big_cracked_2"),
      new alb("underwater_ruin/big_cracked_3"),
      new alb("underwater_ruin/big_cracked_8")
   };
   private static final alb[] j = new alb[]{
      new alb("underwater_ruin/big_warm_4"),
      new alb("underwater_ruin/big_warm_5"),
      new alb("underwater_ruin/big_warm_6"),
      new alb("underwater_ruin/big_warm_7")
   };

   private static emc a(deu $$0, deu $$1, ala<eqi> $$2) {
      return new ell(new ely(List.of(new elu(new eli($$0), eld.b, elr.b, $$1.n(), new emj($$2)))), bpr.a(5));
   }

   private static alb a(azc $$0) {
      return ac.a(c, $$0);
   }

   private static alb b(azc $$0) {
      return ac.a(j, $$0);
   }

   public static void a(emg $$0, iz $$1, dlh $$2, eik $$3, azc $$4, ekr $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(emg $$0, azc $$1, dlh $$2, iz $$3, ekr $$4, eik $$5) {
      iz $$6 = new iz($$3.u(), 90, $$3.w());
      iz $$7 = emf.a(new iz(15, 0, 15), djr.a, $$2, iz.c).a((kd)$$6);
      ehx $$8 = ehx.a($$6, $$7);
      iz $$9 = new iz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<iz> $$10 = a($$1, $$9);
      int $$11 = ayu.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            iz $$14 = $$10.remove($$13);
            dlh $$15 = dlh.a($$1);
            iz $$16 = emf.a(new iz(5, 0, 6), djr.a, $$15, iz.c).a((kd)$$14);
            ehx $$17 = ehx.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<iz> a(azc $$0, iz $$1) {
      List<iz> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayu.a($$0, 1, 8), 0, 16 + ayu.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayu.a($$0, 1, 8), 0, ayu.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayu.a($$0, 1, 8), 0, -16 + ayu.a($$0, 4, 8)));
      $$2.add($$1.b(ayu.a($$0, 1, 7), 0, 16 + ayu.a($$0, 1, 7)));
      $$2.add($$1.b(ayu.a($$0, 1, 7), 0, -16 + ayu.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayu.a($$0, 1, 7), 0, 16 + ayu.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayu.a($$0, 1, 7), 0, ayu.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayu.a($$0, 1, 7), 0, -16 + ayu.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(emg $$0, iz $$1, dlh $$2, eik $$3, azc $$4, ekr $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alb $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ekq.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alb[] $$9 = $$6 ? g : d;
            alb[] $$10 = $$6 ? i : e;
            alb[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ekq.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ekq.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ekq.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eip {
      private final ekr.a h;
      private final float i;
      private final boolean j;

      public a(emg $$0, alb $$1, iz $$2, dlh $$3, float $$4, ekr.a $$5, boolean $$6) {
         super(eiw.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(emg $$0, ur $$1, dlh $$2, float $$3, ekr.a $$4, boolean $$5) {
         super(eiw.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static emb a(dlh $$0, float $$1, ekr.a $$2) {
         emc $$3 = $$2 == ekr.a.b ? ekq.b : ekq.a;
         return new emb().a($$0).a(djr.a).a(new elj($$1)).a(elh.d).a($$3);
      }

      public static ekq.a a(emg $$0, ur $$1) {
         dlh $$2 = dlh.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ekr.a $$4 = ekr.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ekq.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, iz $$1, dci $$2, azc $$3, ehx $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dew.cv.n().a(dfx.e, Boolean.valueOf($$2.b_($$1).a(awr.a))), 2);
            dpc $$5 = $$2.c_($$1);
            if ($$5 instanceof dpj) {
               ((dpj)$$5).a(this.j ? epz.F : epz.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cjm $$6 = bsv.B.a((dbt)$$2.E());
            if ($$6 != null) {
               $$6.fU();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bto.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dew.a.n(), 2);
               } else {
                  $$2.a($$1, dew.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
         int $$7 = $$0.a(dxp.a.c, this.d.u(), this.d.w());
         this.d = new iz(this.d.u(), $$7, this.d.w());
         iz $$8 = emf.a(new iz(this.b.a().u() - 1, 0, this.b.a().w() - 1), djr.a, this.c.d(), iz.c).a((kd)this.d);
         this.d = new iz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(iz $$0, daz $$1, iz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (iz $$7 : iz.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            iz.a $$11 = new iz.a($$8, $$10, $$9);
            drx $$12 = $$1.a_($$11);

            for (enq $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awr.a) || $$12.a(awl.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
